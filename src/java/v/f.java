package v;

import java.util.Locale;

public abstract class f
{
    public static void a(final boolean b, final String s, final Object... array) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(String.format(s, array));
    }
    
    public static float b(final float n, final String s) {
        if (Float.isNaN(n)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append(" must not be NaN");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!Float.isInfinite(n)) {
            return n;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(s);
        sb2.append(" must not be infinite");
        throw new IllegalArgumentException(sb2.toString());
    }
    
    public static float c(final float n, final float n2, final float n3, final String s) {
        if (n < n2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", new Object[] { s, n2, n3 }));
        }
        if (n <= n3) {
            return n;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", new Object[] { s, n2, n3 }));
    }
    
    public static long d(final long n, final long n2, final long n3, final String s) {
        if (n < n2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[] { s, n2, n3 }));
        }
        if (n <= n3) {
            return n;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[] { s, n2, n3 }));
    }
    
    public static int e(final int n) {
        if (n >= 0) {
            return n;
        }
        throw new IllegalArgumentException();
    }
    
    public static Object f(final Object o) {
        o.getClass();
        return o;
    }
    
    public static void g(final boolean b, final String s) {
        if (b) {
            return;
        }
        throw new IllegalStateException(s);
    }
}
