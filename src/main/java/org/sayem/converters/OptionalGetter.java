package org.sayem.converters;

import org.sayem.selenium.Element;
import org.sayem.selenium.Locator;

import java.util.Optional;

public enum OptionalGetter implements Locator<Optional<Element>, Element>{
    GET;

    @Override
    public Element locate(Optional<Element> element) {
        return element.get();
    }
}
