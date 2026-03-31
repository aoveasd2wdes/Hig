package v;

import i4.l;

public class e implements d
{
    private final Object[] a;
    private int b;
    
    public e(final int n) {
        if (n > 0) {
            this.a = new Object[n];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0".toString());
    }
    
    private final boolean c(final Object o) {
        for (int b = this.b, i = 0; i < b; ++i) {
            if (this.a[i] == o) {
                return true;
            }
        }
        return false;
    }
    
    public boolean a(final Object o) {
        l.e(o, "instance");
        if (!(this.c(o) ^ true)) {
            throw new IllegalStateException("Already in the pool!".toString());
        }
        final int b = this.b;
        final Object[] a = this.a;
        if (b < a.length) {
            a[b] = o;
            this.b = b + 1;
            return true;
        }
        return false;
    }
    
    public Object b() {
        int b = this.b;
        if (b > 0) {
            --b;
            final Object o = this.a[b];
            l.c(o, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            this.a[b] = null;
            --this.b;
            return o;
        }
        return null;
    }
}
