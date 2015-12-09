package org.sayem.browsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.sayem.selenium.CachedWebDriverSupplier;

public class ChromeDriverSupplier implements CachedWebDriverSupplier<ChromeDriver> {

    @Override
    public ChromeDriver init() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--test-type");
        return new ChromeDriver(options);
    }
}
