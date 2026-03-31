package r4;

import u3.a;
import w4.h;
import y3.g$c;
import y3.g;

public abstract class i0
{
    public static final void a(final g g, final Throwable t) {
        try {
            final h0 h0 = (h0)g.a((g$c)r4.h0.a);
            if (h0 != null) {
                h0.i(g, t);
                return;
            }
            h.a(g, t);
        }
        finally {
            final Throwable t2;
            h.a(g, b(t, t2));
        }
    }
    
    public static final Throwable b(final Throwable t, final Throwable t2) {
        if (t == t2) {
            return t;
        }
        final RuntimeException ex = new RuntimeException("Exception while trying to handle coroutine exception", t2);
        a.a((Throwable)ex, t);
        return (Throwable)ex;
    }
}
