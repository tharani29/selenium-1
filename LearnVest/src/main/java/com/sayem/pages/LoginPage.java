package com.sayem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    private WebDriver driver;

    public LoginPage(WebDriver driver){
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

    @FindBy(name = "passwordInput")
    private WebElement password;

    @FindBy(css = "#loginButton")
    private WebElement logInButton;

    @FindBy(css = ".forgotPassword")
    private WebElement iForgotButton;

//    public DashboardPage logMeIn(String email, String password){
//        this.emailAddress.clear();
//        this.emailAddress.sendKeys(email);
//        this.password.clear();
//        this.password.sendKeys(password);
//        this.logInButton.click();
//        return PageFactory.initElements(driver, DashboardPage.class);
//    }

    public ResetPasswordPage takeMeToResetPasswordPage(){
        iForgotButton.click();
        return PageFactory.initElements(driver, ResetPasswordPage.class);
    }

//    public AdminPanel logMeInToAdminPanel(String email, String password){
//        this.emailAddress.clear();
//        this.emailAddress.sendKeys(email);
//        this.password.clear();
//        this.password.sendKeys(password);
//        this.logInButton.click();
//        return PageFactory.initElements(driver, AdminPanel.class);
//    }

    private <T> T loginMeIn(String email, String password, Class<T> expectedPage){
        this.emailAddress.clear();
        this.emailAddress.sendKeys(email);
        this.password.clear();
        this.password.sendKeys(password);
        this.logInButton.click();
        return PageFactory.initElements(driver, expectedPage);
    }

    public DashboardPage loginToDashboard(String email, String password){
        return loginMeIn(email, password, DashboardPage.class);
    }

    public AdminPanel loginToAdminPanel(String email, String password){
        return loginMeIn(email, password, AdminPanel.class);
    }

}
