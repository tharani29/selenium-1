package com.sayem.rough;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class TestScreenshot {

	public static void main(String[] args) throws IOException {

		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		// screenshot
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile, new File("/Users/sayem/Desktop/gmail.jpg"));
	}

}
