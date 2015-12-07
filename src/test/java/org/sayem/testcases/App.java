package org.sayem.testcases;

import org.junit.Test;
import org.sayem.browsers.Browsers;
import org.sayem.pages.HomePage;
import org.testng.Assert;

/**
 * Created by sayem on 12/4/15.
 */
public class App {

    @Test
    public void testGoogle() {
        HomePage<?> driver = new HomePage<>(Browsers.CHROME);
        driver
                .first(Assert::assertEquals)
                .second(Assert::assertNotEquals)
                .third(Assert::assertEquals);
        driver.quit();
    }
}