package org.sayem.forms;

import org.sayem.conditions.StringEquals;
import org.sayem.converters.GetText;
import org.sayem.locators.Locators;
import org.sayem.selenium.Element;
import org.sayem.selenium.Locating;
import org.sayem.selenium.SearchScope;
import org.openqa.selenium.By;

import java.util.function.Supplier;

/**
 * Created by sayem on 12/4/15.
 */
public class Checkbox<T extends SearchScope<T>>
        extends Locating<T, Element> {

    /**
     * Constructor of the checkbox.
     *
     * @param where    the place the checkbox can be found
     * @param selector the selector that leads to the checkbox
     */
    public Checkbox(final T where, Supplier<By> selector) {
        super(where, Locators.element(selector));
    }

    /**
     * Change the checkbox according to the value parameter
     *
     * @param value true or false
     */
    public void setValue(boolean value) {
        locate((Element checkbox) -> {
            if (checkbox != null && checkbox.isSelected() != value) {
                checkbox.click();
            }
            return null;
        });
    }

    /**
     * @return whether the checkbox is checked or not
     */
    public boolean isChecked() {
        return test(GetText.CHECKED.and(StringEquals.TRUE));
    }
}
