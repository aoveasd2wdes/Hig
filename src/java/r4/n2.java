package r4;

import w4.m0;
import w4.h0;

public final class n2
{
    public static final n2 a;
    private static final ThreadLocal b;
    
    static {
        a = new n2();
        b = m0.a(new h0("ThreadLocalEventLoop"));
    }
    
    private n2() {
    }
    
    public final a1 a() {
        return (a1)n2.b.get();
    }
    
    public final a1 b() {
        final ThreadLocal b = n2.b;
        a1 a;
        if ((a = (a1)b.get()) == null) {
            a = d1.a();
            b.set((Object)a);
        }
        return a;
    }
    
    public final void c() {
        n2.b.set((Object)null);
    }
    
    public final void d(final a1 a1) {
        n2.b.set((Object)a1);
    }
}
