package com.sayem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLookupPage extends BasePage{

    private WebDriver driver;

    public UserLookupPage(WebDriver driver){
        this.driver = driver;
    }
    @Override
    protected void load() {
//        String url = "https://www.learnvest.com";
//        this.driver.get(url);
    }

    @Override
    protected void isLoaded() throws Error {
//        String title = "LearnVest - Financial Planning Services and Personal Finance News";
//        assertTrue(driver.getTitle().equals(title));
    }

    @FindBy(name = "emailInput")
    private WebElement emailAddress;


    public void quickSearch(String email, String password){
        this.emailAddress.clear();

    }
}
