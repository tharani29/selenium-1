package com.sayem.testcases;

import com.sayem.pages.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {

    }

    @Test
    protected void testUIComputation() throws Exception {

        String emailAddress = "sayem@ilearnvest.com";
        String password = "user1234";

        LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
        landingPage.signUpAndLogin().login().loginIn(emailAddress, password);
    }
}
