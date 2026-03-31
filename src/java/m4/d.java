package m4;

import v3.b0;
import java.util.Iterator;
import c4.c;
import i4.g;

public abstract class d implements Iterable
{
    public static final a h;
    private final long e;
    private final long f;
    private final long g;
    
    static {
        h = new a(null);
    }
    
    public d(final long e, final long n, final long g) {
        if (g == 0L) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (g != Long.MIN_VALUE) {
            this.e = e;
            this.f = c.d(e, n, g);
            this.g = g;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
    }
    
    public final long h() {
        return this.e;
    }
    
    public final long i() {
        return this.f;
    }
    
    public b0 j() {
        return (b0)new e(this.e, this.f, this.g);
    }
    
    public static final class a
    {
        private a() {
        }
    }
}
