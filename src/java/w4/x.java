package w4;

import java.util.List;
import r4.b2;
import u3.d;

public abstract class x
{
    private static final boolean a = false;
    
    private static final y a(final Throwable t, final String s) {
        if (x.a) {
            return new y(t, s);
        }
        if (t != null) {
            throw t;
        }
        d();
        throw new d();
    }
    
    public static final boolean c(final b2 b2) {
        return b2.K() instanceof y;
    }
    
    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
    
    public static final b2 e(v c, final List list) {
        y a = null;
        try {
            c = (v)c.c(list);
        }
        finally {
            final Throwable t;
            a = a(t, c.b());
        }
        return (b2)a;
    }
}
