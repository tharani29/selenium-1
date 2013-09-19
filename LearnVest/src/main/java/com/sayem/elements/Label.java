package com.sayem.elements;

import com.sayem.elements.impl.LabelImpl;
import com.sayem.elements.impl.internal.ImplementedBy;

/**
 * Html form label.
 */
@ImplementedBy(LabelImpl.class)
public interface Label extends Element {
    /**
     * Gets the for attribute on the label.
     *
     * @return string containing value of the for attribute, null if empty.
     */
    String getFor();
}
