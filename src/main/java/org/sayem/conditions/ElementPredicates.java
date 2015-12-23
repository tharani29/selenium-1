package org.sayem.conditions;

import org.sayem.selenium.Element;

import java.util.function.Predicate;

/**
 * Created by sayem on 12/4/15.
 */
public enum ElementPredicates implements Predicate<Element> {
    NOT_NULL {
        @Override
        public boolean test(Element input) {
            return input != null;
        }
    },
    DISPLAYED {
        @Override
        public boolean test(Element input) {
            return input.isDisplayed();
        }
    },
    ENABLED {
        @Override
        public boolean test(Element input) {
            return input.isEnabled();
        }
    },
    SELECTED {
        @Override
        public boolean test(Element input) {
            return input.isSelected();
        }
    }
}