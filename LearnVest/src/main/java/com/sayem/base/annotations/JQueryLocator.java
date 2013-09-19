package com.sayem.base.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
/**
 * Locator which will be used in case an elements needs to be located with JQuery.
 */
public @interface JQueryLocator {
  String $();
}