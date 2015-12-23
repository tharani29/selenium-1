package org.sayem.converters;

import org.sayem.selenium.Locator;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by sayem on 12/4/15.
 */
public class Filter<T> implements Locator<Stream<T>, Stream<T>> {

    private final Predicate<T> predicate;

    public Filter(Predicate<T> predicate) {
        this.predicate = predicate;
    }

    @Override
    public Stream<T> locate(Stream<T> elements) {
        return elements.filter(predicate);
    }

}
