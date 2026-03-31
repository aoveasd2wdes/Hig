package i4;

import u3.c;
import h4.q;
import h4.p;
import h4.l;
import h4.a;

public abstract class z
{
    public static Object a(final Object o, final int n) {
        if (o != null && !c(o, n)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.functions.Function");
            sb.append(n);
            f(o, sb.toString());
        }
        return o;
    }
    
    public static int b(final Object o) {
        if (o instanceof h) {
            return ((h)o).f();
        }
        if (o instanceof a) {
            return 0;
        }
        if (o instanceof l) {
            return 1;
        }
        if (o instanceof p) {
            return 2;
        }
        if (o instanceof q) {
            return 3;
        }
        return -1;
    }
    
    public static boolean c(final Object o, final int n) {
        return o instanceof c && b(o) == n;
    }
    
    private static Throwable d(final Throwable t) {
        return i4.l.i(t, z.class.getName());
    }
    
    public static ClassCastException e(final ClassCastException ex) {
        throw (ClassCastException)d((Throwable)ex);
    }
    
    public static void f(final Object o, final String s) {
        String name;
        if (o == null) {
            name = "null";
        }
        else {
            name = o.getClass().getName();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" cannot be cast to ");
        sb.append(s);
        g(sb.toString());
    }
    
    public static void g(final String s) {
        throw e(new ClassCastException(s));
    }
}
