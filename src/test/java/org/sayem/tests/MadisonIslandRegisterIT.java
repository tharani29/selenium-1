package org.sayem.tests;

import org.sayem.Browser;
import org.sayem.listeners.ScreenshotListener;
import org.sayem.pages.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by sayem on 12/4/15.
 */
@Listeners(ScreenshotListener.class)
public class MadisonIslandRegisterIT {

    @Test
    public void googleCheeseExample() {
        HomePage page = Browser.pageFactory(HomePage.class);
        page.register();
    }

    @AfterMethod
    public void clearCookies(){
        Browser.driver().manage().deleteAllCookies();
    }

    @AfterSuite
    public void quitBrowser(){
        Browser.quitBrowser();
    }
}