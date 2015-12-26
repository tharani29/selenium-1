package org.sayem.selectors;

import org.openqa.selenium.By;

import java.util.function.Supplier;

import static org.openqa.selenium.By.id;

/**
 * This enum is a Supplier of ById from Selenium By API.
 * Created by sayem on 12/4/15.
 */
public enum Id implements Supplier<By> {

    FIRST_NAME("firstname"),
    LAST_NAME("lastname"),
    EMAIL_ADDRESS("email_address"),
    DOB_MONTH("month"),
    DOB_DATE("day"),
    DOB_YEAR("year"),
    GENDER("gender"),
    PASSWORD("password"),
    PASSWD_CONFIRM("confirmation"),

    // http://the-internet.herokuapp.com/dropdown
    dropdown("dropdown");

    private final By by;

    Id(String id) {
        this.by = id(id);
    }

    /**
     * @return the by instance variable which is a ById.
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