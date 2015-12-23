package org.sayem.clickables;

import org.sayem.selenium.SearchScope;

/**
 * Created by sayem on 12/4/15.
 */
public class ImageButton<T extends SearchScope<T>> extends Button<T> {

    public ImageButton(T where, String fileName, int index) {
        super(where, finder -> finder.image(fileName, index));
    }
}
