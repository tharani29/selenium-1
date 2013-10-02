package com.sayem.testcases;

import com.sayem.pages.LandingPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;


public class TestSignup extends TestBase{

    @BeforeMethod
    public void setUp() throws Exception {
        initDriver();
    }

    @Test
    protected void testUIComputation() throws Exception {
        Random rand = new Random();
        int random = rand.nextInt((2147483647 - 1) + 1);
        char c = (char)(rand.nextInt(26) + 'a');
        String emailAddress = "signup"+c+random+c+"@ilearnvest.com";

        LandingPage dashboard = PageFactory.initElements(driver, LandingPage.class);
        dashboard.takeMeToSignupPage().signMeUp(emailAddress, "user1234")
                .enterPasscode().aBitAboutYourself();
    }

    @AfterMethod
    public void tearDown(){
        //quitDriver();
    }
}
