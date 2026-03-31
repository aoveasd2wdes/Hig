package w4;

import h4.l;
import r4.e0;
import z3.b;
import y3.g;
import y3.d;
import a4.e;
import r4.a;

public class d0 extends a implements e
{
    public final d h;
    
    public d0(final g g, final d h) {
        super(g, true, true);
        this.h = h;
    }
    
    protected void Q(final Object o) {
        k.c(z3.b.b(this.h), e0.a(o, this.h), (l)null, 2, (Object)null);
    }
    
    @Override
    protected void S0(final Object o) {
        final d h = this.h;
        h.u(e0.a(o, h));
    }
    
    public final e n() {
        final d h = this.h;
        e e;
        if (h instanceof e) {
            e = (e)h;
        }
        else {
            e = null;
        }
        return e;
    }
    
    protected final boolean q0() {
        return true;
    }
}
