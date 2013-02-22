package com.sayem.rough.businessclasses;

import com.sayem.pages.LandingPage;
import com.sayem.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    public static void main(String [] args){

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        LandingPage landingPage = loginpage.doLogin("syed@hotmail.com", "s@m13o9z");
        landingPage.goToProfile();

    }
}
