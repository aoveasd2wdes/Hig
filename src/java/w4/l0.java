package w4;

import r4.m2;
import i4.l;
import y3.g;
import h4.p;

public abstract class l0
{
    public static final h0 a;
    private static final p b;
    private static final p c;
    private static final p d;
    
    static {
        a = new h0("NO_THREAD_ELEMENTS");
        b = (p)l0$a.f;
        c = (p)l0$b.f;
        d = (p)l0$c.f;
    }
    
    public static final void a(final g g, final Object o) {
        if (o == l0.a) {
            return;
        }
        if (o instanceof p0) {
            ((p0)o).b(g);
        }
        else {
            final Object j = g.j(null, l0.c);
            l.c(j, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((m2)j).e(g, o);
        }
    }
    
    public static final Object b(final g g) {
        final Object j = g.j(0, l0.b);
        l.b(j);
        return j;
    }
    
    public static final Object c(final g g, final Object o) {
        Object b = o;
        if (o == null) {
            b = b(g);
        }
        Object o2;
        if (b == Integer.valueOf(0)) {
            o2 = l0.a;
        }
        else if (b instanceof Integer) {
            o2 = g.j(new p0(g, ((Number)b).intValue()), l0.d);
        }
        else {
            l.c(b, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            o2 = ((m2)b).E(g);
        }
        return o2;
    }
}
