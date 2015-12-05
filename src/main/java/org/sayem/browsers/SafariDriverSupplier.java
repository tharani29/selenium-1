package org.sayem.browsers;

import org.sayem.selenium.CachedWebDriverSupplier;
import org.openqa.selenium.safari.SafariDriver;

public class SafariDriverSupplier implements CachedWebDriverSupplier<SafariDriver> {
    @Override
    public SafariDriver init() {
        return new SafariDriver();
    }

}
