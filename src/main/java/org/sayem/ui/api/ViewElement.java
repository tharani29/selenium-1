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

import org.sayem.ui.AbstractViewElement;
import org.sayem.ui.Elements;
import org.sayem.ui.api.elements.Element;
import org.sayem.ui.internal.ChainedViewFactory;
import org.sayem.ui.internal.NestedViewFactory;
import org.sayem.ui.internal.ViewList;

/**
 * Abstraction of some reusable collection of fundamental element types and conditions. If
 * ViewElements have constructors (or factory methods) that implement
 * {@link ChainedViewFactory} and / or
 * {@link NestedViewFactory} they may be found like regular
 * elements.
 *
 * <p>It is suggested that all ViewElement implementations create static factory methods that accept
 * a locator so as to imitate the static factories on {@link Elements}. This
 * allows ViewElements to be used alongside other element fields and be equally readable. For
 * example:
 *
 * <pre><code>
 *     public class Widget implements ViewElement {
 *         public static Widget widget(Locator locator) {
 *             return new Widget(locator);
 *         }
 *
 *         public static List{@code<Widget>} widgets(Locator locator) {
 *             return new ViewList(Widget::new, locator);
 *         }
 *
 *         public Widget(Locator locator) {
 *           // Handle chaining a locator
 *         }
 *
 *         public Widget(Element element) {
 *           // Handle nesting under an element
 *         }
 *     }
 * </code></pre>
 *
 * <p>To greatly simplify implementations, consider extending
 * {@link AbstractViewElement}.
 *
 * @see ViewList
 * @see AbstractViewElement
 */
public interface ViewElement extends View, Element {
}
