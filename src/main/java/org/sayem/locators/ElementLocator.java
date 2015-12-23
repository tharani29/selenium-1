package org.sayem.locators;

import org.openqa.selenium.By;
import org.sayem.selenium.Element;
import org.sayem.selenium.SearchScope;

import java.util.function.Supplier;

/**
 * Created by sayem on 12/4/15.
 */
public class ElementLocator<T extends SearchScope<T>>
        extends Locators<T, Element> {

    public ElementLocator(Supplier<By> selector) {
        super((T where) -> where.untilFound(selector));
    }
}
