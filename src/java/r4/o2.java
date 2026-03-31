package r4;

import l.d;
import y3.g$c;
import y3.g;

public final class o2 extends g0
{
    public static final o2 g;
    
    static {
        g = new o2();
    }
    
    private o2() {
    }
    
    @Override
    public boolean B(final g g) {
        return false;
    }
    
    @Override
    public String toString() {
        return "Dispatchers.Unconfined";
    }
    
    @Override
    public void z(final g g, final Runnable runnable) {
        l.d.a((Object)g.a((g$c)s2.f));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }
}
