package p;

public class d implements Cloneable
{
    private static final Object i;
    private boolean e;
    private long[] f;
    private Object[] g;
    private int h;
    
    static {
        i = new Object();
    }
    
    public d() {
        this(10);
    }
    
    public d(int f) {
        this.e = false;
        if (f == 0) {
            this.f = c.b;
            this.g = c.c;
        }
        else {
            f = c.f(f);
            this.f = new long[f];
            this.g = new Object[f];
        }
    }
    
    private void f() {
        final int h = this.h;
        final long[] f = this.f;
        final Object[] g = this.g;
        int i = 0;
        int h2 = 0;
        while (i < h) {
            final Object o = g[i];
            int n = h2;
            if (o != d.i) {
                if (i != h2) {
                    f[h2] = f[i];
                    g[h2] = o;
                    g[i] = null;
                }
                n = h2 + 1;
            }
            ++i;
            h2 = n;
        }
        this.e = false;
        this.h = h2;
    }
    
    public void a(final long n, final Object o) {
        final int h = this.h;
        if (h != 0 && n <= this.f[h - 1]) {
            this.k(n, o);
            return;
        }
        if (this.e && h >= this.f.length) {
            this.f();
        }
        final int h2 = this.h;
        if (h2 >= this.f.length) {
            final int f = c.f(h2 + 1);
            final long[] f2 = new long[f];
            final Object[] g = new Object[f];
            final long[] f3 = this.f;
            System.arraycopy((Object)f3, 0, (Object)f2, 0, f3.length);
            final Object[] g2 = this.g;
            System.arraycopy((Object)g2, 0, (Object)g, 0, g2.length);
            this.f = f2;
            this.g = g;
        }
        this.f[h2] = n;
        this.g[h2] = o;
        this.h = h2 + 1;
    }
    
    public void b() {
        final int h = this.h;
        final Object[] g = this.g;
        for (int i = 0; i < h; ++i) {
            g[i] = null;
        }
        this.h = 0;
        this.e = false;
    }
    
    public d c() {
        try {
            final d d = (d)super.clone();
            d.f = this.f.clone();
            d.g = this.g.clone();
            return d;
        }
        catch (final CloneNotSupportedException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public void d(final long n) {
        this.l(n);
    }
    
    public Object g(final long n) {
        return this.h(n, null);
    }
    
    public Object h(final long n, final Object o) {
        final int b = c.b(this.f, this.h, n);
        if (b >= 0) {
            final Object o2 = this.g[b];
            if (o2 != d.i) {
                return o2;
            }
        }
        return o;
    }
    
    public int i(final long n) {
        if (this.e) {
            this.f();
        }
        return c.b(this.f, this.h, n);
    }
    
    public long j(final int n) {
        if (this.e) {
            this.f();
        }
        return this.f[n];
    }
    
    public void k(final long n, final Object o) {
        final int b = c.b(this.f, this.h, n);
        if (b >= 0) {
            this.g[b] = o;
        }
        else {
            final int n2 = ~b;
            final int h = this.h;
            if (n2 < h) {
                final Object[] g = this.g;
                if (g[n2] == d.i) {
                    this.f[n2] = n;
                    g[n2] = o;
                    return;
                }
            }
            int n3 = n2;
            if (this.e) {
                n3 = n2;
                if (h >= this.f.length) {
                    this.f();
                    n3 = ~c.b(this.f, this.h, n);
                }
            }
            final int h2 = this.h;
            if (h2 >= this.f.length) {
                final int f = c.f(h2 + 1);
                final long[] f2 = new long[f];
                final Object[] g2 = new Object[f];
                final long[] f3 = this.f;
                System.arraycopy((Object)f3, 0, (Object)f2, 0, f3.length);
                final Object[] g3 = this.g;
                System.arraycopy((Object)g3, 0, (Object)g2, 0, g3.length);
                this.f = f2;
                this.g = g2;
            }
            final int h3 = this.h;
            if (h3 - n3 != 0) {
                final long[] f4 = this.f;
                final int n4 = n3 + 1;
                System.arraycopy((Object)f4, n3, (Object)f4, n4, h3 - n3);
                final Object[] g4 = this.g;
                System.arraycopy((Object)g4, n3, (Object)g4, n4, this.h - n3);
            }
            this.f[n3] = n;
            this.g[n3] = o;
            ++this.h;
        }
    }
    
    public void l(final long n) {
        final int b = c.b(this.f, this.h, n);
        if (b >= 0) {
            final Object[] g = this.g;
            final Object o = g[b];
            final Object i = d.i;
            if (o != i) {
                g[b] = i;
                this.e = true;
            }
        }
    }
    
    public int m() {
        if (this.e) {
            this.f();
        }
        return this.h;
    }
    
    public Object n(final int n) {
        if (this.e) {
            this.f();
        }
        return this.g[n];
    }
    
    @Override
    public String toString() {
        if (this.m() <= 0) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.h * 28);
        sb.append('{');
        for (int i = 0; i < this.h; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.j(i));
            sb.append('=');
            final Object n = this.n(i);
            if (n != this) {
                sb.append(n);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
