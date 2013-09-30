package com.sayem.testcases;

import com.sayem.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLogin extends TestBase {

// How to implement WebDriver PageObject methods that can return different PageObjects
// http://stackoverflow.com/questions/13371699/how-to-implement-webdriver-pageobject-methods-that-can-return-different-pageobje

    @Test
    public void resetPassword(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

    // Go to configurations => config.properties to change URL, Email, Password etc.
        homePage.takeMeToLoginPage().loginToAdminPanel(loginEmail, loginPassword);

    }
}
