package org.sayem.converters;

import org.sayem.selenium.Locator;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by sayem on 12/4/15.
 */
public class FirstItem<T> implements Locator<Stream<T>, Optional<T>> {

    @Override
    public Optional<T> locate(Stream<T> elements) {
        return elements.findFirst();
    }
}
