package com.sayem.pages.login;

import com.sayem.pages.signup.Profile1Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasscodePage {

    private WebDriver driver;

    public PasscodePage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//window[1]/button[9]")
    private WebElement passcodeOne;

    @FindBy(xpath = "//window[1]/button[10]")
    private WebElement passcodeTwo;

    @FindBy(xpath = "//window[1]/button[11]")
    private WebElement passcodeThree;

    @FindBy(xpath = "//window[1]/button[12]")
    private WebElement passcodeFour;

    public Profile1Page enterPasscode(){
        passcode();
        passcode();
        return PageFactory.initElements(driver, Profile1Page.class);

    }

    private void passcode() {
        passcodeOne.click();
        passcodeTwo.click();
        passcodeThree.click();
        passcodeFour.click();
    }
}
