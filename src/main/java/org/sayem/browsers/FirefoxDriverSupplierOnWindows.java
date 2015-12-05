package org.sayem.browsers;

import org.sayem.selenium.Browser;
import org.sayem.selenium.CachedWebDriverSupplier;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;

/**
 * This class is not one of the enum constants enum Browsers. It is used to demonstrate how to implement the Browser
 * interface thus used as the constructor parameter for AbstractPage. It is declared as a bean in spring context file,
 * <p>
 * &lt;bean id="firefox" class="com.algocrafts.browsers.FirefoxOnWindows"/&gt;
 * <p>
 * and it is referenced by ref attribute of the containing bean.
 * <p>
 * However, the enum browser is referenced by value,
 * &lt;constructor-arg value="${browser}"/&gt;
 * <p>
 * in property file,
 * browser=CHROME
 * <p>
 * The other browsers known to enum don't implement Browser interface, they just implement WebDriverSupplier&lt;T&gt;
 */
public class FirefoxDriverSupplierOnWindows implements Browser<FirefoxDriver> {

    public FirefoxDriver init() {
        FirefoxBinary binary = new FirefoxBinary(new File("src/main/resources/Firefox/firefox.exe"));
        FirefoxProfile profile = new FirefoxProfile(new File("src/main/resources/Firefox/Profiles/default"));
        return new FirefoxDriver(binary, profile);
    }

    @Override
    public CachedWebDriverSupplier<FirefoxDriver> getSupplier() {
        return this;
    }

}
