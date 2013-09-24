package com.sayem.testcases;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver = null;
    public static Properties CONFIG = null;
    public static Properties OR = null;
    public static boolean isLoggedIn=false;

    String loginEmail;
    String loginPassword;
    String signupEmail;
    String signupPassword;

    public TestBase(){

        if (driver == null) {
            // Initialize the properties file
            CONFIG = new Properties();
            OR = new Properties();
            try {
                // Load the Config Properties
                FileInputStream fs = new FileInputStream("LearnVest/src/main/java/com/sayem/configurations/config.properties");
                CONFIG.load(fs);

                // Load the OR Properties
                fs= new FileInputStream("LearnVest/src/main/java/com/sayem/configurations/OR.properties");
                OR.load(fs);
            } catch (Exception e) {
                return;
            }

            //System.out.println(CONFIG.getProperty("browser"));
            if (CONFIG.getProperty("browser").equalsIgnoreCase("Firefox"))
                driver= new FirefoxDriver();
            else if (CONFIG.getProperty("browser").equalsIgnoreCase("Safari"))
                driver= new SafariDriver();
            else if (CONFIG.getProperty("browser").equalsIgnoreCase("IE"))
                driver= new InternetExplorerDriver();
            else if (CONFIG.getProperty("browser").equalsIgnoreCase("Chrome")){
                System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver");
                driver= new ChromeDriver();
            }

            // URL for the whole framework
            driver.navigate().to(CONFIG.getProperty("testsiteBaseURL"));

            // Implicit wait for whole framework
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            // Signup & login information
            Random rand = new Random();
            int random = rand.nextInt((2147483647 - 1) + 1);
            char c = (char)(rand.nextInt(26) + 'a');
            String emailAddress = "signup"+c+random+c+"@ilearnvest.com";

            loginEmail = CONFIG.getProperty("emailAddress");
            loginPassword = CONFIG.getProperty("password");
            signupPassword = CONFIG.getProperty("password");
            signupEmail = emailAddress;
        }
    }

    // IClick Method
    public void click(String xpathKey){
        try{
            driver.findElement(By.xpath(OR.getProperty(xpathKey))).click();
        }catch(Exception e){
            System.out.println("error");
            e.printStackTrace();
            // report error
        }
    }
    // Input

    public void input(String xpathKey, String text){
        try{
            driver.findElement(By.xpath(OR.getProperty(xpathKey))).sendKeys(text);
        }catch(Exception e){
            // report error
            e.printStackTrace();
        }
    }

    // Verification
    public boolean isElementPresent(String xpathKey){
        try{
            driver.findElement(By.xpath(OR.getProperty(xpathKey)));
        }catch(Exception e){
            return false;
        }
        return true;
    }

    public void selectEvent(){
        try {
            WebElement eventList = driver.findElement(By.className("live-events-container"));
            List<WebElement> events = eventList.findElements(By.className("event-link"));
            Random num = new Random();
            int index=num.nextInt(events.size());
            events.get(index).click();

        } catch (Exception e) {
            e.getMessage();
        }
    }

    // finds the link on pages
    public boolean isLinkPresent(String linkText){
        try{
            driver.findElement(By.linkText(linkText));
        }catch(Exception e){
            return false;
        }
        return true;
    }

    public static void takeScreenshot(String fileName) {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "\\screenshots\\" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
