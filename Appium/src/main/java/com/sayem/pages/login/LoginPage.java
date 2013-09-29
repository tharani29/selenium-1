package com.sayem.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//window[1]/scrollview[1]/textfield[2]")
    private WebElement emailAddress;

    @FindBy(xpath = "//window[1]/scrollview[1]/secure[2]")
    private WebElement password;

    @FindBy(name = "Submit")
    private WebElement submitButton;

    @FindBy(name = "Done")
    private WebElement doneButton;

    public PasscodePage loginIn(String emailAddress, String password) throws InterruptedException {
        Thread.sleep(3000L);
        this.emailAddress.sendKeys(emailAddress);
        this.doneButton.click();
        this.password.sendKeys(password);
        this.doneButton.click();
        this.submitButton.click();
        return PageFactory.initElements(driver, PasscodePage.class);
    }
}
