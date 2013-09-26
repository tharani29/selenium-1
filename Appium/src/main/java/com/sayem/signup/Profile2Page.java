package com.sayem.signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile2Page {

    private WebDriver driver;

    public Profile2Page(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(name = "Sign Up / Log In")
    private WebElement budgetBetter;

    @FindBy(name = "Sign Up / Log In")
    private WebElement saveMore;

    @FindBy(name = "Sign Up / Log In")
    private WebElement retireWell;

    @FindBy(name = "Sign Up / Log In")
    private WebElement payOffCards;

    @FindBy(name = "Sign Up / Log In")
    private WebElement buyAHouse;

    @FindBy(name = "Sign Up / Log In")
    private WebElement dealWithLoans;

    @FindBy(name = "Sign Up / Log In")
    private WebElement investWisely;

    @FindBy(name = "Sign Up / Log In")
    private WebElement earnMore;

    @FindBy(name = "Sign Up / Log In")
    private WebElement nextButton;


    public Profile3Page signUpAndLogin(){
        return PageFactory.initElements(driver, Profile3Page.class);

    }
}
