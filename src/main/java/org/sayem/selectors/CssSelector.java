package org.sayem.selectors;


import org.openqa.selenium.By;

import java.util.function.Supplier;

import static org.openqa.selenium.By.cssSelector;

/**
 * This enum is a Supplier of ByCssSelector from Selenium By API.
 * Created by sayem on 12/4/15.
 */
public enum CssSelector implements Supplier<By> {

    ACCOUNT(".skip-link.skip-account"),
    REGISTER(".links > ul > li:nth-of-type(5) > a"),
    ACCOUNT_MENU(".links>ul>li>a");

    private final By by;

    CssSelector(String id) {
        this.by = cssSelector(id);
    }

    /**
     * @return the by instance variable which is a ByCssSelector.
     */
    @Override
    public By get() {
        return by;
    }

    @Override
    public String toString() {
        return by.toString();
    }
}
