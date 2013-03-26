/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *                Selenium WebDriver for iPhone                              *
 *              ********************************                             *
 *    sayem$ cd ~/Desktop/selenium  (Go to selenium project) If no there,    *
 *    sayem$ git clone https://code.google.com/p/selenium/                   *
 *    sayem$ git pull                                                        *
 *                                                                           *
 *   Open Xcode and cick on iWebDriver project (If not there)                *
 *   Click on "Open Other"                                                   *
 *   Go to /Desktop/selenium/iphone/ and then select "iWebDriver.xcodeproj"  *
 *   Click compile & run (Play button)                                       *
 *                                                                           *
 *   Come back to IntelliJ IDEA                                              *
 *   and run the iPhone Script from IntelliJ IDEA                            *
 *   It will run on the iPhone Simulator                                     *
 *                                                                           *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

package com.sayem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.iphone.IPhoneDriver;

public class IPhoneExample {
    public static void main( String[] args ) throws Exception {

        WebDriver driver = new IPhoneDriver("http://192.168.1.148:3001/wd/hub");
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("syed@hotmail.com");
        driver.findElement(By.name("pass")).sendKeys("s@m13o9z");
        driver.findElement(By.name("login")).click();

    }
}