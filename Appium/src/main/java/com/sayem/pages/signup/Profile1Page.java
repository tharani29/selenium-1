package com.sayem.pages.signup;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class Profile1Page {

    public WebDriver driver;

    public Profile1Page(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//window[1]/scrollview[1]/webview[1]/textfield[1]")
    private WebElement firstName;

    @FindBy(xpath = "//window[1]/scrollview[1]/webview[1]/textfield[2]")
    private WebElement age;

    @FindBy(name = "Male")
    private WebElement maleButton;

    @FindBy(name = "female")
    private WebElement femaleButton;

    // I Make Financial Decisions...
    @FindBy(xpath = "//window[1]/scrollview[1]/webview[1]/element[1]")
    private WebElement selectTab;

    @FindBy(xpath = "Sign Up / Log In")
    private WebElement withMySpouseLink;

    @FindBy(name = "Next")
    private WebElement nextButton;

    @FindBy(name = "Done")
    private WebElement doneButton;



    public Profile2Page aBitAboutYourself(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        final HashMap<String, Double> flickObject = new HashMap<String, Double>();

        firstName.sendKeys("Syed");
        doneButton.click();
        age.sendKeys("30");
        doneButton.click();
        maleButton.click();

        swipe(js, flickObject, 1, 156, 360, 156, 360, 0.5);
        swipe(js, flickObject, 1, 100, 419, 100, 419, 0.5);

        doneButton.click();
        nextButton.click();

        return PageFactory.initElements(driver, Profile2Page.class);
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