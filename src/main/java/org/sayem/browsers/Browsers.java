package org.sayem.browsers;


import org.openqa.selenium.WebDriver;
import org.sayem.selenium.Browser;
import org.sayem.selenium.CachedWebDriverSupplier;

public enum Browsers implements Browser {

    FIREFOX(new FirefoxBrowser()),
    CHROME(new ChromeBrowser()),
    HEADLESS_MAC(new HeadlessFirefoxBrowserMac()),
    HEADLESS_LINUX(new HeadlessFirefoxBrowserLinux()),
    SAFARI(new SafariBrowser()),
    INTERNET_EXPLORER(new InternetExplorerBrowser()),
    ANDROID(new AndroidBrowser()),
    IOS(new IOSBrowser());

    private final CachedWebDriverSupplier<? extends WebDriver> webDriverSupplier;

    Browsers(CachedWebDriverSupplier<? extends WebDriver> driverDecorator) {
        this.webDriverSupplier = driverDecorator;
    }

    public CachedWebDriverSupplier<? extends WebDriver> getSupplier() {
        return webDriverSupplier;
    }
}
