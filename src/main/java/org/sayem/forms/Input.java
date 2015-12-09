package org.sayem.forms;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.FluentWait;
import org.sayem.algorithm.Retry;
import org.sayem.conditions.Equals;
import org.sayem.conditions.StringContains;
import org.sayem.converters.FirstMatch;
import org.sayem.converters.GetText;
import org.sayem.converters.OptionalGetter;
import org.sayem.locators.Locators;
import org.sayem.selenium.Element;
import org.sayem.selenium.Locating;
import org.sayem.selenium.Locator;
import org.sayem.selenium.SearchScope;
import org.slf4j.Logger;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.slf4j.LoggerFactory.getLogger;

public class Input<T extends SearchScope<T>> extends Locating<T, Optional<Element>> {

    public static final Logger log = getLogger(Input.class);

    /**
     * Constructor of the input field.
     *
     * @param where    where
     * @param selector selector
     */
    public Input(T where, Supplier<By> selector) {
        super(where, Locators.<T>optionalElement(selector));
    }

    /**
     * the value of input field, for example, "good" will be return
     * <p>
     * String value = page.get(() -&gt; By.name("status"))
     * <p>
     * &lt;input name="status" value="good"/&gt;
     *
     * @return the value of the input
     */
    public String getValue() {
        final Retry retry = new Retry(5, 1, SECONDS);
        try {
            retry.attempt(() -> locate(OptionalGetter.GET.andThen(GetText.VALUE)));
        } catch (Exception e) {
            log.info("Failed to read text", e);
        }
        return null;
    }

    /**
     * set the value of input field, for example,
     * <p>
     * after,
     * page.set(() -&gt; By.name("status"), "good");
     * <p>
     * it will be,
     * &lt;input name="status" value="good"/&gt;
     *
     * @param value the value to set
     */

    public void put(final Object value) {
        String string = value.toString();
        final Retry retry = new Retry(5, 1, SECONDS);
        try {
            retry.attempt(() -> {
                Element element = locate(OptionalGetter.GET);
                element.clear();
                element.sendKeys(string);
                if (GetText.VALUE.and(new Equals(string)).test(element)) {
                    retry.off();
                }
                return null;

            });
        } catch (Exception e) {
            log.info("Failed to set text {}", string);
        }
    }

    /**
     * Test the autocomplete function for the input by given value, click the element
     * on the suggestion list which matches value parameter.
     * <p>
     * Please refer "http://seleniumcapsules.blogspot.com/2014/05/by-xpath.html"
     *
     * @param value   value
     * @param locator locator
     */
    public void autocomplete(Object value, Locator<T, Stream<Element>> locator) {
        Element element = locate(OptionalGetter.GET);
        element.clear();
        Locator<T, Optional<Element>> optionalLocator = locator.andThen(new FirstMatch<>(GetText.TEXT.and(new StringContains(value.toString()))));
        for (char c : value.toString().toCharArray()) {
            element.sendKeys(String.valueOf(c));
            Optional<Element> locate = use(optionalLocator);
            if (locate.isPresent()) {
                locate.get().click();
            }
        }
        new FluentWait<>(this).ignoring(Exception.class).until((Input i) -> use(optionalLocator).get()).click();

    }

}
