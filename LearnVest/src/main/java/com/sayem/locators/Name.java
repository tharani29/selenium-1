package com.sayem.locators;

import com.sayem.interfaces.IClick;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Name implements IClick {

    private WebDriver driver;

    @Override
    public void click(String selector) {
        By.name(selector);
    }
}
