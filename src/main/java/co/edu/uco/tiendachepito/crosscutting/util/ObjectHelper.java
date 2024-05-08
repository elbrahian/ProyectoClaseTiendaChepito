package co.edu.uco.tiendachepito.crosscutting.util;

public final class ObjectHelper {

    private static final ObjectHelper INSTANCE = new ObjectHelper();

    private ObjectHelper() {
        super();
    }

    public static final ObjectHelper getObjectHelper() {
        return INSTANCE;
    }

    public final <T> boolean isNull(T object) {
        return object == null;
    }

    public final <T> T getDefault(final T Object, final T defaultObject){
        return isNull(Object) ? defaultObject : Object;
    }
}
