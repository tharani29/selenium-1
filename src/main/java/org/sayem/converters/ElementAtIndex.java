package org.sayem.converters;

import org.sayem.selenium.Locator;

import java.util.List;

/**
 * Created by sayem on 12/4/15.
 */
public class ElementAtIndex<T> implements Locator<List<T>, T> {

    private final int index;

    public ElementAtIndex(int index) {
        this.index = index;
    }

    @Override
    public T locate(List<T> list) {
        return list.get(index);
    }

}
