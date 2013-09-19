package com.sayem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    @Override
    protected void load() {
//        String url = "https://www.learnvest.com";
//        this.driver.get(url);
    }

    @Override
    protected void isLoaded() throws Error {
//        String title = "LearnVest - Financial Planning Services and Personal Finance News";
//        assertTrue(driver.getTitle().equals(title));
    }

    @FindBy(css = "#rightButtons > li:nth-of-type(2) > a")
    private WebElement loginButton;

    @FindBy(css = "#rightButtons > li:nth-of-type(1) > a")
    private WebElement signupButton;


    public SignupPage takeMeToSignupPage(){
        loginButton.click();
        return PageFactory.initElements(driver, SignupPage.class);
    }

    public LoginPage takeMeToLoginPage(){
        signupButton.click();
        return PageFactory.initElements(driver, LoginPage.class);
    }
}
