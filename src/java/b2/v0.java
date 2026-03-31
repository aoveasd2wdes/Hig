package b2;

import java.util.List;

final class v0 extends w0
{
    final transient int g;
    final transient int h;
    final w0 i;
    
    v0(final w0 i, final int g, final int h) {
        this.i = i;
        this.g = g;
        this.h = h;
    }
    
    public final Object get(final int n) {
        p0.a(n, this.h, "index");
        return ((List)this.i).get(n + this.g);
    }
    
    final Object[] h() {
        return ((t0)this.i).h();
    }
    
    final int i() {
        return ((t0)this.i).i() + this.g;
    }
    
    final int j() {
        return ((t0)this.i).i() + this.g + this.h;
    }
    
    final boolean l() {
        return true;
    }
    
    public final w0 n(final int n, final int n2) {
        p0.c(n, n2, this.h);
        final int g = this.g;
        return this.i.n(n + g, n2 + g);
    }
    
    public final int size() {
        return this.h;
    }
}
