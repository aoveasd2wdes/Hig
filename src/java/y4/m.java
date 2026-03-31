package y4;

import y3.g;
import w4.p;
import r4.g0;

final class m extends g0
{
    public static final m g;
    
    static {
        g = new m();
    }
    
    private m() {
    }
    
    @Override
    public g0 J(final int n) {
        p.a(n);
        if (n >= l.d) {
            return this;
        }
        return super.J(n);
    }
    
    @Override
    public void z(final g g, final Runnable runnable) {
        c.m.M(runnable, l.h, false);
    }
}
