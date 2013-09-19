package com.sayem.base;

import com.sayem.base.annotations.ChildOf;
import com.sayem.base.annotations.JQueryLocator;
import com.sayem.base.annotations.OptionalElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class JQueryHomePage {

  private final WebDriver driver;

  @JQueryLocator($ = "('#jq-intro')")
  private WebElement introDivWithJQuery;

  @JQueryLocator($ = "('div')")
  private List<WebElement> divs;

  @FindBy(id = "jq-intro")
  private WebElement introDivWithDefault;

  @FindBy(id = "jq-intro_DOES_NOT_EXIST")
  @OptionalElement
  private WebElement optionalIntroDivWithDefault;

  @ChildOf(fieldName = "introDivWithDefault", how = How.TAG_NAME, using = "h2")
  private WebElement tagline;

  public JQueryHomePage(final WebDriver driver) {
    this.driver = driver;
    driver.get("http://jquery.com/");
    CustomPageFactory.initElements(this.driver, this);
  }

  public WebElement getIntroDivWithJQuery() {
    return introDivWithJQuery;
  }

  public WebElement getIntroDivWithDefault() {
    return introDivWithDefault;
  }

  public WebElement getOptionalIntroDivWithDefault() {
    return optionalIntroDivWithDefault;
  }

  public List<WebElement> getDivs() {
    return divs;
  }

  public WebElement getTagline() {
    return tagline;
  }

}
