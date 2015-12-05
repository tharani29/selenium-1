package org.sayem.converters;


import org.sayem.selenium.Locator;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamToList<T> implements Locator<Stream<T>, List<T>> {

    @Override
    public List<T> locate(Stream<T> element) {
        return element.collect(toList());
    }

}
