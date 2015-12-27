package org.sayem.tests;

import org.openqa.selenium.By;
import org.sayem.browsers.Browser;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.sayem.browsers.Browser.driver;

/**
 * Created by sayem on 12/24/15.
 */
public class HowToUploadFile {

    @Test
    public void magentoTest() throws InterruptedException {
        String homeDir = System.getProperty("user.home");
        Browser.setBrowserUrl("http://the-internet.herokuapp.com/upload");
        Browser.driver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Browser.driver().findElement(By.id("file-upload")).sendKeys(homeDir + "/IdeaProjects/selenium/important.txt");
        Browser.driver().findElement(By.id("file-submit")).click();
        String fileUploaed = driver().findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(fileUploaed, "important.txt");
    }

    @AfterSuite
    public void tearDown() {
        Browser.quitBrowser();
    }
}
