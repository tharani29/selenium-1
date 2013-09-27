package com.sayem.pages.login;

import com.sayem.pages.HomePage;
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

    public HomePage enterPasscode(){
        try {
            passcode();
            passcode();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return PageFactory.initElements(driver, HomePage.class);

    }

    private void passcode() {
        passcodeOne.click();
        passcodeTwo.click();
        passcodeThree.click();
        passcodeFour.click();
    }
}
