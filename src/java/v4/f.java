package v4;

import a4.h;
import z3.b;
import i4.z;
import w4.l0;
import y3.d;
import h4.p;
import y3.g;

public abstract class f
{
    public static final Object b(final g g, Object j, Object c, final p p5, final d d) {
        c = l0.c(g, c);
        try {
            j = ((p)z.a((Object)p5, 2)).j(j, new u(d, g));
            l0.a(g, c);
            if (j == b.c()) {
                h.c(d);
            }
            return j;
        }
        finally {
            l0.a(g, c);
        }
    }
    
    private static final u4.f d(u4.f f, final g g) {
        if (!(f instanceof t) && !(f instanceof o)) {
            f = (u4.f)new w(f, g);
        }
        return f;
    }
}
