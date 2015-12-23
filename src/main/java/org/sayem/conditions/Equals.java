package org.sayem.conditions;

import java.util.function.Predicate;

/**
 * Created by sayem on 12/4/15.
 */
public class Equals implements Predicate<String> {
    private final String string;

    public Equals(Object o) {
        this.string = o.toString();
    }

    @Override
    public boolean test(String input) {
        return input.equals(string);
    }
}