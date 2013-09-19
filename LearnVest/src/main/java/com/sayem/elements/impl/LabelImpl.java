package com.sayem.elements.impl;

import com.sayem.elements.Label;
import org.openqa.selenium.WebElement;

/**
 * Wraps a label on a html form with some behavior.
 */
public class LabelImpl extends ElementImpl implements Label {

    /**
     * Creates a IElement for a given WebElement.
     *
     * @param element element to wrap up
     */
    public LabelImpl(WebElement element) {
        super(element);
    }

    @Override
    public String getFor() {
        return getWrappedElement().getAttribute("for");
    }
}
