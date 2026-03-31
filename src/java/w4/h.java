package w4;

import java.util.Iterator;
import u3.a;
import r4.i0;
import r4.h0;
import y3.g;

public abstract class h
{
    public static final void a(final g g, final Throwable t) {
        for (final h0 h0 : g.a()) {
            try {
                h0.i(g, t);
            }
            finally {
                final Throwable t2;
                g.b(i0.b(t, t2));
            }
        }
        while (true) {
            try {
                a.a(t, (Throwable)new i(g));
                g.b(t);
            }
            finally {
                continue;
            }
            break;
        }
    }
}
