package org.sayem.browsers;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.sayem.selenium.CachedWebDriverSupplier;


public class InternetExplorerDriverSupplier implements CachedWebDriverSupplier<InternetExplorerDriver> {
    @Override
    public InternetExplorerDriver init() {
        return new InternetExplorerDriver();
    }

}