package com.sayem.businessclasses;

import com.sayem.pages.HomePage;
import com.sayem.pages.SignupPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    public static void main(String [] args){

        // Chrome Driver Path
        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.login();


    }
}
