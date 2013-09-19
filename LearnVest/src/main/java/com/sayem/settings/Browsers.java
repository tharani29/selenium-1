package com.sayem.settings;

import com.sayem.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Browsers {
    private WebDriver driver;

    public void instantiateBrowser(BrowserType browserType, String url) {
        driver = getWebDriver(browserType);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(url);
    }

    public void closeBrowser() {
        driver.close();
    }

    public WebDriver getWebDriver(BrowserType browserType) {
        switch (browserType) {
            case FIREFOX:
                // Need to implement
                return null;
            case IE:
                // Need to implement
                return null;
            case CHROME:
                // Need to implement
                return null;
            case HTMLUNIT:
                // Need to implement
                return null;
            default:
                throw new RuntimeException("IBrowser type unsupported");
        }
    }
}
