package org.sayem.converters;

import org.sayem.selenium.Element;
import org.sayem.selenium.Locator;

/**
 * Created by sayem on 12/4/15.
 */
public enum ElementFunctions implements Locator<Element, Void> {

    CLICK {
        @Override
        public Void locate(Element input) {
            input.click();
            return null;
        }
    }
}