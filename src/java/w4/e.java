package w4;

import androidx.concurrent.futures.b;
import i4.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class e
{
    private static final AtomicReferenceFieldUpdater e;
    private static final AtomicReferenceFieldUpdater f;
    private volatile Object _next;
    private volatile Object _prev;
    
    static {
        e = AtomicReferenceFieldUpdater.newUpdater((Class)e.class, (Class)Object.class, "_next");
        f = AtomicReferenceFieldUpdater.newUpdater((Class)e.class, (Class)Object.class, "_prev");
    }
    
    public e(final e prev) {
        this._prev = prev;
    }
    
    private final e c() {
        e g;
        for (g = this.g(); g != null && g.h(); g = (e)w4.e.f.get((Object)g)) {}
        return g;
    }
    
    private final e d() {
        e e = this.e();
        l.b((Object)e);
        while (e.h()) {
            final e e2 = e.e();
            if (e2 == null) {
                return e;
            }
            e = e2;
        }
        return e;
    }
    
    private final Object f() {
        return w4.e.e.get((Object)this);
    }
    
    public final void b() {
        w4.e.f.lazySet((Object)this, (Object)null);
    }
    
    public final e e() {
        final Object a = this.f();
        if (a == d.a()) {
            return null;
        }
        return (e)a;
    }
    
    public final e g() {
        return (e)w4.e.f.get((Object)this);
    }
    
    public abstract boolean h();
    
    public final boolean i() {
        return this.e() == null;
    }
    
    public final boolean j() {
        return b.a(w4.e.e, (Object)this, (Object)null, (Object)d.a());
    }
    
    public final void k() {
        if (this.i()) {
            return;
        }
        e d;
        e c;
        do {
            c = this.c();
            d = this.d();
            final AtomicReferenceFieldUpdater f = w4.e.f;
            Object value;
            Object o;
            do {
                value = f.get((Object)d);
                if (value == null) {
                    o = null;
                }
                else {
                    o = c;
                }
            } while (!b.a(f, (Object)d, value, o));
            if (c != null) {
                w4.e.e.set((Object)c, (Object)d);
            }
        } while ((d.h() && !d.i()) || (c != null && c.h()));
    }
    
    public final boolean l(final e e) {
        return b.a(e.e, (Object)this, (Object)null, (Object)e);
    }
}
