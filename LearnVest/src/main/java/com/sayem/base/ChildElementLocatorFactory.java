package com.sayem.base;

import com.sayem.base.annotations.ChildOf;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public class ChildElementLocatorFactory implements ElementLocatorFactory {

  final Map<String, List<WebElement>> parentCandidates;

  public ChildElementLocatorFactory(final Map<String, List<WebElement>> parentCandidates) {
    this.parentCandidates = parentCandidates;
  }

  @Override
  public ElementLocator createLocator(final Field field) {
    if (field.isAnnotationPresent(ChildOf.class)) {
      return new ChildElementLocator(parentCandidates, field);
    }
    return null;
  }

}
