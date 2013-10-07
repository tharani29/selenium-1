package com.sayem.screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TakeAScreenShot {

    public static void main(String[] args) throws InterruptedException, IOException {
        //Initialise firefox browser
        WebDriver driver = new FirefoxDriver();

        /* Next line makes the browser wait for 7 seconds before declaring it cant find an element.
           Good for slow loading websites*/
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        driver.get("http://www.sojicity.com/");

        System.out.println("Taking Screen Shot");
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("c:\\logicandtricks\\screenshot.jpg"));

        driver.quit();
    }
}