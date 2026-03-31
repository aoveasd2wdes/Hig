package r4;

import u3.q;
import h4.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

final class o1 extends s1
{
    private static final AtomicIntegerFieldUpdater j;
    private volatile int _invoked;
    private final l i;
    
    static {
        j = AtomicIntegerFieldUpdater.newUpdater((Class)o1.class, "_invoked");
    }
    
    public o1(final l i) {
        this.i = i;
    }
    
    @Override
    public void y(final Throwable t) {
        if (o1.j.compareAndSet((Object)this, 0, 1)) {
            this.i.p((Object)t);
        }
    }
}
