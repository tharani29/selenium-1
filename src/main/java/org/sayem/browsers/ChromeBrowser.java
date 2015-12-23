package org.sayem.browsers;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sayem.browsers.config.IBrowserThreads;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by sayem on 12/4/15.
 */
public class ChromeBrowser implements IBrowserThreads {

    @Override
    public DesiredCapabilities getDesiredCapabilities(Proxy proxySettings) {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("chrome.switches", Arrays.asList("--no-default-browser-check"));
        HashMap<String, String> chromePreferences = new HashMap<>();
        chromePreferences.put("profile.password_manager_enabled", "false");
        capabilities.setCapability("chrome.prefs", chromePreferences);
        return addProxySettings(capabilities, proxySettings);
    }

    @Override
    public WebDriver getWebDriverObject(DesiredCapabilities capabilities) {
        return new ChromeDriver(capabilities);
    }
}
