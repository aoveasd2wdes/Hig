package y4;

import java.util.Collection;
import w4.t;
import u3.q;
import i4.w;
import r4.n0;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import r4.c;
import i4.l;
import java.util.concurrent.locks.LockSupport;
import i4.g;
import w4.c0;
import w4.h0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.io.Closeable;
import java.util.concurrent.Executor;

public final class a implements Executor, Closeable
{
    public static final a l;
    private static final AtomicLongFieldUpdater m;
    private static final AtomicLongFieldUpdater n;
    private static final AtomicIntegerFieldUpdater o;
    public static final h0 p;
    private volatile int _isTerminated;
    private volatile long controlState;
    public final int e;
    public final int f;
    public final long g;
    public final String h;
    public final y4.d i;
    public final y4.d j;
    public final c0 k;
    private volatile long parkedWorkersStack;
    
    static {
        l = new a(null);
        m = AtomicLongFieldUpdater.newUpdater((Class)a.class, "parkedWorkersStack");
        n = AtomicLongFieldUpdater.newUpdater((Class)a.class, "controlState");
        o = AtomicIntegerFieldUpdater.newUpdater((Class)a.class, "_isTerminated");
        p = new h0("NOT_IN_STACK");
    }
    
    public a(final int e, int f, final long g, final String h) {
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        final int n = 1;
        if (e < 1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Core pool size ");
            sb.append(e);
            sb.append(" should be at least 1");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (f < e) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Max pool size ");
            sb2.append(f);
            sb2.append(" should be greater than or equals to core pool size ");
            sb2.append(e);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        if (f > 2097150) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Max pool size ");
            sb3.append(f);
            sb3.append(" should not exceed maximal supported number of threads 2097150");
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        if (g > 0L) {
            f = n;
        }
        else {
            f = 0;
        }
        if (f != 0) {
            this.i = new y4.d();
            this.j = new y4.d();
            this.k = new c0((e + 1) * 2);
            this.controlState = (long)e << 42;
            this._isTerminated = 0;
            return;
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("Idle worker keep alive time ");
        sb4.append(g);
        sb4.append(" must be positive");
        throw new IllegalArgumentException(sb4.toString().toString());
    }
    
    private final h B(final c c, final h h, final boolean b) {
        if (c == null) {
            return h;
        }
        if (c.g == d.i) {
            return h;
        }
        if (h.f.a() == 0 && c.g == d.f) {
            return h;
        }
        c.k = true;
        return c.e.a(h, b);
    }
    
    private final boolean C(final long n) {
        if (m4.g.a((int)(0x1FFFFFL & n) - (int)((n & 0x3FFFFE00000L) >> 21), 0) < this.e) {
            final int c = this.c();
            if (c == 1 && this.e > 1) {
                this.c();
            }
            if (c > 0) {
                return true;
            }
        }
        return false;
    }
    
    static /* synthetic */ boolean D(final a a, long value, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            value = a.n.get((Object)a);
        }
        return a.C(value);
    }
    
    private final boolean E() {
        c p;
        do {
            p = this.p();
            if (p == null) {
                return false;
            }
        } while (!c.j().compareAndSet((Object)p, -1, 0));
        LockSupport.unpark((Thread)p);
        return true;
    }
    
    public static final /* synthetic */ AtomicLongFieldUpdater a() {
        return a.n;
    }
    
    private final boolean b(final h h) {
        final int a = h.f.a();
        boolean b = true;
        if (a != 1) {
            b = false;
        }
        y4.d d;
        if (b) {
            d = this.j;
        }
        else {
            d = this.i;
        }
        return ((t)d).a(h);
    }
    
    private final int c() {
        final c0 k = this.k;
        synchronized (k) {
            if (this.j()) {
                return -1;
            }
            final AtomicLongFieldUpdater n = a.n;
            final long value = n.get((Object)this);
            final int n2 = (int)(value & 0x1FFFFFL);
            final int n3 = (int)((value & 0x3FFFFE00000L) >> 21);
            final int n4 = 0;
            final int a = m4.g.a(n2 - n3, 0);
            if (a >= this.e) {
                return 0;
            }
            if (n2 >= this.f) {
                return 0;
            }
            final int n5 = (int)(a().get((Object)this) & 0x1FFFFFL) + 1;
            if (n5 <= 0 || this.k.b(n5) != null) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            final c c = new c(n5);
            this.k.c(n5, c);
            final long incrementAndGet = n.incrementAndGet((Object)this);
            int n6 = n4;
            if (n5 == (int)(0x1FFFFFL & incrementAndGet)) {
                n6 = 1;
            }
            if (n6 != 0) {
                monitorexit(k);
                c.start();
                return a + 1;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
    
    private final c f() {
        final Thread currentThread = Thread.currentThread();
        final boolean b = currentThread instanceof c;
        final c c = null;
        c c2;
        if (b) {
            c2 = (c)currentThread;
        }
        else {
            c2 = null;
        }
        c c3 = c;
        if (c2 != null) {
            c3 = c;
            if (i4.l.a((Object)y4.a.c.a(c2), (Object)this)) {
                c3 = c2;
            }
        }
        return c3;
    }
    
    public static /* synthetic */ void i(final a a, final Runnable runnable, i g, boolean b, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            g = y4.l.g;
        }
        if ((n & 0x4) != 0x0) {
            b = false;
        }
        a.h(runnable, g, b);
    }
    
    private final int l(c c) {
        int i;
        do {
            final Object j = c.i();
            if (j == a.p) {
                return -1;
            }
            if (j == null) {
                return 0;
            }
            c = (c)j;
            i = c.h();
        } while (i == 0);
        return i;
    }
    
    private final c p() {
        final AtomicLongFieldUpdater m = a.m;
        int l;
        long value;
        c c;
        do {
            value = m.get((Object)this);
            c = (c)this.k.b((int)(0x1FFFFFL & value));
            if (c == null) {
                return null;
            }
            l = this.l(c);
        } while (l < 0 || !a.m.compareAndSet((Object)this, value, (long)l | (2097152L + value & 0xFFFFFFFFFFE00000L)));
        c.r(a.p);
        return c;
    }
    
    private final void z(final long n, final boolean b) {
        if (b) {
            return;
        }
        if (this.E()) {
            return;
        }
        if (this.C(n)) {
            return;
        }
        this.E();
    }
    
    public final void A() {
        if (this.E()) {
            return;
        }
        if (D(this, 0L, 1, null)) {
            return;
        }
        this.E();
    }
    
    public void close() {
        this.w(10000L);
    }
    
    public final h e(final Runnable runnable, final i f) {
        final long a = y4.l.f.a();
        if (runnable instanceof h) {
            final h h = (h)runnable;
            h.e = a;
            h.f = f;
            return h;
        }
        return (h)new k(runnable, a, f);
    }
    
    public void execute(final Runnable runnable) {
        i(this, runnable, null, false, 6, null);
    }
    
    public final void h(final Runnable runnable, final i i, final boolean b) {
        r4.c.a();
        final h e = this.e(runnable, i);
        final int a = e.f.a();
        final boolean b2 = false;
        final boolean b3 = a == 1;
        long addAndGet;
        if (b3) {
            addAndGet = y4.a.n.addAndGet((Object)this, 2097152L);
        }
        else {
            addAndGet = 0L;
        }
        final c f = this.f();
        final h b4 = this.B(f, e, b);
        if (b4 != null && !this.b(b4)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.h);
            sb.append(" was terminated");
            throw new RejectedExecutionException(sb.toString());
        }
        boolean b5 = b2;
        if (b) {
            b5 = b2;
            if (f != null) {
                b5 = true;
            }
        }
        if (b3) {
            this.z(addAndGet, b5);
        }
        else {
            if (b5) {
                return;
            }
            this.A();
        }
    }
    
    public final boolean j() {
        return a.o.get((Object)this) != 0;
    }
    
    public final boolean t(final c c) {
        if (c.i() != a.p) {
            return false;
        }
        final AtomicLongFieldUpdater m = a.m;
        long value;
        int h;
        do {
            value = m.get((Object)this);
            final int n = (int)(0x1FFFFFL & value);
            h = c.h();
            c.r(this.k.b(n));
        } while (!a.m.compareAndSet((Object)this, value, (2097152L + value & 0xFFFFFFFFFFE00000L) | (long)h));
        return true;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        final int a = this.k.a();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6;
        int n7;
        int n8;
        int n9;
        for (int i = 1; i < a; ++i, n = n6, n2 = n7, n3 = n8, n5 = n9) {
            final c c = (c)this.k.b(i);
            if (c == null) {
                n6 = n;
                n7 = n2;
                n8 = n3;
                n9 = n5;
            }
            else {
                final int e = c.e.e();
                final int n10 = b.a[c.g.ordinal()];
                if (n10 != 1) {
                    StringBuilder sb;
                    char c2;
                    if (n10 != 2) {
                        if (n10 != 3) {
                            if (n10 != 4) {
                                if (n10 != 5) {
                                    n6 = n;
                                    n7 = n2;
                                    n8 = n3;
                                    n9 = n5;
                                    continue;
                                }
                                n9 = n5 + 1;
                                n6 = n;
                                n7 = n2;
                                n8 = n3;
                                continue;
                            }
                            else {
                                final int n11 = n4 + 1;
                                n6 = n;
                                n7 = n2;
                                n8 = n3;
                                n4 = n11;
                                n9 = n5;
                                if (e <= 0) {
                                    continue;
                                }
                                sb = new StringBuilder();
                                sb.append(e);
                                c2 = 'd';
                                n4 = n11;
                            }
                        }
                        else {
                            ++n;
                            sb = new StringBuilder();
                            sb.append(e);
                            c2 = 'c';
                        }
                    }
                    else {
                        ++n2;
                        sb = new StringBuilder();
                        sb.append(e);
                        c2 = 'b';
                    }
                    sb.append(c2);
                    ((Collection)list).add((Object)sb.toString());
                    n6 = n;
                    n7 = n2;
                    n8 = n3;
                    n9 = n5;
                }
                else {
                    n8 = n3 + 1;
                    n9 = n5;
                    n7 = n2;
                    n6 = n;
                }
            }
        }
        final long value = y4.a.n.get((Object)this);
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(this.h);
        sb2.append('@');
        sb2.append(n0.b((Object)this));
        sb2.append("[Pool Size {core = ");
        sb2.append(this.e);
        sb2.append(", max = ");
        sb2.append(this.f);
        sb2.append("}, Worker States {CPU = ");
        sb2.append(n);
        sb2.append(", blocking = ");
        sb2.append(n2);
        sb2.append(", parked = ");
        sb2.append(n3);
        sb2.append(", dormant = ");
        sb2.append(n4);
        sb2.append(", terminated = ");
        sb2.append(n5);
        sb2.append("}, running workers queues = ");
        sb2.append((Object)list);
        sb2.append(", global CPU queue size = ");
        sb2.append(((t)this.i).c());
        sb2.append(", global blocking queue size = ");
        sb2.append(((t)this.j).c());
        sb2.append(", Control State {created workers= ");
        sb2.append((int)(0x1FFFFFL & value));
        sb2.append(", blocking tasks = ");
        sb2.append((int)((0x3FFFFE00000L & value) >> 21));
        sb2.append(", CPUs acquired = ");
        sb2.append(this.e - (int)((0x7FFFFC0000000000L & value) >> 42));
        sb2.append("}]");
        return sb2.toString();
    }
    
    public final void u(final c c, final int n, final int n2) {
        final AtomicLongFieldUpdater m = a.m;
        int l;
        long value;
        do {
            value = m.get((Object)this);
            if ((l = (int)(0x1FFFFFL & value)) == n) {
                if (n2 == 0) {
                    l = this.l(c);
                }
                else {
                    l = n2;
                }
            }
        } while (l < 0 || !a.m.compareAndSet((Object)this, value, (2097152L + value & 0xFFFFFFFFFFE00000L) | (long)l));
    }
    
    public final void v(final h h) {
        while (true) {
            final Throwable t2;
            try {
                ((Runnable)h).run();
                r4.c.a();
                return;
            }
            finally {
                final Thread thread = Thread.currentThread();
                final Thread thread3;
                final Thread thread2 = thread3 = thread;
                final Thread$UncaughtExceptionHandler thread$UncaughtExceptionHandler = thread3.getUncaughtExceptionHandler();
                final Thread thread4 = thread2;
                final Throwable t = t2;
                thread$UncaughtExceptionHandler.uncaughtException(thread4, t);
                continue;
            }
            try {
                final Thread thread = Thread.currentThread();
                final Thread thread3;
                final Thread thread2 = thread3 = thread;
                final Thread$UncaughtExceptionHandler thread$UncaughtExceptionHandler = thread3.getUncaughtExceptionHandler();
                final Thread thread4 = thread2;
                final Throwable t = t2;
                thread$UncaughtExceptionHandler.uncaughtException(thread4, t);
                continue;
            }
            finally {
                r4.c.a();
            }
            break;
        }
    }
    
    public final void w(final long n) {
        if (!a.o.compareAndSet((Object)this, 0, 1)) {
            return;
        }
        final c f = this.f();
        final c0 k = this.k;
        synchronized (k) {
            final int n2 = (int)(a().get((Object)this) & 0x1FFFFFL);
            monitorexit(k);
            if (1 <= n2) {
                int n3 = 1;
                while (true) {
                    final Object b = this.k.b(n3);
                    i4.l.b(b);
                    final c c = (c)b;
                    if (c != f) {
                        while (c.isAlive()) {
                            LockSupport.unpark((Thread)c);
                            c.join(n);
                        }
                        c.e.f(this.j);
                    }
                    if (n3 == n2) {
                        break;
                    }
                    ++n3;
                }
            }
            ((t)this.j).b();
            ((t)this.i).b();
            h g;
            while ((f != null && (g = f.g(true)) != null) || (g = (h)((t)this.i).d()) != null || (g = (h)((t)this.j).d()) != null) {
                this.v(g);
            }
            if (f != null) {
                f.u(d.i);
            }
            a.m.set((Object)this, 0L);
            a.n.set((Object)this, 0L);
        }
    }
    
    public static final class a
    {
        private a() {
        }
    }
    
    public final class c extends Thread
    {
        private static final AtomicIntegerFieldUpdater m;
        public final n e;
        private final w f;
        public d g;
        private long h;
        private long i;
        private volatile int indexInArray;
        private int j;
        public boolean k;
        final a l;
        private volatile Object nextParkedWorker;
        private volatile int workerCtl;
        
        static {
            m = AtomicIntegerFieldUpdater.newUpdater((Class)c.class, "workerCtl");
        }
        
        private c(final a l) {
            this.l = l;
            this.setDaemon(true);
            this.e = new n();
            this.f = new w();
            this.g = d.h;
            this.nextParkedWorker = a.p;
            this.j = k4.c.e.b();
        }
        
        public c(final a a, final int n) {
            this(a);
            this.q(n);
        }
        
        public static final /* synthetic */ a a(final c c) {
            return c.l;
        }
        
        private final void b(final int n) {
            if (n == 0) {
                return;
            }
            a.a().addAndGet((Object)this.l, -2097152L);
            if (this.g != d.i) {
                this.g = d.h;
            }
        }
        
        private final void c(final int n) {
            if (n == 0) {
                return;
            }
            if (this.u(d.f)) {
                this.l.A();
            }
        }
        
        private final void d(final h h) {
            final int a = h.f.a();
            this.k(a);
            this.c(a);
            this.l.v(h);
            this.b(a);
        }
        
        private final h e(final boolean b) {
            if (b) {
                final boolean b2 = this.m(this.l.e * 2) == 0;
                if (b2) {
                    final h o = this.o();
                    if (o != null) {
                        return o;
                    }
                }
                final h g = this.e.g();
                if (g != null) {
                    return g;
                }
                if (!b2) {
                    final h o2 = this.o();
                    if (o2 != null) {
                        return o2;
                    }
                }
            }
            else {
                final h o3 = this.o();
                if (o3 != null) {
                    return o3;
                }
            }
            return this.v(3);
        }
        
        private final h f() {
            h h;
            if ((h = this.e.h()) == null && (h = (h)((t)this.l.j).d()) == null) {
                h = this.v(1);
            }
            return h;
        }
        
        public static final AtomicIntegerFieldUpdater j() {
            return c.m;
        }
        
        private final void k(final int n) {
            this.h = 0L;
            if (this.g == d.g) {
                this.g = d.f;
            }
        }
        
        private final boolean l() {
            return this.nextParkedWorker != a.p;
        }
        
        private final void n() {
            if (this.h == 0L) {
                this.h = System.nanoTime() + this.l.g;
            }
            LockSupport.parkNanos(this.l.g);
            if (System.nanoTime() - this.h >= 0L) {
                this.h = 0L;
                this.w();
            }
        }
        
        private final h o() {
            y4.d d;
            if (this.m(2) == 0) {
                final h h = (h)((t)this.l.i).d();
                if (h != null) {
                    return h;
                }
                d = this.l.j;
            }
            else {
                final h h2 = (h)((t)this.l.j).d();
                if (h2 != null) {
                    return h2;
                }
                d = this.l.i;
            }
            return (h)((t)d).d();
        }
        
        private final void p() {
        Label_0000:
            while (true) {
                int n = 0;
                while (!this.l.j() && this.g != d.i) {
                    final h g = this.g(this.k);
                    if (g != null) {
                        this.i = 0L;
                        this.d(g);
                        continue Label_0000;
                    }
                    this.k = false;
                    if (this.i != 0L) {
                        if (n != 0) {
                            this.u(d.g);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.i);
                            this.i = 0L;
                            continue Label_0000;
                        }
                        n = 1;
                    }
                    else {
                        this.t();
                    }
                }
                break;
            }
            this.u(d.i);
        }
        
        private final boolean s() {
            final d g = this.g;
            final d e = d.e;
            boolean b = true;
            if (g != e) {
                final a l = this.l;
                final AtomicLongFieldUpdater a = y4.a.a();
                while (true) {
                    long value;
                    do {
                        value = a.get((Object)l);
                        if ((int)((0x7FFFFC0000000000L & value) >> 42) == 0) {
                            final boolean b2 = false;
                            if (b2) {
                                this.g = d.e;
                                return b;
                            }
                            b = false;
                            return b;
                        }
                    } while (!y4.a.a().compareAndSet((Object)l, value, value - 4398046511104L));
                    final boolean b2 = true;
                    continue;
                }
            }
            return b;
        }
        
        private final void t() {
            if (!this.l()) {
                this.l.t(this);
                return;
            }
            c.m.set((Object)this, -1);
            while (this.l() && c.m.get((Object)this) == -1 && !this.l.j() && this.g != d.i) {
                this.u(d.g);
                Thread.interrupted();
                this.n();
            }
        }
        
        private final h v(final int n) {
            final int n2 = (int)(a.a().get((Object)this.l) & 0x1FFFFFL);
            if (n2 < 2) {
                return null;
            }
            int m = this.m(n2);
            final a l = this.l;
            int i = 0;
            long j = Long.MAX_VALUE;
            while (i < n2) {
                if (++m > n2) {
                    m = 1;
                }
                final c c = (c)l.k.b(m);
                long min;
                if (c != null && c != this) {
                    final long n3 = c.e.n(n, this.f);
                    if (n3 == -1L) {
                        final w f = this.f;
                        final h h = (h)f.e;
                        f.e = null;
                        return h;
                    }
                    min = j;
                    if (n3 > 0L) {
                        min = Math.min(j, n3);
                    }
                }
                else {
                    min = j;
                }
                ++i;
                j = min;
            }
            if (j == Long.MAX_VALUE) {
                j = 0L;
            }
            this.i = j;
            return null;
        }
        
        private final void w() {
            final a l = this.l;
            final c0 k = l.k;
            synchronized (k) {
                if (l.j()) {
                    return;
                }
                if ((int)(a.a().get((Object)l) & 0x1FFFFFL) <= l.e) {
                    return;
                }
                if (!c.m.compareAndSet((Object)this, -1, 1)) {
                    return;
                }
                final int indexInArray = this.indexInArray;
                this.q(0);
                l.u(this, indexInArray, 0);
                final int n = (int)(a.a().getAndDecrement((Object)l) & 0x1FFFFFL);
                if (n != indexInArray) {
                    final Object b = l.k.b(n);
                    i4.l.b(b);
                    final c c = (c)b;
                    l.k.c(indexInArray, c);
                    c.q(indexInArray);
                    l.u(c, n, indexInArray);
                }
                l.k.c(n, null);
                final q a = q.a;
                monitorexit(k);
                this.g = d.i;
            }
        }
        
        public final h g(final boolean b) {
            if (this.s()) {
                return this.e(b);
            }
            return this.f();
        }
        
        public final int h() {
            return this.indexInArray;
        }
        
        public final Object i() {
            return this.nextParkedWorker;
        }
        
        public final int m(final int n) {
            final int j = this.j;
            final int n2 = j ^ j << 13;
            final int n3 = n2 ^ n2 >> 17;
            final int i = n3 ^ n3 << 5;
            this.j = i;
            final int n4 = n - 1;
            if ((n4 & n) == 0x0) {
                return i & n4;
            }
            return (i & Integer.MAX_VALUE) % n;
        }
        
        public final void q(final int indexInArray) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.l.h);
            sb.append("-worker-");
            String value;
            if (indexInArray == 0) {
                value = "TERMINATED";
            }
            else {
                value = String.valueOf(indexInArray);
            }
            sb.append(value);
            this.setName(sb.toString());
            this.indexInArray = indexInArray;
        }
        
        public final void r(final Object nextParkedWorker) {
            this.nextParkedWorker = nextParkedWorker;
        }
        
        public void run() {
            this.p();
        }
        
        public final boolean u(final d g) {
            final d g2 = this.g;
            final boolean b = g2 == d.e;
            if (b) {
                a.a().addAndGet((Object)this.l, 4398046511104L);
            }
            if (g2 != g) {
                this.g = g;
            }
            return b;
        }
    }
    
    public enum d
    {
        e("CPU_ACQUIRED", 0), 
        f("BLOCKING", 1), 
        g("PARKING", 2), 
        h("DORMANT", 3), 
        i("TERMINATED", 4);
        
        private static final d[] j;
        
        static {
            j = a();
        }
        
        private d(final String s, final int n) {
        }
        
        private static final /* synthetic */ d[] a() {
            return new d[] { d.e, d.f, d.g, d.h, d.i };
        }
    }
}
