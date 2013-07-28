package com.sayem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class SafariTest {

    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device", "iPhone Simulator");
        capabilities.setCapability("version", "6.1");
        capabilities.setCapability("app", "safari");
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),
                capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void runTest() throws Exception {
        driver.get("http://google.com");

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}