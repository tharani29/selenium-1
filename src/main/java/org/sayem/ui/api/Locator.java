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

package org.sayem.ui.api;

import org.sayem.ui.api.elements.Findable;

import java.util.List;

/**
 * A locator is a strategy for finding an instance (or List of instances) that implement some class,
 * given some {@link Context}.
 */
public interface Locator {
    /**
     * Returns a list of all the elements found by this locator, of the given type, in the given
     * context.
     *
     * @param type
     * @param context
     * @return
     */
    <T extends Findable> List<T> findAll(Class<T> type, Context context);
    
    /**
     * Returns one element found by this locator, of the given type, in the given context.
     *
     * @param type
     * @param context
     * @return
     */
    <T extends Findable> T find(Class<T> type, Context context);
}
