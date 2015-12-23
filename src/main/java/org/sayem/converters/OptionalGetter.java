package org.sayem.converters;

import org.sayem.selenium.Element;
import org.sayem.selenium.Locator;

import java.util.Optional;

/**
 * Created by sayem on 12/4/15.
 */
public enum OptionalGetter implements Locator<Optional<Element>, Element> {
    GET;

    @Override
    public Element locate(Optional<Element> element) {
        return element.get();
    }
}
