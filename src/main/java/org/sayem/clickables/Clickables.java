package org.sayem.clickables;

import org.sayem.selenium.Clickable;
import org.sayem.selenium.Element;
import org.sayem.selenium.Locator;
import org.sayem.selenium.SearchScope;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Created by sayem on 12/4/15.
 */
public class Clickables<T extends SearchScope<T>> implements Clickable {

    private static final Logger log = getLogger(Clickables.class);
    private final T where;
    private final Locator<T, Element> locator;

    public Clickables(T where, Locator<T, Element> locator) {
        this.locator = locator;
        this.where = where;
    }

    @Override
    public void click() {
        Element menu = locator.locate(where);
        log.info("clicking [" + menu + "]");
        menu.click();
    }

    @Override
    public String toString() {
        return locator.toString();
    }
}
