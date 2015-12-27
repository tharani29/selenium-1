/*
 Copyright 2014 Red Hat, Inc. and/or its affiliates.

 This file is part of darcy-ui.

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

package org.sayem.ui;

import org.sayem.ui.api.elements.Element;

public class ElementNotDisplayedException extends ElementException {
    public ElementNotDisplayedException(Element element) {
        super("Can't interact with an element if it is not displayed.\n" +
                "Element was a " + element);
    }

    public ElementNotDisplayedException(Element element, Throwable cause) {
        super("Can't interact with an element if it is not displayed.\n" +
                "Element was a " + element, cause);
    }
}
