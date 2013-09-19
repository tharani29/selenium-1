package com.sayem.elements;

import com.sayem.elements.impl.TextInputImpl;
import com.sayem.elements.impl.internal.ImplementedBy;

/**
 * Text field functionality.
 */
@ImplementedBy(TextInputImpl.class)
public interface TextInput extends Element {
    /**
     * @param text The text to type into the field.
     */
    void set(String text);
}
