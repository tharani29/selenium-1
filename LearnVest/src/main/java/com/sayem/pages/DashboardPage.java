package com.sayem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {

    private WebDriver driver;

    public DashboardPage(WebDriver driver){
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

    @FindBy(xpath = "//*[@id='email']")
    private WebElement emailAddress;

    @FindBy(xpath = "//*[@id='pass']")
    private WebElement settings;


    // IClick on your email address on top right corner
    public DashboardPage settingMenu(){
        emailAddress.click();
        settings.click();
        return PageFactory.initElements(driver, DashboardPage.class);

    }

    public void addAccount(){

    }

    public void inviteFriends(){

    }
}
