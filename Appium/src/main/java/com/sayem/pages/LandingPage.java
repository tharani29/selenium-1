package com.sayem.pages;

import com.sayem.pages.signup.SignupPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    private WebDriver driver;

    public LandingPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(name = "Sign Up / Log In")
    private WebElement signUpLoginButton;

    public SignupPage takeMeToSignupPage(){
        signUpLoginButton.click();
        return PageFactory.initElements(driver, SignupPage.class);

    }
}
