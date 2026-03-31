package v;

import java.util.Objects;

public abstract class c
{
    public static boolean a(final Object o, final Object o2) {
        return Objects.equals(o, o2);
    }
    
    public static int b(final Object... array) {
        return Objects.hash(array);
    }
    
    public static Object c(final Object o) {
        o.getClass();
        return o;
    }
    
    public static Object d(final Object o, final String s) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException(s);
    }
}
