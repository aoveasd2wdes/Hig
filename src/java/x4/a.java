package x4;

import u3.q;
import z3.b;
import h4.p;
import u3.k$a;
import u3.l;
import u3.k;
import y3.d;

public abstract class a
{
    private static final void a(final d d, final Throwable t) {
        final k$a e = k.e;
        d.u(k.a(l.a(t)));
        throw t;
    }
    
    public static final void b(final p p4, final Object o, final d d, final h4.l l) {
        try {
            final d b = z3.b.b(z3.b.a(p4, o, d));
            final k$a e = k.e;
            w4.k.b(b, k.a((Object)q.a), l);
        }
        finally {
            final Throwable t;
            a(d, t);
        }
    }
    
    public static final void c(d b, final d d) {
        try {
            b = b.b(b);
            final k$a e = k.e;
            w4.k.c(b, k.a((Object)q.a), null, 2, null);
        }
        finally {
            final Throwable t;
            a(d, t);
        }
    }
}
