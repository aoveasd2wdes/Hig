package w4;

import java.util.Iterator;
import java.util.List;
import o4.c;
import java.util.ServiceLoader;
import r4.b2;

public final class w
{
    public static final w a;
    private static final boolean b = false;
    public static final b2 c;
    
    static {
        final w w = a = new w();
        i0.f("kotlinx.coroutines.fast.service.loader", true);
        c = w.a();
    }
    
    private w() {
    }
    
    private final b2 a() {
        y b = null;
        try {
            List list;
            if (w.b) {
                list = l.a.c();
            }
            else {
                list = o4.c.d(o4.c.a(ServiceLoader.load((Class)v.class, v.class.getClassLoader()).iterator()));
            }
            final Iterator iterator = ((Iterable)list).iterator();
            Object next;
            if (!iterator.hasNext()) {
                next = null;
            }
            else {
                next = iterator.next();
                if (iterator.hasNext()) {
                    int a = ((v)next).a();
                    v v = (v)next;
                    do {
                        final Object next2 = iterator.next();
                        final int a2 = ((v)next2).a();
                        next = v;
                        int n;
                        if ((n = a) < a2) {
                            next = next2;
                            n = a2;
                        }
                        v = (v)next;
                        a = n;
                    } while (iterator.hasNext());
                }
            }
            final v v2 = (v)next;
            final b2 e;
            if (v2 == null || (e = x.e(v2, list)) == null) {
                x.b(null, null, 3, null);
            }
        }
        finally {
            final Throwable t;
            b = x.b(t, null, 2, null);
        }
        return (b2)b;
    }
}
