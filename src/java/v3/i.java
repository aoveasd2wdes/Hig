package v3;

import java.util.Comparator;
import java.util.Arrays;
import i4.l;
import java.util.List;

abstract class i extends h
{
    public static List c(final Object[] array) {
        l.e((Object)array, "<this>");
        final List a = k.a(array);
        l.d((Object)a, "asList(...)");
        return a;
    }
    
    public static byte[] d(final byte[] array, final byte[] array2, final int n, final int n2, final int n3) {
        l.e((Object)array, "<this>");
        l.e((Object)array2, "destination");
        System.arraycopy((Object)array, n2, (Object)array2, n, n3 - n2);
        return array2;
    }
    
    public static Object[] e(final Object[] array, final Object[] array2, final int n, final int n2, final int n3) {
        l.e((Object)array, "<this>");
        l.e((Object)array2, "destination");
        System.arraycopy((Object)array, n2, (Object)array2, n, n3 - n2);
        return array2;
    }
    
    public static byte[] h(byte[] copyOfRange, final int n, final int n2) {
        l.e((Object)copyOfRange, "<this>");
        g.b(n2, copyOfRange.length);
        copyOfRange = Arrays.copyOfRange(copyOfRange, n, n2);
        l.d((Object)copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }
    
    public static Object[] i(Object[] copyOfRange, final int n, final int n2) {
        l.e((Object)copyOfRange, "<this>");
        g.b(n2, copyOfRange.length);
        copyOfRange = Arrays.copyOfRange(copyOfRange, n, n2);
        l.d((Object)copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }
    
    public static final void j(final Object[] array, final Object o, final int n, final int n2) {
        l.e((Object)array, "<this>");
        Arrays.fill(array, n, n2, o);
    }
    
    public static final void k(final Object[] array, final Comparator comparator) {
        l.e((Object)array, "<this>");
        l.e((Object)comparator, "comparator");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
    }
}
