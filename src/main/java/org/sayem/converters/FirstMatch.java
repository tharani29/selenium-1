package org.sayem.converters;

import org.sayem.selenium.Locator;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by sayem on 12/4/15.
 */
public class FirstMatch<T> implements Locator<Stream<T>, Optional<T>> {

    private final Predicate<T> predicate;

    public FirstMatch(Predicate<T> predicate) {
        this.predicate = predicate;
    }

    @Override
    public Optional<T> locate(Stream<T> stream) {
        return new Filter<>(predicate).andThen(new FirstItem<>()).locate(stream);
    }
}
