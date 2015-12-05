package org.sayem.converters;


import org.sayem.selenium.Locator;

public enum Ordinal implements Locator<Enum, Integer> {

    ORDINAL {
        @Override
        public Integer locate(Enum input) {
            return input.ordinal();
        }
    }
}
