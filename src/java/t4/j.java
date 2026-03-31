package t4;

import w4.h0;
import h4.l;
import w4.z;
import r4.r2;
import y3.g;
import java.util.concurrent.atomic.AtomicReferenceArray;
import w4.e0;

public final class j extends e0
{
    private final b i;
    private final AtomicReferenceArray j;
    
    public j(final long n, final j j, final b i, final int n2) {
        super(n, (e0)j, n2);
        this.i = i;
        this.j = new AtomicReferenceArray(c.b * 2);
    }
    
    private final void z(final int n, final Object o) {
        this.j.lazySet(n * 2, o);
    }
    
    public final void A(final int n, final Object o) {
        this.j.set(n * 2 + 1, o);
    }
    
    public final void B(final int n, final Object o) {
        this.z(n, o);
    }
    
    public int n() {
        return c.b;
    }
    
    public void o(final int n, final Throwable t, final g g) {
        final int b = c.b;
        final boolean b2 = n >= b;
        int n2 = n;
        if (b2) {
            n2 = n - b;
        }
        final Object v = this.v(n2);
        while (true) {
            final Object w = this.w(n2);
            if (!(w instanceof r2) && !(w instanceof u)) {
                if (w == c.j() || w == c.i()) {
                    this.s(n2);
                    if (b2) {
                        final l f = this.u().f;
                        if (f != null) {
                            z.b(f, v, g);
                        }
                    }
                    return;
                }
                if (w == c.p()) {
                    continue;
                }
                if (w == c.q()) {
                    continue;
                }
                if (w == c.f() || w == c.d) {
                    return;
                }
                if (w == c.z()) {
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("unexpected state: ");
                sb.append(w);
                throw new IllegalStateException(sb.toString().toString());
            }
            else {
                h0 h0;
                if (b2) {
                    h0 = c.j();
                }
                else {
                    h0 = c.i();
                }
                if (this.r(n2, w, h0)) {
                    this.s(n2);
                    this.x(n2, b2 ^ true);
                    if (b2) {
                        final l f2 = this.u().f;
                        if (f2 != null) {
                            z.b(f2, v, g);
                        }
                    }
                    return;
                }
                continue;
            }
        }
    }
    
    public final boolean r(final int n, final Object o, final Object o2) {
        return t4.i.a(this.j, n * 2 + 1, o, o2);
    }
    
    public final void s(final int n) {
        this.z(n, null);
    }
    
    public final Object t(final int n, final Object o) {
        return this.j.getAndSet(n * 2 + 1, o);
    }
    
    public final b u() {
        final b i = this.i;
        i4.l.b((Object)i);
        return i;
    }
    
    public final Object v(final int n) {
        return this.j.get(n * 2);
    }
    
    public final Object w(final int n) {
        return this.j.get(n * 2 + 1);
    }
    
    public final void x(final int n, final boolean b) {
        if (b) {
            this.u().G0(super.g * c.b + n);
        }
        this.p();
    }
    
    public final Object y(final int n) {
        final Object v = this.v(n);
        this.s(n);
        return v;
    }
}
