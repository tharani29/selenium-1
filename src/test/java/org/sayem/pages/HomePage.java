package org.sayem.pages;

import org.sayem.selenium.Browser;

import java.util.function.BiConsumer;

/**
 * Created by sayem on 12/4/15.
 */
public class HomePage <T extends BasePage<?>> extends BasePage<T> {

    private final SecondPage<HomePage<T>> secondPage;

    public HomePage(Browser<?> browser) {
        super(browser);
        this.secondPage = new SecondPage<>(this);
    }

    public SecondPage<HomePage<T>> first(BiConsumer<String, String> consumer){
        driver.get("http://www.google.com");
        consumer.accept("", "");
        return this.secondPage;
    }
}
