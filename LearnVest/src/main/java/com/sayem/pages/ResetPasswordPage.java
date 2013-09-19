package com.sayem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPasswordPage extends BasePage {

    private WebDriver driver;

    public ResetPasswordPage(WebDriver driver){
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

    @FindBy(name = "emailInput")
    private WebElement emailAddress;

    @FindBy(name = "sendButton")
    private WebElement resetPasswordButton;

    @FindBy(css = ".returnToLogin")
    private WebElement returnToLoginButton;

    @FindBy(css = "#j_id80>a")
    private WebElement createAnAccountButton;

    @FindBy(css = ".btn.big")
    private WebElement goToHomePageButton;



    public HomePage resetMyPassword(String emailAddress){
        this.emailAddress.sendKeys(emailAddress);
        this.resetPasswordButton.click();
        return PageFactory.initElements(driver, HomePage.class);
    }
}
