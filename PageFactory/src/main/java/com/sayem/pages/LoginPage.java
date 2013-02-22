package com.sayem.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//*[@id='pass']")
    private WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    private WebElement loginButton;


    public LandingPage doLogin(String email, String password){
        driver.get("http://www.facebook.com");
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.password.sendKeys(Keys.ENTER);

        return PageFactory.initElements(driver, LandingPage.class);

    }
}
