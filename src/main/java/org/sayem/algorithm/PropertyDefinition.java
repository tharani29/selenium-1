package org.sayem.algorithm;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by sayem on 12/4/15.
 */
public class PropertyDefinition {

    public int getCount() {
        return (byte) 3;
    }

    public int getInterval() {
        return 3;
    }

    public TimeUnit getTimeUnit() {
        return SECONDS;
    }
}
