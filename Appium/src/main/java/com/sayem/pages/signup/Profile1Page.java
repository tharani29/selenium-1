package com.sayem.pages.signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile1Page {

    private WebDriver driver;

    public Profile1Page(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//window[1]/scrollview[1]/webview[1]/textfield[1]")
    private WebElement firstName;

    @FindBy(xpath = "//window[1]/scrollview[1]/webview[1]/textfield[2]")
    private WebElement age;

    @FindBy(name = "Male")
    private WebElement maleButton;

    @FindBy(name = "female")
    private WebElement femaleButton;

    // I Make Financial Decisions...
    @FindBy(xpath = "//window[1]/scrollview[1]/webview[1]/element[1]")
    private WebElement selectTab;

    @FindBy(xpath = "Sign Up / Log In")
    private WebElement withMySpouseLink;

    @FindBy(xpath = "Sign Up / Log In")
    private WebElement nextButton;

    @FindBy(name = "Done")
    private WebElement doneButton;

    public Profile2Page aBitAboutYourself(){
        firstName.sendKeys("Syed");
        doneButton.click();
        age.sendKeys("30");
        doneButton.click();
        maleButton.click();
        return PageFactory.initElements(driver, Profile2Page.class);

    }
}