package com.sayem;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.iphone.IPhoneDriver;

/**
 * Aurthur: Syed Sayem
 *
 */
public class App{
    public static void main( String[] args ) throws Exception {

        WebDriver driver = new IPhoneDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("syed@hotmail.com");
        driver.findElement(By.name("pass")).sendKeys("n4#m0n7#n83n8sn38&*30~@");
        driver.findElement(By.name("login")).click();

    }
}
