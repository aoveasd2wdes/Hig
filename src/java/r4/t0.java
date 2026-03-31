package r4;

import h4.l;
import w4.k;
import z3.b;
import y3.d;
import y3.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import w4.d0;

public final class t0 extends d0
{
    private static final AtomicIntegerFieldUpdater i;
    private volatile int _decision;
    
    static {
        i = AtomicIntegerFieldUpdater.newUpdater((Class)t0.class, "_decision");
    }
    
    public t0(final g g, final d d) {
        super(g, d);
    }
    
    private final boolean X0() {
        final AtomicIntegerFieldUpdater i = t0.i;
        do {
            final int value = i.get((Object)this);
            if (value != 0) {
                if (value == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!t0.i.compareAndSet((Object)this, 0, 2));
        return true;
    }
    
    private final boolean Y0() {
        final AtomicIntegerFieldUpdater i = t0.i;
        do {
            final int value = i.get((Object)this);
            if (value != 0) {
                if (value == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!t0.i.compareAndSet((Object)this, 0, 1));
        return true;
    }
    
    @Override
    protected void Q(final Object o) {
        this.S0(o);
    }
    
    @Override
    protected void S0(final Object o) {
        if (this.X0()) {
            return;
        }
        k.c(z3.b.b(super.h), e0.a(o, super.h), (l)null, 2, (Object)null);
    }
    
    public final Object W0() {
        if (this.Y0()) {
            return z3.b.c();
        }
        final Object h = z1.h(this.l0());
        if (!(h instanceof a0)) {
            return h;
        }
        throw ((a0)h).a;
    }
}
