package w4;

import u3.a;
import r4.i0;
import y3.g;
import h4.l;

public abstract class z
{
    public static final l a(final l l, final Object o, final g g) {
        return (l)new z$a(l, o, g);
    }
    
    public static final void b(final l l, final Object o, final g g) {
        final q0 c = c(l, o, null);
        if (c != null) {
            i0.a(g, (Throwable)c);
        }
    }
    
    public static final q0 c(final l l, final Object o, final q0 q0) {
        final Throwable t;
        Label_0031: {
            try {
                l.p(o);
            }
            finally {
                if (q0 == null || ((Throwable)q0).getCause() == t) {
                    break Label_0031;
                }
                a.a((Throwable)q0, t);
            }
            return q0;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Exception in undelivered element handler for ");
        sb.append(o);
        return new q0(sb.toString(), t);
    }
}
