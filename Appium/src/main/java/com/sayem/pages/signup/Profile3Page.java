package com.sayem.pages.signup;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class Profile3Page {

    private WebDriver driver;

    public Profile3Page(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(name = "Done")
    private WebElement doneButton;

    public Profile4Page profile3income(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        final HashMap<String, Double> flickObject = new HashMap<String, Double>();

        /**********************************************
                           INCOME
         **********************************************/

        // first swipe
        flickObject.put("touchCount", (double) 1);
        flickObject.put("startX", (double) 273);
        flickObject.put("startY", (double) 190);
        flickObject.put("endX", (double) 273);
        flickObject.put("endY", (double) 190);
        flickObject.put("duration", 0.5);
        js.executeScript("mobile: swipe", flickObject);


        // second swipe
        flickObject.put("touchCount", (double) 1);
        flickObject.put("startX", (double) 158);
        flickObject.put("startY", (double)464);
        flickObject.put("endX", (double)162);
        flickObject.put("endY", (double)292);
        flickObject.put("duration", (double)0.5);
        js.executeScript("mobile: swipe", flickObject);

        // thrid swipe
        flickObject.put("touchCount", (double) 1);
        flickObject.put("startX", (double) 141);
        flickObject.put("startY", (double)416);
        flickObject.put("endX", (double)141);
        flickObject.put("endY", (double)416);
        flickObject.put("duration", (double)0.5);
        js.executeScript("mobile: swipe", flickObject);

        doneButton.click();


        /**********************************************
                        Total Saving
         **********************************************/


        return PageFactory.initElements(driver, Profile4Page.class);

    }
}
