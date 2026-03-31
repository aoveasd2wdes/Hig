package r4;

import y3.b;
import y3.e$a;
import y3.g$b;
import w4.o;
import w4.p;
import w4.j;
import i4.l;
import y3.d;
import y3.g$c;
import i4.g;
import y3.e;
import y3.a;

public abstract class g0 extends y3.a implements e
{
    public static final a f;
    
    static {
        f = new a(null);
    }
    
    public g0() {
        super((g$c)e.d);
    }
    
    public boolean B(final y3.g g) {
        return true;
    }
    
    @Override
    public final void D(final d d) {
        l.c((Object)d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((j)d).q();
    }
    
    public g0 J(final int n) {
        p.a(n);
        return new o(this, n);
    }
    
    @Override
    public g$b a(final g$c g$c) {
        return e$a.a((e)this, g$c);
    }
    
    @Override
    public y3.g h(final g$c g$c) {
        return e$a.b((e)this, g$c);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(n0.a((Object)this));
        sb.append('@');
        sb.append(n0.b((Object)this));
        return sb.toString();
    }
    
    @Override
    public final d v(final d d) {
        return (d)new j(this, d);
    }
    
    public abstract void z(final y3.g p0, final Runnable p1);
    
    public static final class a extends b
    {
        private a() {
            super((g$c)e.d, (h4.l)g0$a$a.f);
        }
    }
}
