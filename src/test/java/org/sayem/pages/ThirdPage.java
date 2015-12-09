package org.sayem.pages;

/**
 * Created by sayem on 12/5/15.
 */
public class ThirdPage<T extends Page<?>> extends Page<T> {

    public ThirdPage(Page page, T parent) {
        super(page, parent);
    }

    public ThirdPage<T> third() {
        System.out.println("ThirdPage method....");
        return this;
    }
}
