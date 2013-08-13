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
    protected void testUIComputation() throws Exception {

        String emailAddress = "sayem@ilearnvest.com";
        String password = "user1234";

        LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
        landingPage.signUpAndLogin().login().loginIn(emailAddress, password);

    }
}
