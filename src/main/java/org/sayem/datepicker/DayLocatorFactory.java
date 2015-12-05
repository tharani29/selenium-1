package org.sayem.datepicker;

import org.sayem.pages.Page;
import org.sayem.selenium.Locator;

public interface DayLocatorFactory {

    Locator<Page, Void> forDay(int day);
}
