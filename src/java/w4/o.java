package w4;

import y3.g;
import r4.m;
import r4.p0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import r4.r0;
import r4.g0;

public final class o extends g0 implements r0
{
    private static final AtomicIntegerFieldUpdater l;
    private final g0 g;
    private final int h;
    private final r0 i;
    private final t j;
    private final Object k;
    private volatile int runningWorkers;
    
    static {
        l = AtomicIntegerFieldUpdater.newUpdater((Class)o.class, "runningWorkers");
    }
    
    public o(final g0 g, final int h) {
        this.g = g;
        this.h = h;
        r0 r0;
        if (g instanceof r0) {
            r0 = (r0)g;
        }
        else {
            r0 = null;
        }
        r0 a = r0;
        if (r0 == null) {
            a = p0.a();
        }
        this.i = a;
        this.j = new t(false);
        this.k = new Object();
    }
    
    private final Runnable N() {
        Runnable runnable;
        while (true) {
            runnable = (Runnable)this.j.d();
            if (runnable == null) {
                final Object k = this.k;
                synchronized (k) {
                    final AtomicIntegerFieldUpdater l = o.l;
                    l.decrementAndGet((Object)this);
                    if (this.j.c() == 0) {
                        return null;
                    }
                    l.incrementAndGet((Object)this);
                    continue;
                }
                break;
            }
            break;
        }
        return runnable;
    }
    
    private final boolean O() {
        final Object k = this.k;
        synchronized (k) {
            final AtomicIntegerFieldUpdater l = o.l;
            if (l.get((Object)this) >= this.h) {
                return false;
            }
            l.incrementAndGet((Object)this);
            return true;
        }
    }
    
    public void u(final long n, final m m) {
        this.i.u(n, m);
    }
    
    @Override
    public void z(final g g, final Runnable runnable) {
        this.j.a((Object)runnable);
        if (o.l.get((Object)this) < this.h && this.O()) {
            final Runnable n = this.N();
            if (n != null) {
                this.g.z((g)this, (Runnable)new o.o$a(this, n));
            }
        }
    }
}
