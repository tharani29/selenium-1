package org.sayem.conditions;

import java.util.function.Predicate;

/**
 * Created by sayem on 12/4/15.
 */
public class StringContains implements Predicate<String> {
    private final String string;

    public StringContains(String string) {
        this.string = string;
    }

    @Override
    public boolean test(String input) {
        return input.contains(string);
    }
}