package r4;

import java.util.concurrent.CancellationException;
import y3.d;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class q extends a0
{
    private static final AtomicIntegerFieldUpdater c;
    private volatile int _resumed;
    
    static {
        c = AtomicIntegerFieldUpdater.newUpdater((Class)q.class, "_resumed");
    }
    
    public q(final d d, final Throwable t, final boolean b) {
        Object o = t;
        if (t == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Continuation ");
            sb.append((Object)d);
            sb.append(" was cancelled normally");
            o = new CancellationException(sb.toString());
        }
        super((Throwable)o, b);
        this._resumed = 0;
    }
    
    public final boolean c() {
        return q.c.compareAndSet((Object)this, 0, 1);
    }
}
