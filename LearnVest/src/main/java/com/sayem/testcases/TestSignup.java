package com.sayem.testcases;

import com.sayem.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSignup extends TestBase {

    @Test
    public void resetPassword(){

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.takeMeToSignupPage().signMeUp(loginEmail, "user1234");
    }
}
