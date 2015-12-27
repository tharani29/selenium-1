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

import org.sayem.ui.DarcyException;
import org.sayem.ui.annotations.Context;
import org.sayem.ui.api.ElementContext;
import org.sayem.ui.api.HasElementContext;
import org.sayem.ui.api.View;
import org.sayem.ui.api.elements.Element;

import java.lang.reflect.Field;
import java.util.List;

public class Initializer {
    private final View view;
    private final List<Field> fields;

    public Initializer(View view, List<Field> fields) {
        this.view = view;
        this.fields = fields;
    }

    /**
     * Sets the context for fields that are
     * {@link Element Elements} or {@link List Lists} and
     * implement {@link HasElementContext}, as well as assigns fields the
     * context itself if they are annotated with {@link Context}.
     */
    public void initializeFields(ElementContext context) {
        setContext(context);
        assignContext(context);
    }

    /**
     * Filters element or list fields, and if their associated objects implement
     * {@link HasElementContext}, calls
     * {@link HasElementContext#setContext(ElementContext)}
     * on those objects with the specified context.
     */
    private void setContext(ElementContext context) {
        fields.stream()
                .filter(f -> HasElementContext.class.isAssignableFrom(f.getType())
                        || Element.class.isAssignableFrom(f.getType())
                        || List.class.isAssignableFrom(f.getType()))
                // TODO: .filter(f -> f.getAnnotation(IndependentContext.class) == null)
                .map(f -> {
                    try {
                        return f.get(view);
                    } catch (IllegalAccessException e) {
                        throw new DarcyException(String.format("Couldn't retrieve get object " +
                                "from field, %s, in view, %s", f, view), e);
                    }
                })
                .filter(o -> o instanceof HasElementContext)
                .map(e -> (HasElementContext) e)
                .forEach(e -> e.setContext(context));
    }

    /**
     * Sets fields annotated with {@link Context @Context} with the
     * specified context.
     */
    private void assignContext(ElementContext context) {
        fields.stream()
                .filter(f -> f.getAnnotation(Context.class) != null)
                .forEach(f -> {
                    try {
                        f.set(view, context);
                    } catch (IllegalAccessException | IllegalArgumentException e) {
                        throw new DarcyException("Couldn't assign context to field," + f, e);
                    }
                });
    }
}
