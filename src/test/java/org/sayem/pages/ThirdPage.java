package org.sayem.pages;

import org.sayem.Browser;

/**
 * Created by sayem on 12/5/15.
 */
public class ThirdPage implements Browser<ThirdPage> {

    public ThirdPage third() {
        System.out.println("ThirdPage method....");
        return this;
    }
}
