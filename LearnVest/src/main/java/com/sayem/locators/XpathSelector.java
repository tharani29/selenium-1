package com.sayem.locators;

import com.sayem.interfaces.IClick;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XpathSelector implements IClick {
    private WebDriver driver;

    @Override
    public void click(String selector) {
        driver.findElement(By.xpath(selector)).click();
    }
}
