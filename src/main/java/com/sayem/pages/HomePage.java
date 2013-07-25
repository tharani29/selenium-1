package com.sayem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    @FindBy(css = ".button-green.rcorners_right>a")
    private WebElement signupButton;

    @FindBy(css = "#login_button")
    private WebElement loginButton;

    @FindBy(css = "#email")
    private WebElement email;

    @FindBy(css = "#password")
    private WebElement password;

    @FindBy(css = "#login_action")
    private WebElement loginAction;

    // Constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public SignupPage signup(){
        signupButton.click();
        return PageFactory.initElements(driver, SignupPage.class);
    }

    public Dashboard login(String email, String password){
        this.loginButton.click();
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.loginAction.click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
        driver.navigate().to("https://www.interviewstreet.com/recruit2/recruiter#settings");

        return PageFactory.initElements(driver, Dashboard.class);
    }
}
