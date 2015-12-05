package org.sayem.pages;

import org.sayem.selenium.Browser;
import org.sayem.selenium.Clickable;

/**
 * Created by sayem on 12/4/15.
 */
public abstract class BasePage<T extends BasePage<?>> extends Page {

    private final T parent;
    protected Browser<?> driver;

    public BasePage(Page page) {
        super(page);
        this.parent = null;
    }

    public BasePage(Page page, Clickable clickable) {
        super(page, clickable);
        this.parent = null;
    }

    public BasePage(Browser<?> browser) {
        super(browser);
        this.parent = null;
        this.driver = browser;
    }

    public BasePage(Browser<?> browser, Clickable clickable) {
        super(browser, clickable);
        this.parent = null;
        this.driver = browser;
    }

    public T parentPage() throws NullPointerException {
        if (parent != null) {
            return parent;
        }

        throw new NullPointerException();
    }
}