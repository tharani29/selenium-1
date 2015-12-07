package org.sayem.testcases;

import org.junit.Test;
import org.sayem.assertion.Assertion;
import org.sayem.browsers.Browsers;
import org.sayem.pages.HomePage;

/**
 * Created by sayem on 12/4/15.
 */
public class App {

    @Test
    public void testGoogle() {
        HomePage<?> driver = new HomePage<>(Browsers.CHROME);
        driver
                .first(Assertion::assertEquals)
                .second(Assertion::assertNotEquals)
                .third(Assertion::assertEquals);
        driver.quit();
    }
}
