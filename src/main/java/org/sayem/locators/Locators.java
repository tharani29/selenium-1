package org.sayem.locators;

import org.sayem.selenium.Element;
import org.sayem.selenium.Locator;
import org.sayem.selenium.SearchScope;
import org.openqa.selenium.By;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created by sayem on 12/4/15.
 */
public class Locators<T1 extends SearchScope<T1>, T2>
        implements Locator<T1, T2> {

    private final Locator<T1, T2> locator;

    public Locators(Locator<T1, T2> locator) {
        this.locator = locator;
    }

    public static <T extends SearchScope<T>> Locators<T, Element> element(Supplier<By> selector) {
        return new ElementLocator<>(selector);
    }

    public static <T extends SearchScope<T>> Locators<T, Stream<Element>> elements(Supplier<By> selector) {
        return new ElementsLocator<>(selector);
    }

    public static <T extends SearchScope<T>> Locators<T, Optional<Element>> optionalElement(Supplier<By> selector) {
        return new OptionalElementLocator<>(selector);
    }

    public static SelectLocator select(Supplier<By> selector) {
        return new SelectLocator(selector);
    }

    @Override
    public T2 locate(T1 where) {
        return locator.locate(where);
    }
}