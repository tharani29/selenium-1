package org.sayem.conditions;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by sayem on 12/4/15.
 */
public class HasElements<T> implements Predicate<Stream<T>> {

    @Override
    public boolean test(Stream<T> stream) {
        return stream.count() > 0;
    }

}
