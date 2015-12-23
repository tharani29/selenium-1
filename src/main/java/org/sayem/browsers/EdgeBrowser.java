package org.sayem.browsers;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sayem.browsers.config.IBrowserThreads;

/**
 * Created by sayem on 12/4/15.
 */
public class EdgeBrowser implements IBrowserThreads {

    @Override
    public DesiredCapabilities getDesiredCapabilities(Proxy proxySettings) {
        DesiredCapabilities capabilities = DesiredCapabilities.edge();
        return addProxySettings(capabilities, proxySettings);
    }

    @Override
    public WebDriver getWebDriverObject(DesiredCapabilities capabilities) {
        return new EdgeDriver(capabilities);
    }
}
