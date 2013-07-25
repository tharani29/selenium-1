package com.sayem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage {

    private WebDriver driver;

    @FindBy(css = ".button-green.rcorners_right>a")
    private WebElement emailAddress;

    @FindBy(name = "name")
    private WebElement yourName;

    @FindBy(name = "company")
    private WebElement yourCompanyName;

    @FindBy(name = "phone")
    private WebElement yourContactNumber;

    @FindBy(name = "email_from")
    private WebElement sendInvitesAs;

    @FindBy(css = ".select2-choice>span")
    private WebElement yourCountry;

    @FindBy(name = "#login_button")
    private WebElement yourTimeZone;

    @FindBy(css = "#login_button")
    private WebElement saveButton;

    @FindBy(css = "#login_button")
    private WebElement uploadCompanyLogo;

    // Constructor
    public SettingsPage(WebDriver driver){
        this.driver = driver;
    }
}
