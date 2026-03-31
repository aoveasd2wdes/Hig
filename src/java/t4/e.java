package t4;

import h4.l;
import r4.q1;
import r4.r1;
import java.util.concurrent.CancellationException;
import r4.y1;
import y3.g;
import r4.a;

public abstract class e extends a implements d
{
    private final d h;
    
    public e(final g g, final d h, final boolean b, final boolean b2) {
        super(g, b, b2);
        this.h = h;
    }
    
    public Object B(final Object o, final y3.d d) {
        return ((t)this.h).B(o, d);
    }
    
    public void V(final Throwable t) {
        final CancellationException l0 = y1.L0(this, t, null, 1, null);
        ((s)this.h).b(l0);
        this.T((Throwable)l0);
    }
    
    protected final d W0() {
        return this.h;
    }
    
    public final void b(final CancellationException ex) {
        if (this.p0()) {
            return;
        }
        Object o;
        if ((o = ex) == null) {
            o = new r1(y1.M(this), (Throwable)null, (q1)this);
        }
        this.V((Throwable)o);
    }
    
    public Object g(final y3.d d) {
        return ((s)this.h).g(d);
    }
    
    public f iterator() {
        return ((s)this.h).iterator();
    }
    
    public Object o() {
        return ((s)this.h).o();
    }
    
    public boolean q(final Throwable t) {
        return ((t)this.h).q(t);
    }
    
    public Object r(final Object o) {
        return ((t)this.h).r(o);
    }
    
    public void y(final l l) {
        ((t)this.h).y(l);
    }
    
    public boolean z() {
        return ((t)this.h).z();
    }
}
