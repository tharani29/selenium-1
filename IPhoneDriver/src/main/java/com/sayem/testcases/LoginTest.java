package com.sayem.testcases;

import com.sayem.pages.LandingPage;
import com.sayem.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.iphone.IPhoneDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    public static void main(String [] args){

        WebDriver driver = null;
        try {
            driver = new IPhoneDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.getMessage();
        }

        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        LandingPage landingPage = loginpage.doLogin("ssayem+x@totsy.com", "user123");
        landingPage.goToProductProductPage();
        landingPage.driver.close();

    }
}
