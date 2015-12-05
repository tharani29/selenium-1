package org.sayem.converters;


import org.sayem.selenium.Locator;

import static java.lang.Integer.parseInt;

public enum StringToInt implements Locator<String, Integer> {

    PARSE_INT {
        @Override
        public Integer locate(String element) {
            return parseInt(element);
        }

    }
}
