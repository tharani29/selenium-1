package org.sayem.pages;

/**
 * Created by sayem on 12/5/15.
 */
public class ThirdPage<T extends BasePage<?>> extends BasePage<T> {

    public ThirdPage(Page page) {
        super(page);
    }

    public void third(){
        System.out.println("third....");
    }
}
