package r4;

import w4.n0;
import u3.q;
import w4.o0;
import m4.g;
import i4.l;
import w4.u;
import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class b1 extends c1 implements r0
{
    private static final AtomicReferenceFieldUpdater j;
    private static final AtomicReferenceFieldUpdater k;
    private static final AtomicIntegerFieldUpdater l;
    private volatile Object _delayed;
    private volatile int _isCompleted;
    private volatile Object _queue;
    
    static {
        j = AtomicReferenceFieldUpdater.newUpdater((Class)b1.class, (Class)Object.class, "_queue");
        k = AtomicReferenceFieldUpdater.newUpdater((Class)b1.class, (Class)Object.class, "_delayed");
        l = AtomicIntegerFieldUpdater.newUpdater((Class)b1.class, "_isCompleted");
    }
    
    public b1() {
        this._isCompleted = 0;
    }
    
    private final void c0() {
        final AtomicReferenceFieldUpdater j = b1.j;
        while (true) {
            final Object value = j.get((Object)this);
            if (value == null) {
                if (b.a(b1.j, (Object)this, (Object)null, (Object)e1.a())) {
                    return;
                }
                continue;
            }
            else {
                if (value instanceof u) {
                    ((u)value).d();
                    return;
                }
                if (value == e1.a()) {
                    return;
                }
                final u u = new u(8, true);
                i4.l.c(value, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                u.a((Object)value);
                if (b.a(b1.j, (Object)this, value, (Object)u)) {
                    return;
                }
                continue;
            }
        }
    }
    
    private final Runnable d0() {
        final AtomicReferenceFieldUpdater j = b1.j;
        while (true) {
            final Object value = j.get((Object)this);
            if (value == null) {
                return null;
            }
            if (value instanceof u) {
                i4.l.c(value, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                final u u = (u)value;
                final Object i = u.j();
                if (i != w4.u.h) {
                    return (Runnable)i;
                }
                b.a(b1.j, (Object)this, value, (Object)u.i());
            }
            else {
                if (value == e1.a()) {
                    return null;
                }
                if (b.a(b1.j, (Object)this, value, (Object)null)) {
                    i4.l.c(value, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable)value;
                }
                continue;
            }
        }
    }
    
    private final boolean f0(final Runnable runnable) {
        final AtomicReferenceFieldUpdater j = b1.j;
        while (true) {
            final Object value = j.get((Object)this);
            if (this.p()) {
                return false;
            }
            if (value == null) {
                if (b.a(b1.j, (Object)this, (Object)null, (Object)runnable)) {
                    return true;
                }
                continue;
            }
            else if (value instanceof u) {
                i4.l.c(value, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                final u u = (u)value;
                final int a = u.a((Object)runnable);
                if (a == 0) {
                    return true;
                }
                if (a != 1) {
                    if (a != 2) {
                        continue;
                    }
                    return false;
                }
                else {
                    b.a(b1.j, (Object)this, value, (Object)u.i());
                }
            }
            else {
                if (value == e1.a()) {
                    return false;
                }
                final u u2 = new u(8, true);
                i4.l.c(value, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                u2.a((Object)value);
                u2.a((Object)runnable);
                if (b.a(b1.j, (Object)this, value, (Object)u2)) {
                    return true;
                }
                continue;
            }
        }
    }
    
    private final void h0() {
        c.a();
        final long nanoTime = System.nanoTime();
        while (true) {
            final b1.b1$c b1$c = (b1.b1$c)b1.k.get((Object)this);
            if (b1$c == null) {
                break;
            }
            final b1$b b1$b = (b1$b)((n0)b1$c).i();
            if (b1$b == null) {
                break;
            }
            this.Z(nanoTime, b1$b);
        }
    }
    
    private final int k0(final long n, final b1$b b1$b) {
        if (this.p()) {
            return 1;
        }
        final AtomicReferenceFieldUpdater k = b1.k;
        b1.b1$c b1$c;
        if ((b1$c = (b1.b1$c)k.get((Object)this)) == null) {
            b.a(k, (Object)this, (Object)null, (Object)new b1.b1$c(n));
            final Object value = k.get((Object)this);
            i4.l.b(value);
            b1$c = (b1.b1$c)value;
        }
        return b1$b.l(n, b1$c, this);
    }
    
    private final void l0(final boolean b) {
        b1.l.set((Object)this, (int)(b ? 1 : 0));
    }
    
    private final boolean m0(final b1$b b1$b) {
        final b1.b1$c b1$c = (b1.b1$c)b1.k.get((Object)this);
        b1$b b1$b2;
        if (b1$c != null) {
            b1$b2 = (b1$b)((n0)b1$c).e();
        }
        else {
            b1$b2 = null;
        }
        return b1$b2 == b1$b;
    }
    
    private final boolean p() {
        return b1.l.get((Object)this) != 0;
    }
    
    protected long P() {
        if (super.P() == 0L) {
            return 0L;
        }
        final Object value = b1.j.get((Object)this);
        if (value != null) {
            if (value instanceof u) {
                if (!((u)value).g()) {
                    return 0L;
                }
            }
            else {
                if (value == e1.a()) {
                    return Long.MAX_VALUE;
                }
                return 0L;
            }
        }
        final b1.b1$c b1$c = (b1.b1$c)b1.k.get((Object)this);
        if (b1$c != null) {
            final b1$b b1$b = (b1$b)((n0)b1$c).e();
            if (b1$b != null) {
                final long e = b1$b.e;
                c.a();
                return m4.g.b(e - System.nanoTime(), 0L);
            }
        }
        return Long.MAX_VALUE;
    }
    
    public long U() {
        if (this.V()) {
            return 0L;
        }
        final b1.b1$c b1$c = (b1.b1$c)b1.k.get((Object)this);
        if (b1$c != null && !((n0)b1$c).d()) {
            c.a();
            final long nanoTime = System.nanoTime();
            while (true) {
                synchronized (b1$c) {
                    final o0 b = ((n0)b1$c).b();
                    Object h = null;
                    if (b != null) {
                        final b1$b b1$b = (b1$b)b;
                        if (b1$b.m(nanoTime) && this.f0((Runnable)b1$b)) {
                            h = ((n0)b1$c).h(0);
                        }
                    }
                    monitorexit(b1$c);
                    if (h != null) {
                        continue;
                    }
                }
                break;
            }
        }
        final Runnable d0 = this.d0();
        if (d0 != null) {
            d0.run();
            return 0L;
        }
        return this.P();
    }
    
    public void X() {
        n2.a.c();
        this.l0(true);
        this.c0();
        while (this.U() <= 0L) {}
        this.h0();
    }
    
    public void e0(final Runnable runnable) {
        if (this.f0(runnable)) {
            this.a0();
        }
        else {
            r4.o0.m.e0(runnable);
        }
    }
    
    protected boolean g0() {
        final boolean t = this.T();
        boolean g = false;
        if (!t) {
            return false;
        }
        final b1.b1$c b1$c = (b1.b1$c)b1.k.get((Object)this);
        if (b1$c != null && !((n0)b1$c).d()) {
            return false;
        }
        final Object value = b1.j.get((Object)this);
        if (value != null) {
            if (value instanceof u) {
                g = ((u)value).g();
                return g;
            }
            if (value != e1.a()) {
                return g;
            }
        }
        g = true;
        return g;
    }
    
    protected final void i0() {
        b1.j.set((Object)this, (Object)null);
        b1.k.set((Object)this, (Object)null);
    }
    
    public final void j0(final long n, final b1$b b1$b) {
        final int k0 = this.k0(n, b1$b);
        if (k0 != 0) {
            if (k0 != 1) {
                if (k0 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
            }
            else {
                this.Z(n, b1$b);
            }
        }
        else if (this.m0(b1$b)) {
            this.a0();
        }
    }
    
    public void u(long nanoTime, final m m) {
        final long c = e1.c(nanoTime);
        if (c < 4611686018427387903L) {
            r4.c.a();
            nanoTime = System.nanoTime();
            final a a = new a(c + nanoTime, m);
            this.j0(nanoTime, (b1$b)a);
            p.a(m, (x0)a);
        }
    }
    
    public final void z(final y3.g g, final Runnable runnable) {
        this.e0(runnable);
    }
    
    private final class a extends b1$b
    {
        private final m g;
        final b1 h;
        
        public a(final b1 h, final long n, final m g) {
            this.h = h;
            super(n);
            this.g = g;
        }
        
        public void run() {
            this.g.m((g0)this.h, (Object)q.a);
        }
        
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append((Object)this.g);
            return sb.toString();
        }
    }
}
