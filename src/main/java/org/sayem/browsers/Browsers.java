package org.sayem.browsers;


import org.openqa.selenium.WebDriver;
import org.sayem.selenium.Browser;
import org.sayem.selenium.CachedWebDriverSupplier;

public enum Browsers implements Browser {

    FIREFOX(new FirefoxDriverSupplier()),
    CHROME(new ChromeDriverSupplier()),
    HEADLESS_MAC(new HeadlessFirefoxDriverSupplierOnMacOs()),
    HEADLESS_LINUX(new HeadlessFirefoxDriverSupplierOnLinux()),
    SAFARI(new SafariDriverSupplier()),
    INTERNET_EXPLORER(new InternetExplorerDriverSupplier());

    private final CachedWebDriverSupplier<? extends WebDriver> webDriverSupplier;

    Browsers(CachedWebDriverSupplier<? extends WebDriver> driverDecorator) {
        this.webDriverSupplier = driverDecorator;
    }

    public CachedWebDriverSupplier<? extends WebDriver> getSupplier() {
        return webDriverSupplier;
    }
}
