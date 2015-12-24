package org.sayem.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import static org.sayem.Browser.driver;
import static org.sayem.Browser.quitBrowser;

/**
 * Created by sayem on 12/24/15.
 */
public class MagentoTest {

    @Test
    public void magentoTest(){
        driver().navigate().to("http://enterprise-demo.user.magentotrial.com/");
//        driver().findElement(By.cssSelector("")).sendKeys("");
    }

    @AfterSuite
    public void tearDown(){
        quitBrowser();
    }
}
