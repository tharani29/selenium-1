package org.sayem.tests;

import org.openqa.selenium.By;
import org.sayem.Browser;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.sayem.Browser.driver;
import static org.sayem.Browser.quitBrowser;

/**
 * Created by sayem on 12/24/15.
 */
public class HowToUploadFile {

    @Test
    public void magentoTest() throws InterruptedException {
        String homeDir = System.getProperty("user.home");
        Browser.setBrowserUrl("http://the-internet.herokuapp.com/upload");
        driver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver().findElement(By.id("file-upload")).sendKeys(homeDir + "/IdeaProjects/selenium/some-file.txt");
        driver().findElement(By.id("file-submit")).click();
        String fileUploaed = driver().findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(fileUploaed, "some-file.txt");
    }

    @AfterSuite
    public void tearDown() {
        quitBrowser();
    }
}
