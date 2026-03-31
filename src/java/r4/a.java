package r4;

import h4.l;
import h4.p;
import y3.g$c;
import y3.g;
import y3.d;

public abstract class a extends y1 implements d, j0
{
    private final g g;
    
    public a(final g g, final boolean b, final boolean b2) {
        super(b2);
        if (b) {
            this.o0((q1)g.a((g$c)q1.b));
        }
        this.g = g.A((g)this);
    }
    
    @Override
    protected final void C0(final Object o) {
        if (o instanceof a0) {
            final a0 a0 = (a0)o;
            this.T0(a0.a, a0.a());
        }
        else {
            this.U0(o);
        }
    }
    
    protected void S0(final Object o) {
        this.Q(o);
    }
    
    protected void T0(final Throwable t, final boolean b) {
    }
    
    protected void U0(final Object o) {
    }
    
    public final void V0(final l0 l0, final Object o, final p p3) {
        l0.b(p3, o, (d)this);
    }
    
    @Override
    protected String Y() {
        final StringBuilder sb = new StringBuilder();
        sb.append(n0.a((Object)this));
        sb.append(" was cancelled");
        return sb.toString();
    }
    
    @Override
    public boolean c() {
        return super.c();
    }
    
    public final g d() {
        return this.g;
    }
    
    @Override
    public final void n0(final Throwable t) {
        i0.a(this.g, t);
    }
    
    public g s() {
        return this.g;
    }
    
    public final void u(Object v0) {
        v0 = this.v0(e0.d(v0, (l)null, 1, (Object)null));
        if (v0 == z1.b) {
            return;
        }
        this.S0(v0);
    }
    
    @Override
    public String x0() {
        final String b = f0.b(this.g);
        if (b == null) {
            return super.x0();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append('\"');
        sb.append(b);
        sb.append("\":");
        sb.append(super.x0());
        return sb.toString();
    }
}
