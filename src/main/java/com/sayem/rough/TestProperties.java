package com.sayem.rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

    public static void main(String [] args){

        Properties prop = new Properties();
        try {
            FileInputStream fs = new FileInputStream("src\\main\\java\\com\\sayem\\config\\OR.properties");
            prop.load(fs);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(prop.getProperty("Name"));


    }
}
