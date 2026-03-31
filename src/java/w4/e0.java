package w4;

import y3.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import r4.e2;

public abstract class e0 extends e implements e2
{
    private static final AtomicIntegerFieldUpdater h;
    private volatile int cleanedAndPointers;
    public final long g;
    
    static {
        h = AtomicIntegerFieldUpdater.newUpdater((Class)e0.class, "cleanedAndPointers");
    }
    
    public e0(final long g, final e0 e0, final int n) {
        super((e)e0);
        this.g = g;
        this.cleanedAndPointers = n << 16;
    }
    
    public boolean h() {
        return e0.h.get((Object)this) == this.n() && !this.i();
    }
    
    public final boolean m() {
        return e0.h.addAndGet((Object)this, -65536) == this.n() && !this.i();
    }
    
    public abstract int n();
    
    public abstract void o(final int p0, final Throwable p1, final g p2);
    
    public final void p() {
        if (e0.h.incrementAndGet((Object)this) == this.n()) {
            this.k();
        }
    }
    
    public final boolean q() {
        final AtomicIntegerFieldUpdater h = e0.h;
        int value;
        do {
            value = h.get((Object)this);
            final int n = this.n();
            final boolean b = false;
            if (value == n && !this.i()) {
                return b;
            }
        } while (!h.compareAndSet((Object)this, value, 65536 + value));
        return true;
    }
}
