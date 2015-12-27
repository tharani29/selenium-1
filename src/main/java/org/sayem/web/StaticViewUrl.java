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

import org.sayem.ui.api.View;
import org.sayem.web.api.ViewUrl;

import java.util.function.Supplier;

public class StaticViewUrl<T extends View> implements ViewUrl<T> {
    private final String url;
    private final Supplier<T> view;
    
    public StaticViewUrl(String url, Supplier<T> view) {
        this.url = url;
        this.view = view;
    }
    
    @Override
    public String url() {
        return url;
    }
    
    @Override
    public T destination() {
        return view.get();
    }
    
    @Override
    public String toString() {
        return "StaticViewUrl: {url: " + url + ", destination: " + view.get().toString() + "}";
    }
}
