package org.sayem.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sayem.converters.GetText;
import org.sayem.converters.OptionalGetter;
import org.sayem.forms.FormControl;
import org.sayem.locators.Locators;
import org.sayem.selectors.ClassName;
import org.sayem.selenium.*;
import org.slf4j.Logger;

import java.util.List;
import java.util.function.Supplier;

import static org.slf4j.LoggerFactory.getLogger;

public class Page<T extends Page<?>> implements FormControl<Page<?>>, SearchScope<Page<?>> {

    public static final Logger logger = getLogger(Page.class);
    private final Browser<?> browser;
    protected final Clickable clickable;
    protected Page<?> page;
    private final T parent;

    public Page(Page page, T parent) {
        this(page.browser, null, parent);
    }

    public Page(Browser<?> browser, Clickable clickable, T parent) {
        this.browser = browser;
        this.clickable = clickable;
        this.parent = parent;
    }

    public Page(Browser<?> browser) {
        this.browser = browser;
        this.parent = null;
        this.clickable = null;
    }

    public final void open() {
        if (clickable != null) {
            clickable.click();
        }
    }

    public T parent() throws NullPointerException {
        if (parent != null) {
            return parent;
        }
        throw new NullPointerException();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return browser.findElements(by);
    }

    /**
     * Find the first element or throw NoSuchElementException
     *
     * @param by selector
     * @return the first element or throw NoSuchElementException
     */
    @Override
    public final Element findElement(final By by) {
        return browser.findElement(by);
    }

    @Override
    public final void onTimeout() {
        if (logger.isDebugEnabled()) {
            browser.save(this.getTitle());
        }
    }

    public final void accept() {
        browser.accept();
    }

    public final void cancel() {
        browser.cancel();
    }

    public final void close() {
        if (!Boolean.getBoolean("keep.browser.open")) {
            browser.close();
            quit();
        }
    }

    public final void quit() {
        browser.quit();
    }

    public final Locator<Element, Element> mouseOver() {
        return element -> {
            browser.mouseOver(element);
            return element;
        };
    }

    public final void mouseOver(Element element) {
        browser.mouseOver(element);
    }

    public final void dragAndDrop(Supplier<By> from, Supplier<By> to) {
        browser.dragAndDrop(from.get(), to.get());
    }

    public String getTitle() {
        try {
            return Locators.<Page<?>>optionalElement(ClassName.PAGE_TITLE).andThen(OptionalGetter.GET).andThen(GetText.TEXT).locate(this);
        } catch (Exception e) {
            return "";
        }
    }

    public final Page frame(int i) {
        browser.frame(i);
        return this;
    }

    public final Page defaultContent() {
        browser.defaultContent();
        return this;
    }

}