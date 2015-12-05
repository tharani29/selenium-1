package org.sayem.browsers;

import org.sayem.selenium.CachedWebDriverSupplier;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class InternetExplorerDriverSupplier implements CachedWebDriverSupplier<InternetExplorerDriver> {
    @Override
    public InternetExplorerDriver init() {
        return new InternetExplorerDriver();
    }

}