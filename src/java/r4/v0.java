package r4;

import u3.q;
import w4.l0;
import u3.l;
import u3.k;
import y3.g;
import y3.d;
import w4.j;

public abstract class v0
{
    public static final void a(final u0 u0, final int n) {
        final d c = u0.c();
        final boolean b = n == 4;
        if (!b && c instanceof j && b(n) == b(u0.g)) {
            final g0 h = ((j)c).h;
            final g d = c.d();
            if (h.B(d)) {
                h.z(d, (Runnable)u0);
            }
            else {
                e(u0);
            }
        }
        else {
            d(u0, c, b);
        }
    }
    
    public static final boolean b(final int n) {
        boolean b = true;
        if (n != 1) {
            b = (n == 2 && b);
        }
        return b;
    }
    
    public static final boolean c(final int n) {
        return n == 2;
    }
    
    public static final void d(u0 g, d d, final boolean b) {
        final Object h = ((u0)g).h();
        final Throwable e = ((u0)g).e(h);
        Object o;
        if (e != null) {
            final k.a e2 = k.e;
            o = l.a(e);
        }
        else {
            final k.a e3 = k.e;
            o = ((u0)g).f(h);
        }
        final Object a = k.a(o);
        if (b) {
            i4.l.c((Object)d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            final j j = (j)d;
            final d i = j.i;
            final Object k = j.k;
            d = (d)i.d();
            final Object c = l0.c((g)d, k);
            if (c != l0.a) {
                g = f0.g(i, (g)d, c);
            }
            else {
                g = null;
            }
            try {
                j.i.u(a);
                final q a2 = q.a;
                return;
            }
            finally {
                if (g == null || ((p2)g).W0()) {
                    l0.a((g)d, c);
                }
            }
        }
        d.u(a);
    }
    
    private static final void e(final u0 u0) {
        final a1 b = n2.a.b();
        if (b.S()) {
            b.O(u0);
            return;
        }
        b.Q(true);
        final Throwable t2;
        try {
            d(u0, u0.c(), true);
            while (b.V()) {}
            return;
        }
        finally {
            final u0 u2 = u0;
            final Throwable t = t2;
            final Throwable t3 = null;
            u2.g(t, t3);
        }
        try {
            final u0 u2 = u0;
            final Throwable t = t2;
            final Throwable t3 = null;
            u2.g(t, t3);
        }
        finally {
            b.K(true);
        }
    }
}
