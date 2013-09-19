package com.sayem.testcases;

import com.sayem.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestResetPasswd extends TestBase {


    @Test
    public void resetPassword(){


        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.takeMeToLoginPage().takeMeToResetPasswordPage()
                .resetMyPassword(loginEmail);
    }
}
