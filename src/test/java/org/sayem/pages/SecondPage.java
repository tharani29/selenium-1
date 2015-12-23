package org.sayem.pages;

import org.sayem.page.Page;

/**
 * Created by sayem on 12/4/15.
 */
public class SecondPage<T extends Page<?>> extends Page<T> {

    private final ThirdPage<SecondPage<T>> thirdPage;

    public SecondPage(T parent) {
        super(parent);
        this.thirdPage = new ThirdPage<>();
    }

    public ThirdPage<SecondPage<T>> second() {
        System.out.println("SecondPage method....");
        return this.thirdPage;
    }
}
