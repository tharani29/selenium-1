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

    @FindBy(name = "Next")
    private WebElement nextButton;

    public Profile4Page profile3income(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        final HashMap<String, Double> flickObject = new HashMap<String, Double>();

        // Income
        swipe(js, flickObject, 1, 273, 190, 273, 190, 0.5);
        swipe(js, flickObject, 1, 158, 464, 162, 292, 0.5);
        swipe(js, flickObject, 1, 141, 416, 141, 416, 0.5);
        doneButton.click();

        // Total Saving
        swipe(js, flickObject, 1, 273, 246, 273, 246, 0.5);
        swipe(js, flickObject, 1, 74, 416, 74, 416, 0.5);
        doneButton.click();

        // Total Debt
        swipe(js, flickObject, 1, 272, 302, 272, 302, 0.5);
        swipe(js, flickObject, 1, 71, 418, 71, 418, 0.5);
        doneButton.click();

        // Any Kids?
        swipe(js, flickObject, 1, 272, 357, 272, 357, 0.5);
        swipe(js, flickObject, 1, 179, 444, 179, 361, 0.5);
        swipe(js, flickObject, 1, 70, 372, 70, 372, 0.5);
        doneButton.click();
        nextButton.click();

        return PageFactory.initElements(driver, Profile4Page.class);
    }

    private void swipe(JavascriptExecutor js, HashMap<String, Double> flickObject,
                       double touchCount, double startX, double startY,
                       double endX, double endY, double duration) {
        flickObject.put("touchCount", (double) touchCount);
        flickObject.put("startX", (double) startX);
        flickObject.put("startY", (double) startY);
        flickObject.put("endX", (double) endX);
        flickObject.put("endY", (double) endY);
        flickObject.put("duration", duration);
        js.executeScript("mobile: swipe", flickObject);
    }
}
