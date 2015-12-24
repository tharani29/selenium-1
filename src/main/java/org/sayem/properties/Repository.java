package org.sayem.properties;

/**
 * Created by sayem on 12/4/15.
 */
public enum Repository {

    LOCATION("src/test/resources/org.sayem/selenium.properties"),
    BROWSER("browser"),
    URL("url");

    private String value;

    private Repository(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.getValue();
    }
}