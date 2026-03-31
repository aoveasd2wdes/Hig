package r4;

import y3.g$b;
import y3.g$c;
import y3.e;
import y3.g;
import a4.h;
import z3.b;
import u3.q;
import y3.d;

public abstract class s0
{
    public static final Object a(final long n, final d d) {
        if (n <= 0L) {
            return q.a;
        }
        final n n2 = new n(b.b(d), 1);
        n2.B();
        if (n < Long.MAX_VALUE) {
            b(((d)n2).d()).u(n, (m)n2);
        }
        final Object y = n2.y();
        if (y == b.c()) {
            h.c(d);
        }
        if (y == b.c()) {
            return y;
        }
        return q.a;
    }
    
    public static final r0 b(final g g) {
        final g$b a = g.a((g$c)e.d);
        r0 r0;
        if (a instanceof r0) {
            r0 = (r0)a;
        }
        else {
            r0 = null;
        }
        r0 a2 = r0;
        if (r0 == null) {
            a2 = p0.a();
        }
        return a2;
    }
}
