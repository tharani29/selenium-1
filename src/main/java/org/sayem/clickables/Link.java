package org.sayem.clickables;

import org.sayem.selenium.Element;
import org.sayem.selenium.Locator;
import org.sayem.selenium.SearchScope;

/**
 * Created by sayem on 12/4/15.
 */
public class Link<T extends SearchScope<T>> extends Clickables<T> {

    public Link(T where, Locator<T, Element> locator) {
        super(where, locator);
    }

}
