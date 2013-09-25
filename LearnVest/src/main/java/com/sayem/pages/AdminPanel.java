package com.sayem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPanel extends BasePage{

    private WebDriver driver;

    public AdminPanel(WebDriver driver){
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

    @FindBy(xpath = "//*[@id='adminPanelLinks']/a[3]")
    private WebElement premiumClientSearchLink;

    public UserLookupPage takeMeToUserLookUpDashboard(){
        premiumClientSearchLink.click();
        return PageFactory.initElements(driver, UserLookupPage.class);
    }
}
