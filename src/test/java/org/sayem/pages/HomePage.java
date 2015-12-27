package org.sayem.pages;

import org.sayem.browsers.Browser;
import org.sayem.page.Page;
import org.sayem.selectors.CssSelector;

/**
 * Created by sayem on 12/4/15.
 */
public class HomePage implements Page<HomePage> {

    public RegisterPage register() {
        Browser.driver().get("http://enterprise-demo.user.magentotrial.com/");
        link(CssSelector.ACCOUNT).click();
        link(CssSelector.REGISTER).click();
        return Browser.pageFactory(RegisterPage.class);
    }
}
