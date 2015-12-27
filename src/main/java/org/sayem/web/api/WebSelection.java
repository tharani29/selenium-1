/*
 Copyright 2014 Red Hat, Inc. and/or its affiliates.

 This file is part of darcy-web.

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.sayem.web.api;

import org.sayem.ui.api.ContextSelection;
import org.sayem.ui.api.ElementSelection;
import org.sayem.ui.api.Locator;
import org.sayem.web.api.elements.HtmlButton;
import org.sayem.web.api.elements.HtmlCheckbox;
import org.sayem.web.api.elements.HtmlDateInput;
import org.sayem.web.api.elements.HtmlElement;
import org.sayem.web.api.elements.HtmlFileSelect;
import org.sayem.web.api.elements.HtmlLabel;
import org.sayem.web.api.elements.HtmlLink;
import org.sayem.web.api.elements.HtmlMultiSelect;
import org.sayem.web.api.elements.HtmlRadio;
import org.sayem.web.api.elements.HtmlSelect;
import org.sayem.web.api.elements.HtmlText;
import org.sayem.web.api.elements.HtmlTextInput;

import java.util.List;

/**
 * Extends the default {@link ContextSelection} interface with some web-specific defaults.
 */
public interface WebSelection extends ContextSelection, ElementSelection {
    default Browser browser(Locator locator) {
        return contextOfType(Browser.class, locator);
    }

    default Frame frame(Locator locator) {
        return contextOfType(Frame.class, locator);
    }

    /**
     * Returns a reference to a Javascript alert window. Will not throw an exception immediately if
     * one is not open, but attempting to interact with one where none is present <em>will</em>
     * throw an exception. Because there can only be one alert within one window at a time,
     * providing a {@link Locator} is unnecessary.
     *
     * @see Alert
     * @see Alert#isPresent()
     */
    Alert alert();

    default HtmlElement htmlElement(Locator locator) {
        return elementOfType(HtmlElement.class, locator);
    }

    default List<HtmlElement> htmlElements(Locator locator) {
        return elementsOfType(HtmlElement.class, locator);
    }

    default HtmlTextInput htmlTextInput(Locator locator) {
        return elementOfType(HtmlTextInput.class, locator);
    }

    default List<HtmlTextInput> htmlTextInputs(Locator locator) {
        return elementsOfType(HtmlTextInput.class, locator);
    }

    default HtmlButton htmlButton(Locator locator) {
        return elementOfType(HtmlButton.class, locator);
    }

    default List<HtmlButton> htmlButtons(Locator locator) {
        return elementsOfType(HtmlButton.class, locator);
    }

    default HtmlFileSelect htmlFileSelect(Locator locator) {
        return elementOfType(HtmlFileSelect.class, locator);
    }

    default List<HtmlFileSelect> htmlFileSelects(Locator locator) {
        return elementsOfType(HtmlFileSelect.class, locator);
    }

    default HtmlLabel htmlLabel(Locator locator) {
        return elementOfType(HtmlLabel.class, locator);
    }

    default List<HtmlLabel> htmlLabels(Locator locator) {
        return elementsOfType(HtmlLabel.class, locator);
    }

    default HtmlLink htmlLink(Locator locator) {
        return elementOfType(HtmlLink.class, locator);
    }

    default List<HtmlLink> htmlLinks(Locator locator) {
        return elementsOfType(HtmlLink.class, locator);
    }

    default HtmlSelect htmlSelect(Locator locator) {
        return elementOfType(HtmlSelect.class, locator);
    }

    default List<HtmlSelect> htmlSelects(Locator locator) {
        return elementsOfType(HtmlSelect.class, locator);
    }

    default HtmlText htmlText(Locator locator) {
        return elementOfType(HtmlText.class, locator);
    }

    default List<HtmlText> htmlTexts(Locator locator) {
        return elementsOfType(HtmlText.class, locator);
    }

    default HtmlCheckbox htmlCheckbox(Locator locator) {
        return elementOfType(HtmlCheckbox.class, locator);
    }

    default List<HtmlCheckbox> htmlCheckboxes(Locator locator) {
        return elementsOfType(HtmlCheckbox.class, locator);
    }

    default HtmlRadio htmlRadio(Locator locator) {
        return elementOfType(HtmlRadio.class, locator);
    }

    default List<HtmlRadio> htmlRadios(Locator locator) {
        return elementsOfType(HtmlRadio.class, locator);
    }

    default HtmlMultiSelect htmlMultiSelect(Locator locator) {
        return elementOfType(HtmlMultiSelect.class, locator);
    }

    default List<HtmlMultiSelect> htmlMultiSelects(Locator locator) {
        return elementsOfType(HtmlMultiSelect.class, locator);
    }

    default HtmlDateInput htmlDateInput(Locator locator) {
        return elementOfType(HtmlDateInput.class, locator);
    }

    default List<HtmlDateInput> htmlDateInputs(Locator locator) {
        return elementsOfType(HtmlDateInput.class, locator);
    }
}
