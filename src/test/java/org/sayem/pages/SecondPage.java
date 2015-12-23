package org.sayem.pages;

import org.sayem.Browser;
import org.sayem.page.Page;
import org.sayem.selenium.Clickable;

/**
 * Created by sayem on 12/4/15.
 */
public class SecondPage<T extends Page<?>> extends Page<T> {

    private final ThirdPage<SecondPage<T>> thirdPage;

    public SecondPage(Browser<?> browser, Clickable clickable, T parent) {
        super(browser, clickable, parent);
        this.thirdPage = new ThirdPage<>(browser, clickable, this);
    }

    public ThirdPage<SecondPage<T>> second() {
        System.out.println("SecondPage method....");
        return this.thirdPage;
    }
}
