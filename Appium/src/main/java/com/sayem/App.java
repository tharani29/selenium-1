package com.sayem;

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
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class App {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        // set up appium
        File app = new File("/Users/ssayem/Downloads/LearnVest.app");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "iOS");
        capabilities.setCapability(CapabilityType.VERSION, "6.0");
        capabilities.setCapability(CapabilityType.PLATFORM, "Mac");
        capabilities.setCapability("app", app.getAbsolutePath());
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }

    @Test
    public void testUIComputation() throws Exception {

        Random rand = new Random();
        int random = rand.nextInt(100);

        String emailAddress = "test"+random+"@ilearnvest.com";

        // Sign Up / Login Button
        driver.findElement(By.xpath("//window[1]/button[1]")).click();

        // Email Address
        driver.findElement(By.xpath("//window[1]/scrollview[1]/textfield[2]")).sendKeys(emailAddress);
        // Done button
        driver.findElement(By.xpath("//window[2]/toolbar[1]/button[3]")).click();

        // Confirm Email Address
        driver.findElement(By.xpath("//window[1]/scrollview[1]/textfield[3]")).sendKeys(emailAddress);
        // Done button
        driver.findElement(By.xpath("//window[2]/toolbar[1]/button[3]")).click();

        // Password
        driver.findElement(By.xpath("//window[1]/scrollview[1]/textfield[4]")).sendKeys("user1234");
        // Done button
        driver.findElement(By.xpath("//window[2]/toolbar[1]/button[3]")).click();

        // Confirm Email Address
        driver.findElement(By.xpath("//window[1]/scrollview[1]/textfield[5]")).sendKeys("user1234");
        // Done button
        driver.findElement(By.xpath("//window[2]/toolbar[1]/button[3]")).click();

        // Create Account
        driver.findElement(By.xpath("//window[1]/scrollview[1]/button[5]")).click();




        /*
          Create Your Passcode
         */
        driver.findElement(By.xpath("//window[1]/button[9]")).click();
        driver.findElement(By.xpath("//window[1]/button[10]")).click();
        driver.findElement(By.xpath("//window[1]/button[11]")).click();
        driver.findElement(By.xpath("//window[1]/button[12]")).click();


        // Confirm Your Passcode
        driver.findElement(By.xpath("//window[1]/button[9]")).click();
        driver.findElement(By.xpath("//window[1]/button[10]")).click();
        driver.findElement(By.xpath("//window[1]/button[11]")).click();
        driver.findElement(By.xpath("//window[1]/button[12]")).click();



    }

    @AfterMethod
    public void tearDown() throws Exception {
        //driver.quit();
    }
}