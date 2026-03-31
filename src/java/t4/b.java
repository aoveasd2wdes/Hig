package t4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import w4.e;
import java.util.ArrayList;
import i4.g;
import w4.g0;
import a4.h;
import w4.q0;
import r4.n;
import u3.k$a;
import u3.k;
import i4.z;
import w4.f0;
import w4.e0;
import h4.p;
import w4.h0;
import r4.r2;
import z4.a;
import i4.m;
import h4.q;
import h4.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class b implements d
{
    private static final AtomicLongFieldUpdater h;
    private static final AtomicLongFieldUpdater i;
    private static final AtomicLongFieldUpdater j;
    private static final AtomicLongFieldUpdater k;
    private static final AtomicReferenceFieldUpdater l;
    private static final AtomicReferenceFieldUpdater m;
    private static final AtomicReferenceFieldUpdater n;
    private static final AtomicReferenceFieldUpdater o;
    private static final AtomicReferenceFieldUpdater p;
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private final int e;
    public final l f;
    private final q g;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;
    
    static {
        h = AtomicLongFieldUpdater.newUpdater((Class)b.class, "sendersAndCloseStatus");
        i = AtomicLongFieldUpdater.newUpdater((Class)b.class, "receivers");
        j = AtomicLongFieldUpdater.newUpdater((Class)b.class, "bufferEnd");
        k = AtomicLongFieldUpdater.newUpdater((Class)b.class, "completedExpandBuffersAndPauseFlag");
        l = AtomicReferenceFieldUpdater.newUpdater((Class)b.class, (Class)Object.class, "sendSegment");
        m = AtomicReferenceFieldUpdater.newUpdater((Class)b.class, (Class)Object.class, "receiveSegment");
        n = AtomicReferenceFieldUpdater.newUpdater((Class)b.class, (Class)Object.class, "bufferEndSegment");
        o = AtomicReferenceFieldUpdater.newUpdater((Class)b.class, (Class)Object.class, "_closeCause");
        p = AtomicReferenceFieldUpdater.newUpdater((Class)b.class, (Class)Object.class, "closeHandler");
    }
    
    public b(final int e, final l f) {
        this.e = e;
        this.f = f;
        if (e >= 0) {
            this.bufferEnd = c.t(e);
            this.completedExpandBuffersAndPauseFlag = this.J();
            j n = new j(0L, null, this, 3);
            this.sendSegment = n;
            this.receiveSegment = n;
            if (this.Z()) {
                n = c.n();
                i4.l.c((Object)n, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = n;
            Object g;
            if (f != null) {
                g = new q(this) {
                    final b f;
                    
                    public final l a(final a a, final Object o, final Object o2) {
                        return (l)new l(o2, this.f, a) {
                            final Object f;
                            final b g;
                            
                            public final void a(final Throwable t) {
                                if (this.f == c.z()) {
                                    return;
                                }
                                final l f = this.g.f;
                                throw null;
                            }
                        };
                    }
                };
            }
            else {
                g = null;
            }
            this.g = (q)g;
            this._closeCause = c.l();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid channel capacity: ");
        sb.append(e);
        sb.append(", should be >=0");
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    private final void A(final long n) {
        this.p0(this.C(n));
    }
    
    private final Object A0(final j j, final int n, final long n2, final Object o) {
        final Object w = j.w(n);
        if (w == null) {
            if (n2 >= (b.h.get((Object)this) & 0xFFFFFFFFFFFFFFFL)) {
                if (o == null) {
                    return c.s();
                }
                if (j.r(n, w, o)) {
                    this.F();
                    return c.r();
                }
            }
        }
        else if (w == c.d && j.r(n, w, c.f())) {
            this.F();
            return j.y(n);
        }
        return this.B0(j, n, n2, o);
    }
    
    private final Object B0(final j j, final int n, final long n2, Object a) {
        while (true) {
            final Object w = j.w(n);
            if (w != null && w != c.k()) {
                if (w == c.d) {
                    if (j.r(n, w, c.f())) {
                        this.F();
                        return j.y(n);
                    }
                    continue;
                }
                else {
                    if (w == c.j()) {
                        return c.h();
                    }
                    if (w == c.o()) {
                        return c.h();
                    }
                    if (w == c.z()) {
                        this.F();
                        return c.h();
                    }
                    if (w != c.p() && j.r(n, w, c.q())) {
                        final boolean b = w instanceof u;
                        a = w;
                        if (b) {
                            a = ((u)w).a;
                        }
                        Object o;
                        if (this.x0(a, j, n)) {
                            j.A(n, c.f());
                            this.F();
                            o = j.y(n);
                        }
                        else {
                            j.A(n, c.j());
                            j.x(n, false);
                            if (b) {
                                this.F();
                            }
                            o = c.h();
                        }
                        return o;
                    }
                    continue;
                }
            }
            else if (n2 < (b.h.get((Object)this) & 0xFFFFFFFFFFFFFFFL)) {
                if (j.r(n, w, c.o())) {
                    this.F();
                    return c.h();
                }
                continue;
            }
            else {
                if (a == null) {
                    return c.s();
                }
                if (j.r(n, w, a)) {
                    this.F();
                    return c.r();
                }
                continue;
            }
        }
    }
    
    private final j C(final long n) {
        final j w = this.w();
        if (this.Y()) {
            final long a0 = this.a0(w);
            if (a0 != -1L) {
                this.E(a0);
            }
        }
        this.v(w, n);
        return w;
    }
    
    private final int C0(final j j, int n, final Object o, final long n2, final Object o2, final boolean b) {
        j.B(n, o);
        if (b) {
            return this.D0(j, n, o, n2, o2, b);
        }
        final Object w = j.w(n);
        if (w == null) {
            if (this.t(n2)) {
                if (j.r(n, null, c.d)) {
                    return 1;
                }
            }
            else {
                if (o2 == null) {
                    return 3;
                }
                if (j.r(n, null, o2)) {
                    return 2;
                }
            }
        }
        else if (w instanceof r2) {
            j.s(n);
            if (this.w0(w, o)) {
                j.A(n, c.f());
                this.j0();
                n = 0;
            }
            else {
                if (j.t(n, c.i()) != c.i()) {
                    j.x(n, true);
                }
                n = 5;
            }
            return n;
        }
        return this.D0(j, n, o, n2, o2, b);
    }
    
    private final void D() {
        this.z();
    }
    
    private final int D0(final j j, int n, final Object o, final long n2, Object a, final boolean b) {
        while (true) {
            final Object w = j.w(n);
            final int n3 = 0;
            if (w == null) {
                if (this.t(n2) && !b) {
                    if (j.r(n, null, c.d)) {
                        return 1;
                    }
                    continue;
                }
                else if (b) {
                    if (j.r(n, null, c.j())) {
                        j.x(n, false);
                        return 4;
                    }
                    continue;
                }
                else {
                    if (a == null) {
                        return 3;
                    }
                    if (j.r(n, null, a)) {
                        return 2;
                    }
                    continue;
                }
            }
            else if (w == c.k()) {
                if (j.r(n, w, c.d)) {
                    return 1;
                }
                continue;
            }
            else {
                if (w == c.i()) {
                    j.s(n);
                    return 5;
                }
                if (w == c.o()) {
                    j.s(n);
                    return 5;
                }
                final h0 z = c.z();
                j.s(n);
                if (w == z) {
                    this.D();
                    return 4;
                }
                a = w;
                if (w instanceof u) {
                    a = ((u)w).a;
                }
                if (this.w0(a, o)) {
                    j.A(n, c.f());
                    this.j0();
                    n = n3;
                }
                else {
                    if (j.t(n, c.i()) != c.i()) {
                        j.x(n, true);
                    }
                    n = 5;
                }
                return n;
            }
        }
    }
    
    private final void E0(final long n) {
        final AtomicLongFieldUpdater i = b.i;
        long value;
        do {
            value = i.get((Object)this);
            if (value >= n) {
                return;
            }
        } while (!b.i.compareAndSet((Object)this, value, n));
    }
    
    private final void F() {
        if (this.Z()) {
            return;
        }
        j j = (j)b.n.get((Object)this);
        while (true) {
            final long andIncrement = b.j.getAndIncrement((Object)this);
            final int b = c.b;
            final long n = andIncrement / b;
            final long o = this.O();
            final long g = j.g;
            if (o <= andIncrement) {
                if (g < n && ((e)j).e() != null) {
                    this.e0(n, j);
                }
                R(this, 0L, 1, null);
                return;
            }
            j g2 = j;
            if (g != n) {
                g2 = this.G(n, j, andIncrement);
                if (g2 == null) {
                    continue;
                }
            }
            final boolean y0 = this.y0(g2, (int)(andIncrement % b), andIncrement);
            R(this, 0L, 1, null);
            j = g2;
            if (y0) {
                return;
            }
        }
    }
    
    private final void F0(final long n) {
        final AtomicLongFieldUpdater h = b.h;
        long value;
        long n2;
        do {
            value = h.get((Object)this);
            n2 = (0xFFFFFFFFFFFFFFFL & value);
            if (n2 >= n) {
                return;
            }
        } while (!b.h.compareAndSet((Object)this, value, c.b(n2, (int)(value >> 60))));
    }
    
    private final j G(final long n, j j, final long n2) {
        final AtomicReferenceFieldUpdater n3 = b.n;
        final p p3 = (p)c.y();
        Object c = null;
    Label_0062_Outer:
        while (true) {
            c = w4.d.c((e0)j, n, p3);
            if (f0.c(c)) {
                break;
            }
            final e0 b = f0.b(c);
            boolean b2 = false;
        Label_0111:
            while (true) {
                e0 e0 = null;
                Block_3: {
                    Block_2: {
                        while (true) {
                            e0 = (e0)n3.get((Object)this);
                            if (e0.g >= b.g) {
                                break;
                            }
                            if (!b.q()) {
                                break Block_2;
                            }
                            if (androidx.concurrent.futures.b.a(n3, (Object)this, (Object)e0, (Object)b)) {
                                break Block_3;
                            }
                            if (!b.m()) {
                                continue Label_0062_Outer;
                            }
                            ((e)b).k();
                        }
                        b2 = true;
                        break Label_0111;
                    }
                    b2 = false;
                    break Label_0111;
                }
                if (e0.m()) {
                    ((e)e0).k();
                }
                continue;
            }
            if (b2) {
                break;
            }
        }
        final boolean c2 = f0.c(c);
        final j i = null;
        if (c2) {
            this.D();
            this.e0(n, j);
        }
        else {
            j = (j)f0.b(c);
            final long g = j.g;
            if (g <= n) {
                return j;
            }
            final AtomicLongFieldUpdater k = b.j;
            final int b3 = t4.c.b;
            if (k.compareAndSet((Object)this, n2 + 1L, b3 * g)) {
                this.Q(j.g * b3 - n2);
                j = i;
                return j;
            }
        }
        R(this, 0L, 1, null);
        j = i;
        return j;
    }
    
    private final j H(final long n, j j) {
        final AtomicReferenceFieldUpdater m = b.m;
        final p p2 = (p)c.y();
        Object c;
        while (true) {
            c = w4.d.c((e0)j, n, p2);
            if (f0.c(c)) {
                break;
            }
            final e0 b = f0.b(c);
            int n2;
            while (true) {
                final e0 e0 = (e0)m.get((Object)this);
                final long g = e0.g;
                final long g2 = b.g;
                final boolean b2 = true;
                if (g >= g2) {
                    n2 = (b2 ? 1 : 0);
                    break;
                }
                if (!b.q()) {
                    n2 = 0;
                    break;
                }
                if (androidx.concurrent.futures.b.a(m, (Object)this, (Object)e0, (Object)b)) {
                    n2 = (b2 ? 1 : 0);
                    if (e0.m()) {
                        ((e)e0).k();
                        n2 = (b2 ? 1 : 0);
                        break;
                    }
                    break;
                }
                else {
                    if (!b.m()) {
                        continue;
                    }
                    ((e)b).k();
                }
            }
            if (n2 != 0) {
                break;
            }
        }
        final boolean c2 = f0.c(c);
        final j i = null;
        if (c2) {
            this.D();
            final j k = i;
            if (j.g * t4.c.b >= this.O()) {
                return k;
            }
        }
        else {
            j = (j)f0.b(c);
            if (!this.Z() && n <= this.J() / t4.c.b) {
                final AtomicReferenceFieldUpdater n3 = b.n;
                while (true) {
                    final e0 e2 = (e0)n3.get((Object)this);
                    if (e2.g >= j.g || !j.q()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(n3, (Object)this, (Object)e2, (Object)j)) {
                        if (e2.m()) {
                            ((e)e2).k();
                            break;
                        }
                        break;
                    }
                    else {
                        if (!j.m()) {
                            continue;
                        }
                        ((e)j).k();
                    }
                }
            }
            final long g3 = j.g;
            if (g3 <= n) {
                return j;
            }
            final int b3 = t4.c.b;
            this.E0(g3 * b3);
            final j k = i;
            if (j.g * b3 >= this.O()) {
                return k;
            }
        }
        ((e)j).b();
        return i;
    }
    
    private final j I(final long n, j j) {
        final AtomicReferenceFieldUpdater l = b.l;
        final p p2 = (p)c.y();
        Object c;
        while (true) {
            c = w4.d.c((e0)j, n, p2);
            if (f0.c(c)) {
                break;
            }
            final e0 b = f0.b(c);
            int n2;
            while (true) {
                final e0 e0 = (e0)l.get((Object)this);
                final long g = e0.g;
                final long g2 = b.g;
                final boolean b2 = true;
                if (g >= g2) {
                    n2 = (b2 ? 1 : 0);
                    break;
                }
                if (!b.q()) {
                    n2 = 0;
                    break;
                }
                if (androidx.concurrent.futures.b.a(l, (Object)this, (Object)e0, (Object)b)) {
                    n2 = (b2 ? 1 : 0);
                    if (e0.m()) {
                        ((e)e0).k();
                        n2 = (b2 ? 1 : 0);
                        break;
                    }
                    break;
                }
                else {
                    if (!b.m()) {
                        continue;
                    }
                    ((e)b).k();
                }
            }
            if (n2 != 0) {
                break;
            }
        }
        final boolean c2 = f0.c(c);
        final j i = null;
        if (c2) {
            this.D();
            final j k = i;
            if (j.g * t4.c.b >= this.M()) {
                return k;
            }
        }
        else {
            j = (j)f0.b(c);
            final long g3 = j.g;
            if (g3 <= n) {
                return j;
            }
            final int b3 = t4.c.b;
            this.F0(g3 * b3);
            final j k = i;
            if (j.g * b3 >= this.M()) {
                return k;
            }
        }
        ((e)j).b();
        return i;
    }
    
    private final long J() {
        return b.j.get((Object)this);
    }
    
    private final Throwable L() {
        Object k;
        if ((k = this.K()) == null) {
            k = new t4.m("Channel was closed");
        }
        return (Throwable)k;
    }
    
    private final void Q(final long n) {
        if ((b.k.addAndGet((Object)this, n) & 0x4000000000000000L) != 0x0L) {
            while ((b.k.get((Object)this) & 0x4000000000000000L) != 0x0L) {}
        }
    }
    
    static /* synthetic */ void R(final b b, long n, final int n2, final Object o) {
        if (o == null) {
            if ((n2 & 0x1) != 0x0) {
                n = 1L;
            }
            b.Q(n);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
    }
    
    private final void S() {
        final AtomicReferenceFieldUpdater p = b.p;
        Object value;
        h0 h0;
        do {
            value = p.get((Object)this);
            if (value == null) {
                h0 = c.d();
            }
            else {
                h0 = c.e();
            }
        } while (!androidx.concurrent.futures.b.a(p, (Object)this, value, (Object)h0));
        if (value == null) {
            return;
        }
        final l l = (l)z.a(value, 1);
        ((l)value).p((Object)this.K());
    }
    
    private final boolean T(final j j, final int n, final long n2) {
        Object w;
        do {
            w = j.w(n);
            boolean b = false;
            if (w != null && w != c.k()) {
                if (w == c.d) {
                    return true;
                }
                if (w == c.j()) {
                    return false;
                }
                if (w == c.z()) {
                    return false;
                }
                if (w == c.f()) {
                    return false;
                }
                if (w == c.o()) {
                    return false;
                }
                if (w == c.p()) {
                    return true;
                }
                if (w == c.q()) {
                    return false;
                }
                if (n2 == this.M()) {
                    b = true;
                }
                return b;
            }
        } while (!j.r(n, w, c.o()));
        this.F();
        return false;
    }
    
    private final boolean U(final long n, final boolean b) {
        final int n2 = (int)(n >> 60);
        boolean b3;
        final boolean b2 = b3 = false;
        if (n2 != 0) {
            b3 = b2;
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("unexpected close status: ");
                        sb.append(n2);
                        throw new IllegalStateException(sb.toString().toString());
                    }
                    this.A(n & 0xFFFFFFFFFFFFFFFL);
                }
                else {
                    this.C(n & 0xFFFFFFFFFFFFFFFL);
                    if (b) {
                        b3 = b2;
                        if (this.P()) {
                            return b3;
                        }
                    }
                }
                b3 = true;
            }
        }
        return b3;
    }
    
    private final boolean W(final long n) {
        return this.U(n, true);
    }
    
    private final boolean X(final long n) {
        return this.U(n, false);
    }
    
    private final boolean Z() {
        final long j = this.J();
        return j == 0L || j == Long.MAX_VALUE;
    }
    
    private final long a0(j j) {
        do {
            int n = c.b - 1;
        Label_0006:
            while (-1 < n) {
                final long n2 = j.g * c.b + n;
                if (n2 < this.M()) {
                    return -1L;
                }
                while (true) {
                    Object w;
                    do {
                        w = j.w(n);
                        if (w != null && w != c.k()) {
                            if (w == c.d) {
                                return n2;
                            }
                            --n;
                            continue Label_0006;
                        }
                    } while (!j.r(n, w, c.z()));
                    j.p();
                    continue;
                }
            }
        } while ((j = (j)((e)j).g()) != null);
        return -1L;
    }
    
    private final void b0() {
        final AtomicLongFieldUpdater h = b.h;
        long value;
        do {
            value = h.get((Object)this);
        } while ((int)(value >> 60) == 0 && !h.compareAndSet((Object)this, value, c.b(0xFFFFFFFFFFFFFFFL & value, 1)));
    }
    
    private final void c0() {
        final AtomicLongFieldUpdater h = b.h;
        long value;
        do {
            value = h.get((Object)this);
        } while (!h.compareAndSet((Object)this, value, c.b(0xFFFFFFFFFFFFFFFL & value, 3)));
    }
    
    private final void d0() {
        final AtomicLongFieldUpdater h = b.h;
        long value;
        long n;
        int n2;
        do {
            value = h.get((Object)this);
            final int n3 = (int)(value >> 60);
            if (n3 != 0) {
                if (n3 != 1) {
                    return;
                }
                n = (value & 0xFFFFFFFFFFFFFFFL);
                n2 = 3;
            }
            else {
                n = (value & 0xFFFFFFFFFFFFFFFL);
                n2 = 2;
            }
        } while (!h.compareAndSet((Object)this, value, c.b(n, n2)));
    }
    
    public static final /* synthetic */ AtomicReferenceFieldUpdater e() {
        return b.m;
    }
    
    private final void e0(long g, j j) {
        j i;
        while (true) {
            i = j;
            if (j.g >= g) {
                break;
            }
            final j k = (j)((e)j).e();
            if (k == null) {
                i = j;
                break;
            }
            j = k;
        }
        while (true) {
            if (i.h()) {
                j = (j)((e)i).e();
                if (j != null) {
                    i = j;
                    continue;
                }
            }
            final AtomicReferenceFieldUpdater n = b.n;
            int n2;
            while (true) {
                final e0 e0 = (e0)n.get((Object)this);
                final long g2 = e0.g;
                g = i.g;
                final boolean b = true;
                if (g2 >= g) {
                    n2 = (b ? 1 : 0);
                    break;
                }
                if (!i.q()) {
                    n2 = 0;
                    break;
                }
                if (androidx.concurrent.futures.b.a(n, (Object)this, (Object)e0, (Object)i)) {
                    n2 = (b ? 1 : 0);
                    if (e0.m()) {
                        ((e)e0).k();
                        n2 = (b ? 1 : 0);
                        break;
                    }
                    break;
                }
                else {
                    if (!i.m()) {
                        continue;
                    }
                    ((e)i).k();
                }
            }
            if (n2 != 0) {
                break;
            }
        }
    }
    
    public static final /* synthetic */ AtomicLongFieldUpdater f() {
        return b.i;
    }
    
    private final void g0(final r4.m m) {
        final k$a e = u3.k.e;
        ((y3.d)m).u(u3.k.a(u3.l.a(this.L())));
    }
    
    public static final /* synthetic */ AtomicReferenceFieldUpdater h() {
        return b.l;
    }
    
    private final Object h0(Object y, final y3.d d) {
        final n n = new n(z3.b.b(d), 1);
        n.B();
        final l f = this.f;
        Object o = null;
        Label_0058: {
            if (f != null) {
                o = w4.z.d(f, y, (q0)null, 2, (Object)null);
                if (o != null) {
                    u3.a.a((Throwable)o, this.N());
                    break Label_0058;
                }
            }
            o = this.N();
        }
        final k$a e = u3.k.e;
        ((y3.d)n).u(u3.k.a(u3.l.a((Throwable)o)));
        y = n.y();
        if (y == z3.b.c()) {
            a4.h.c(d);
        }
        if (y == z3.b.c()) {
            return y;
        }
        return u3.q.a;
    }
    
    public static final /* synthetic */ AtomicLongFieldUpdater i() {
        return b.h;
    }
    
    private final void i0(final Object o, final r4.m m) {
        final l f = this.f;
        if (f != null) {
            w4.z.b(f, o, ((y3.d)m).d());
        }
        final Throwable n = this.N();
        final k$a e = u3.k.e;
        ((y3.d)m).u(u3.k.a(u3.l.a(n)));
    }
    
    private final void l0(final r2 r2, final j j, final int n) {
        this.k0();
        r2.b((e0)j, n);
    }
    
    private final void m0(final r2 r2, final j j, final int n) {
        r2.b((e0)j, n + c.b);
    }
    
    static /* synthetic */ Object n0(final b b, final y3.d d) {
        j j = (j)e().get((Object)b);
        while (!b.V()) {
            final long andIncrement = f().getAndIncrement((Object)b);
            final int b2 = c.b;
            final long n = andIncrement / b2;
            final int n2 = (int)(andIncrement % b2);
            if (j.g != n) {
                final j a = b.H(n, j);
                if (a == null) {
                    continue;
                }
                j = a;
            }
            final Object p2 = b.A0(j, n2, andIncrement, null);
            if (p2 == c.r()) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (p2 == c.h()) {
                if (andIncrement >= b.O()) {
                    continue;
                }
                ((e)j).b();
            }
            else {
                if (p2 == c.s()) {
                    return b.o0(j, n2, andIncrement, d);
                }
                ((e)j).b();
                return p2;
            }
        }
        throw g0.a(b.L());
    }
    
    private final Object o0(j a, int b, long n, final y3.d d) {
        final n b2 = r4.p.b(z3.b.b(d));
        try {
            final Object p4 = this.A0(a, b, n, b2);
            Label_0352: {
                if (p4 == c.r()) {
                    this.l0((r2)b2, a, b);
                }
                else {
                    final h0 h = c.h();
                    final l l = null;
                    final r2 r2 = null;
                    h0 h2 = null;
                    l i = null;
                    Label_0283: {
                        if (p4 == h) {
                            if (n < this.O()) {
                                ((e)a).b();
                            }
                            j j = (j)e().get((Object)this);
                            while (!this.V()) {
                                final long andIncrement = f().getAndIncrement((Object)this);
                                b = c.b;
                                n = andIncrement / b;
                                b = (int)(andIncrement % b);
                                a = j;
                                if (j.g != n) {
                                    a = this.H(n, j);
                                    if (a == null) {
                                        continue;
                                    }
                                }
                                final Object p5 = this.A0(a, b, andIncrement, b2);
                                if (p5 == c.r()) {
                                    r2 r3 = r2;
                                    if (b2 instanceof r2) {
                                        r3 = (r2)b2;
                                    }
                                    if (r3 != null) {
                                        this.l0(r3, a, b);
                                    }
                                    break Label_0352;
                                }
                                else if (p5 == c.h()) {
                                    j = a;
                                    if (andIncrement >= this.O()) {
                                        continue;
                                    }
                                    ((e)a).b();
                                    j = a;
                                }
                                else {
                                    if (p5 == c.s()) {
                                        throw new IllegalStateException("unexpected".toString());
                                    }
                                    ((e)a).b();
                                    final l f = this.f;
                                    h2 = (h0)p5;
                                    i = l;
                                    if (f != null) {
                                        i = w4.z.a(f, p5, b2.d());
                                        h2 = (h0)p5;
                                    }
                                    break Label_0283;
                                }
                            }
                            this.g0((r4.m)b2);
                            break Label_0352;
                        }
                        ((e)a).b();
                        final l f2 = this.f;
                        h2 = (h0)p4;
                        i = l;
                        if (f2 != null) {
                            i = w4.z.a(f2, p4, b2.d());
                            h2 = (h0)p4;
                        }
                    }
                    b2.K(h2, i);
                }
            }
            final Object y = b2.y();
            if (y == z3.b.c()) {
                a4.h.c(d);
            }
            return y;
        }
        finally {
            b2.M();
        }
    }
    
    private final void p0(final j j) {
        final l f = this.f;
        q0 q0 = null;
        Object b = w4.n.b((Object)null, 1, (g)null);
        j i = j;
        j k;
        Object o = null;
        q0 q2 = null;
    Label_0349:
        do {
            int n = c.b - 1;
            o = b;
            q2 = q0;
            while (-1 < n) {
                final long n2 = i.g * c.b + n;
                while (true) {
                    final Object w = i.w(n);
                    if (w != c.f()) {
                        Label_0317: {
                            Label_0142: {
                                q0 q3;
                                Object c;
                                if (w == t4.c.d) {
                                    if (n2 < this.M()) {
                                        break Label_0349;
                                    }
                                    if (!i.r(n, w, t4.c.z())) {
                                        continue;
                                    }
                                    q3 = q2;
                                    c = o;
                                    if (f != null) {
                                        q3 = w4.z.c(f, i.v(n), q2);
                                        c = o;
                                    }
                                }
                                else if (w != t4.c.k() && w != null) {
                                    if (!(w instanceof r2) && !(w instanceof u)) {
                                        if (w == t4.c.p()) {
                                            break Label_0349;
                                        }
                                        if (w == t4.c.q()) {
                                            break Label_0349;
                                        }
                                        if (w != t4.c.p()) {
                                            break Label_0317;
                                        }
                                        continue;
                                    }
                                    else {
                                        if (n2 < this.M()) {
                                            break Label_0349;
                                        }
                                        r2 a;
                                        if (w instanceof u) {
                                            a = ((u)w).a;
                                        }
                                        else {
                                            a = (r2)w;
                                        }
                                        if (!i.r(n, w, t4.c.z())) {
                                            continue;
                                        }
                                        q3 = q2;
                                        if (f != null) {
                                            q3 = w4.z.c(f, i.v(n), q2);
                                        }
                                        c = w4.n.c(o, (Object)a);
                                    }
                                }
                                else {
                                    if (i.r(n, w, t4.c.z())) {
                                        break Label_0142;
                                    }
                                    continue;
                                }
                                i.s(n);
                                o = c;
                                q2 = q3;
                            }
                            i.p();
                        }
                        --n;
                        break;
                    }
                    break Label_0349;
                }
            }
            k = (j)((e)i).g();
            q0 = q2;
            b = o;
        } while ((i = k) != null);
        if (o != null) {
            if (!(o instanceof ArrayList)) {
                this.r0((r2)o);
            }
            else {
                i4.l.c(o, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                final ArrayList list = (ArrayList)o;
                for (int n3 = list.size() - 1; -1 < n3; --n3) {
                    this.r0((r2)list.get(n3));
                }
            }
        }
        if (q2 == null) {
            return;
        }
        throw q2;
    }
    
    private final void q0(final r2 r2) {
        this.s0(r2, true);
    }
    
    private final void r0(final r2 r2) {
        this.s0(r2, false);
    }
    
    private final void s0(final r2 r2, final boolean b) {
        if (r2 instanceof r4.m) {
            final y3.d d = (y3.d)r2;
            final k$a e = u3.k.e;
            Throwable t;
            if (b) {
                t = this.L();
            }
            else {
                t = this.N();
            }
            d.u(u3.k.a(u3.l.a(t)));
        }
        else {
            if (!(r2 instanceof b.b$a)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unexpected waiter: ");
                sb.append((Object)r2);
                throw new IllegalStateException(sb.toString().toString());
            }
            ((b.b$a)r2).j();
        }
    }
    
    private final boolean t(final long n) {
        return n < this.J() || n < this.M() + this.e;
    }
    
    static /* synthetic */ Object t0(final b b, final Object o, final y3.d d) {
        j j = (j)h().get((Object)b);
        while (true) {
            final long andIncrement = i().getAndIncrement((Object)b);
            final long n = andIncrement & 0xFFFFFFFFFFFFFFFL;
            final boolean i = b.X(andIncrement);
            final int b2 = c.b;
            final long n2 = n / b2;
            final int n3 = (int)(n % b2);
            if (j.g != n2) {
                final j c = b.I(n2, j);
                if (c == null) {
                    if (!i) {
                        continue;
                    }
                    final Object h0 = b.h0(o, d);
                    if (h0 == z3.b.c()) {
                        return h0;
                    }
                    break;
                }
                else {
                    j = c;
                }
            }
            final int s = b.C0(j, n3, o, n, null, i);
            if (s == 0) {
                ((e)j).b();
                break;
            }
            if (s == 1) {
                break;
            }
            if (s != 2) {
                if (s != 3) {
                    if (s != 4) {
                        if (s != 5) {
                            continue;
                        }
                        ((e)j).b();
                    }
                    else {
                        if (n < b.M()) {
                            ((e)j).b();
                        }
                        final Object h2 = b.h0(o, d);
                        if (h2 == z3.b.c()) {
                            return h2;
                        }
                        break;
                    }
                }
                else {
                    final Object u0 = b.u0(j, n3, o, n, d);
                    if (u0 == z3.b.c()) {
                        return u0;
                    }
                    break;
                }
            }
            else {
                if (!i) {
                    break;
                }
                j.p();
                final Object h3 = b.h0(o, d);
                if (h3 == z3.b.c()) {
                    return h3;
                }
                break;
            }
        }
        return u3.q.a;
    }
    
    private final Object u0(j j, int b, final Object o, long n, final y3.d d) {
        final n b2 = r4.p.b(z3.b.b(d));
        try {
            final int s = this.C0(j, b, o, n, b2, false);
            Label_0407: {
                Object o3 = null;
                Label_0302: {
                    if (s != 0) {
                        if (s != 1) {
                            if (s != 2) {
                                Label_0140: {
                                    if (s != 4) {
                                        if (s == 5) {
                                            ((e)j).b();
                                            j = (j)h().get((Object)this);
                                            Label_0313: {
                                                Label_0291: {
                                                    boolean i = false;
                                                    Label_0249: {
                                                        while (true) {
                                                            final long andIncrement = i().getAndIncrement((Object)this);
                                                            n = (andIncrement & 0xFFFFFFFFFFFFFFFL);
                                                            i = this.X(andIncrement);
                                                            b = c.b;
                                                            final long n2 = n / b;
                                                            b = (int)(n % b);
                                                            if (j.g != n2) {
                                                                final j c = this.I(n2, j);
                                                                if (c == null) {
                                                                    if (i) {
                                                                        break Label_0140;
                                                                    }
                                                                    continue;
                                                                }
                                                                else {
                                                                    j = c;
                                                                }
                                                            }
                                                            final int s2 = this.C0(j, b, o, n, b2, i);
                                                            if (s2 == 0) {
                                                                break Label_0313;
                                                            }
                                                            if (s2 == 1) {
                                                                break Label_0291;
                                                            }
                                                            if (s2 == 2) {
                                                                break Label_0249;
                                                            }
                                                            if (s2 == 3) {
                                                                throw new IllegalStateException("unexpected".toString());
                                                            }
                                                            if (s2 == 4) {
                                                                break;
                                                            }
                                                            if (s2 != 5) {
                                                                continue;
                                                            }
                                                            ((e)j).b();
                                                        }
                                                        if (n < this.M()) {
                                                            ((e)j).b();
                                                        }
                                                        break Label_0140;
                                                    }
                                                    if (i) {
                                                        j.p();
                                                        break Label_0140;
                                                    }
                                                    Object o2;
                                                    if (b2 instanceof r2) {
                                                        o2 = b2;
                                                    }
                                                    else {
                                                        o2 = null;
                                                    }
                                                    if (o2 != null) {
                                                        this.m0((r2)o2, j, b);
                                                    }
                                                    break Label_0407;
                                                }
                                                final k$a e = u3.k.e;
                                                o3 = u3.k.a((Object)u3.q.a);
                                                break Label_0302;
                                            }
                                            ((e)j).b();
                                            final k$a e2 = u3.k.e;
                                            o3 = u3.k.a((Object)u3.q.a);
                                            break Label_0302;
                                        }
                                        throw new IllegalStateException("unexpected".toString());
                                    }
                                    else if (n < this.M()) {
                                        ((e)j).b();
                                    }
                                }
                                this.i0(o, (r4.m)b2);
                                break Label_0407;
                            }
                            this.m0((r2)b2, j, b);
                            break Label_0407;
                        }
                        else {
                            final k$a e3 = u3.k.e;
                            o3 = u3.k.a((Object)u3.q.a);
                        }
                    }
                    else {
                        ((e)j).b();
                        final k$a e4 = u3.k.e;
                        o3 = u3.k.a((Object)u3.q.a);
                    }
                }
                ((y3.d)b2).u(o3);
            }
            final Object y = b2.y();
            if (y == z3.b.c()) {
                a4.h.c(d);
            }
            if (y == z3.b.c()) {
                return y;
            }
            return u3.q.a;
        }
        finally {
            b2.M();
        }
    }
    
    private final void v(final j j, final long n) {
        final Object b = w4.n.b((Object)null, 1, (g)null);
        j i = j;
        Object o = b;
        Object o2 = null;
    Label_0212:
        while (true) {
            o2 = o;
            if (i == null) {
                break;
            }
            Object c;
            for (int n2 = t4.c.b - 1; -1 < n2; --n2, o = c) {
                o2 = o;
                if (i.g * t4.c.b + n2 < n) {
                    break Label_0212;
                }
                while (true) {
                    final Object w = i.w(n2);
                    if (w != null && w != t4.c.k()) {
                        Object a;
                        if (w instanceof u) {
                            if (!i.r(n2, w, t4.c.z())) {
                                continue;
                            }
                            a = ((u)w).a;
                        }
                        else {
                            c = o;
                            if (!(w instanceof r2)) {
                                break;
                            }
                            if (!i.r(n2, w, t4.c.z())) {
                                continue;
                            }
                            a = w;
                        }
                        c = w4.n.c(o, a);
                        i.x(n2, true);
                        break;
                    }
                    if (i.r(n2, w, t4.c.z())) {
                        i.p();
                        c = o;
                        break;
                    }
                }
            }
            i = (j)((e)i).g();
        }
        if (o2 != null) {
            if (!(o2 instanceof ArrayList)) {
                this.q0((r2)o2);
            }
            else {
                i4.l.c(o2, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                final ArrayList list = (ArrayList)o2;
                for (int n3 = list.size() - 1; -1 < n3; --n3) {
                    this.q0((r2)list.get(n3));
                }
            }
        }
    }
    
    private final boolean v0(final long n) {
        return !this.X(n) && (this.t(n & 0xFFFFFFFFFFFFFFFL) ^ true);
    }
    
    private final j w() {
        final Object value = b.n.get((Object)this);
        final j j = (j)b.l.get((Object)this);
        Object o = value;
        if (j.g > ((j)value).g) {
            o = j;
        }
        final j i = (j)b.m.get((Object)this);
        Object o2 = o;
        if (i.g > ((j)o).g) {
            o2 = i;
        }
        return (j)w4.d.b((e)o2);
    }
    
    private final boolean w0(final Object o, final Object o2) {
        boolean b;
        if (o instanceof b.b$a) {
            i4.l.c(o, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            b = ((b.b$a)o).i(o2);
        }
        else {
            if (!(o instanceof r4.m)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unexpected receiver type: ");
                sb.append(o);
                throw new IllegalStateException(sb.toString().toString());
            }
            i4.l.c(o, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            final r4.m m = (r4.m)o;
            final l f = this.f;
            l a;
            if (f != null) {
                a = w4.z.a(f, o2, ((y3.d)m).d());
            }
            else {
                a = null;
            }
            b = c.u(m, o2, a);
        }
        return b;
    }
    
    private final boolean x0(final Object o, final j j, final int n) {
        if (o instanceof r4.m) {
            i4.l.c(o, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return c.C((r4.m)o, (Object)u3.q.a, (l)null, 2, (Object)null);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected waiter: ");
        sb.append(o);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    private final boolean y0(final j j, final int n, final long n2) {
        final Object w = j.w(n);
        if (w instanceof r2 && n2 >= b.i.get((Object)this) && j.r(n, w, c.p())) {
            boolean b;
            if (this.x0(w, j, n)) {
                j.A(n, c.d);
                b = true;
            }
            else {
                j.A(n, c.j());
                j.x(n, false);
                b = false;
            }
            return b;
        }
        return this.z0(j, n, n2);
    }
    
    private final boolean z0(final j j, final int n, final long n2) {
        while (true) {
            final Object w = j.w(n);
            final boolean b = w instanceof r2;
            boolean b2 = false;
            if (b) {
                if (n2 < t4.b.i.get((Object)this)) {
                    if (j.r(n, w, new u((r2)w))) {
                        return true;
                    }
                    continue;
                }
                else {
                    if (j.r(n, w, c.p())) {
                        if (this.x0(w, j, n)) {
                            j.A(n, c.d);
                            b2 = true;
                        }
                        else {
                            j.A(n, c.j());
                            j.x(n, false);
                        }
                        return b2;
                    }
                    continue;
                }
            }
            else {
                if (w == c.j()) {
                    return false;
                }
                if (w == null) {
                    if (j.r(n, w, c.k())) {
                        return true;
                    }
                    continue;
                }
                else {
                    if (w == c.d) {
                        return true;
                    }
                    if (w == c.o() || w == c.f() || w == c.i()) {
                        return true;
                    }
                    if (w == c.z()) {
                        return true;
                    }
                    if (w == c.q()) {
                        continue;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected cell state: ");
                    sb.append(w);
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
        }
    }
    
    public Object B(final Object o, final y3.d d) {
        return t0(this, o, d);
    }
    
    protected final void E(final long n) {
        Object o = b.m.get((Object)this);
        while (true) {
            final AtomicLongFieldUpdater i = b.i;
            final long value = i.get((Object)this);
            if (n < Math.max(this.e + value, this.J())) {
                return;
            }
            if (!i.compareAndSet((Object)this, value, value + 1L)) {
                continue;
            }
            final int b = c.b;
            final long n2 = value / b;
            final int n3 = (int)(value % b);
            Object h = o;
            if (((e0)o).g != n2) {
                h = this.H(n2, (j)o);
                if (h == null) {
                    continue;
                }
            }
            final Object a0 = this.A0((j)h, n3, value, null);
            if (a0 == c.h()) {
                o = h;
                if (value >= this.O()) {
                    continue;
                }
                ((e)h).b();
                o = h;
            }
            else {
                ((e)h).b();
                final l f = this.f;
                o = h;
                if (f == null) {
                    continue;
                }
                final q0 d = w4.z.d(f, a0, (q0)null, 2, (Object)null);
                if (d != null) {
                    throw d;
                }
                o = h;
            }
        }
    }
    
    public final void G0(long n) {
        if (this.Z()) {
            return;
        }
        while (this.J() <= n) {}
        for (int g = c.g(), i = 0; i < g; ++i) {
            n = this.J();
            if (n == (b.k.get((Object)this) & 0x3FFFFFFFFFFFFFFFL) && n == this.J()) {
                return;
            }
        }
        final AtomicLongFieldUpdater k = b.k;
        do {
            n = k.get((Object)this);
        } while (!k.compareAndSet((Object)this, n, c.a(n & 0x3FFFFFFFFFFFFFFFL, true)));
        AtomicLongFieldUpdater l;
        while (true) {
            final long j = this.J();
            l = b.k;
            n = l.get((Object)this);
            final long n2 = n & 0x3FFFFFFFFFFFFFFFL;
            final boolean b = (0x4000000000000000L & n) != 0x0L;
            if (j == n2 && j == this.J()) {
                break;
            }
            if (b) {
                continue;
            }
            l.compareAndSet((Object)this, n, c.a(n2, true));
        }
        do {
            n = l.get((Object)this);
        } while (!l.compareAndSet((Object)this, n, c.a(n & 0x3FFFFFFFFFFFFFFFL, false)));
    }
    
    protected final Throwable K() {
        return (Throwable)b.o.get((Object)this);
    }
    
    public final long M() {
        return b.i.get((Object)this);
    }
    
    protected final Throwable N() {
        Object k;
        if ((k = this.K()) == null) {
            k = new t4.n("Channel was closed");
        }
        return (Throwable)k;
    }
    
    public final long O() {
        return b.h.get((Object)this) & 0xFFFFFFFFFFFFFFFL;
    }
    
    public final boolean P() {
        while (true) {
            final AtomicReferenceFieldUpdater m = b.m;
            final j j = (j)m.get((Object)this);
            final long i = this.M();
            if (this.O() <= i) {
                return false;
            }
            final int b = c.b;
            final long n = i / b;
            j h = j;
            if (j.g != n && (h = this.H(n, j)) == null) {
                if (((j)m.get((Object)this)).g < n) {
                    return false;
                }
                continue;
            }
            else {
                ((e)h).b();
                if (this.T(h, (int)(i % b), i)) {
                    return true;
                }
                t4.b.i.compareAndSet((Object)this, i, i + 1L);
            }
        }
    }
    
    public boolean V() {
        return this.W(b.h.get((Object)this));
    }
    
    protected boolean Y() {
        return false;
    }
    
    public final void b(final CancellationException ex) {
        this.u((Throwable)ex);
    }
    
    protected void f0() {
    }
    
    public Object g(final y3.d d) {
        return n0(this, d);
    }
    
    public f iterator() {
        return (f)new b.b$a(this);
    }
    
    protected void j0() {
    }
    
    protected void k0() {
    }
    
    public Object o() {
        final long value = b.i.get((Object)this);
        final long value2 = b.h.get((Object)this);
        if (this.W(value2)) {
            return t4.h.a.a(this.K());
        }
        if (value >= (value2 & 0xFFFFFFFFFFFFFFFL)) {
            return t4.h.a.b();
        }
        final h0 i = c.i();
        j j = (j)e().get((Object)this);
        while (!this.V()) {
            final long andIncrement = f().getAndIncrement((Object)this);
            final int b = c.b;
            final long n = andIncrement / b;
            final int n2 = (int)(andIncrement % b);
            if (j.g != n) {
                final j a = this.H(n, j);
                if (a == null) {
                    continue;
                }
                j = a;
            }
            final Object p = this.A0(j, n2, andIncrement, i);
            Object o;
            if (p == c.r()) {
                r2 r2;
                if (i instanceof r2) {
                    r2 = (r2)i;
                }
                else {
                    r2 = null;
                }
                if (r2 != null) {
                    this.l0(r2, j, n2);
                }
                this.G0(andIncrement);
                j.p();
                o = t4.h.a.b();
            }
            else {
                if (p == c.h()) {
                    if (andIncrement >= this.O()) {
                        continue;
                    }
                    ((e)j).b();
                    continue;
                }
                if (p == c.s()) {
                    throw new IllegalStateException("unexpected".toString());
                }
                ((e)j).b();
                o = t4.h.a.c(p);
            }
            return o;
        }
        return t4.h.a.a(this.K());
    }
    
    public boolean q(final Throwable t) {
        return this.x(t, false);
    }
    
    public Object r(Object o) {
        if (this.v0(b.h.get((Object)this))) {
            return t4.h.a.b();
        }
        final h0 j = c.j();
        j i = (j)h().get((Object)this);
        while (true) {
            final long andIncrement = i().getAndIncrement((Object)this);
            final long n = andIncrement & 0xFFFFFFFFFFFFFFFL;
            final boolean k = this.X(andIncrement);
            final int b = c.b;
            final long n2 = n / b;
            final int n3 = (int)(n % b);
            if (i.g != n2) {
                final j c = this.I(n2, i);
                if (c == null) {
                    if (k) {
                        return t4.h.a.a(this.N());
                    }
                    continue;
                }
                else {
                    i = c;
                }
            }
            final int s = this.C0(i, n3, o, n, j, k);
            if (s == 0) {
                ((e)i).b();
                break;
            }
            if (s == 1) {
                break;
            }
            if (s != 2) {
                if (s == 3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                if (s != 4) {
                    if (s != 5) {
                        continue;
                    }
                    ((e)i).b();
                    continue;
                }
                if (n < this.M()) {
                    ((e)i).b();
                }
            }
            else {
                if (!k) {
                    r2 r2;
                    if (j instanceof r2) {
                        r2 = (r2)j;
                    }
                    else {
                        r2 = null;
                    }
                    if (r2 != null) {
                        this.m0(r2, i, n3);
                    }
                    i.p();
                    o = t4.h.a.b();
                    return o;
                }
                i.p();
            }
            o = t4.h.a.a(this.N());
            return o;
        }
        o = t4.h.a.c((Object)u3.q.a);
        return o;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        final int n = (int)(b.h.get((Object)this) >> 60);
        Label_0055: {
            String s;
            if (n != 2) {
                if (n != 3) {
                    break Label_0055;
                }
                s = "cancelled,";
            }
            else {
                s = "closed,";
            }
            sb.append(s);
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("capacity=");
        sb2.append(this.e);
        sb2.append(',');
        sb.append(sb2.toString());
        sb.append("data=[");
        final List j = v3.l.j((Object[])new j[] { (j)b.m.get((Object)this), (j)b.l.get((Object)this), (j)b.n.get((Object)this) });
        final ArrayList list = new ArrayList();
        for (final Object next : j) {
            if (next != c.n()) {
                ((Collection)list).add(next);
            }
        }
        final Iterator iterator2 = ((Iterable)list).iterator();
        if (iterator2.hasNext()) {
            Object next2 = iterator2.next();
            Object o;
            if (!iterator2.hasNext()) {
                o = next2;
            }
            else {
                long g = ((j)next2).g;
                do {
                    final Object next3 = iterator2.next();
                    final long g2 = ((j)next3).g;
                    o = next2;
                    long n2 = g;
                    if (g > g2) {
                        o = next3;
                        n2 = g2;
                    }
                    next2 = o;
                    g = n2;
                } while (iterator2.hasNext());
            }
            j i = (j)o;
            final long m = this.M();
            final long o2 = this.O();
        Label_0831:
            do {
                for (int b = c.b, k = 0; k < b; ++k) {
                    final long n3 = i.g * c.b + k;
                    final long n4 = lcmp(n3, o2);
                    if (n4 >= 0 && n3 >= m) {
                        break Label_0831;
                    }
                    final Object w = i.w(k);
                    final Object v = i.v(k);
                    String s2;
                    if (w instanceof r4.m) {
                        final long n5 = lcmp(n3, m);
                        if (n5 < 0 && n4 >= 0) {
                            s2 = "receive";
                        }
                        else if (n4 < 0 && n5 >= 0) {
                            s2 = "send";
                        }
                        else {
                            s2 = "cont";
                        }
                    }
                    else if (w instanceof u) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("EB(");
                        sb3.append(w);
                        sb3.append(')');
                        s2 = sb3.toString();
                    }
                    else if (i4.l.a(w, (Object)c.q()) || i4.l.a(w, (Object)c.p())) {
                        s2 = "resuming_sender";
                    }
                    else {
                        if (w == null || i4.l.a(w, (Object)c.k()) || i4.l.a(w, (Object)c.f()) || i4.l.a(w, (Object)c.o()) || i4.l.a(w, (Object)c.i()) || i4.l.a(w, (Object)c.j()) || i4.l.a(w, (Object)c.z())) {
                            continue;
                        }
                        s2 = w.toString();
                    }
                    String s3;
                    if (v != null) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append('(');
                        sb4.append(s2);
                        sb4.append(',');
                        sb4.append(v);
                        sb4.append("),");
                        s3 = sb4.toString();
                    }
                    else {
                        final StringBuilder sb5 = new StringBuilder();
                        sb5.append(s2);
                        sb5.append(',');
                        s3 = sb5.toString();
                    }
                    sb.append(s3);
                }
                i = (j)((e)i).e();
            } while (i != null);
            if (p4.f.f0((CharSequence)sb) == ',') {
                i4.l.d((Object)sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
            }
            sb.append("]");
            return sb.toString();
        }
        throw new NoSuchElementException();
    }
    
    public boolean u(final Throwable t) {
        Object o = t;
        if (t == null) {
            o = new CancellationException("Channel was cancelled");
        }
        return this.x((Throwable)o, true);
    }
    
    protected boolean x(final Throwable t, final boolean b) {
        if (b) {
            this.b0();
        }
        final boolean a = b.a(b.o, (Object)this, (Object)c.l(), (Object)t);
        if (b) {
            this.c0();
        }
        else {
            this.d0();
        }
        this.D();
        this.f0();
        if (a) {
            this.S();
        }
        return a;
    }
    
    public void y(final l l) {
        final AtomicReferenceFieldUpdater p = b.p;
        if (androidx.concurrent.futures.b.a(p, (Object)this, (Object)null, (Object)l)) {
            return;
        }
        do {
            final Object value = p.get((Object)this);
            if (value == c.d()) {
                continue;
            }
            if (value == c.e()) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Another handler is already registered: ");
            sb.append(value);
            throw new IllegalStateException(sb.toString().toString());
        } while (!androidx.concurrent.futures.b.a(b.p, (Object)this, (Object)c.d(), (Object)c.e()));
        l.p((Object)this.K());
    }
    
    public boolean z() {
        return this.X(b.h.get((Object)this));
    }
}
