package com.sayem.pages;

import org.openqa.selenium.WebDriver;

public class ProgramPage extends BasePage {

    private WebDriver driver;

    public ProgramPage(WebDriver driver){
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
}
