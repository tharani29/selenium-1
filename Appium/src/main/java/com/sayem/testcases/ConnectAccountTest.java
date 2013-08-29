package com.sayem.testcases;

import com.sayem.pages.random.LandingPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ConnectAccountTest extends TestBase{


    @BeforeMethod
    public void setUp() throws Exception {
        initDriver();
    }


    @Test
    protected void testUIComputation() throws Exception {

        String emailAddress = "sayem@ilearnvest.com";
        String password = "user1234";

        LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
        landingPage.signUpAndLogin().login().loginIn(emailAddress, password);
    }
}
