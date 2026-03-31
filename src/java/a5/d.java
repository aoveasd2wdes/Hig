package a5;

import u3.q;
import r4.m;
import t4.i;
import androidx.concurrent.futures.b;
import w4.f0;
import h4.p;
import w4.e0;
import r4.r2;
import h4.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class d
{
    private static final AtomicReferenceFieldUpdater c;
    private static final AtomicLongFieldUpdater d;
    private static final AtomicReferenceFieldUpdater e;
    private static final AtomicLongFieldUpdater f;
    private static final AtomicIntegerFieldUpdater g;
    private volatile int _availablePermits;
    private final int a;
    private final l b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;
    
    static {
        c = AtomicReferenceFieldUpdater.newUpdater((Class)d.class, (Class)Object.class, "head");
        d = AtomicLongFieldUpdater.newUpdater((Class)d.class, "deqIdx");
        e = AtomicReferenceFieldUpdater.newUpdater((Class)d.class, (Class)Object.class, "tail");
        f = AtomicLongFieldUpdater.newUpdater((Class)d.class, "enqIdx");
        g = AtomicIntegerFieldUpdater.newUpdater((Class)d.class, "_availablePermits");
    }
    
    public d(final int a, final int n) {
        this.a = a;
        final int n2 = 1;
        if (a <= 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Semaphore should have at least 1 permit, but had ");
            sb.append(a);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        int n3;
        if (n >= 0 && n <= a) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        if (n3 != 0) {
            final f f = new f(0L, (f)null, 2);
            this.head = f;
            this.tail = f;
            this._availablePermits = a - n;
            this.b = (l)new d$b(this);
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("The number of acquired permits should be in 0..");
        sb2.append(a);
        throw new IllegalArgumentException(sb2.toString().toString());
    }
    
    private final boolean e(final r2 r2) {
        final AtomicReferenceFieldUpdater e = a5.d.e;
        final f f = (f)e.get((Object)this);
        final long andIncrement = a5.d.f.getAndIncrement((Object)this);
        final d$a n = d$a.n;
        final long n2 = andIncrement / a5.e.f();
        Object c = null;
    Label_0088_Outer:
        while (true) {
            c = w4.d.c((e0)f, n2, (p)n);
            if (f0.c(c)) {
                break;
            }
            final e0 b = f0.b(c);
            boolean b2 = false;
        Label_0135:
            while (true) {
                e0 e2 = null;
                Block_3: {
                    Block_2: {
                        while (true) {
                            e2 = (e0)e.get((Object)this);
                            if (e2.g >= b.g) {
                                break;
                            }
                            if (!b.q()) {
                                break Block_2;
                            }
                            if (androidx.concurrent.futures.b.a(e, (Object)this, (Object)e2, (Object)b)) {
                                break Block_3;
                            }
                            if (!b.m()) {
                                continue Label_0088_Outer;
                            }
                            ((w4.e)b).k();
                        }
                        b2 = true;
                        break Label_0135;
                    }
                    b2 = false;
                    break Label_0135;
                }
                if (e2.m()) {
                    ((w4.e)e2).k();
                }
                continue;
            }
            if (b2) {
                break;
            }
        }
        final f f2 = (f)f0.b(c);
        final int n3 = (int)(andIncrement % a5.e.f());
        if (i.a(f2.r(), n3, (Object)null, (Object)r2)) {
            r2.b((e0)f2, n3);
            return true;
        }
        if (!i.a(f2.r(), n3, (Object)a5.e.e(), (Object)a5.e.g())) {
            return false;
        }
        if (r2 instanceof m) {
            i4.l.c(r2, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((m)r2).K((Object)q.a, this.b);
            return true;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("unexpected: ");
        sb.append((Object)r2);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    private final void f() {
        int value;
        int a;
        AtomicIntegerFieldUpdater g;
        do {
            g = a5.d.g;
            value = g.get((Object)this);
            a = this.a;
        } while (value > a && !g.compareAndSet((Object)this, value, a));
    }
    
    private final int g() {
        int i;
        do {
            i = a5.d.g.getAndDecrement((Object)this);
        } while (i > this.a);
        return i;
    }
    
    private final boolean k(final Object o) {
        if (o instanceof m) {
            i4.l.c(o, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            final m m = (m)o;
            final Object x = m.x((Object)q.a, (Object)null, this.b);
            boolean b;
            if (x != null) {
                m.J(x);
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("unexpected: ");
        sb.append(o);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    private final boolean l() {
        final AtomicReferenceFieldUpdater c = a5.d.c;
        final f f = (f)c.get((Object)this);
        final long andIncrement = a5.d.d.getAndIncrement((Object)this);
        final long n = andIncrement / a5.e.f();
        final d$c n2 = d$c.n;
        Object c2 = null;
    Label_0090_Outer:
        while (true) {
            c2 = w4.d.c((e0)f, n, (p)n2);
            if (f0.c(c2)) {
                break;
            }
            final e0 b = f0.b(c2);
            boolean b2 = false;
        Label_0137:
            while (true) {
                e0 e0 = null;
                Block_3: {
                    Block_2: {
                        while (true) {
                            e0 = (e0)c.get((Object)this);
                            if (e0.g >= b.g) {
                                break;
                            }
                            if (!b.q()) {
                                break Block_2;
                            }
                            if (androidx.concurrent.futures.b.a(c, (Object)this, (Object)e0, (Object)b)) {
                                break Block_3;
                            }
                            if (!b.m()) {
                                continue Label_0090_Outer;
                            }
                            ((w4.e)b).k();
                        }
                        b2 = true;
                        break Label_0137;
                    }
                    b2 = false;
                    break Label_0137;
                }
                if (e0.m()) {
                    ((w4.e)e0).k();
                }
                continue;
            }
            if (b2) {
                break;
            }
        }
        final f f2 = (f)f0.b(c2);
        ((w4.e)f2).b();
        if (((e0)f2).g > n) {
            return false;
        }
        final int n3 = (int)(andIncrement % a5.e.f());
        final Object andSet = f2.r().getAndSet(n3, (Object)a5.e.e());
        if (andSet == null) {
            for (int d = a5.e.d(), i = 0; i < d; ++i) {
                if (f2.r().get(n3) == a5.e.g()) {
                    return true;
                }
            }
            return i.a(f2.r(), n3, (Object)a5.e.e(), (Object)a5.e.b()) ^ true;
        }
        return andSet != a5.e.c() && this.k(andSet);
    }
    
    protected final void d(final m m) {
        while (this.g() <= 0) {
            i4.l.c(m, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (this.e((r2)m)) {
                return;
            }
        }
        m.K((Object)q.a, this.b);
    }
    
    public int h() {
        return Math.max(a5.d.g.get((Object)this), 0);
    }
    
    public void i() {
        do {
            final int andIncrement = a5.d.g.getAndIncrement((Object)this);
            if (andIncrement >= this.a) {
                this.f();
                final StringBuilder sb = new StringBuilder();
                sb.append("The number of released permits cannot be greater than ");
                sb.append(this.a);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!this.l());
    }
    
    public boolean j() {
        while (true) {
            final AtomicIntegerFieldUpdater g = a5.d.g;
            final int value = g.get((Object)this);
            if (value > this.a) {
                this.f();
            }
            else {
                if (value <= 0) {
                    return false;
                }
                if (g.compareAndSet((Object)this, value, value - 1)) {
                    return true;
                }
                continue;
            }
        }
    }
}
