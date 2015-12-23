package org.sayem;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.interactions.Mouse;
import org.sayem.browsers.config.BrowserThreads;
import org.sayem.forms.FormControl;
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

    @Override
    default void quit() {
        BROWSER_THREADS.forEach(BrowserThreads::quitDriver);
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

    static WebDriver driver() {
        return THREAD_LOCAL.get().getDriver();
    }
}