package org.sayem.selectors;


import org.openqa.selenium.By;

import java.util.function.Supplier;

import static org.openqa.selenium.By.partialLinkText;

/**
 * This enum is a Supplier of  ByPartialLinkText from Selenium By API.
 * Created by sayem on 12/4/15.
 */
public enum PartialLinkText implements Supplier<By> {

    UI_DATEPICKER_CLOSE("ui-datepicker-close");

    private final By by;

    PartialLinkText(String id) {
        this.by = partialLinkText(id);
    }

    /**
     * @return the by instance variable which is a ByPartialLinkText.
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
