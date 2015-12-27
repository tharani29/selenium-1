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

import org.sayem.ui.api.Locator;
import org.sayem.ui.api.ViewElement;
import org.sayem.ui.annotations.NotRequired;
import org.sayem.ui.annotations.RequireAll;
import org.sayem.ui.api.elements.Element;
import com.redhat.synq.Condition;
import org.sayem.ui.annotations.Require;
import org.sayem.ui.api.View;
import org.sayem.ui.api.elements.Findable;

/**
 * Like {@link AbstractView AbstractView}, but instead of just partially
 * implementing a {@link View View}, implements
 * {@link ViewElement ViewElement}, which implements both
 * {@link View View} and
 * {@link Element Element}. It does this using the familiar
 * {@link Require @Require},
 * {@link RequireAll @RequireAll}, and
 * {@link NotRequired @NotRequired} annotations.
 * {@link #isDisplayed()} checks that all required elements are displayed.
 * {@link #isPresent()} checks that all required findables are present.
 * {@link #isLoaded()} works just like {@link AbstractView}.
 *
 * <p>Additionally, AbstractViewElement provides
 * {@link #byInner(Locator, Locator...)} for
 * conveniently nesting elements underneath some other locator or element. For example:
 *
 * <pre><code>
 *     public class MyCustomElement extends AbstractViewElement {
 *         private TextInput input = textInput(byInner(By.id("input")));
 *                 // Equivalent to: textInput(By.nested(parent, By.id("input")));
 *
 *         // snip
 *     }
 * </code></pre>
 *
 * @see #byInner(Locator, Locator...)
 * @see AbstractView
 * @see ViewElement
 */
public abstract class AbstractViewElement<T extends Element> extends AbstractView implements ViewElement {
    /**
     * The parent element of this ViewElement.
     */
    protected final T parent;

    /**
     * Creates a nested View underneath some parent Locator.
     */
    @Deprecated
    public AbstractViewElement(Locator parent) {
        this(Elements.element((Class<T>) Element.class, parent));
    }

    public AbstractViewElement(Class<T> type, Locator parent) {
        this(Elements.element(type, parent));
    }

    /**
     * Creates a nested View underneath some parent element, which is necessary for creating a list
     * of this ViewElement from some {@link Locator}, as the locator itself
     * may correspond to a number of elements, so each unique element found by the same locator is
     * used to construct this ViewElement to ensure each represents a unique element.
     */
    public AbstractViewElement(T parent) {
        this.parent = parent;
    }

    /**
     * Determines whether or not this ViewElement is displayed by querying
     * {@link Element#isDisplayed()} on all of the required
     * element fields (as annotated by {@link Require},
     * {@link RequireAll}, and
     * {@link NotRequired}.
     *
     * <p>By default, the {@link #parent} element is not required. If you wish to require it, you
     * can either override this method or add your own parent element field that is annotated as
     * required.
     */
    @Override
    public boolean isDisplayed() {
        return analyzer.getDisplayConditions().stream().allMatch(Condition::isMet);
    }

    /**
     * Determines whether or not this ViewElement is present by querying
     * {@link Findable#isPresent()} on all of the required
     * findable fields (as annotated by {@link Require},
     * {@link RequireAll}, and
     * {@link NotRequired}.
     *
     * <p>By default, the {@link #parent} element is not required. If you wish to require it, you
     * can either override this method or add your own parent element field that is annotated as
     * required.
     */
    @Override
    public boolean isPresent() {
        return analyzer.getIsPresentConditions().stream().allMatch(Condition::isMet);
    }

    /**
     * @return a {@link Locator} that is nested underneath the
     * {@link #parent} element. This is simply syntactic sugar for
     * {@code By.nested(parent, locator, additional)}.
     */
    protected Locator byInner(Locator locator, Locator... additional) {
        return By.nested(parent, locator, additional);
    }
}
