package r4;

import i4.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class a0
{
    private static final AtomicIntegerFieldUpdater b;
    private volatile int _handled;
    public final Throwable a;
    
    static {
        b = AtomicIntegerFieldUpdater.newUpdater((Class)a0.class, "_handled");
    }
    
    public a0(final Throwable a, final boolean handled) {
        this.a = a;
        this._handled = (handled ? 1 : 0);
    }
    
    public final boolean a() {
        return a0.b.get((Object)this) != 0;
    }
    
    public final boolean b() {
        return a0.b.compareAndSet((Object)this, 0, 1);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(n0.a(this));
        sb.append('[');
        sb.append((Object)this.a);
        sb.append(']');
        return sb.toString();
    }
}
