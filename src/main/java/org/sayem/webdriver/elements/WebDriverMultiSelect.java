package org.sayem.webdriver.elements;

import org.sayem.ui.api.ElementContext;
import org.sayem.ui.api.Locator;
import org.sayem.ui.api.elements.SelectOption;
import org.sayem.web.By;
import org.sayem.web.api.elements.HtmlMultiSelect;
import org.sayem.web.api.elements.HtmlSelectOption;
import org.sayem.webdriver.internal.ElementLookup;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class WebDriverMultiSelect extends WebDriverElement implements HtmlMultiSelect {
    public WebDriverMultiSelect(ElementLookup source, ElementContext context) {
        super(source, context);
    }

    @Override
    public void select(Locator locator) {
        By.nested(this, locator).find(SelectOption.class, getContext()).select();
    }

    @Override
    public List<HtmlSelectOption> getOptions() {
        return By.nested(this, By.htmlTag("option")).findAll(HtmlSelectOption.class, getContext());
    }

    @Override
    public List<HtmlSelectOption> getSelectedOptions() {
        return getOptions()
                .stream()
                .filter(SelectOption::isSelected)
                .collect(Collectors.toList());
    }

    @Override
    public boolean isEnabled() {
        return attemptAndGet(WebElement::isEnabled);
    }

    @Override
    public String toString() {
        return "A WebDriverMultiSelect backed by, " + source;
    }
}
