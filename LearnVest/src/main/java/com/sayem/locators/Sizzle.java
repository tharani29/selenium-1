package com.sayem.locators;

import com.sayem.base.SizzleSelector;
import com.sayem.interfaces.IClick;
import org.openqa.selenium.WebDriver;

public class Sizzle implements IClick {

    private WebDriver driver;
    SizzleSelector sizzle;

    @Override
    public void click(String selector) {
        sizzle.findElementBySizzleCss(selector).click();
    }
}

