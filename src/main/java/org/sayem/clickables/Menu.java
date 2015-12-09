package org.sayem.clickables;

import org.sayem.pages.Page;
import org.sayem.selenium.Element;
import org.sayem.selenium.Locator;

public class Menu extends Button<Page<?>> {

    public Menu(Page page, Locator<Page<?>, Element> locator) {
        super(page, locator);
    }

}
