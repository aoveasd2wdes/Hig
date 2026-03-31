package r4;

import u3.n;
import u3.q;
import u3.j;
import w4.l0;
import y3.e;
import y3.g$c;
import y3.d;
import y3.g;
import w4.d0;

public final class p2 extends d0
{
    private final ThreadLocal i;
    private volatile boolean threadLocalIsSet;
    
    public p2(final g g, final d d) {
        final q2 e = q2.e;
        g a;
        if (g.a((g$c)e) == null) {
            a = g.A((g)e);
        }
        else {
            a = g;
        }
        super(a, d);
        this.i = new ThreadLocal();
        if (!(d.d().a((g$c)y3.e.d) instanceof g0)) {
            final Object c = l0.c(g, (Object)null);
            l0.a(g, c);
            this.X0(g, c);
        }
    }
    
    @Override
    protected void S0(Object g) {
        if (this.threadLocalIsSet) {
            final j j = (j)this.i.get();
            if (j != null) {
                l0.a((g)j.a(), j.b());
            }
            this.i.remove();
        }
        final Object a = e0.a(g, super.h);
        final d h = super.h;
        final g d = h.d();
        g = null;
        final Object c = l0.c(d, (Object)null);
        if (c != l0.a) {
            g = f0.g(h, d, c);
        }
        try {
            super.h.u(a);
            final q a2 = q.a;
        }
        finally {
            if (g == null || ((p2)g).W0()) {
                l0.a(d, c);
            }
        }
    }
    
    public final boolean W0() {
        final boolean b = this.threadLocalIsSet && this.i.get() == null;
        this.i.remove();
        return b ^ true;
    }
    
    public final void X0(final g g, final Object o) {
        this.threadLocalIsSet = true;
        this.i.set((Object)n.a((Object)g, o));
    }
}
