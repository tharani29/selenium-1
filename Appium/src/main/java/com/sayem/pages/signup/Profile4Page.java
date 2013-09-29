package com.sayem.pages.signup;

import com.sayem.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile4Page {

    private WebDriver driver;

    public Profile4Page(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(name = "Sign Up / Log In")
    private WebElement showMeMyApp;


    public HomePage signUpAndLogin(){
        return PageFactory.initElements(driver, HomePage.class);

    }
}
