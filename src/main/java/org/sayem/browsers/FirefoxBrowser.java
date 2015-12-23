package org.sayem.browsers;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sayem.browsers.config.IBrowserThreads;

/**
 * Created by sayem on 12/4/15.
 */
public class FirefoxBrowser implements IBrowserThreads {

    @Override
    public DesiredCapabilities getDesiredCapabilities(Proxy proxySettings) {
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        return addProxySettings(capabilities, proxySettings);
    }

    @Override
    public WebDriver getWebDriverObject(DesiredCapabilities capabilities) {
        return new FirefoxDriver(capabilities);
    }
}
