package org.sayem;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.base.Predicate;
import org.openqa.selenium.*;
import org.openqa.selenium.internal.Locatable;

import java.util.Map;

/**
 * Created by sayem on 12/26/15.
 */
public class WaitUtil {

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

    public static void angularHasFinish() {
        WebDriverWait wait = new WebDriverWait(Browser.driver(), 15, 100);
        wait.until(jQueryAJAXCallsHaveCompleted());
    }

    public static void jqueryHasFinish() {
        WebDriverWait wait = new WebDriverWait(Browser.driver(), 15, 100);
        wait.until(angularHasFinishedProcessing());
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
}
