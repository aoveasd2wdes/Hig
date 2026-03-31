package r4;

import i4.g;
import u3.l;
import u3.k;
import y3.d;

public abstract class e0
{
    public static final Object a(final Object o, final d d) {
        Object a = o;
        if (o instanceof a0) {
            final k.a e = k.e;
            a = l.a(((a0)o).a);
        }
        return k.a(a);
    }
    
    public static final Object b(final Object o, final h4.l l) {
        final Throwable b = k.b(o);
        Object o2;
        if (b == null) {
            o2 = o;
            if (l != null) {
                o2 = new b0(o, l);
            }
        }
        else {
            o2 = new a0(b, false, 2, null);
        }
        return o2;
    }
    
    public static final Object c(Object o, final m m) {
        final Throwable b = k.b(o);
        if (b != null) {
            o = new a0(b, false, 2, null);
        }
        return o;
    }
}
