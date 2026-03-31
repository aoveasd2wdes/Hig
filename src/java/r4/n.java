package r4;

import java.util.concurrent.CancellationException;
import w4.h0;
import w4.j;
import w4.e0;
import androidx.concurrent.futures.b;
import h4.l;
import y3.g$c;
import y3.g;
import y3.d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import a4.e;

public class n extends u0 implements m, e, r2
{
    private static final AtomicIntegerFieldUpdater j;
    private static final AtomicReferenceFieldUpdater k;
    private static final AtomicReferenceFieldUpdater l;
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;
    private final d h;
    private final g i;
    
    static {
        j = AtomicIntegerFieldUpdater.newUpdater((Class)n.class, "_decisionAndIndex");
        k = AtomicReferenceFieldUpdater.newUpdater((Class)n.class, (Class)Object.class, "_state");
        l = AtomicReferenceFieldUpdater.newUpdater((Class)n.class, (Class)Object.class, "_parentHandle");
    }
    
    public n(final d h, final int n) {
        super(n);
        this.h = h;
        this.i = h.d();
        this._decisionAndIndex = 536870911;
        this._state = r4.d.e;
    }
    
    private final String A() {
        final Object z = this.z();
        String s;
        if (z instanceof e2) {
            s = "Active";
        }
        else if (z instanceof q) {
            s = "Cancelled";
        }
        else {
            s = "Completed";
        }
        return s;
    }
    
    private final x0 C() {
        final q1 q1 = (q1)this.d().a((g$c)r4.q1.b);
        if (q1 == null) {
            return null;
        }
        final x0 d = q1$a.d(q1, true, false, (l)new r(this), 2, (Object)null);
        b.a(n.l, (Object)this, (Object)null, (Object)d);
        return d;
    }
    
