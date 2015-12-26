package org.sayem;

import com.google.common.base.Predicate;
import org.openqa.selenium.*;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Created by sayem on 12/26/15.
 */
public class WaitUtil {

    public static Logger LOG = getLogger(WaitUtil.class);

    public static void fluentWaitIgnoringSingleException() {
        Wait<WebDriver> wait = new FluentWait<>(Browser.driver())
                .withTimeout(15, TimeUnit.SECONDS)
                .pollingEvery(500, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class)
                .withMessage("The message you will see in if a TimeoutException is thrown");

        wait.until(angularHasFinishedProcessing());
    }

    public static void fluentWaitIgnoringACollectionOfExceptions() {

        List<Class<? extends Throwable>> exceptionsToIgnore = new ArrayList<Class<? extends Throwable>>() {
            {
                add(NoSuchElementException.class);
                add(StaleElementReferenceException.class);
            }
        };

        Wait<WebDriver> wait = new FluentWait<WebDriver>(Browser.driver())
                .withTimeout(15, TimeUnit.SECONDS)
                .pollingEvery(500, TimeUnit.MILLISECONDS)
                .ignoreAll(exceptionsToIgnore)
                .withMessage("The message you will see in if a TimeoutException is thrown");


        wait.until(angularHasFinishedProcessing());
    }

    public static void fluentWaitIgnoringAListOfExceptions() {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(Browser.driver())
                .withTimeout(15, TimeUnit.SECONDS)
                .pollingEvery(500, TimeUnit.MILLISECONDS)
                .ignoreAll(Arrays.asList(NoSuchElementException.class, StaleElementReferenceException.class))
                .withMessage("The message you will see in if a TimeoutException is thrown");

        wait.until(angularHasFinishedProcessing());
    }

    public static void fluentWaitIgnoringMultipleExceptions() {
        Wait<WebDriver> wait = new FluentWait<>(Browser.driver())
                .withTimeout(15, TimeUnit.SECONDS)
                .pollingEvery(500, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("The message you will see in if a TimeoutException is thrown");


        wait.until(angularHasFinishedProcessing());
    }

    public static void angularHasFinish() {
        WebDriverWait wait = new WebDriverWait(Browser.driver(), 15, 100);
        wait.until(jQueryAJAXCallsHaveCompleted());
    }

    public static void jqueryHasFinish() {
        WebDriverWait wait = new WebDriverWait(Browser.driver(), 15, 100);
        wait.until(angularHasFinishedProcessing());
    }

    Predicate<WebDriver> didWeFindElementFoo = driver -> driver.findElements(By.id("foo")).size() > 0;

    @SuppressWarnings("unchecked")
    public static Predicate<WebDriver> listenerIsRegisteredOnElement(final String listenerType, final WebElement element) {
        return driver -> {
            Map<String, Object> registeredListeners = (Map<String, Object>) ((JavascriptExecutor) driver)
                    .executeScript("return (window.jQuery != null) && (jQuery._data(jQuery(arguments[0]).get(0)), 'events')", element);
            for (Map.Entry<String, Object> listener : registeredListeners.entrySet()) {
                if (listener.getKey().equals(listenerType)) {
                    return true;
                }
            }
            return false;
        };
    }

    public static Predicate<WebDriver> elementHasStoppedMoving(final WebElement element) {
        return driver -> {
            Point initialLocation = ((Locatable) element).getCoordinates().inViewPort();
            try {
                Thread.sleep(50);
            } catch (InterruptedException ignored) {
                //ignored
            }
            Point finalLocation = ((Locatable) element).getCoordinates().inViewPort();
            return initialLocation.equals(finalLocation);
        };
    }

    private static ExpectedCondition<Boolean> jQueryAJAXCallsHaveCompleted() {
        return driver -> (Boolean) ((JavascriptExecutor) driver)
                .executeScript("return (window.jQuery != null) && (jQuery.active === 0);");
    }


    private static ExpectedCondition<Boolean> angularHasFinishedProcessing() {
        return driver -> Boolean.valueOf(((JavascriptExecutor) driver)
                .executeScript("return (window.angular !== undefined) &&" +
                        " (angular.element(document).injector() !== undefined) &&" +
                        " (angular.element(document).injector().get('$http')" +
                        ".pendingRequests.length === 0)").toString());
    }

    public static ExpectedCondition<Boolean> waitForAjax(final long timeout) {
        return driver -> {
            final long startTime = System.currentTimeMillis();
            final JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

            while ((startTime + timeout) >= System.currentTimeMillis()) {
                final Boolean scriptResult = (Boolean) javascriptExecutor.executeScript("return jQuery.active == 0");

                if (scriptResult)
                    return true;

                delay(100);

            }
            return false;
        };
    }

    public static void waitForPageToLoad(WebDriver driver) {

        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };

        Wait<WebDriver> wait = new WebDriverWait(driver, 1000);
        try {
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println("Timeout waiting for Page Load Request to complete.");
        }
    }

    private static void delay(final long amount) {
        try {
            Thread.sleep(amount);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * dynamically load jQuery
     */
    public static void injectJQuery(WebDriver driver) {
        String LoadJQuery = "(function(jqueryUrl, callback) {\n" +
                "if (typeof jqueryUrl != 'string') {" +
                "jqueryUrl = 'https://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js';\n" +
                "}\n" +
                "if (typeof jQuery == 'undefined') {\n" +
                "var script = document.createElement('script');\n" +
                "var head = document.getElementsByTagName('head')[0];\n" +
                "var done = false;\n" +
                "script.onload = script.onreadystatechange = (function() {\n" +
                "if (!done && (!this.readyState || this.readyState == 'loaded'\n" +
                "|| this.readyState == 'complete')) {\n" +
                "done = true;\n" +
                "script.onload = script.onreadystatechange = null;\n" +
                "head.removeChild(script);\n" +
                "callback();\n" +
                "}\n" +
                "});\n" +
                "script.src = jqueryUrl;\n" +
                "head.appendChild(script);\n" +
                "}\n" +
                "else {\n" +
                "callback();\n" +
                "}\n" +
                "})(arguments[0], arguments[arguments.length - 1]);\n";

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // give jQuery time to load asynchronously
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
        js.executeAsyncScript(LoadJQuery);
        System.out.println("Jquery is loaded.");
    }


    /**
     * This Condition waits until all the active JQuery Ajax calls have stopped.
     */

    public static Boolean waitUntilJQueryAjaxStopped(WebDriver webDriver) {
        try {
            Long value = (Long) ((JavascriptExecutor) webDriver).executeScript("return jQuery.active");
            if (LOG.isTraceEnabled()) {
                LOG.trace(value + " jQuery ajax calls are currently active.");
            }

            return value.equals(0L);
        } catch (WebDriverException e) {
            if (e.getMessage().contains("jQuery is not defined")) {
                return false;
            } else {
                throw e;
            }
        }
    }
}
