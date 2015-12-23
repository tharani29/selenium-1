package org.sayem.api;

import com.jayway.restassured.path.json.JsonPath;

/**
 * Created by sayem on 12/7/15.
 */
@FunctionalInterface
public interface RestAdapter {
    JsonPath execute();
}
