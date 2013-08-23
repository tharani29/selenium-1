package com.sayem.testcases;

import com.sayem.pages.LandingPage;
import com.sayem.pages.SignupPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;


public class SignupTest extends TestBase{

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

        LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
        SignupPage signupPage = landingPage.signUpAndLogin();
        signupPage.signUp(emailAddress, "user1234", "Syed", "30");
    }
}
