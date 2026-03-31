package w4;

import r4.p2;
import r4.a1;
import u3.k$a;
import java.util.concurrent.CancellationException;
import u3.q;
import r4.f0;
import y3.g;
import r4.q1;
import r4.u0;
import r4.n2;
import r4.e0;
import h4.l;
import y3.d;

public abstract class k
{
    private static final h0 a;
    public static final h0 b;
    
    static {
        a = new h0("UNDEFINED");
        b = new h0("REUSABLE_CLAIMED");
    }
    
    public static final void b(d o, final Object o2, l b) {
        if (o instanceof j) {
            final j j = (j)o;
            final Object b2 = e0.b(o2, b);
            if (j.h.B(j.d())) {
                j.j = b2;
                ((u0)j).g = 1;
                j.h.z(j.d(), (Runnable)j);
                return;
            }
            b = (l)n2.a.b();
            if (((a1)b).S()) {
                j.j = b2;
                ((u0)j).g = 1;
                ((a1)b).O((u0)j);
                return;
            }
            ((a1)b).Q(true);
            final Throwable t2;
            try {
                final q1 q1 = (q1)j.d().a((g.c)r4.q1.b);
                boolean b3;
                if (q1 != null && !q1.c()) {
                    final CancellationException l = q1.l();
                    j.a(b2, (Throwable)l);
                    final k$a e = u3.k.e;
                    ((d)j).u(u3.k.a(u3.l.a((Throwable)l)));
                    b3 = true;
                }
                else {
                    b3 = false;
                }
                if (!b3) {
                    o = j.i;
                    final Object k = j.k;
                    final g d = ((d)o).d();
                    final Object c = l0.c(d, k);
                    if (c != l0.a) {
                        o = f0.g((d)o, d, c);
                    }
                    else {
                        o = null;
                    }
                    try {
                        j.i.u(o2);
                        final q a = q.a;
                    }
                    finally {
                        if (o == null || ((p2)o).W0()) {
                            l0.a(d, c);
                        }
                    }
                }
                while (((a1)b).V()) {}
                return;
            }
            finally {
                final j i = j;
                final Throwable t = t2;
                final Throwable t3 = null;
                ((u0)i).g(t, t3);
            }
            try {
                final j i = j;
                final Throwable t = t2;
                final Throwable t3 = null;
                ((u0)i).g(t, t3);
                return;
            }
            finally {
                ((a1)b).K(true);
            }
        }
        ((d)o).u(o2);
    }
}
