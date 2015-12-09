package org.sayem.domain;


import org.sayem.converters.StringConverter;

public enum Countries {
    Australia,
    China,
    India,
    United_Kindon,
    United_States;

    public static Countries fromString(String string) {
        return valueOf(StringConverter.RESTORE_UNDERSCORE.locate(string));
    }

    @Override
    public String toString() {
        return StringConverter.REPLACE_UNDERSCORE.locate(this.name());
    }
}
