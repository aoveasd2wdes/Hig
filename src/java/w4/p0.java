package w4;

import i4.l;
import r4.m2;
import y3.g;

final class p0
{
    public final g a;
    private final Object[] b;
    private final m2[] c;
    private int d;
    
    public p0(final g a, final int n) {
        this.a = a;
        this.b = new Object[n];
        this.c = new m2[n];
    }
    
    public final void a(final m2 m2, final Object o) {
        final Object[] b = this.b;
        final int d = this.d;
        b[d] = o;
        final m2[] c = this.c;
        this.d = d + 1;
        l.c((Object)m2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        c[d] = m2;
    }
    
    public final void b(final g g) {
        int n = this.c.length - 1;
        if (n >= 0) {
            while (true) {
                final int n2 = n - 1;
                final m2 m2 = this.c[n];
                l.b((Object)m2);
                m2.e(g, this.b[n]);
                if (n2 < 0) {
                    break;
                }
                n = n2;
            }
        }
    }
}
