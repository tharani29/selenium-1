package org.sayem.browsers;

import org.sayem.browsers.config.IBrowserThreads;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sayem on 12/4/15.
 */
public class PhantomJSBrowser implements IBrowserThreads {

    @Override
    public DesiredCapabilities getDesiredCapabilities(Proxy proxySettings) {
        DesiredCapabilities capabilities = DesiredCapabilities.phantomjs();
        final List<String> cliArguments = new ArrayList<>();
        cliArguments.add("--web-security=false");
        cliArguments.add("--ssl-protocol=any");
        cliArguments.add("--ignore-ssl-errors=true");
        capabilities.setCapability("phantomjs.cli.args", applyPhantomJSProxySettings(cliArguments, proxySettings));
        capabilities.setCapability("takesScreenshot", true);
        return capabilities;
    }

    @Override
    public WebDriver getWebDriverObject(DesiredCapabilities capabilities) {
        return new PhantomJSDriver(capabilities);
    }
}
