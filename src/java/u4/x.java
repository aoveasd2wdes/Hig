package u4;

import v4.h;
import y3.g;
import t4.a;
import w4.h0;

public abstract class x
{
    public static final h0 a;
    
    static {
        a = new h0("NO_VALUE");
    }
    
    public static final r a(final int n, int n2, final a a) {
        final boolean b = true;
        if (n < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("replay cannot be negative, but was ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (n2 < 0) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("extraBufferCapacity cannot be negative, but was ");
            sb2.append(n2);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        int n3 = b ? 1 : 0;
        if (n <= 0) {
            n3 = (b ? 1 : 0);
            if (n2 <= 0) {
                if (a == a.e) {
                    n3 = (b ? 1 : 0);
                }
                else {
                    n3 = 0;
                }
            }
        }
        if (n3 != 0) {
            if ((n2 += n) < 0) {
                n2 = Integer.MAX_VALUE;
            }
            return (r)new w(n, n2, a);
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
        sb3.append((Object)a);
        throw new IllegalArgumentException(sb3.toString().toString());
    }
    
    public static final e d(final v v, final g g, final int n, final a a) {
        if ((n == 0 || n == -3) && a == a.e) {
            return (e)v;
        }
        return (e)new h((e)v, g, n, a);
    }
    
    private static final Object e(final Object[] array, final long n) {
        return array[array.length - 1 & (int)n];
    }
    
    private static final void f(final Object[] array, final long n, final Object o) {
        array[array.length - 1 & (int)n] = o;
    }
}
