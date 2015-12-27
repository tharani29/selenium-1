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

package org.sayem.webdriver.internal;

import org.sayem.ui.api.Locator;
import org.sayem.webdriver.ElementConstructorMap;
import org.sayem.webdriver.WebDriverElementContext;
import org.sayem.webdriver.elements.WebDriverElement;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class NestedElementListLookup implements ElementListLookup {
    private final WebDriverElement parent;
    private final Locator children;

    private static final ElementConstructorMap elMap = ElementConstructorMap.webDriverElementOnly();

    public NestedElementListLookup(WebDriverElement parent, Locator children) {
        this.parent = parent;
        this.children = children;
    }

    @Override
    public List<WebElement> lookup() {
        List<WebDriverElement> found = children.findAll(WebDriverElement.class, getNestedContext());

        return found.stream()
                .map(WebDriverElement::getWrappedElement)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "A list of elements found nested within a parent element, " + parent + "\n" +
                "with locator, " + children;
    }

    private WebDriverElementContext getNestedContext() {
        return new DefaultWebDriverElementContext(parent.getWrappedElement(), elMap);
    }
}
