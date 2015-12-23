package org.sayem.selenium;

import org.sayem.clickables.Button;
import org.sayem.clickables.Link;
import org.sayem.conditions.StringContains;
import org.sayem.converters.*;
import org.sayem.locators.Locators;
import org.sayem.selectors.TagName;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.sayem.conditions.ElementPredicates.DISPLAYED;
import static org.sayem.conditions.ElementPredicates.NOT_NULL;
import static java.util.stream.Collectors.toList;

/**
 * Created by sayem on 12/4/15.
 */
public interface SearchScope<T extends SearchScope<T>>
        extends SearchContext,    //<1>
        ExplicitWait<T> {

    /**
     * Find the first element or throw NoSuchElementException
     *
     * @param by selector
     * @return the first element or throw NoSuchElementException
     */
    @Deprecated                                   //<2>
    @Override
    default Element findElement(By by) {
        return new ElementFinder(by).locate(this);
    }

    @Deprecated                                   //<3>
    @Override
    default List<WebElement> findElements(By by) {
        return by.findElements(this).stream().map(Element::new).collect(toList());
    }

    /**
     * Find the first element or return empty Optional if nothing found.
     *
     * @param by selector
     * @return the first element or return empty Optional if nothing found.
     */
    default Optional<Element> optionalElement(Supplier<By> by) {         //<4>
        try {
            return Optional.of(findElement(by.get()));
        } catch (NoSuchElementException e) {
            return Optional.empty();
        }
    }

    /**
     * Find the first element until timeout then throw NoSuchElementException
     *
     * @param by selector
     * @return the first element or throw NoSuchElementException
     */
    default Element untilFound(Supplier<By> by) {                     //<5>
        return until(by);
    }

    /**
     * Find all elements within the area using the given search method.
     *
     * @param by selector
     * @return A stream of all {@link Element}s, or an empty stream if nothing matches.
     * @see By
     */
    default Stream<Element> findElements(Supplier<By> by) {           //<6>
        return findElements(by.get()).stream().map(Element::new);
    }

    /**
     * Find the first button meeting the By selector.
     * method to find the button.
     *
     * @param by selector                       ˜
     * @return the first button meeting the By selector.
     */
    default Clickable button(Supplier<By> by) {
        return button(by, 0);
    }

    /**
     * If there are multiple buttons with the same name on the same page, use this
     * method to find the button.
     *
     * @param by    selector
     * @param index given index
     * @return the button by index in the list
     */
    @SuppressWarnings("unchecked")
    default Clickable button(Supplier<By> by, int index) {
        return new Button<>((T) this, Locators.<T>elements(by)
                .andThen(new StreamToList<>())
                .andThen(new ElementAtIndex<>(index)));
    }

    /**
     * If the button can't be found using the previous two methods, use this.
     *
     * @param locator locator
     * @return button found by the locator
     */
    @SuppressWarnings("unchecked")
    default Clickable button(Locator<T, Element> locator) {
        return new Button<>((T) this, locator);
    }

    /**
     * The first image using the image file.
     *
     * @param fileName file name
     * @return first image found by using the image file.
     */
    default Optional<Element> image(String fileName) {
        return new FirstItem<Element>().locate(images(fileName));
    }

    /**
     * The image at the given index using the same image file.
     *
     * @param fileName file name
     * @param index    index
     * @return image at the given index using the same image file.
     */
    default Element image(String fileName, int index) {
        return new StreamToList<Element>()
                .andThen(new ElementAtIndex<>(index))
                .locate(images(fileName));
    }

    /**
     * Find the images using the same image file.
     *
     * @param fileName file name
     * @return the images  found by using the same image file.
     */
    default Stream<Element> images(String fileName) {
        return Locators.<T>elements(TagName.IMG)
                .andThen(new Filter<>(NOT_NULL.and(DISPLAYED)
                        .and(GetText.SRC.and(new StringContains(fileName)))))
                .locate((T) this);
    }

    /**
     * Find the link using the selector.
     *
     * @param selector selector
     * @return the link found by using the selector.
     */
    @SuppressWarnings("unchecked")
    default Clickable link(Supplier<By> selector) {
        return new Link<>((T) this, Locators.element(selector));
    }

}
