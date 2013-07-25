package com.sayem.businessclasses;

import com.sayem.pages.Dashboard;
import com.sayem.pages.HomePage;
import com.sayem.pages.SettingsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BasicInfoTest {
    public static void main(String [] args){

        // Chrome Driver Path
        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to("https://www.interviewstreet.com");

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Dashboard dashboard = homePage.login("sayem4@gmail.com", "user123");
        dashboard.settingMenu();


    }
}
