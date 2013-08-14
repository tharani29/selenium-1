package com.sayem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage {


    private WebDriver driver;

    public SettingsPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//window[1]/button[2]")
    private WebElement passcodeButton;

    @FindBy(xpath = "//window[1]/button[3]")
    private WebElement accountsButton;

    @FindBy(xpath = "//window[1]/button[4]")
    private WebElement helpAndSupportButton;

    @FindBy(xpath = "//window[1]/button[5]")
    private WebElement feedbackButton;

    @FindBy(name = "LOG OUT")
    private WebElement  logoutButton;

    @FindBy(xpath = "//window[3]/alert[1]/button[2]")
    private WebElement alertBox;



    public void passcode(){
        passcodeButton.click();
    }

    public void accounts(){
        accountsButton.click();
    }

    public void helpAndSupport(){
        helpAndSupportButton.click();
    }

    public void feedback(){
        feedbackButton.click();
    }

    public void logout(){
        logoutButton.click();
        alertBox.click();

    }
}
