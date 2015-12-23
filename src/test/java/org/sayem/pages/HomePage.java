package org.sayem.pages;

import org.sayem.Browser;
import org.sayem.page.Page;

/**
 * Created by sayem on 12/4/15.
 */
public class HomePage<T extends Page<?>> extends Page<T> {

    private final SecondPage<HomePage<T>> secondPage;

    public HomePage() {
        super();
        this.secondPage = new SecondPage<>(this);
    }

    public SecondPage<HomePage<T>> first() {
        Browser.driver().getTitle();
        return this.secondPage;
    }
}
