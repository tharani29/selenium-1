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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.iphone.IPhoneDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class IPhoneExample {
    public static void main( String[] args ) throws Exception {

        //WebDriver driver = new IPhoneDriver("http://192.168.1.148:3001/wd/hub");
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.148:3001/wd/hub"), DesiredCapabilities.iphone());
        driver.get("https://www.totsy.com/");
        driver.findElement(By.cssSelector("#email")).sendKeys("sssayem@totsy.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("user123");
        driver.findElement(By.cssSelector("#submit-button")).click();

    }
}