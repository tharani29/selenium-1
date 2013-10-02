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

        firstName.sendKeys("Syed");
        doneButton.click();
        age.sendKeys("30");
        doneButton.click();
        maleButton.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        final HashMap<String, Double> flickObject = new HashMap<String, Double>();

        // first swipe
        flickObject.put("touchCount", (double) 1);
        flickObject.put("startX", (double) 156);
        flickObject.put("startY", (double) 360);
        flickObject.put("endX", (double) 156);
        flickObject.put("endY", (double) 360);
        flickObject.put("duration", 0.5);
        js.executeScript("mobile: swipe", flickObject);


        // second swipe
        //flickObject.put("touchCount", (double) 1);
        flickObject.put("startX", (double) 100);
        flickObject.put("startY", (double)419);
        flickObject.put("endX", (double)100);
        flickObject.put("endY", (double)419);
        flickObject.put("duration", (double)0.5);
        js.executeScript("mobile: swipe", flickObject);

        doneButton.click();
        nextButton.click();

        return PageFactory.initElements(driver, Profile2Page.class);
    }
}