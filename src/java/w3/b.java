package w3;

import java.util.Arrays;
import i4.l;
import java.util.Collection;
import java.util.List;

public abstract class b
{
    public static final Object[] d(final int n) {
        if (n >= 0) {
            return new Object[n];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }
    
    public static final Object[] e(Object[] copy, final int n) {
        l.e((Object)copy, "<this>");
        copy = Arrays.copyOf(copy, n);
        l.d((Object)copy, "copyOf(...)");
        return copy;
    }
    
    public static final void f(final Object[] array, final int n) {
        l.e((Object)array, "<this>");
        array[n] = null;
    }
    
    public static final void g(final Object[] array, int i, final int n) {
        l.e((Object)array, "<this>");
        while (i < n) {
            f(array, i);
            ++i;
        }
    }
    
    private static final boolean h(final Object[] array, final int n, final int n2, final List list) {
        if (n2 != list.size()) {
            return false;
        }
        for (int i = 0; i < n2; ++i) {
            if (!l.a(array[n + i], list.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    private static final int i(final Object[] array, final int n, final int n2) {
        int n3 = 1;
        for (int i = 0; i < n2; ++i) {
            final Object o = array[n + i];
            int hashCode;
            if (o != null) {
                hashCode = o.hashCode();
            }
            else {
                hashCode = 0;
            }
            n3 = n3 * 31 + hashCode;
        }
        return n3;
    }
    
    private static final String j(final Object[] array, final int n, final int n2, final Collection collection) {
        final StringBuilder sb = new StringBuilder(n2 * 3 + 2);
        sb.append("[");
        for (int i = 0; i < n2; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            final Object o = array[n + i];
            if (o == collection) {
                sb.append("(this Collection)");
            }
            else {
                sb.append(o);
            }
        }
        sb.append("]");
        final String string = sb.toString();
        l.d((Object)string, "toString(...)");
        return string;
    }
}
