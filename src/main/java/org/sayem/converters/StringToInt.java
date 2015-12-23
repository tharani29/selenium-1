package org.sayem.converters;

import org.sayem.selenium.Locator;

import static java.lang.Integer.parseInt;

/**
 * Created by sayem on 12/4/15.
 */
public enum StringToInt implements Locator<String, Integer> {

    PARSE_INT {
        @Override
        public Integer locate(String element) {
            return parseInt(element);
        }

    }
}
