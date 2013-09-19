package com.sayem.base;

import org.openqa.selenium.*;
import org.openqa.selenium.internal.WrapsElement;

import java.util.List;

public class MissingWebElement implements WebElement, WrapsElement {

  private final NoSuchElementException nsee;

  public MissingWebElement(final NoSuchElementException nsee) {
    this.nsee = nsee;
  }

  @Override
  public void click() {
    throw nsee;
  }

  @Override
  public void submit() {
    throw nsee;
  }

  @Override
  public void sendKeys(final CharSequence... keysToSend) {
    throw nsee;
  }

  @Override
  public void clear() {
    throw nsee;
  }

  @Override
  public String getTagName() {
    throw nsee;
  }

  @Override
  public String getAttribute(final String name) {
    throw nsee;
  }

  @Override
  public boolean isSelected() {
    throw nsee;
  }

  @Override
  public boolean isEnabled() {
    throw nsee;
  }

  @Override
  public String getText() {
    throw nsee;
  }

  @Override
  public List<WebElement> findElements(final By by) {
    throw nsee;
  }

  @Override
  public WebElement findElement(final By by) {
    throw nsee;
  }

  @Override
  public boolean isDisplayed() {
    throw nsee;
  }

  @Override
  public Point getLocation() {
    throw nsee;
  }

  @Override
  public Dimension getSize() {
    throw nsee;
  }

  @Override
  public String getCssValue(final String propertyName) {
    throw nsee;
  }

  @Override
  public WebElement getWrappedElement() {
    return null;
  }

  public NoSuchElementException getNoSuchElementException() {
    return nsee;
  }

}
