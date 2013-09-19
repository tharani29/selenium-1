package com.sayem.examples;

import com.sayem.locators.SizzleSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SizzleExample {

    private static WebDriver driver;
    SizzleSelector sizzle;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver(); sizzle = new SizzleSelector(driver);
        driver.get("http://selenium.polteq.com/prestashop/");
    }


    @AfterClass
    public void tearDown() {
        driver.close(); driver.quit();
    }

    @Test
    public void useSizzleSelector() {
        sizzle.findElementBySizzleCss("input#search_query_top").sendKeys("ipod nano");
        sizzle.findElementBySizzleCss("input[name='submit_search']").click();
        String searchHeader = sizzle.findElementBySizzleCss("H1").getText().toLowerCase();
        Assert.assertTrue(searchHeader.contains("ipod nano"));
    }
}