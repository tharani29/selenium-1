package com.sayem.testcases;

import com.sayem.pages.LandingPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogout extends TestBase{

    @BeforeMethod
    public void setUp() throws Exception {
        initDriver();
    }

    @Test
    protected void testUIComputation() throws Exception {
        String emailAddress = "sayem@ilearnvest.com";
        String password = "user1234";

        LandingPage dashboard = PageFactory.initElements(driver, LandingPage.class);
//        dashboard.takeMeToSignupPage().login().loginIn(emailAddress,password)
//                .goToSettingsPage().logout();

    }

    @AfterMethod
    public void tearDown(){
        //quitDriver();
    }
}
