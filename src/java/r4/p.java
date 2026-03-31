package r4;

import w4.j;
import y3.d;
import h4.l;

public abstract class p
{
    public static final void a(final m m, final x0 x0) {
        m.k((l)new y0(x0));
    }
    
    public static final n b(final d d) {
        if (!(d instanceof j)) {
            return new n(d, 1);
        }
        n j = ((j)d).j();
        if (j != null) {
            if (!j.N()) {
                j = null;
            }
            if (j != null) {
                return j;
            }
        }
        return new n(d, 2);
    }
}
