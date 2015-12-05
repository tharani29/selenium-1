package org.sayem.pages;

import org.sayem.selenium.Browser;

/**
 * Created by sayem on 12/4/15.
 */
public class HomePage <T extends BasePage<?>> extends BasePage<T> {

    private final SecondPage<HomePage<T>> secondPage;

    public HomePage(Browser<?> browser) {
        super(browser);
        this.secondPage = new SecondPage<>(this);
    }

    public SecondPage<HomePage<T>> first(){
        driver.get("http://www.google.com");
        return this.secondPage;
    }
}
