package com.sayem.rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test_Properties {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream("src/main/java/com/sayem/config/OR.properties");
		prop.load(fs);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("place"));
		System.out.println(prop.getProperty("xxxx"));

	}

}
