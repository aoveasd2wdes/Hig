package u4;

import i4.l;
import v4.c;
import u3.k$a;
import a4.h;
import u3.q;
import u3.k;
import r4.n;
import z3.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v4.d;

final class k0 extends d
{
    private static final AtomicReferenceFieldUpdater a;
    private volatile Object _state;
    
    static {
        a = AtomicReferenceFieldUpdater.newUpdater((Class)k0.class, (Class)Object.class, "_state");
    }
    
    public k0() {
    }
    
    public static final /* synthetic */ AtomicReferenceFieldUpdater c() {
        return k0.a;
    }
    
    public boolean d(final i0 i0) {
        final AtomicReferenceFieldUpdater a = k0.a;
        if (a.get((Object)this) != null) {
            return false;
        }
        a.set((Object)this, (Object)j0.b());
        return true;
    }
    
    public final Object e(final y3.d d) {
        final n n = new n(b.b(d), 1);
        n.B();
        if (!androidx.concurrent.futures.b.a(c(), (Object)this, (Object)j0.b(), (Object)n)) {
            final k$a e = k.e;
            ((y3.d)n).u(k.a((Object)q.a));
        }
        final Object y = n.y();
        if (y == b.c()) {
            h.c(d);
        }
        if (y == b.c()) {
            return y;
        }
        return q.a;
    }
    
    public y3.d[] f(final i0 i0) {
        k0.a.set((Object)this, (Object)null);
        return c.a;
    }
    
    public final void g() {
        final AtomicReferenceFieldUpdater a = k0.a;
        while (true) {
            final Object value = a.get((Object)this);
            if (value == null) {
                return;
            }
            if (value == j0.c()) {
                return;
            }
            if (value == j0.b()) {
                if (androidx.concurrent.futures.b.a(k0.a, (Object)this, value, (Object)j0.c())) {
                    return;
                }
                continue;
            }
            else {
                if (androidx.concurrent.futures.b.a(k0.a, (Object)this, value, (Object)j0.b())) {
                    final n n = (n)value;
                    final k$a e = k.e;
                    ((y3.d)n).u(k.a((Object)q.a));
                    return;
                }
                continue;
            }
        }
    }
    
    public final boolean h() {
        final Object andSet = k0.a.getAndSet((Object)this, (Object)j0.b());
        l.b(andSet);
        return andSet == j0.c();
    }
}
