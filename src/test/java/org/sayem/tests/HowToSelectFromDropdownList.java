package org.sayem.tests;

import org.sayem.Browser;
import org.sayem.selectors.Id;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

/**
 * Created by sayem on 12/26/15.
 */
public class HowToSelectFromDropdownList implements Browser<HowToSelectFromDropdownList> {

    @Test
    public void dropDownList(){
        Browser.setBrowserUrl("http://the-internet.herokuapp.com/dropdown");
        select(Id.dropdown, "Option 1");
        Browser.delay(2000);
    }

    @AfterSuite
    public void quitBrowser(){
        Browser.quitBrowser();
    }
}
