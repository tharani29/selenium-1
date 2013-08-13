package com.sayem.draft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;

public class BMICalculator {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        // set up appium
        File app = new File("/Users/sayem/appium-apps/BmiCalculator.app");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "iOS");
        capabilities.setCapability(CapabilityType.VERSION, "6.0");
        capabilities.setCapability(CapabilityType.PLATFORM, "Mac");
        capabilities.setCapability("app", app.getAbsolutePath());
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }

    @Test
    public void testUIComputation() throws Exception {
        driver.findElement(By.xpath("//window[1]/textfield[1]")).sendKeys("2");
        driver.findElement(By.xpath("//window[1]/textfield[2]")).sendKeys("2");
        driver.findElement(By.xpath("//window[1]/button[1]")).click();


    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}