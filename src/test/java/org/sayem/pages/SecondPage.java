package org.sayem.pages;

import org.sayem.Browser;

/**
 * Created by sayem on 12/4/15.
 */
public class SecondPage implements Browser<SecondPage> {

    public ThirdPage second() {
        System.out.println("SecondPage method....");
        return Browser.pageFactory(ThirdPage.class);
    }
}
