package org.sayem;

import net.lightbody.bmp.BrowserMobProxy;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sayem.browsers.config.BrowserThreads;
import org.sayem.forms.FormControl;
import org.sayem.properties.PropertiesUtil;
import org.sayem.properties.Repository;
import org.sayem.selenium.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Created by sayem on 12/4/15.
 */
public interface Browser<T extends WebDriver> extends Actionable,
        SearchScope<Browser<T>>, FormControl<Browser<T>>,
        WebDriver,
        HasInputDevices, JavascriptExecutor, HasCapabilities {

    List<BrowserThreads> BROWSER_THREADS = Collections.synchronizedList(new ArrayList<>());
    ThreadLocal<BrowserThreads> THREAD_LOCAL = new ThreadLocal<BrowserThreads>() {
        @Override
        protected BrowserThreads initialValue() {
            BrowserThreads browserThreads = new BrowserThreads();
            BROWSER_THREADS.add(browserThreads);
            return browserThreads;
        }
    };

    static WebDriver driver() {
        return THREAD_LOCAL.get().getDriver();
    }

    static WebDriver browserMobProxyEnabledDriver() throws Exception {
        return THREAD_LOCAL.get().getBrowserMobProxyEnabledDriver();
    }

    static BrowserMobProxy browserMobProxy() {
        return THREAD_LOCAL.get().getBrowserMobProxy();
    }

    static void setBrowserUrl(String value) {
        System.setProperty("seleniumUrl", value);
    }

    static void quitBrowser() {
        BROWSER_THREADS.forEach(BrowserThreads::quitDriver);
    }

    static <T> T pageFactory(Class<T> clazz) {
        return PageFactory.initElements(driver(), clazz);
    }

    static String getProperties(Repository repository) {
        return PropertiesUtil.create(Repository.LOCATION.getValue()).data(repository);
    }

    @Override
    default void quit() {
        BROWSER_THREADS.forEach(BrowserThreads::quitDriver);
    }

    /**
     * Wait for dynamic element to display
     */

    default WebElement dynamicElement(By by, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver(), timeOut);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    @Override
    default void onTimeout() {
        if (logger.isDebugEnabled()) {
            save(this.getTitle());
        }
    }

    @Deprecated
    @Override
    default Element findElement(By by) {
        return new ElementFinder(by).locate(driver());
    }

    @Deprecated
    @Override
    default List<WebElement> findElements(By by) {
        return new ElementsFinder(by).locate(driver());
    }

    @Override
    default void get(String url) {
        driver().get(url);
    }

    @Override
    default String getCurrentUrl() {
        return driver().getCurrentUrl();
    }

    @Override
    default String getTitle() {
        return driver().getTitle();
    }

    @Override
    default String getPageSource() {
        return driver().getPageSource();
    }

    @Override
    default Set<String> getWindowHandles() {
        return driver().getWindowHandles();
    }

    @Override
    default String getWindowHandle() {
        return driver().getWindowHandle();
    }

    @Override
    default TargetLocator switchTo() {
        return driver().switchTo();
    }

    @Override
    default Navigation navigate() {
        return driver().navigate();
    }

    @Override
    default Options manage() {
        return driver().manage();
    }

    @Override
    default void close() {
        driver().close();
    }

    @Override
    default Keyboard getKeyboard() {
        HasInputDevices t = (HasInputDevices) driver();
        return t.getKeyboard();
    }

    @Override
    default Mouse getMouse() {
        HasInputDevices t = (HasInputDevices) driver();
        return t.getMouse();
    }

    @Override
    default Capabilities getCapabilities() {
        HasCapabilities hasCapabilities = (HasCapabilities) driver();
        return hasCapabilities.getCapabilities();
    }

    @Override
    default Object executeScript(String script, Object... args) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver();
        return javascriptExecutor.executeScript(script, args);
    }

    @Override
    default Object executeAsyncScript(String script, Object... args) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver();
        return javascriptExecutor.executeAsyncScript(script, args);
    }

    default void angularHasFinish() {
        WebDriverWait wait = new WebDriverWait(Browser.driver(), 15, 100);
        wait.until(jQueryAJAXCallsHaveCompleted());
    }

    default void jqueryHasFinish() {
        WebDriverWait wait = new WebDriverWait(Browser.driver(), 15, 100);
        wait.until(angularHasFinishedProcessing());
    }

    default ExpectedCondition<Boolean> jQueryAJAXCallsHaveCompleted() {
        return driver -> (Boolean) ((JavascriptExecutor) driver)
                .executeScript("return (window.jQuery != null) && (jQuery.active === 0);");
    }


    default ExpectedCondition<Boolean> angularHasFinishedProcessing() {
        return driver -> Boolean.valueOf(((JavascriptExecutor) driver)
                .executeScript("return (window.angular !== undefined) " +
                        "&& (angular.element(document).injector() !== undefined) " +
                        "&& (angular.element(document).injector().get('$http')" +
                        ".pendingRequests.length === 0)").toString());
    }
}