package com.sayem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//window[1]/button[1]")
    private WebElement moneyCenter;

    @FindBy(xpath = "//window[1]/button[1]")
    private WebElement financialConsultation;

    @FindBy(xpath = "//window[1]/button[1]")
    private WebElement learnVestArticles;

    @FindBy(xpath = "//window[1]/button[1]")
    private WebElement Settings;

    public SettingsPage signUpAndLogin(){
        return PageFactory.initElements(driver, SettingsPage.class);

    }


}
