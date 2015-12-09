package org.sayem.locators;

import org.openqa.selenium.By;
import org.sayem.selenium.Element;
import org.sayem.selenium.SearchScope;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalElementLocator<T extends SearchScope<T>>
        extends Locators<T, Optional<Element>> {

    public OptionalElementLocator(Supplier<By> selector) {
        super((T where) ->
                where.optionalElement(selector)
        );
    }
}
