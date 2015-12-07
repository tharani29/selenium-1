package org.sayem.assertion;

import org.testng.Assert;

/**
 * Created by sayem on 12/7/15.
 */
public interface Assertion {

    public static void assertEquals(String actual, String expected) {
        Assert.assertEquals(actual, expected);
    }

    public static void assertNotEquals(String actual, String expected) {
        Assert.assertNotEquals(actual, expected);
    }
}
