package org.sayem.converters;

import org.sayem.selenium.Locator;

/**
 * Created by sayem on 12/4/15.
 */
public enum Ordinal implements Locator<Enum, Integer> {

    ORDINAL {
        @Override
        public Integer locate(Enum input) {
            return input.ordinal();
        }
    }
}
