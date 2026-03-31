package p;

public class h implements Cloneable
{
    private static final Object i;
    private boolean e;
    private int[] f;
    private Object[] g;
    private int h;
    
    static {
        i = new Object();
    }
    
    public h() {
        this(10);
    }
    
    public h(int e) {
        this.e = false;
        if (e == 0) {
            this.f = c.a;
            this.g = c.c;
        }
        else {
            e = c.e(e);
            this.f = new int[e];
            this.g = new Object[e];
        }
    }
    
    private void d() {
        final int h = this.h;
        final int[] f = this.f;
        final Object[] g = this.g;
        int i = 0;
        int h2 = 0;
        while (i < h) {
            final Object o = g[i];
            int n = h2;
            if (o != p.h.i) {
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
    
    public void a(final int n, final Object o) {
        final int h = this.h;
        if (h != 0 && n <= this.f[h - 1]) {
            this.i(n, o);
            return;
        }
        if (this.e && h >= this.f.length) {
            this.d();
        }
        final int h2 = this.h;
        if (h2 >= this.f.length) {
            final int e = c.e(h2 + 1);
            final int[] f = new int[e];
            final Object[] g = new Object[e];
            final int[] f2 = this.f;
            System.arraycopy((Object)f2, 0, (Object)f, 0, f2.length);
            final Object[] g2 = this.g;
            System.arraycopy((Object)g2, 0, (Object)g, 0, g2.length);
            this.f = f;
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
    
    public h c() {
        try {
            final h h = (h)super.clone();
            h.f = this.f.clone();
            h.g = this.g.clone();
            return h;
        }
        catch (final CloneNotSupportedException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public Object f(final int n) {
        return this.g(n, null);
    }
    
    public Object g(int a, final Object o) {
        a = c.a(this.f, this.h, a);
        if (a >= 0) {
            final Object o2 = this.g[a];
            if (o2 != p.h.i) {
                return o2;
            }
        }
        return o;
    }
    
    public int h(final int n) {
        if (this.e) {
            this.d();
        }
        return this.f[n];
    }
    
    public void i(final int n, final Object o) {
        final int a = c.a(this.f, this.h, n);
        if (a >= 0) {
            this.g[a] = o;
        }
        else {
            final int n2 = ~a;
            final int h = this.h;
            if (n2 < h) {
                final Object[] g = this.g;
                if (g[n2] == p.h.i) {
                    this.f[n2] = n;
                    g[n2] = o;
                    return;
                }
            }
            int n3 = n2;
            if (this.e) {
                n3 = n2;
                if (h >= this.f.length) {
                    this.d();
                    n3 = ~c.a(this.f, this.h, n);
                }
            }
            final int h2 = this.h;
            if (h2 >= this.f.length) {
                final int e = c.e(h2 + 1);
                final int[] f = new int[e];
                final Object[] g2 = new Object[e];
                final int[] f2 = this.f;
                System.arraycopy((Object)f2, 0, (Object)f, 0, f2.length);
                final Object[] g3 = this.g;
                System.arraycopy((Object)g3, 0, (Object)g2, 0, g3.length);
                this.f = f;
                this.g = g2;
            }
            final int h3 = this.h;
            if (h3 - n3 != 0) {
                final int[] f3 = this.f;
                final int n4 = n3 + 1;
                System.arraycopy((Object)f3, n3, (Object)f3, n4, h3 - n3);
                final Object[] g4 = this.g;
                System.arraycopy((Object)g4, n3, (Object)g4, n4, this.h - n3);
            }
            this.f[n3] = n;
            this.g[n3] = o;
            ++this.h;
        }
    }
    
    public int j() {
        if (this.e) {
            this.d();
        }
        return this.h;
    }
    
    public Object k(final int n) {
        if (this.e) {
            this.d();
        }
        return this.g[n];
    }
    
    @Override
    public String toString() {
        if (this.j() <= 0) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.h * 28);
        sb.append('{');
        for (int i = 0; i < this.h; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.h(i));
            sb.append('=');
            final Object k = this.k(i);
            if (k != this) {
                sb.append(k);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
