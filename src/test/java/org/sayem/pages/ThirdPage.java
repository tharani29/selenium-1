package org.sayem.pages;

import org.sayem.page.Page;

/**
 * Created by sayem on 12/5/15.
 */
public class ThirdPage<T extends Page<?>> extends Page<T> {

    public ThirdPage<T> third() {
        System.out.println("ThirdPage method....");
        return this;
    }
}
