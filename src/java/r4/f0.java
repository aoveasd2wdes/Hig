package r4;

import y3.d;
import y3.g$c;
import y3.e;
import h4.p;
import y3.h;
import i4.w;
import y3.g;

public abstract class f0
{
    private static final g a(g g, final g e, final boolean b) {
        final boolean c = c(g);
        final boolean c2 = c(e);
        if (!c && !c2) {
            return g.A(e);
        }
        final w w = new w();
        w.e = e;
        final h e2 = h.e;
        g = (g)g.j((Object)e2, (p)new f0$b(w, b));
        if (c2) {
            w.e = ((g)w.e).j((Object)e2, (p)f0$a.f);
        }
        return g.A((g)w.e);
    }
    
    public static final String b(final g g) {
        return null;
    }
    
    private static final boolean c(final g g) {
        return (boolean)g.j((Object)Boolean.FALSE, (p)f0$c.f);
    }
    
    public static final g d(final j0 j0, g g) {
        g g2;
        g = (g2 = a(j0.s(), g, true));
        if (g != w0.a()) {
            g2 = g;
            if (g.a((g$c)e.d) == null) {
                g2 = g.A((g)w0.a());
            }
        }
        return g2;
    }
    
    public static final g e(final g g, final g g2) {
        if (!c(g2)) {
            return g.A(g2);
        }
        return a(g, g2, false);
    }
    
    public static final p2 f(a4.e e) {
        while (!(e instanceof t0)) {
            final Object n = e.n();
            if (n == null) {
                return null;
            }
            e = (a4.e)n;
            if (n instanceof p2) {
                return (p2)n;
            }
        }
        return null;
    }
    
    public static final p2 g(final d d, final g g, final Object o) {
        if (!(d instanceof a4.e)) {
            return null;
        }
        if (g.a((g$c)q2.e) == null) {
            return null;
        }
        final p2 f = f((a4.e)d);
        if (f != null) {
            f.X0(g, o);
        }
        return f;
    }
}
