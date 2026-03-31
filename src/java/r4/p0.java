package r4;

import w4.x;
import w4.i0;

public abstract class p0
{
    private static final boolean a;
    private static final r0 b;
    
    static {
        a = i0.f("kotlinx.coroutines.main.delay", false);
        b = b();
    }
    
    public static final r0 a() {
        return p0.b;
    }
    
    private static final r0 b() {
        if (!p0.a) {
            return (r0)o0.m;
        }
        final b2 c = w0.c();
        Object m;
        if (!x.c(c) && c instanceof r0) {
            m = c;
        }
        else {
            m = o0.m;
        }
        return (r0)m;
    }
}
