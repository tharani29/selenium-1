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

    @FindBy(name = "Finished! Show Me My App")
    private WebElement showMeMyApp;


    public HomePage finishedShowMeMyApp(){
        showMeMyApp.click();
        return PageFactory.initElements(driver, HomePage.class);

    }
}
