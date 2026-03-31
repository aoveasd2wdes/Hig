package r4;

import v3.e;

public abstract class a1 extends g0
{
    private long g;
    private boolean h;
    private v3.e i;
    
    private final long N(final boolean b) {
        long n;
        if (b) {
            n = 4294967296L;
        }
        else {
            n = 1L;
        }
        return n;
    }
    
    public final void K(final boolean b) {
        final long g = this.g - this.N(b);
        this.g = g;
        if (g > 0L) {
            return;
        }
        if (this.h) {
            this.X();
        }
    }
    
    public final void O(final u0 u0) {
        v3.e i;
        if ((i = this.i) == null) {
            i = new v3.e();
            this.i = i;
        }
        i.k((Object)u0);
    }
    
    protected long P() {
        final v3.e i = this.i;
        long n = Long.MAX_VALUE;
        if (i == null) {
            return Long.MAX_VALUE;
        }
        if (!i.isEmpty()) {
            n = 0L;
        }
        return n;
    }
    
    public final void Q(final boolean b) {
        this.g += this.N(b);
        if (!b) {
            this.h = true;
        }
    }
    
    public final boolean S() {
        final long g = this.g;
        boolean b = true;
        if (g < this.N(true)) {
            b = false;
        }
        return b;
    }
    
    public final boolean T() {
        final v3.e i = this.i;
        return i == null || i.isEmpty();
    }
    
    public abstract long U();
    
    public final boolean V() {
        final v3.e i = this.i;
        if (i == null) {
            return false;
        }
        final u0 u0 = (u0)i.t();
        if (u0 == null) {
            return false;
        }
        u0.run();
        return true;
    }
    
    public boolean W() {
        return false;
    }
    
    public abstract void X();
}
