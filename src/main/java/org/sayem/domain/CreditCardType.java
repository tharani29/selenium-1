package org.sayem.domain;

import org.sayem.converters.StringConverter;

/**
 * Created by sayem on 12/4/15.
 */
public enum CreditCardType {

    American_Express,
    JCB,
    MasterCard,
    Visa,
    Discover;

    public static CreditCardType fromString(String string) {
        return valueOf(StringConverter.RESTORE_UNDERSCORE.locate(string));
    }

    @Override
    public String toString() {
        return StringConverter.REPLACE_UNDERSCORE.locate(this.name());
    }
}
