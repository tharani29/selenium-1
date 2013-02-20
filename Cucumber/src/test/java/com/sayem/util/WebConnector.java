package com.sayem.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class WebConnector {

    // logging
    // Initialize properties file
    // selenium layers - selenium commands


    Properties OR = null;
    Properties CONFIG = null;

    WebDriver driver = null;

    public WebConnector(){

        if (OR == null){
            try {

                // Initialize OR
                OR = new Properties();
                FileInputStream fs = new FileInputStream("Cucumber\\src\\test\\java\\com\\sayem\\config/OR.properties");

                OR.load(fs);

                // Initialize CONFIG
                CONFIG = new Properties();

                fs = new FileInputStream("Cucumber\\src\\test\\java\\com\\sayem\\config\\"+OR.getProperty("testEnv")+"_config.properties");
                CONFIG.load(fs);

                //System.out.println(OR.getProperty("loginusername"));
                //System.out.println(CONFIG.getProperty("loginURL"));

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }

    public void openBrowser(String browserType){
        if (browserType.equalsIgnoreCase("Mozilla")){
            driver = new FirefoxDriver();
        }else if (browserType.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "ChromeDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browserType.equalsIgnoreCase("IE")){
            driver = new InternetExplorerDriver();
        }

        // Maximize Window
        driver.manage().window().maximize();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void navigate(String URL){
        driver.get(CONFIG.getProperty(URL));
    }

    public void click(String objectName){
        //driver.findElement(By.cssSelector("")).click();
    }

    public void type(){

    }

    public void select(){

    }

    public boolean isElementPresent(){
        return true;
    }

}
