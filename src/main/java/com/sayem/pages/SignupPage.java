package com.sayem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

    private WebDriver driver;

    @FindBy(css = "#inputEmail")
    private WebElement email;

    @FindBy(css = "#inputPassword")
    private WebElement password;

    @FindBy(css = "#inputFirstName")
    private WebElement fullName;

    @FindBy(css = "#inputCompany")
    private WebElement companyName;

    @FindBy(css = "#inputNumber")
    private WebElement phoneNumber;

    @FindBy(name = "signup_button")
    private WebElement signupButton;

    // Constructor
    public SignupPage(WebDriver driver){
        this.driver = driver;
    }

    public Dashboard registration(String email, String password, String fullName,
                                    String companyName, String phoneNumber){
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.fullName.sendKeys(fullName);
        this.companyName.sendKeys(companyName);
        this.phoneNumber.sendKeys(phoneNumber);
        this.signupButton.click();
        return PageFactory.initElements(driver, Dashboard.class);

    }

}
