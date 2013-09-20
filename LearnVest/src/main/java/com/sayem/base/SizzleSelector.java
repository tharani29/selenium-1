package com.sayem.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import java.util.List;

@SuppressWarnings("unchecked")
public class SizzleSelector {

    private JavascriptExecutor driver;

    public SizzleSelector(WebDriver webDriver) {
        driver = (JavascriptExecutor) webDriver;
    }
    public WebElement findElementBySizzleCss(String using) {
        injectSizzleIfNeeded();
        String javascriptExpression = createSizzleSelectorExpression(using);
        List elements = (List) driver
                .executeScript(javascriptExpression);
        if (elements.size() > 0)
            return (WebElement) elements.get(0);
        return null;
    }

    public List findElementsBySizzleCss(String using) {
        injectSizzleIfNeeded();
        String javascriptExpression = createSizzleSelectorExpression(using);
        return (List) driver.executeScript(javascriptExpression);
    }
    private String createSizzleSelectorExpression(String using) {
        return "return Sizzle(\"" + using + "\")";
    }

    private void injectSizzleIfNeeded() {
        if (!sizzleLoaded()) injectSizzle();
    }

    public Boolean sizzleLoaded() {
        Boolean loaded;
        try{
            loaded = (Boolean) driver.executeScript("return Sizzle()!=null");
        } catch (WebDriverException e) {
            loaded = false;
        }
        return loaded;
    }
    public void injectSizzle() {
        driver.executeScript(" var headID = document.getElementsByTagName(\"head\")[0];"
                + "var newScript = document.createElement('script');"
                + "newScript.type = 'text/javascript';"
                + "newScript.src = 'https://raw.github.com/jquery/sizzle/master/sizzle.js';"
                + "headID.appendChild(newScript);");
    }
}