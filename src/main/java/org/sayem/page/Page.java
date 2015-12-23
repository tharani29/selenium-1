package org.sayem.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sayem.Browser;
import org.sayem.selenium.Clickable;
import org.sayem.selenium.Element;
import org.sayem.selenium.Locator;
import org.slf4j.Logger;

import java.util.List;
import java.util.function.Supplier;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Created by sayem on 12/22/15.
 */
public class Page<T extends Page<?>> implements Browser<T>{

    public static final Logger logger = getLogger(Page.class);
    protected Clickable clickable;
    protected Browser<?> browser;
    private final T parent;

    public Page() {
        this.parent = null;
    }

    public Page(T parent) {
        this.parent = parent;
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
}
