package t4;

import w4.e;
import w4.h0;
import r4.r2;
import u3.q;
import w4.q0;
import w4.z;
import y3.d;
import i4.x;
import h4.l;

public class o extends b
{
    private final int q;
    private final a r;
    
    public o(final int q, final a r, final l l) {
        super(q, l);
        this.q = q;
        this.r = r;
        final a e = a.e;
        final int n = 0;
        if (r == e) {
            final StringBuilder sb = new StringBuilder();
            sb.append("This implementation does not support suspension for senders, use ");
            sb.append(x.b((Class)b.class).b());
            sb.append(" instead");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        int n2 = n;
        if (q >= 1) {
            n2 = 1;
        }
        if (n2 != 0) {
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Buffered channel capacity must be at least 1, but ");
        sb2.append(q);
        sb2.append(" was specified");
        throw new IllegalArgumentException(sb2.toString().toString());
    }
    
    static /* synthetic */ Object H0(final o o, final Object o2, final d d) {
        final Object k0 = o.K0(o2, true);
        if (k0 instanceof h$a) {
            t4.h.c(k0);
            final l f = o.f;
            if (f != null) {
                final q0 d2 = z.d(f, o2, (q0)null, 2, (Object)null);
                if (d2 != null) {
                    u3.a.a((Throwable)d2, o.N());
                    throw d2;
                }
            }
            throw o.N();
        }
        return q.a;
    }
    
    private final Object I0(final Object o, final boolean b) {
        final Object r = super.r(o);
        if (!t4.h.f(r) && !t4.h.e(r)) {
            if (b) {
                final l f = super.f;
                if (f != null) {
                    final q0 d = z.d(f, o, (q0)null, 2, (Object)null);
                    if (d != null) {
                        throw d;
                    }
                }
            }
            return t4.h.a.c((Object)u3.q.a);
        }
        return r;
    }
    
    private final Object J0(final Object o) {
        final h0 d = c.d;
        j j = (j)b.h().get((Object)this);
        while (true) {
            final long andIncrement = b.i().getAndIncrement((Object)this);
            final long n = andIncrement & 0xFFFFFFFFFFFFFFFL;
            final boolean i = b.j(this, andIncrement);
            final int b = c.b;
            final long n2 = n / b;
            final int n3 = (int)(n % b);
            if (j.g != n2) {
                final j c = t4.b.c(this, n2, j);
                if (c == null) {
                    if (i) {
                        return t4.h.a.a(this.N());
                    }
                    continue;
                }
                else {
                    j = c;
                }
            }
            final int s = t4.b.s(this, j, n3, o, n, d, i);
            if (s == 0) {
                ((e)j).b();
                return t4.h.a.c((Object)u3.q.a);
            }
            if (s == 1) {
                return t4.h.a.c((Object)u3.q.a);
            }
            if (s != 2) {
                if (s == 3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                if (s == 4) {
                    if (n < this.M()) {
                        ((e)j).b();
                    }
                    return t4.h.a.a(this.N());
                }
                if (s != 5) {
                    continue;
                }
                ((e)j).b();
            }
            else {
                if (i) {
                    j.p();
                    return t4.h.a.a(this.N());
                }
                r2 r2;
                if (d instanceof r2) {
                    r2 = (r2)d;
                }
                else {
                    r2 = null;
                }
                if (r2 != null) {
                    t4.b.n(this, r2, j, n3);
                }
                this.E(j.g * b + n3);
                return t4.h.a.c((Object)u3.q.a);
            }
        }
    }
    
    private final Object K0(Object o, final boolean b) {
        if (this.r == a.g) {
            o = this.I0(o, b);
        }
        else {
            o = this.J0(o);
        }
        return o;
    }
    
    @Override
    public Object B(final Object o, final d d) {
        return H0(this, o, d);
    }
    
    @Override
    protected boolean Y() {
        return this.r == a.f;
    }
    
    @Override
    public Object r(final Object o) {
        return this.K0(o, false);
    }
}
