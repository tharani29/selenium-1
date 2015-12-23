package org.sayem.conditions;

import org.sayem.selenium.Element;

import java.util.Optional;
import java.util.function.Predicate;

/**
 * Created by sayem on 12/4/15.
 */
public enum OptionalPresents implements Predicate<Optional<Element>> {
    PRESENT;

    @Override
    public boolean test(Optional<Element> elementOptional) {
        return elementOptional.isPresent();
    }
}
