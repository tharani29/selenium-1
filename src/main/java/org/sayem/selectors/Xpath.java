package org.sayem.selectors;

import org.openqa.selenium.By;

import java.util.function.Supplier;

import static org.openqa.selenium.By.xpath;

/**
 * This enum is a Supplier ByXpath from Selenium By API.
 * Created by sayem on 12/4/15.
 */
public enum Xpath implements Supplier<By> {
    PARENT(".."),
    DIV_CONTAINER_ID("//div[@id='container']"),
    LOCATION("//div[@class='tools']/descendant::strong"),
    //*[@id="sbse0"]/div[2]
    GOOGLE_AUTOCOMPLETE("//*[@id='sbse0']/descendant::div"),
    QUANTITY("//div[@id='ys_cartInfo']/descendant::input[@name='cartDS.shoppingcart_ROW0_m_orderItemVector_ROW0_m_quantity']"),
    TABLE_CONTAINER("//*[@id=\"main\"]");

    private final By by;

    Xpath(String id) {
        this.by = xpath(id);
    }

    /**
     * @return the by instance variable which is a ByXpath.
     */
    @Override
    public By get() {
        return by;
    }

    @Override
    public String toString() {
        return by.toString();
    }
}
