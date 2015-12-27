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

import org.sayem.ui.annotations.Context;
import org.sayem.ui.annotations.NotRequired;
import org.sayem.ui.annotations.Require;
import org.sayem.ui.annotations.RequireAll;
import org.sayem.ui.api.ElementContext;
import org.sayem.ui.api.HasElementContext;
import org.sayem.ui.api.Transition;
import org.sayem.ui.api.View;
import org.sayem.ui.internal.Analyzer;
import org.sayem.ui.internal.Initializer;
import org.sayem.util.ReflectionUtil;
import com.redhat.synq.Condition;
import org.sayem.ui.api.elements.Element;
import org.sayem.ui.api.elements.Findable;

import java.lang.reflect.Field;
import java.util.List;

/**
 * A partial implementation of View that initializes Element and View fields in
 * {@link #setContext(ElementContext)}, and simplifies defining load
 * conditions (via {@link Require}, {@link RequireAll}, and {@link NotRequired}). This allows a
 * client to succinctly and declaratively define a valid view simply by the content of that view's
 * class fields and annotations.
 *
 * @see Elements
 * @see #setContext(ElementContext)
 * @see #onSetContext()
 * @see #isLoaded()
 */
public abstract class AbstractView implements View {
    /**
     * The ElementContext for this View, managed by AbstractView.
     */
    private ElementContext context;

    /**
     * Analyzes annotations and fields for load conditions. Intentionally package scope for
     * collaboration with {@link AbstractViewElement}.
     */
    final Analyzer analyzer;

    /**
     * Sets context on fields that have a context whatever context is assigned to this view.
     */
    private final Initializer initializer;

    protected AbstractView() {
        List<Field> declaredFields = ReflectionUtil.getAllDeclaredFields(this);

        analyzer = new Analyzer(this, declaredFields);
        initializer = new Initializer(this, declaredFields);
    }

    /**
     * Determines whether or not the view is loaded by reading annotations
     * ({@link Require},
     * {@link RequireAll}, and
     * {@link NotRequired}), and all fields that
     * implement one of {@link View View},
     * {@link Element Element}, or
     * {@link Findable Findable}, or
     * {@link List} of any of those types. Each field that is determined to be required
     * will be queried based on its type, preferring {@link View#isLoaded()}
     * over {@link Element#isDisplayed() Element.isDisplayed()}
     * over {@link Findable#isPresent() Findable.isPresent()}, and
     * the combined success of these queries determines that this view is loaded.
     *
     * <p>Lists of those types are queried such that, by default, at least one element in the list
     * is loaded, displayed, or present (in that order of precedence). The lists contents may change
     * each time {@code isLoaded()} is called, reflecting whatever elements are found by the
     * supplied locator at the time it is called. To require more than one element in a list, see
     * {@link Require} documentation.
     *
     * <p>If no fields are configured to be required that implement one of those interfaces, a
     * {@link NoRequiredElementsException} will be thrown.
     *
     * @throws NoRequiredElementsException if no
     * {@link View}, {@link Element},
     * {@link Findable}, or
     * {@link List} of those types is configured to be required.
     */
    @Override
    public boolean isLoaded() {
        return analyzer.getLoadConditions().stream().allMatch(Condition::isMet);
    }

    /**
     * In AbstractView, setContext triggers some helpful initializations:
     * <ul>
     * <li>If a field is annotated with {@link Context}, then the context parameter will be casted
     * and assigned to that field. If the context does not implement that fields type, a
     * {@link ClassCastException} will be thrown.</li>
     * <li>If there are fields that implement {@link HasElementContext},
     * then they were created in such a way that they do not know about their owning View and,
     * therefore, ElementContext. When setContext is called, LazyElements will get the context
     * assigned to them.</li>
     * <li>Calls {@link #onSetContext()} so that implementations of AbstractView may provide their
     * own initializations that depend on the context, as necessary.</li>
     * </ul>
     */
    @Override
    public final void setContext(ElementContext context) {
        this.context = context;

        initializer.initializeFields(context);

        onSetContext();
    }

    @Override
    public ElementContext getContext() {
        return context;
    }

    /**
     * Called after any call to {@link #setContext(ElementContext)}. Useful if you need to set up
     * some fields that depend on this view having a context.
     */
    protected void onSetContext() {

    }

    /**
     * Shortcut for getContext().transition().
     * @see ElementContext#transition()
     */
    protected Transition transition() {
        if (context == null) {
            throw new NullContextException();
        }

        return context.transition();
    }
}
