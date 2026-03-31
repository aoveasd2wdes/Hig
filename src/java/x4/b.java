package x4;

import r4.y1;
import r4.z1;
import r4.a0;
import w4.d0;
import u3.k$a;
import u3.l;
import u3.k;
import i4.z;
import y3.g;
import w4.l0;
import a4.h;
import y3.d;
import h4.p;

public abstract class b
{
    public static final void a(final p p2, final Object o, d d) {
        final d a = h.a(d);
        Object a2 = null;
        Label_0070: {
            try {
                d = (d)d.d();
                final Object c = l0.c((g)d, null);
                try {
                    final Object j = ((p)z.a((Object)p2, 2)).j(o, a);
                    l0.a((g)d, c);
                    if (j != z3.b.c()) {
                        break Label_0070;
                    }
                    return;
                }
                finally {
                    l0.a((g)d, c);
                }
            }
            finally {
                final k$a e = k.e;
                final Throwable t;
                a2 = l.a(t);
            }
        }
        a.u(k.a(a2));
    }
    
    public static final Object b(final d0 d0, Object j, final p p3) {
        a0 a0 = null;
        try {
            j = ((p)z.a((Object)p3, 2)).j(j, d0);
        }
        finally {
            final Throwable t;
            a0 = new a0(t, false, 2, (i4.g)null);
        }
        if (a0 != z3.b.c()) {
            final Object v0 = ((y1)d0).v0((Object)a0);
            if (v0 != z1.b) {
                if (!(v0 instanceof a0)) {
                    return z1.h(v0);
                }
                throw ((a0)v0).a;
            }
        }
        return z3.b.c();
    }
}
