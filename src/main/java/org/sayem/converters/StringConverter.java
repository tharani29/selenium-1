package org.sayem.converters;

import org.sayem.selenium.Locator;

/**
 * Created by sayem on 12/4/15.
 */
public enum StringConverter implements Locator<String, String> {
    FIRST_HALF {
        @Override
        public String locate(String element) {
            return element.split(" ")[0];
        }
    },
    SECOND_HALF {
        @Override
        public String locate(String element) {
            return element.split(" ")[1];
        }
    },
    RESTORE_UNDERSCORE {
        @Override
        public String locate(String element) {
            return element.replace(' ', '_');
        }
    },

    REPLACE_UNDERSCORE {
        @Override
        public String locate(String element) {
            return element.replace('_', ' ');
        }
    }
}
