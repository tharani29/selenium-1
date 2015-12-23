package org.sayem.browsers;

import org.sayem.browsers.config.IBrowserThreads;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by sayem on 12/4/15.
 */
public class HtmlUnitBrowser implements IBrowserThreads {

    @Override
    public DesiredCapabilities getDesiredCapabilities(Proxy proxySettings) {
        DesiredCapabilities capabilities = DesiredCapabilities.htmlUnit();
        return addProxySettings(capabilities, proxySettings);
    }

    @Override
    public WebDriver getWebDriverObject(DesiredCapabilities capabilities) {
        return new HtmlUnitDriver(capabilities);
    }
}
