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
import org.sayem.web.api.elements.HtmlLink;
import org.sayem.webdriver.internal.ElementLookup;

import org.openqa.selenium.WebElement;

public class WebDriverLink extends WebDriverElement implements HtmlLink {
    public WebDriverLink(ElementLookup source, ElementContext context) {
        super(source, context);
    }
    
    @Override
    public String getLinkText() {
        return attemptAndGet(WebElement::getText);
    }

    @Override
    public String getText() {
        return attemptAndGet(WebElement::getText);
    }

    @Override
    public boolean isEnabled() {
        return attemptAndGet(WebElement::isEnabled);
    }

    @Override
    public String getHref() {
        return getAttribute("href");
    }

    @Override
    public String toString() {
        return "A WebDriverLink backed by, " + source;
    }
}
