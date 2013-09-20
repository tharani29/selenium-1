package com.sayem.locators;

import com.sayem.interfaces.IClick;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class TagName implements IClick {

    private JavascriptExecutor driver;

    @Override
    public void click(String selector) {
        By.tagName(selector);
    }
}
