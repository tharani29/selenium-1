package org.sayem.pages;

import org.sayem.Browser;

/**
 * Created by sayem on 12/4/15.
 */
public class HomePage implements Browser<HomePage> {

    public SecondPage first() {
        Browser.driver().getTitle();
        return Browser.pageFactory(SecondPage.class);
    }
}
