package v3;

import java.util.Collections;
import java.util.Arrays;
import w3.a;
import i4.l;
import java.util.List;

abstract class m
{
    public static List a(final List list) {
        l.e((Object)list, "builder");
        return ((a)list).p();
    }
    
    public static final Object[] b(Object[] copy, final boolean b) {
        l.e((Object)copy, "<this>");
        if (!b || !l.a((Object)copy.getClass(), (Object)Object[].class)) {
            copy = Arrays.copyOf(copy, copy.length, (Class)Object[].class);
            l.d((Object)copy, "copyOf(...)");
        }
        return copy;
    }
    
    public static List c(final int n) {
        return (List)new a(n);
    }
    
    public static List d(final Object o) {
        final List singletonList = Collections.singletonList(o);
        l.d((Object)singletonList, "singletonList(...)");
        return singletonList;
    }
    
    public static Object[] e(final int n, final Object[] array) {
        l.e((Object)array, "array");
        if (n < array.length) {
            array[n] = null;
        }
        return array;
    }
}
