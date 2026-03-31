package u4;

import t4.a;
import y3.g;
import v4.p;
import w4.h0;

public abstract class j0
{
    private static final h0 a;
    private static final h0 b;
    
    static {
        a = new h0("NONE");
        b = new h0("PENDING");
    }
    
    public static final s a(final Object o) {
        Object a = o;
        if (o == null) {
            a = p.a;
        }
        return (s)new i0(a);
    }
    
    public static final e d(final u4.h0 h0, final g g, final int n, final a a) {
        int n2 = 0;
        if (n >= 0) {
            n2 = n2;
            if (n < 2) {
                n2 = 1;
            }
        }
        if ((n2 != 0 || n == -2) && a == a.f) {
            return (e)h0;
        }
        return x.d((v)h0, g, n, a);
    }
}
