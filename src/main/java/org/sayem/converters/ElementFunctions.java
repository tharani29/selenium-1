package org.sayem.converters;

import org.sayem.selenium.Element;
import org.sayem.selenium.Locator;

public enum ElementFunctions implements Locator<Element, Void> {

    CLICK {
        @Override
        public Void locate(Element input) {
            input.click();
            return null;
        }
    }
}