    private final void D(final Object o) {
        final AtomicReferenceFieldUpdater k = n.k;
        while (true) {
            final Object value = k.get((Object)this);
            if (value instanceof r4.d) {
                if (b.a(n.k, (Object)this, value, o)) {
                    return;
                }
                continue;
            }
            else if (value instanceof k || value instanceof e0) {
                this.H(o, value);
            }
            else {
                final boolean b = value instanceof a0;
                if (b) {
                    a0 a0 = (a0)value;
                    if (!a0.b()) {
                        this.H(o, value);
                    }
                    if (value instanceof q) {
                        Throwable a2 = null;
                        if (!b) {
                            a0 = null;
                        }
                        if (a0 != null) {
                            a2 = a0.a;
                        }
                        if (o instanceof k) {
                            this.j((k)o, a2);
                        }
                        else {
                            i4.l.c(o, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            this.o((e0)o, a2);
                        }
                    }
                    return;
                }
                if (value instanceof z) {
                    final z z = (z)value;
                    if (z.b != null) {
                        this.H(o, value);
                    }
                    if (o instanceof e0) {
                        return;
                    }
                    i4.l.c(o, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    final k i = (k)o;
                    if (z.c()) {
                        this.j(i, z.e);
                        return;
                    }
                    if (androidx.concurrent.futures.b.a(n.k, (Object)this, value, (Object)r4.z.b(z, (Object)null, i, (l)null, (Object)null, (Throwable)null, 29, (Object)null))) {
                        return;
                    }
                    continue;
                }
                else {
                    if (o instanceof e0) {
                        return;
                    }
                    i4.l.c(o, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.b.a(n.k, (Object)this, value, (Object)new z(value, (k)o, (l)null, (Object)null, (Throwable)null, 28, (i4.g)null))) {
                        return;
                    }
                    continue;
                }
            }
        }
    }
    
    private final boolean F() {
        if (v0.c(super.g)) {
            final d h = this.h;
            i4.l.c((Object)h, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((j)h).o()) {
                return true;
            }
        }
        return false;
    }
    
    private final k G(final l l) {
        k k;
        if (l instanceof k) {
            k = (k)l;
        }
        else {
            k = new n1(l);
        }
        return k;
    }
    
    private final void H(final Object o, final Object o2) {
        final StringBuilder sb = new StringBuilder();
        sb.append("It's prohibited to register multiple handlers, tried to register ");
        sb.append(o);
        sb.append(", already has ");
        sb.append(o2);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    private final void O(final Object o, final int n, final l l) {
        final AtomicReferenceFieldUpdater k = n.k;
        Object value;
        do {
            value = k.get((Object)this);
            if (value instanceof e2) {
                continue;
            }
            if (value instanceof q) {
                final q q = (q)value;
                if (q.c()) {
                    if (l != null) {
                        this.l(l, ((a0)q).a);
                    }
                    return;
                }
            }
            this.i(o);
            throw new u3.d();
        } while (!b.a(n.k, (Object)this, value, this.Q((e2)value, o, n, l, null)));
        this.s();
        this.t(n);
    }
    
    static /* synthetic */ void P(final n n, final Object o, final int n2, l l, final int n3, final Object o2) {
        if (o2 == null) {
            if ((n3 & 0x4) != 0x0) {
                l = null;
            }
            n.O(o, n2, l);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }
    
    private final Object Q(final e2 e2, final Object o, final int n, final l l, final Object o2) {
        Object o3;
        if (o instanceof a0) {
            o3 = o;
        }
        else if (!v0.b(n) && o2 == null) {
            o3 = o;
        }
        else {
            if (l == null && !(e2 instanceof k)) {
                o3 = o;
                if (o2 == null) {
                    return o3;
                }
            }
            k k;
            if (e2 instanceof k) {
                k = (k)e2;
            }
            else {
                k = null;
            }
            o3 = new z(o, k, l, o2, (Throwable)null, 16, (i4.g)null);
        }
        return o3;
    }
    
    private final boolean R() {
        final AtomicIntegerFieldUpdater j = n.j;
        int value;
        do {
            value = j.get((Object)this);
            final int n = value >> 29;
            if (n != 0) {
                if (n == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!n.j.compareAndSet((Object)this, value, 1073741824 + (0x1FFFFFFF & value)));
        return true;
    }
    
    private final h0 S(final Object o, final Object o2, final l l) {
        final AtomicReferenceFieldUpdater k = n.k;
        Object value;
        do {
            value = k.get((Object)this);
            if (value instanceof e2) {
                continue;
            }
            final boolean b = value instanceof z;
            h0 a;
            final h0 h0 = a = null;
            if (b) {
                a = h0;
                if (o2 != null) {
                    a = h0;
                    if (((z)value).d == o2) {
                        a = o.a;
                    }
                }
            }
            return a;
        } while (!b.a(n.k, (Object)this, value, this.Q((e2)value, o, super.g, l, o2)));
        this.s();
        return o.a;
    }
    
    private final boolean T() {
        final AtomicIntegerFieldUpdater j = n.j;
        int value;
        do {
            value = j.get((Object)this);
            final int n = value >> 29;
            if (n != 0) {
                if (n == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!n.j.compareAndSet((Object)this, value, 536870912 + (0x1FFFFFFF & value)));
        return true;
    }
    
    private final Void i(final Object o) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Already resumed, but proposed with update ");
        sb.append(o);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    private final void o(final e0 e0, final Throwable t) {
        final int n = r4.n.j.get((Object)this) & 0x1FFFFFFF;
        if (n != 536870911) {
            try {
                e0.o(n, t, this.d());
            }
            finally {
                final g d = this.d();
                final StringBuilder sb = new StringBuilder();
                sb.append("Exception in invokeOnCancellation handler for ");
                sb.append((Object)this);
                final Throwable t2;
                i0.a(d, (Throwable)new d0(sb.toString(), t2));
            }
            return;
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
    }
    
    private final boolean q(final Throwable t) {
        if (!this.F()) {
            return false;
        }
        final d h = this.h;
        i4.l.c((Object)h, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((j)h).p(t);
    }
    
    private final void s() {
        if (!this.F()) {
            this.r();
        }
    }
    
    private final void t(final int n) {
        if (this.R()) {
            return;
        }
        v0.a((u0)this, n);
    }
    
    private final x0 w() {
        return (x0)n.l.get((Object)this);
    }
    
    public void B() {
        final x0 c = this.C();
        if (c == null) {
            return;
        }
        if (this.E()) {
            c.a();
            n.l.set((Object)this, (Object)d2.e);
        }
    }
    
    public boolean E() {
        return this.z() instanceof e2 ^ true;
    }
    
    protected String I() {
        return "CancellableContinuation";
    }
    
    public void J(final Object o) {
        this.t(super.g);
    }
    
    public void K(final Object o, final l l) {
        this.O(o, super.g, l);
    }
    
    public final void L(final Throwable t) {
        if (this.q(t)) {
            return;
        }
        this.p(t);
        this.s();
    }
    
    public final void M() {
        final d h = this.h;
        j j;
        if (h instanceof j) {
            j = (j)h;
        }
        else {
            j = null;
        }
        if (j != null) {
            final Throwable r = j.r((m)this);
            if (r != null) {
                this.r();
                this.p(r);
            }
        }
    }
    
    public final boolean N() {
        final AtomicReferenceFieldUpdater k = n.k;
        final Object value = k.get((Object)this);
        if (value instanceof z && ((z)value).d != null) {
            this.r();
            return false;
        }
        n.j.set((Object)this, 536870911);
        k.set((Object)this, (Object)r4.d.e);
        return true;
    }
    
    public void a(Object value, final Throwable t) {
        final AtomicReferenceFieldUpdater k = n.k;
        while (true) {
            value = k.get((Object)this);
            if (value instanceof e2) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (value instanceof a0) {
                return;
            }
            if (value instanceof z) {
                final z z = (z)value;
                if (!(z.c() ^ true)) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (b.a(n.k, (Object)this, value, (Object)r4.z.b(z, (Object)null, (k)null, (l)null, (Object)null, t, 15, (Object)null))) {
                    z.d(this, t);
                    return;
                }
                continue;
            }
            else {
                if (b.a(n.k, (Object)this, value, (Object)new z(value, (k)null, (l)null, (Object)null, t, 14, (i4.g)null))) {
                    return;
                }
                continue;
            }
        }
    }
    
    public void b(final e0 e0, final int n) {
        final AtomicIntegerFieldUpdater j = n.j;
        int value;
        do {
            value = j.get((Object)this);
            if ((value & 0x1FFFFFFF) == 0x1FFFFFFF) {
                continue;
            }
            throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
        } while (!j.compareAndSet((Object)this, value, (value >> 29 << 29) + n));
        this.D(e0);
    }
    
    public final d c() {
        return this.h;
    }
    
    public g d() {
        return this.i;
    }
    
    public Throwable e(final Object o) {
        Throwable e = super.e(o);
        if (e == null) {
            e = null;
        }
        return e;
    }
    
    public Object f(final Object o) {
        Object a = o;
        if (o instanceof z) {
            a = ((z)o).a;
        }
        return a;
    }
    
    public Object h() {
        return this.z();
    }
    
    public final void j(final k k, final Throwable t) {
        try {
            k.a(t);
        }
        finally {
            final g d = this.d();
            final StringBuilder sb = new StringBuilder();
            sb.append("Exception in invokeOnCancellation handler for ");
            sb.append((Object)this);
            i0.a(d, (Throwable)new d0(sb.toString(), t));
        }
    }
    
    public void k(final l l) {
        this.D(this.G(l));
    }
    
    public final void l(final l l, final Throwable t) {
        try {
            l.p((Object)t);
        }
        finally {
            final g d = this.d();
            final StringBuilder sb = new StringBuilder();
            sb.append("Exception in resume onCancellation handler for ");
            sb.append((Object)this);
            final Throwable t2;
            i0.a(d, (Throwable)new d0(sb.toString(), t2));
        }
    }
    
    public void m(final g0 g0, final Object o) {
        final d h = this.h;
        final boolean b = h instanceof j;
        g0 h2 = null;
        j j;
        if (b) {
            j = (j)h;
        }
        else {
            j = null;
        }
        if (j != null) {
            h2 = j.h;
        }
        int g2;
        if (h2 == g0) {
            g2 = 4;
        }
        else {
            g2 = super.g;
        }
        P(this, o, g2, null, 4, null);
    }
    
    public e n() {
        final d h = this.h;
        e e;
        if (h instanceof e) {
            e = (e)h;
        }
        else {
            e = null;
        }
        return e;
    }
    
    public boolean p(final Throwable t) {
        final AtomicReferenceFieldUpdater k = n.k;
        Object value;
        boolean b;
        do {
            value = k.get((Object)this);
            final boolean b2 = value instanceof e2;
            b = false;
            if (!b2) {
                return false;
            }
            if (!(value instanceof k) && !(value instanceof e0)) {
                continue;
            }
            b = true;
        } while (!androidx.concurrent.futures.b.a(n.k, (Object)this, value, (Object)new q((d)this, t, b)));
        final e2 e2 = (e2)value;
        if (e2 instanceof k) {
            this.j((k)value, t);
        }
        else if (e2 instanceof e0) {
            this.o((e0)value, t);
        }
        this.s();
        this.t(super.g);
        return true;
    }
    
    public final void r() {
        final x0 w = this.w();
        if (w == null) {
            return;
        }
        w.a();
        n.l.set((Object)this, (Object)d2.e);
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.I());
        sb.append('(');
        sb.append(n0.c(this.h));
        sb.append("){");
        sb.append(this.A());
        sb.append("}@");
        sb.append(n0.b((Object)this));
        return sb.toString();
    }
    
    public void u(final Object o) {
        P(this, r4.e0.c(o, (m)this), super.g, null, 4, null);
    }
    
    public Throwable v(final q1 q1) {
        return (Throwable)q1.l();
    }
    
    public Object x(final Object o, final Object o2, final l l) {
        return this.S(o, o2, l);
    }
    
    public final Object y() {
        final boolean f = this.F();
        if (this.T()) {
            if (this.w() == null) {
                this.C();
            }
            if (f) {
                this.M();
            }
            return z3.b.c();
        }
        if (f) {
            this.M();
        }
        final Object z = this.z();
        if (!(z instanceof a0)) {
            if (v0.b(super.g)) {
                final q1 q1 = (q1)this.d().a((g$c)r4.q1.b);
                if (q1 != null) {
                    if (!q1.c()) {
                        final CancellationException l = q1.l();
                        this.a(z, (Throwable)l);
                        throw l;
                    }
                }
            }
            return this.f(z);
        }
        throw ((a0)z).a;
    }
    
    public final Object z() {
        return n.k.get((Object)this);
    }
}
