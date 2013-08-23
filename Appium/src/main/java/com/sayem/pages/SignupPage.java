package com.sayem.pages;

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

    @FindBy(xpath = "//window[1]/scrollview[1]/textfield[2]")
    private WebElement emailAddress;

    @FindBy(xpath = "//window[1]/scrollview[1]/textfield[3]")
    private WebElement confirmEmailAddress;

    @FindBy(xpath = "/window[1]/scrollview[1]/secure[2]")
    private WebElement password;

    @FindBy(xpath = "//window[1]/scrollview[1]/secure[3]")
    private WebElement confirmPassword;

    @FindBy(xpath = "//window[1]/scrollview[1]/button[5]")
    private WebElement createAccount;

    @FindBy(xpath = "//*[@id='email']")
    private WebElement radioButton;

    @FindBy(xpath = "//window[2]/toolbar[1]/button[3]")
    private WebElement doneButton;

    @FindBy(xpath = "//window[1]/button[9]")
    private WebElement passcodeOne;

    @FindBy(xpath = "//window[1]/button[10]")
    private WebElement passcodeTwo;

    @FindBy(xpath = "//window[1]/button[11]")
    private WebElement passcodeThree;

    @FindBy(xpath = "//window[1]/button[12]")
    private WebElement passcodeFour;


    public LoginPage login(){
        loginButton.click();
        return PageFactory.initElements(driver, LoginPage.class);
    }


    public HomePage signUp(String emailAddress, String password){
        signupMethod(emailAddress, password);
        passcodeMethod();
        passcodeMethod();
        return PageFactory.initElements(driver, HomePage.class);
    }

    private void signupMethod(String emailAddress, String password) {
        this.emailAddress.sendKeys(emailAddress);
        doneButton.click();
        this.confirmEmailAddress.sendKeys(emailAddress);
        doneButton.click();
        this.password.sendKeys(password);
        doneButton.click();
        this.confirmPassword.sendKeys(password);
        doneButton.click();
        this.createAccount.click();
    }

    private void passcodeMethod() {
        passcodeOne.click();
        passcodeTwo.click();
        passcodeThree.click();
        passcodeFour.click();
    }
}
