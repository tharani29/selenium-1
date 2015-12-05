package org.sayem.domain;

import org.sayem.converters.StringConverter;

public enum CreditCardType {

    American_Express,
    JCB,
    MasterCard,
    Visa,
    Discover;

    @Override
    public String toString() {
        return StringConverter.REPLACE_UNDERSCORE.locate(this.name());
    }

    public static CreditCardType fromString(String string) {
        return valueOf(StringConverter.RESTORE_UNDERSCORE.locate(string));
    }
}
