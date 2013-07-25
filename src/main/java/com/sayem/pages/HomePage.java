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

    // Constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public SignupPage signup(){
        signupButton.click();
        return PageFactory.initElements(driver, SignupPage.class);
    }

    public Dashboard login(){
        loginButton.click();
        return PageFactory.initElements(driver, Dashboard.class);
    }
}
