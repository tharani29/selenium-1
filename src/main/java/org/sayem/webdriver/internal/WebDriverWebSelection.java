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

import org.sayem.web.api.Alert;
import org.sayem.web.internal.AbstractWebSelection;

public class WebDriverWebSelection extends AbstractWebSelection {
    private final WebDriverWebContext webContext;

    public WebDriverWebSelection(WebDriverWebContext webContext) {
        super(webContext);

        this.webContext = webContext;
    }

    @Override
    public Alert alert() {
        return webContext.alert();
    }
}
