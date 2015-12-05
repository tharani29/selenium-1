package org.sayem.clickables;

import org.sayem.pages.Page;
import org.sayem.selenium.Locator;
import org.sayem.selenium.Element;

public class Menu extends Button<Page> {

    public Menu(Page page, Locator<Page, Element> locator) {
        super(page, locator);
    }

}
