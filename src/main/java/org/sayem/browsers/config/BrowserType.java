package org.sayem.browsers.config;

import org.sayem.browsers.*;

/**
 * Created by sayem on 12/4/15.
 */
public enum BrowserType {
    FIREFOX(new FirefoxBrowser()),
    CHROME(new ChromeBrowser()),
    IE(new IEBrowser()),
    SAFARI(new SafariBrowser()),
    OPERA(new OperaBrowser()),
    PHANTOMJS(new PhantomJSBrowser());

    public final IBrowserThreads browser;

    BrowserType(IBrowserThreads browser) {
        this.browser = browser;
    }
}