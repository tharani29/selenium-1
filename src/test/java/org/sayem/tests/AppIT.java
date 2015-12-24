package org.sayem.tests;

import org.sayem.Browser;
import org.sayem.listeners.ScreenshotListener;
import org.sayem.pages.HomePage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by sayem on 12/4/15.
 */
@Listeners(ScreenshotListener.class)
public class AppIT {

    @Test
    public void googleCheeseExample() {
        HomePage page = Browser.pageFactory(HomePage.class);
        page.first()
                .second()
                .third()
                .quit();
    }
}