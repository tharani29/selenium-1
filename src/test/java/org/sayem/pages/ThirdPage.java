package org.sayem.pages;

import org.sayem.Browser;
import org.sayem.page.Page;
import org.sayem.selenium.Clickable;

/**
 * Created by sayem on 12/5/15.
 */
public class ThirdPage<T extends Page<?>> extends Page<T> {

    public ThirdPage(Browser<?> browser, Clickable clickable, T parent) {
        super(browser, clickable, parent);
    }

    public ThirdPage<T> third() {
        System.out.println("ThirdPage method....");
        return this;
    }
}
