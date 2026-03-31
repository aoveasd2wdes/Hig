package q4;

import i4.l;
import m4.f;
import i4.g;

public abstract class a implements Comparable
{
    public static final a e;
    private static final long f;
    private static final long g;
    private static final long h;
    
    static {
        e = new a(null);
        f = b(0L);
        g = c.a(4611686018427387903L);
        h = c.a(-4611686018427387903L);
    }
    
    public static final /* synthetic */ long a() {
        return a.f;
    }
    
    public static long b(final long n) {
        if (b.a()) {
            if (l(n)) {
                if (!new f(-4611686018426999999L, 4611686018426999999L).k(g(n))) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(g(n));
                    sb.append(" ns is out of nanoseconds range");
                    throw new AssertionError((Object)sb.toString());
                }
            }
            else {
                if (!new f(-4611686018427387903L, 4611686018427387903L).k(g(n))) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(g(n));
                    sb2.append(" ms is out of milliseconds range");
                    throw new AssertionError((Object)sb2.toString());
                }
                if (new f(-4611686018426L, 4611686018426L).k(g(n))) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(g(n));
                    sb3.append(" ms is denormalized");
                    throw new AssertionError((Object)sb3.toString());
                }
            }
        }
        return n;
    }
    
    public static final long d(long n) {
        if (k(n) && j(n)) {
            n = g(n);
        }
        else {
            n = n(n, d.h);
        }
        return n;
    }
    
    private static final d f(final long n) {
        d d;
        if (l(n)) {
            d = q4.d.f;
        }
        else {
            d = q4.d.h;
        }
        return d;
    }
    
    private static final long g(final long n) {
        return n >> 1;
    }
    
    public static final boolean j(final long n) {
        return m(n) ^ true;
    }
    
    private static final boolean k(final long n) {
        final int n2 = (int)n;
        boolean b = true;
        if ((n2 & 0x1) != 0x1) {
            b = false;
        }
        return b;
    }
    
    private static final boolean l(final long n) {
        final int n2 = (int)n;
        boolean b = true;
        if ((n2 & 0x1) != 0x0) {
            b = false;
        }
        return b;
    }
    
    public static final boolean m(final long n) {
        return n == a.g || n == a.h;
    }
    
    public static final long n(long a, final d d) {
        l.e((Object)d, "unit");
        if (a == a.g) {
            a = Long.MAX_VALUE;
        }
        else if (a == a.h) {
            a = Long.MIN_VALUE;
        }
        else {
            a = q4.e.a(g(a), f(a), d);
        }
        return a;
    }
    
    public static final class a
    {
        private a() {
        }
        
        public final long a() {
            return q4.a.a();
        }
    }
}
