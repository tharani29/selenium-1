package org.sayem.pages;

import org.sayem.Browser;
import org.sayem.page.Page;
import org.sayem.selenium.Clickable;

/**
 * Created by sayem on 12/4/15.
 */
public class HomePage<T extends Page<?>> extends Page<T> {

    private final SecondPage<HomePage<T>> secondPage;

    public HomePage() {
        super();
        this.secondPage = new SecondPage<>(browser, clickable, this);
    }
    public HomePage(Browser<?> browser, Clickable clickable, T parent) {
        super(browser, clickable, parent);
        this.secondPage = new SecondPage<>(browser, clickable, this);
    }

    public SecondPage<HomePage<T>> first() {
        System.out.println("FirstPage method....");
        return this.secondPage;
    }
}
