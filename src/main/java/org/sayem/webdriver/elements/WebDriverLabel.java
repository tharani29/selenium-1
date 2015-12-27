/*
 Copyright 2014 Red Hat, Inc. and/or its affiliates.

 This file is part of darcy-webdriver.

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

package org.sayem.webdriver.elements;

import org.sayem.ui.api.ElementContext;
import org.sayem.web.api.elements.HtmlLabel;
import org.sayem.webdriver.internal.ElementLookup;

import org.openqa.selenium.WebElement;

public class WebDriverLabel extends WebDriverElement implements HtmlLabel {
    public WebDriverLabel(ElementLookup source, ElementContext context) {
        super(source, context);
    }

    @Override
    public String getText() {
        return attemptAndGet(WebElement::getText);
    }

    @Override
    public String getFor() {
        return getAttribute("for");
    }

    @Override
    public String toString() {
        return "A WebDriverLabel backed by, " + source;
    }
}
