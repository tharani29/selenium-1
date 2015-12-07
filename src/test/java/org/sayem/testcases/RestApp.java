package org.sayem.testcases;

import org.sayem.rest.api.RestAdapter;
import org.sayem.rest.api.RestFactory;
import org.testng.annotations.Test;

/**
 * Created by sayem on 12/7/15.
 */
public class RestApp {

    @Test
    public void restTest(){
        RestAdapter delete = RestFactory.DELETE.adapter;
        delete.execute();
    }
}
