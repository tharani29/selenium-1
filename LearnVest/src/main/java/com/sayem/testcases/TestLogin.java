package com.sayem.testcases;

import com.sayem.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLogin extends TestBase {

    @Test
    public void resetPassword(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

    // Go to configurations => config.properties to change URL, Email, Password etc.
        homePage.takeMeToLoginPage().logMeIn(loginEmail, loginPassword);

    }
}
