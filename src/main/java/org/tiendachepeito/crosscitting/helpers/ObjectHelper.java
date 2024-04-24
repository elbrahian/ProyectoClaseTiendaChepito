package org.tiendachepeito.crosscitting.helpers;

public class ObjectHelper {
    private static final ObjectHelper instance = new ObjectHelper();

    private ObjectHelper() {
        super();
    }

    public static final ObjectHelper getObjectHelper() {
        return instance;
    }

    public final <T> T getDefault(final T object, final T defaultObject) {
        return isNull(object) ? defaultObject : object;
    }

    public final <T> boolean isNull(T object) {
        return object == null;
    }
}
