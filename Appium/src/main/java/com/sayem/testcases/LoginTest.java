package com.sayem.testcases;

import com.sayem.pages.LandingPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    @BeforeMethod
    public void setUp() throws Exception {
        initDriver();
    }


    @Test
    protected void testUIComputation() throws Exception {

        String emailAddress = "sayem@learnvest.com";
        String password = "sami3092";

        LandingPage dashboard = PageFactory.initElements(driver, LandingPage.class);
        dashboard.takeMeToSignupPage().login().loginIn(emailAddress, password)
                .enterPasscode();
    }

    @AfterMethod
    public void tearDown(){
        //quitDriver();
    }
}
