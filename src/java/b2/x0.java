package b2;

import java.util.Objects;

final class x0 extends w0
{
    static final w0 i;
    final transient Object[] g;
    private final transient int h;
    
    static {
        i = new x0(new Object[0], 0);
    }
    
    x0(final Object[] g, final int h) {
        this.g = g;
        this.h = h;
    }
    
    public final Object get(final int n) {
        p0.a(n, this.h, "index");
        final Object o = this.g[n];
        Objects.requireNonNull(o);
        return o;
    }
    
    final Object[] h() {
        return this.g;
    }
    
    final int i() {
        return 0;
    }
    
    final int j() {
        return this.h;
    }
    
    final boolean l() {
        return false;
    }
    
    final int m(final Object[] array, final int n) {
        System.arraycopy((Object)this.g, 0, (Object)array, 0, this.h);
        return this.h;
    }
    
    public final int size() {
        return this.h;
    }
}
