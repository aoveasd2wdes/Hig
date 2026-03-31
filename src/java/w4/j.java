package w4;

import r4.a1;
import u3.q;
import r4.n2;
import r4.e0;
import r4.n0;
import r4.m;
import i4.l;
import androidx.concurrent.futures.b;
import y3.g;
import r4.b0;
import r4.n;
import r4.g0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import y3.d;
import a4.e;
import r4.u0;

public final class j extends u0 implements e, d
{
    private static final AtomicReferenceFieldUpdater l;
    private volatile Object _reusableCancellableContinuation;
    public final g0 h;
    public final d i;
    public Object j;
    public final Object k;
    
    static {
        l = AtomicReferenceFieldUpdater.newUpdater((Class)j.class, (Class)Object.class, "_reusableCancellableContinuation");
    }
    
    public j(final g0 h, final d i) {
        super(-1);
        this.h = h;
        this.i = i;
        this.j = w4.k.a();
        this.k = l0.b(this.d());
    }
    
    private final n l() {
        final Object value = w4.j.l.get((Object)this);
        n n;
        if (value instanceof n) {
            n = (n)value;
        }
        else {
            n = null;
        }
        return n;
    }
    
    public void a(final Object o, final Throwable t) {
        if (o instanceof b0) {
            ((b0)o).b.p((Object)t);
        }
    }
    
    public d c() {
        return (d)this;
    }
    
    public g d() {
        return this.i.d();
    }
    
    public Object h() {
        final Object j = this.j;
        this.j = w4.k.a();
        return j;
    }
    
    public final void i() {
        while (w4.j.l.get((Object)this) == w4.k.b) {}
    }
    
    public final n j() {
        final AtomicReferenceFieldUpdater l = w4.j.l;
        while (true) {
            final Object value = l.get((Object)this);
            if (value == null) {
                w4.j.l.set((Object)this, (Object)w4.k.b);
                return null;
            }
            if (value instanceof n) {
                if (b.a(w4.j.l, (Object)this, value, (Object)w4.k.b)) {
                    return (n)value;
                }
                continue;
            }
            else {
                if (value == w4.k.b) {
                    continue;
                }
                if (value instanceof Throwable) {
                    continue;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Inconsistent state ");
                sb.append(value);
                throw new IllegalStateException(sb.toString().toString());
            }
        }
    }
    
    public e n() {
        final d i = this.i;
        e e;
        if (i instanceof e) {
            e = (e)i;
        }
        else {
            e = null;
        }
        return e;
    }
    
    public final boolean o() {
        return w4.j.l.get((Object)this) != null;
    }
    
    public final boolean p(final Throwable t) {
        final AtomicReferenceFieldUpdater l = w4.j.l;
        while (true) {
            final Object value = l.get((Object)this);
            final h0 b = w4.k.b;
            if (i4.l.a(value, (Object)b)) {
                if (androidx.concurrent.futures.b.a(w4.j.l, (Object)this, (Object)b, (Object)t)) {
                    return true;
                }
                continue;
            }
            else {
                if (value instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.b.a(w4.j.l, (Object)this, value, (Object)null)) {
                    return false;
                }
                continue;
            }
        }
    }
    
    public final void q() {
        this.i();
        final n l = this.l();
        if (l != null) {
            l.r();
        }
    }
    
    public final Throwable r(final m m) {
        final AtomicReferenceFieldUpdater l = w4.j.l;
        h0 b;
        do {
            final Object value = l.get((Object)this);
            b = w4.k.b;
            if (value == b) {
                continue;
            }
            if (!(value instanceof Throwable)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Inconsistent state ");
                sb.append(value);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (androidx.concurrent.futures.b.a(w4.j.l, (Object)this, value, (Object)null)) {
                return (Throwable)value;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } while (!androidx.concurrent.futures.b.a(w4.j.l, (Object)this, (Object)b, (Object)m));
        return null;
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DispatchedContinuation[");
        sb.append((Object)this.h);
        sb.append(", ");
        sb.append(n0.c(this.i));
        sb.append(']');
        return sb.toString();
    }
    
    public void u(final Object o) {
        Object o2 = this.i.d();
        final Object d = e0.d(o, (h4.l)null, 1, (Object)null);
        if (this.h.B((g)o2)) {
            this.j = d;
            super.g = 0;
            this.h.z((g)o2, (Runnable)this);
            return;
        }
        o2 = n2.a.b();
        if (((a1)o2).S()) {
            this.j = d;
            super.g = 0;
            ((a1)o2).O(this);
            return;
        }
        ((a1)o2).Q(true);
        final Throwable t2;
        try {
            final g d2 = this.d();
            final Object c = l0.c(d2, this.k);
            try {
                this.i.u(o);
                final q a = q.a;
                l0.a(d2, c);
                while (((a1)o2).V()) {}
            }
            finally {
                l0.a(d2, c);
            }
        }
        finally {
            final j j = this;
            final Throwable t = t2;
            final Throwable t3 = null;
            j.g(t, t3);
        }
        try {
            final j j = this;
            final Throwable t = t2;
            final Throwable t3 = null;
            j.g(t, t3);
        }
        finally {
            ((a1)o2).K(true);
        }
    }
}
