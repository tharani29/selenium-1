package org.sayem.selectors;

import org.openqa.selenium.By;

import java.util.function.Supplier;

import static org.openqa.selenium.By.tagName;

/**
 * This enum is the Supplier of ByTagName from Selenium By API.
 * Created by sayem on 12/4/15.
 */
public enum TagName implements Supplier<By> {
    A("a"),
    IMG("img"),
    OPTION("option");

    private final By by;

    TagName(String id) {
        this.by = tagName(id);
    }

    /**
     * @return the by instance variable which is a ByTagName.
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
