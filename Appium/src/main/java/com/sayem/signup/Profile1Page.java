package com.sayem.signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile1Page {

    private WebDriver driver;

    public Profile1Page(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(name = "Sign Up / Log In")
    private WebElement firstName;

    @FindBy(name = "Sign Up / Log In")
    private WebElement age;

    @FindBy(name = "Sign Up / Log In")
    private WebElement maleButton;

    @FindBy(name = "Sign Up / Log In")
    private WebElement femaleButton;

    // I Make Financial Decisions...
    @FindBy(name = "Sign Up / Log In")
    private WebElement dropDownTab;

    @FindBy(name = "Sign Up / Log In")
    private WebElement withMySpouseLink;

    @FindBy(name = "Sign Up / Log In")
    private WebElement nextButton;

    public Profile2Page signUpAndLogin(){
        firstName.sendKeys();
        age.sendKeys();
        maleButton.click();
        dropDownTab.click();
        withMySpouseLink.click();
        nextButton.click();

        return PageFactory.initElements(driver, Profile2Page.class);

    }
}