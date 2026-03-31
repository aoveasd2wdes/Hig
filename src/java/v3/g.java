package v3;

import java.lang.reflect.Array;
import i4.l;

abstract class g
{
    public static final Object[] a(final Object[] array, final int n) {
        l.e((Object)array, "reference");
        final Object instance = Array.newInstance((Class)array.getClass().getComponentType(), n);
        l.c(instance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[])instance;
    }
    
    public static final void b(final int n, final int n2) {
        if (n <= n2) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("toIndex (");
        sb.append(n);
        sb.append(") is greater than size (");
        sb.append(n2);
        sb.append(").");
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
