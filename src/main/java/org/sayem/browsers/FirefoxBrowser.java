package org.sayem.browsers;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.sayem.selenium.CachedWebDriverSupplier;

public class FirefoxBrowser implements CachedWebDriverSupplier<FirefoxDriver> {
    @Override
    public FirefoxDriver init() {
        return new FirefoxDriver();
//        FirefoxBinary binary = new FirefoxBinary(new File("src/main/resources/Firefox/Contents/MacOS/firefox-bin"));
//        FirefoxProfile profile = new FirefoxProfile(new File("src/main/resources/Firefox/Profiles/default"));
//        return new FirefoxDriver(binary, profile);
    }
}
