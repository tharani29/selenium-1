package com.sayem.signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile3Page {

    private WebDriver driver;

    public Profile3Page(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(name = "Sign Up / Log In")
    private WebElement income;

    @FindBy(name = "Sign Up / Log In")
    private WebElement totalSaving;

    @FindBy(name = "Sign Up / Log In")
    private WebElement totalDebt;

    @FindBy(name = "Sign Up / Log In")
    private WebElement anyKids;

    @FindBy(name = "Sign Up / Log In")
    private WebElement nextButton;

    @FindBy(name = "Sign Up / Log In")
    private WebElement backButton;


    public Profile4Page signUpAndLogin(){
        return PageFactory.initElements(driver, Profile4Page.class);

    }
}
