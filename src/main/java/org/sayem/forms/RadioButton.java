package org.sayem.forms;

import org.sayem.conditions.ElementPredicates;
import org.sayem.conditions.StringContains;
import org.sayem.conditions.StringEquals;
import org.sayem.converters.ElementFunctions;
import org.sayem.converters.FirstMatch;
import org.sayem.converters.GetText;
import org.sayem.converters.OptionalGetter;
import org.sayem.locators.Locators;
import org.sayem.selenium.Element;
import org.sayem.selenium.Locating;
import org.sayem.selenium.SearchScope;
import org.openqa.selenium.By;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created by sayem on 12/4/15.
 */
public class RadioButton<T extends SearchScope<T>>
        extends Locating<T, Stream<Element>> {

    /**
     * Constructor this radio button.
     *
     * @param where    where
     * @param selector selector
     */
    public RadioButton(T where, Supplier<By> selector) {
        super(where, Locators.elements(selector));
    }

    /**
     * @return the value of the select radio
     */
    public String getValue() {
        return locate(new FirstMatch<>(ElementPredicates.DISPLAYED
                .and(GetText.CHECKED.and(StringEquals.TRUE)))
                .andThen(OptionalGetter.GET)
                .andThen(GetText.VALUE));
    }

    /**
     * @param value value to set
     */
    public void setValue(Object value) {
        locate(new FirstMatch<>(GetText.VALUE.and(new StringContains(value.toString())))
                .andThen(OptionalGetter.GET).andThen(ElementFunctions.CLICK));
    }
}

