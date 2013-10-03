package com.sayem.pages.mymoney;

import com.sayem.pages.signup.SignupPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyMoneyPage {

    private WebDriver driver;

    public MyMoneyPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//window[1]/button[1]")
    private WebElement signUpLoginButton;

    @FindBy(xpath = "//window[1]/button[2]")
    private WebElement getStartedButton;

    @FindBy(xpath = "//window[1]/textfield[1]")
    private WebElement searchForAnAccount;

    @FindBy(xpath = "//window[1]/tableview[1]/cell[1]/text[1]")
    private WebElement bankName;

    @FindBy(xpath = "")
    private WebElement userID;

    @FindBy(xpath = "")
    private WebElement password;

    @FindBy(xpath = "")
    private WebElement submitButton;

    @FindBy(xpath = "")
    private WebElement cancelButton;

    @FindBy(xpath = "")
    private WebElement doneButton;

    @FindBy(xpath = "")
    private WebElement nextButton;

    @FindBy(xpath = "")
    private WebElement prevButton;



    public SignupPage signUpAndLogin(){
        signUpLoginButton.click();
        return PageFactory.initElements(driver, SignupPage.class);
    }

    public void setUpYourBudget(){
        getStartedButton.click();
        searchForAnAccount.sendKeys("CAPITAL ONE - BANK");
        bankName.click();


    }
}
