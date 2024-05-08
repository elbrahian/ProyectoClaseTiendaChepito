package org.tiendachepeito.crosscitting.helpers;


//singlelton
public final class TextHelper {
    private TextHelper() {
        super();
    }

    public static final boolean isNull(final String string) {
        return ObjectHelper.getObjectHelper().isNull(string);
    }

    public static final boolean isNUllOrEmpty(final String string) {
        return isNull(string) | "".equals(string);
    }

    public static final String applyTrim(final String string) {
        return string.trim();
    }

    public static final String getDefault(final String string, final String defaultvalue) {
        return isNull(string) ? defaultvalue : string;
    }
}
