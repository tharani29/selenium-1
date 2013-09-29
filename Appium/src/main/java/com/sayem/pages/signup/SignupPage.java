package com.sayem.pages.signup;

import com.sayem.pages.login.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
    private WebDriver driver;

    public SignupPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(name = "Log In")
    private WebElement loginButton;

    @FindBy(name = "Sign Up")
    private WebElement signupButton;

    @FindBy(xpath = "//window[1]/scrollview[1]/textfield[1]")
    private WebElement emailAddress;

    @FindBy(xpath = "//window[1]/scrollview[1]/textfield[3]")
    private WebElement confirmEmailAddress;

    @FindBy(xpath = "//window[1]/scrollview[1]/textfield[4]")
    private WebElement password;

    @FindBy(xpath = "//window[1]/scrollview[1]/secure[3]")
    private WebElement confirmPassword;

    @FindBy(name = "Create Account")
    private WebElement createAccount;

    @FindBy(name = "LVOnboardingSigninCheckBoxBkgd")
    private WebElement radioButton;

    @FindBy(name = "Done")
    private WebElement doneButton;

    public LoginPage login(){
        loginButton.click();
        return PageFactory.initElements(driver, LoginPage.class);
    }

    public PasscodePage signMeUp(String emailAddress, String password){
        this.emailAddress.sendKeys(emailAddress);
        doneButton.click();
        this.confirmEmailAddress.sendKeys(emailAddress);
        doneButton.click();
        this.password.sendKeys(password);
        doneButton.click();
        this.confirmPassword.sendKeys(password);
        doneButton.click();
        createAccount.click();
        return PageFactory.initElements(driver, PasscodePage.class);
    }
}
