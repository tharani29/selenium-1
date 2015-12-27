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

package org.sayem.ui.internal;

import org.sayem.ui.api.Context;
import org.sayem.ui.api.ContextSelection;
import org.sayem.ui.api.Locator;
import org.sayem.ui.api.ParentContext;
import org.sayem.ui.api.elements.Findable;

import java.util.List;

/**
 * A simple default {@link ContextSelection} that forwards to {@link Locator#find(Class, Context)}
 * and {@link Locator#findAll(Class, Context)} respectively.
 */
public class DefaultContextSelection implements ContextSelection {
    private final ParentContext parentContext;
    
    public DefaultContextSelection(ParentContext parentContext) {
        this.parentContext = parentContext;
    }
    
    @Override
    public <T extends Context & Findable> T contextOfType(Class<T> contextType, Locator locator) {
        return locator.find(contextType, parentContext);
    }
    
    @Override
    public <T extends Context & Findable> List<T> contextsOfType(Class<T> contextType, Locator locator) {
        return locator.findAll(contextType, parentContext);
    }
    
}
