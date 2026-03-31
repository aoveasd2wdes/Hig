package y4;

import w4.t;
import i4.w;
import t4.i;
import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class n
{
    private static final AtomicReferenceFieldUpdater b;
    private static final AtomicIntegerFieldUpdater c;
    private static final AtomicIntegerFieldUpdater d;
    private static final AtomicIntegerFieldUpdater e;
    private final AtomicReferenceArray a;
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;
    
    static {
        b = AtomicReferenceFieldUpdater.newUpdater((Class)n.class, (Class)Object.class, "lastScheduledTask");
        c = AtomicIntegerFieldUpdater.newUpdater((Class)n.class, "producerIndex");
        d = AtomicIntegerFieldUpdater.newUpdater((Class)n.class, "consumerIndex");
        e = AtomicIntegerFieldUpdater.newUpdater((Class)n.class, "blockingTasksInBuffer");
    }
    
    public n() {
        this.a = new AtomicReferenceArray(128);
    }
    
    private final h b(final h h) {
        if (this.d() == 127) {
            return h;
        }
        final int a = h.f.a();
        boolean b = true;
        if (a != 1) {
            b = false;
        }
        if (b) {
            n.e.incrementAndGet((Object)this);
        }
        final int n = y4.n.c.get((Object)this) & 0x7F;
        while (this.a.get(n) != null) {
            Thread.yield();
        }
        this.a.lazySet(n, (Object)h);
        y4.n.c.incrementAndGet((Object)this);
        return null;
    }
    
    private final void c(final h h) {
        if (h != null) {
            final int a = h.f.a();
            boolean b = true;
            if (a != 1) {
                b = false;
            }
            if (b) {
                n.e.decrementAndGet((Object)this);
            }
        }
    }
    
    private final int d() {
        return n.c.get((Object)this) - n.d.get((Object)this);
    }
    
    private final h i() {
        while (true) {
            final AtomicIntegerFieldUpdater d = n.d;
            final int value = d.get((Object)this);
            if (value - n.c.get((Object)this) == 0) {
                return null;
            }
            if (!d.compareAndSet((Object)this, value, value + 1)) {
                continue;
            }
            final h h = (h)this.a.getAndSet(value & 0x7F, (Object)null);
            if (h == null) {
                continue;
            }
            this.c(h);
            return h;
        }
    }
    
    private final boolean j(final d d) {
        final h i = this.i();
        if (i == null) {
            return false;
        }
        ((t)d).a(i);
        return true;
    }
    
    private final h k(final boolean b) {
        AtomicReferenceFieldUpdater b2;
        h h;
        do {
            b2 = n.b;
            h = (h)b2.get((Object)this);
            if (h != null) {
                final int a = h.f.a();
                boolean b3 = true;
                if (a != 1) {
                    b3 = false;
                }
                if (b3 == b) {
                    continue;
                }
            }
            final int i = n.d.get((Object)this);
            int value = n.c.get((Object)this);
            while (i != value) {
                if (b && n.e.get((Object)this) == 0) {
                    return null;
                }
                --value;
                final h m = this.m(value, b);
                if (m != null) {
                    return m;
                }
            }
            return null;
        } while (!b.a(b2, (Object)this, (Object)h, (Object)null));
        return h;
    }
    
    private final h l(int i) {
        final int value = n.d.get((Object)this);
        final int value2 = n.c.get((Object)this);
        boolean b = true;
        if (i == 1) {
            i = value;
        }
        else {
            b = false;
            i = value;
        }
        while (i != value2) {
            if (b && n.e.get((Object)this) == 0) {
                return null;
            }
            final h m = this.m(i, b);
            if (m != null) {
                return m;
            }
            ++i;
        }
        return null;
    }
    
    private final h m(int a, final boolean b) {
        final int n = a & 0x7F;
        final h h = (h)this.a.get(n);
        if (h != null) {
            a = h.f.a();
            boolean b2 = true;
            if (a != 1) {
                b2 = false;
            }
            if (b2 == b && i.a(this.a, n, (Object)h, (Object)null)) {
                if (b) {
                    y4.n.e.decrementAndGet((Object)this);
                }
                return h;
            }
        }
        return null;
    }
    
    private final long o(final int n, final w w) {
        AtomicReferenceFieldUpdater b;
        h e;
        do {
            b = n.b;
            e = (h)b.get((Object)this);
            if (e == null) {
                return -2L;
            }
            final int a = e.f.a();
            final int n2 = 1;
            int n3;
            if (a == 1) {
                n3 = n2;
            }
            else {
                n3 = 2;
            }
            if ((n3 & n) == 0x0) {
                return -2L;
            }
            final long n4 = l.f.a() - e.e;
            final long b2 = l.b;
            if (n4 < b2) {
                return b2 - n4;
            }
        } while (!androidx.concurrent.futures.b.a(b, (Object)this, (Object)e, (Object)null));
        w.e = e;
        return -1L;
    }
    
    public final h a(h h, final boolean b) {
        if (b) {
            return this.b(h);
        }
        h = (h)n.b.getAndSet((Object)this, (Object)h);
        if (h == null) {
            return null;
        }
        return this.b(h);
    }
    
    public final int e() {
        int d;
        if (n.b.get((Object)this) != null) {
            d = this.d() + 1;
        }
        else {
            d = this.d();
        }
        return d;
    }
    
    public final void f(final d d) {
        final h h = (h)n.b.getAndSet((Object)this, (Object)null);
        if (h != null) {
            ((t)d).a(h);
        }
        while (this.j(d)) {}
    }
    
    public final h g() {
        h i;
        if ((i = (h)n.b.getAndSet((Object)this, (Object)null)) == null) {
            i = this.i();
        }
        return i;
    }
    
    public final h h() {
        return this.k(true);
    }
    
    public final long n(final int n, final w w) {
        h e;
        if (n == 3) {
            e = this.i();
        }
        else {
            e = this.l(n);
        }
        if (e != null) {
            w.e = e;
            return -1L;
        }
        return this.o(n, w);
    }
}
