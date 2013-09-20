package com.sayem.examples;

import com.sayem.base.SizzleSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SizzleExample {

    private static WebDriver driver;
    SizzleSelector sizzleSelector;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver(); sizzleSelector = new SizzleSelector(driver);
        driver.get("http://selenium.polteq.com/prestashop/");
    }


    @AfterClass
    public void tearDown() {
        driver.close(); driver.quit();
    }

    @Test
    public void useSizzleSelector() {
        sizzleSelector.findElementBySizzleCss("input#search_query_top").sendKeys("ipod nano");
        sizzleSelector.findElementBySizzleCss("input[name='submit_search']").click();
        String searchHeader = sizzleSelector.findElementBySizzleCss("H1").getText().toLowerCase();
        Assert.assertTrue(searchHeader.contains("ipod nano"));
    }
}