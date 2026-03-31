package w4;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class t
{
    private static final AtomicReferenceFieldUpdater a;
    private volatile Object _cur;
    
    static {
        a = AtomicReferenceFieldUpdater.newUpdater((Class)t.class, (Class)Object.class, "_cur");
    }
    
    public t(final boolean b) {
        this._cur = new u(8, b);
    }
    
    public final boolean a(final Object o) {
        final AtomicReferenceFieldUpdater a = t.a;
        while (true) {
            final u u = (u)a.get((Object)this);
            final int a2 = u.a(o);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                if (a2 != 2) {
                    continue;
                }
                return false;
            }
            else {
                b.a(t.a, (Object)this, (Object)u, (Object)u.i());
            }
        }
    }
    
    public final void b() {
        final AtomicReferenceFieldUpdater a = t.a;
        while (true) {
            final u u = (u)a.get((Object)this);
            if (u.d()) {
                break;
            }
            b.a(t.a, (Object)this, (Object)u, (Object)u.i());
        }
    }
    
    public final int c() {
        return ((u)t.a.get((Object)this)).f();
    }
    
    public final Object d() {
        final AtomicReferenceFieldUpdater a = t.a;
        Object j;
        while (true) {
            final u u = (u)a.get((Object)this);
            j = u.j();
            if (j != w4.u.h) {
                break;
            }
            b.a(t.a, (Object)this, (Object)u, (Object)u.i());
        }
        return j;
    }
}
