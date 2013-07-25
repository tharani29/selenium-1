package com.sayem.businessclasses;

import com.sayem.pages.Dashboard;
import com.sayem.pages.HomePage;
import com.sayem.pages.SignupPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SignupTest {

    public static void main(String [] args){

       // Chrome Driver Path
        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to("https://www.interviewstreet.com");


        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SignupPage signupPage = homePage.signup();
        signupPage.registration("sayem4+8@gmail.com","user123", "Test User",
                "Totsy", "7189568116");

    }
}
