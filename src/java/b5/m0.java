package b5;

import v3.f;
import i4.l;
import i4.g;

public final class m0
{
    public static final a h;
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public m0 f;
    public m0 g;
    
    static {
        h = new a(null);
    }
    
    public m0() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
    
    public m0(final byte[] a, final int b, final int c, final boolean d, final boolean e) {
        l.e(a, "data");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a() {
        final m0 g = this.g;
        final int n = 0;
        if (g == this) {
            throw new IllegalStateException("cannot compact".toString());
        }
        l.b(g);
        if (!g.e) {
            return;
        }
        final int n2 = this.c - this.b;
        final m0 g2 = this.g;
        l.b(g2);
        final int c = g2.c;
        final m0 g3 = this.g;
        l.b(g3);
        int b;
        if (g3.d) {
            b = n;
        }
        else {
            final m0 g4 = this.g;
            l.b(g4);
            b = g4.b;
        }
        if (n2 > 8192 - c + b) {
            return;
        }
        final m0 g5 = this.g;
        l.b(g5);
        this.f(g5, n2);
        this.b();
        n0.b(this);
    }
    
    public final m0 b() {
        m0 f = this.f;
        if (f == this) {
            f = null;
        }
        final m0 g = this.g;
        l.b(g);
        g.f = this.f;
        final m0 f2 = this.f;
        l.b(f2);
        f2.g = this.g;
        this.f = null;
        this.g = null;
        return f;
    }
    
    public final m0 c(final m0 m0) {
        l.e(m0, "segment");
        m0.g = this;
        m0.f = this.f;
        final m0 f = this.f;
        l.b(f);
        f.g = m0;
        return this.f = m0;
    }
    
    public final m0 d() {
        this.d = true;
        return new m0(this.a, this.b, this.c, true, false);
    }
    
    public final m0 e(final int n) {
        if (n > 0 && n <= this.c - this.b) {
            m0 m0;
            if (n >= 1024) {
                m0 = this.d();
            }
            else {
                m0 = n0.c();
                final byte[] a = this.a;
                final byte[] a2 = m0.a;
                final int b = this.b;
                v3.f.f(a, a2, 0, b, b + n, 2, (Object)null);
            }
            m0.c = m0.b + n;
            this.b += n;
            final m0 g = this.g;
            l.b(g);
            g.c(m0);
            return m0;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }
    
    public final void f(final m0 m0, final int n) {
        l.e(m0, "sink");
        if (m0.e) {
            final int c = m0.c;
            if (c + n > 8192) {
                if (m0.d) {
                    throw new IllegalArgumentException();
                }
                final int b = m0.b;
                if (c + n - b > 8192) {
                    throw new IllegalArgumentException();
                }
                final byte[] a = m0.a;
                v3.f.f(a, a, 0, b, c, 2, (Object)null);
                m0.c -= m0.b;
                m0.b = 0;
            }
            final byte[] a2 = this.a;
            final byte[] a3 = m0.a;
            final int c2 = m0.c;
            final int b2 = this.b;
            v3.f.d(a2, a3, c2, b2, b2 + n);
            m0.c += n;
            this.b += n;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }
    
    public static final class a
    {
        private a() {
        }
    }
}
