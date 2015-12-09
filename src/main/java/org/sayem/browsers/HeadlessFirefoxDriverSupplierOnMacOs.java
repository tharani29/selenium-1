package org.sayem.browsers;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.sayem.selenium.CachedWebDriverSupplier;

import java.io.File;


public class HeadlessFirefoxDriverSupplierOnMacOs implements CachedWebDriverSupplier<FirefoxDriver> {
    @Override
    public FirefoxDriver init() {
        FirefoxBinary binary = new FirefoxBinary(new File("/opt/local/lib/firefox-x11/firefox-bin"));
        binary.setEnvironmentProperty("DISPLAY", ":88");
        return new FirefoxDriver(binary, new FirefoxProfile());
    }
}