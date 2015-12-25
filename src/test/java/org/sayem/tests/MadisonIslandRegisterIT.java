package org.sayem.tests;

import org.sayem.Browser;
import org.sayem.listeners.Screenshot;
import org.sayem.pages.HomePage;
import org.sayem.reports.ReporterNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by sayem on 12/4/15.
 */
@Listeners({Screenshot.class, ReporterNG.class})
public class MadisonIslandRegisterIT {

    @Test
    public void googleCheeseExample() {
        Browser.setBrowserUrl("http://enterprise-demo.user.magentotrial.com/");
        HomePage page = Browser.pageFactory(HomePage.class);
        page.register().createAnAccount();
    }

    @AfterMethod
    public void clearCookies() {
        Browser.driver().manage().deleteAllCookies();
    }

    @AfterSuite
    public void quitBrowser() {
        Browser.quitBrowser();
    }
}