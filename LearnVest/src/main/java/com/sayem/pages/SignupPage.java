package com.sayem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage extends BasePage {

    private WebDriver driver;

    public SignupPage(WebDriver driver){
        this.driver = driver;
    }
    @Override
    protected void load() {
//        String url = "https://www.learnvest.com/s/get-started/";
//        this.driver.get(url);
    }

    @Override
    protected void isLoaded() throws Error {
//        String title = "Join LearnVest - Talk to an Expert for free";
//        assertTrue(driver.getTitle().equals(title));
    }

    @FindBy(name = "email")
    private WebElement emailAddress;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(css = ".submit_button.homepage-button")
    private WebElement startFreeProfileButton;

    @FindBy(css = "#inputCompany")
    private WebElement getDailyEmailRadioButton;


    public DashboardPage signMeUp(String email, String password){
        this.emailAddress.sendKeys(email);
        this.password.sendKeys(password);
        this.startFreeProfileButton.click();
        return PageFactory.initElements(driver, DashboardPage.class);
    }
}
