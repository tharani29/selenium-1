package org.sayem.browsers;

import org.openqa.selenium.safari.SafariDriver;
import org.sayem.selenium.CachedWebDriverSupplier;

public class SafariDriverSupplier implements CachedWebDriverSupplier<SafariDriver> {
    @Override
    public SafariDriver init() {
        return new SafariDriver();
    }

}
