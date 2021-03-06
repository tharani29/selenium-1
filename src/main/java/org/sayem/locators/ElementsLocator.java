package org.sayem.locators;

import org.openqa.selenium.By;
import org.sayem.selenium.Element;
import org.sayem.selenium.SearchScope;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created by sayem on 12/4/15.
 */
public class ElementsLocator<T extends SearchScope<T>>
        extends Locators<T, Stream<Element>> {

    public ElementsLocator(Supplier<By> selector) {
        super((T where)
                -> where.findElements(selector)
        );
    }
}
