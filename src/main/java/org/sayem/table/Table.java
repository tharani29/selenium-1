package org.sayem.table;


import org.sayem.converters.GetText;
import org.sayem.locators.Locators;
import org.sayem.selectors.TagName;
import org.sayem.selenium.Element;
import org.sayem.selenium.Locator;
import org.sayem.selenium.SearchScope;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

public class Table<T, Where extends SearchScope<Where>> {


    private final Where where;
    private final Locator<Where, Element> locator;
    private final Locator<Stream<Element>, T> mapper;

    public Table(Where where,
                 Locator<Where, Element> locator,
                 Locator<Stream<Element>, T> mapper) {
        this.where = where;
        this.locator = locator;
        this.mapper = mapper;
    }

    public Stream<String> getHeader() {
        return locator.andThen(Locators.elements(TagName.TH)).locate(where).map(GetText.TEXT);
    }

    public Stream<T> getRows() {
        return locator.andThen(Locators.elements(TagName.TR)).locate(where)
                .filter(e ->
                        Locators.<Element>optionalElement(TagName.TD)
                                .locate(e)
                                .isPresent())
                .map(Locators.elements(TagName.TD))
                .map(mapper);
    }

    public TableContents<T> getContents() {
        return new TableContents<T>(
                this.getHeader().collect(toSet()),
                this.getRows().collect(Collectors.<T>toSet())
        );
    }
}

