package w4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class b extends a0
{
    private static final AtomicReferenceFieldUpdater a;
    private volatile Object _consensus;
    
    static {
        a = AtomicReferenceFieldUpdater.newUpdater((Class)b.class, (Class)Object.class, "_consensus");
    }
    
    public b() {
        this._consensus = w4.a.a;
    }
    
    private final Object c(final Object o) {
        final AtomicReferenceFieldUpdater a = b.a;
        final Object value = a.get((Object)this);
        final Object a2 = w4.a.a;
        if (value != a2) {
            return value;
        }
        if (androidx.concurrent.futures.b.a(a, (Object)this, a2, o)) {
            return o;
        }
        return a.get((Object)this);
    }
    
    public final Object a(final Object o) {
        Object o2;
        if ((o2 = b.a.get((Object)this)) == w4.a.a) {
            o2 = this.c(this.d(o));
        }
        this.b(o, o2);
        return o2;
    }
    
    public abstract void b(final Object p0, final Object p1);
    
    public abstract Object d(final Object p0);
}
