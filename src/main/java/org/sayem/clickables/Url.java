package org.sayem.clickables;

import org.sayem.selenium.Browser;
import org.sayem.selenium.Clickable;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class Url<T extends Browser> implements Clickable {

    private static final Logger log = getLogger(Url.class);

    private T browser;
    private String url;

    public Url(T browser, String url) {
        this.browser = browser;
        this.url = url;
    }

    public void click() {
        log.info("loading [" + url + "]");
        browser.get(url);
        browser.save(url);
    }

    public T load() {
        click();
        return browser;
    }
}
