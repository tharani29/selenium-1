package com.sayem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

    private WebDriver driver;

    // Constructor
    public Dashboard(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id='email']")
    private WebElement emailAddress;

    @FindBy(xpath = "//*[@id='pass']")
    private WebElement settings;


    // Click on your email address on top right corner
    public Dashboard settingMenu(){
        emailAddress.click();
        settings.click();
        return PageFactory.initElements(driver, Dashboard.class);

    }
}
