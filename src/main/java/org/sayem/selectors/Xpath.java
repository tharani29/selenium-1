package org.sayem.selectors;

import org.openqa.selenium.By;

import java.util.function.Supplier;

import static org.openqa.selenium.By.xpath;

/**
 * This enum is a Supplier ByXpath from Selenium By API.
 * Created by sayem on 12/4/15.
 */
public enum Xpath implements Supplier<By> {

    ACCOUNT_MENU("//*[@id='header-account']/div/ul/li[1]/a"),
    REGISTER_BTN(".//*[@id='form-validate']/div[2]/button");

    private final By by;

    Xpath(String id) {
        this.by = xpath(id);
    }

    /**
     * @return the by instance variable which is a ByXpath.
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
