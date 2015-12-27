package org.sayem.browsers;

import net.lightbody.bmp.BrowserMobProxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.sayem.browsers.config.BrowserThreads;
import org.sayem.properties.PropertiesUtil;
import org.sayem.properties.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sayem on 12/4/15.
 */
public interface Browser {

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

    static void delay(final long amount) {
        try {
            Thread.sleep(amount);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}