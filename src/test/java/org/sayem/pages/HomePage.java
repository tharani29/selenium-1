package org.sayem.pages;

import org.sayem.selenium.Browser;

/**
 * Created by sayem on 12/4/15.
 */
public class HomePage<T extends Page<?>> extends Page<T> {

    private final SecondPage<HomePage<T>> secondPage;

    public HomePage(Browser<?> browser) {
        super(browser);
        this.secondPage = new SecondPage<>(this, this);
    }

    public SecondPage<HomePage<T>> first() {
//        button(Id.DATE_PICKER).click();
//        sendBy(Id.DATE_PICKER, "");
//        link(Id.DATE_PICKER).click();

        System.out.println("FirstPage method....");
        return this.secondPage;
    }
}
