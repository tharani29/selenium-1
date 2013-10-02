package com.sayem.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseTest {

	public static Logger APPLICATION_LOGS = null;
	public static Properties CONFIG=null;
	public static WebDriver driver=null;
	public static boolean isLoggedIn=false;

	
	public void initConfigurations(){
		if(CONFIG==null){
		// Logging
		APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
		// config.prop
		 CONFIG = new Properties();
		try {
			FileInputStream fs = new FileInputStream("Appium/src/main/java/com/sayem/config/config.properties");
			CONFIG.load(fs);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
	
	public void initDriver(){
		if(driver==null){
		if(CONFIG.getProperty("browser").equals("Mozilla"))
			driver=new FirefoxDriver();
		else if(CONFIG.getProperty("browser").equals("IE"))
			driver=new InternetExplorerDriver();
		else if(CONFIG.getProperty("browser").equals("Chrome"))
			driver=new ChromeDriver();
		}
	}
	
	public void quitDriver(){
		driver.quit();
		driver=null;
	}

}
