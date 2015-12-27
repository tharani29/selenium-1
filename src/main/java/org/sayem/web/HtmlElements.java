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

package org.sayem.web;

import org.sayem.ui.Elements;
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
import org.sayem.web.api.elements.HtmlSelectOption;
import org.sayem.web.api.elements.HtmlText;
import org.sayem.web.api.elements.HtmlTextInput;

import java.util.List;

/**
 * An extension of {@link Elements} which provides additional static factories
 * intended to be used as class fields for HTML element subtypes. Extends
 * {@link Elements} so this class may be used in its place if you require HTML
 * specific APIs.
 *
 * @see Elements
 */
public abstract class HtmlElements extends Elements {
    public static HtmlElement htmlElement(Locator locator) {
        return element(HtmlElement.class, locator);
    }

    public static List<HtmlElement> htmlElements(Locator locator) {
        return elements(HtmlElement.class, locator);
    }

    public static HtmlTextInput htmlTextInput(Locator locator) {
        return element(HtmlTextInput.class, locator);
    }

    public static List<HtmlTextInput> htmlTextInputs(Locator locator) {
        return elements(HtmlTextInput.class, locator);
    }

    public static HtmlButton htmlButton(Locator locator) {
        return element(HtmlButton.class, locator);
    }

    public static List<HtmlButton> htmlButtons(Locator locator) {
        return elements(HtmlButton.class, locator);
    }

    public static HtmlFileSelect htmlFileSelect(Locator locator) {
        return element(HtmlFileSelect.class, locator);
    }

    public static List<HtmlFileSelect> htmlFileSelects(Locator locator) {
        return elements(HtmlFileSelect.class, locator);
    }

    public static HtmlLabel htmlLabel(Locator locator) {
        return element(HtmlLabel.class, locator);
    }

    public static List<HtmlLabel> htmlLabels(Locator locator) {
        return elements(HtmlLabel.class, locator);
    }

    public static HtmlLink htmlLink(Locator locator) {
        return element(HtmlLink.class, locator);
    }

    public static List<HtmlLink> htmlLinks(Locator locator) {
        return elements(HtmlLink.class, locator);
    }

    public static HtmlSelect htmlSelect(Locator locator) {
        return element(HtmlSelect.class, locator);
    }

    public static List<HtmlSelect> htmlSelects(Locator locator) {
        return elements(HtmlSelect.class, locator);
    }

    public static HtmlCheckbox htmlCheckbox(Locator locator) {
        return element(HtmlCheckbox.class, locator);
    }

    public static List<HtmlCheckbox> htmlCheckboxes(Locator locator) {
        return elements(HtmlCheckbox.class, locator);
    }

    public static HtmlRadio htmlRadio(Locator locator) {
        return element(HtmlRadio.class, locator);
    }

    public static List<HtmlRadio> htmlRadios(Locator locator) {
        return elements(HtmlRadio.class, locator);
    }

    public static HtmlDateInput htmlDateInput(Locator locator) {
        return element(HtmlDateInput.class, locator);
    }

    public static List<HtmlDateInput> htmlDateInputs(Locator locator) {
        return elements(HtmlDateInput.class, locator);
    }

    public static HtmlMultiSelect htmlMultiSelect(Locator locator) {
        return element(HtmlMultiSelect.class, locator);
    }

    public static List<HtmlMultiSelect> htmlMultiSelects(Locator locator) {
        return elements(HtmlMultiSelect.class, locator);
    }

    public static HtmlText htmlText(Locator locator) {
        return element(HtmlText.class, locator);
    }

    public static List<HtmlText> htmlTexts(Locator locator) {
        return elements(HtmlText.class, locator);
    }

    public static HtmlSelectOption htmlSelectOption(Locator locator) {
        return element(HtmlSelectOption.class, locator);
    }

    public static List<HtmlSelectOption> htmlSelectOptions(Locator locator) {
        return elements(HtmlSelectOption.class, locator);
    }
}
