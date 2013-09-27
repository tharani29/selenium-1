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
    private WebElement dagBank;



    public SignupPage signUpAndLogin(){
        signUpLoginButton.click();
        return PageFactory.initElements(driver, SignupPage.class);

    }


    public void budgetSetup(){
        getStartedButton.click();
        searchForAnAccount.sendKeys("dag");
    }
}
