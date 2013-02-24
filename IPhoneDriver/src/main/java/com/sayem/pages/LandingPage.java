package com.sayem.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class LandingPage {

    public WebDriver driver;

    public LandingPage(WebDriver driver){
        this.driver = driver;
    }

    public void goToProductProductPage(){

        List<WebElement> events = driver.findElements(By.cssSelector(".event-link"));
        Random num = new Random();
        int index=num.nextInt(events.size());
        events.get(index);
    }
}
