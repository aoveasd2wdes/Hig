package r4;

import y3.g$b;
import y3.g$c;
import i4.g;
import a4.h;
import y3.d;
import i4.w;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import w4.r;
import java.util.concurrent.CancellationException;
import androidx.concurrent.futures.b;
import u3.q;
import u3.a;
import w4.s;
import i4.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class y1 implements q1, u, f2
{
    private static final AtomicReferenceFieldUpdater e;
    private static final AtomicReferenceFieldUpdater f;
    private volatile Object _parentHandle;
    private volatile Object _state;
    
    static {
        e = AtomicReferenceFieldUpdater.newUpdater((Class)y1.class, (Class)Object.class, "_state");
        f = AtomicReferenceFieldUpdater.newUpdater((Class)y1.class, (Class)Object.class, "_parentHandle");
    }
    
    public y1(final boolean b) {
        z0 state;
        if (b) {
            state = z1.c();
        }
        else {
            state = z1.d();
        }
        this._state = state;
    }
    
    private final void A0(final c2 c2, final Throwable t) {
        final Object q = ((s)c2).q();
        l.c(q, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        s r = (s)q;
        Throwable t2 = null;
        while (!l.a((Object)r, (Object)c2)) {
            Object o = t2;
            if (r instanceof x1) {
                final x1 x1 = (x1)r;
                try {
                    x1.y(t);
                }
                finally {
                    if (t2 != null) {
                        final Throwable t3;
                        u3.a.a(t2, t3);
                        o = t2;
                    }
                    else {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Exception in completion handler ");
                        sb.append((Object)x1);
                        sb.append(" for ");
                        sb.append((Object)this);
                        final Throwable t3;
                        o = new d0(sb.toString(), t3);
                        final q a = u3.q.a;
                    }
                }
            }
            r = r.r();
            t2 = (Throwable)o;
        }
        if (t2 != null) {
            this.n0(t2);
        }
    }
    
    private final void E0(final z0 z0) {
        Object o = new c2();
        if (!z0.c()) {
            o = new k1((c2)o);
        }
        androidx.concurrent.futures.b.a(y1.e, (Object)this, (Object)z0, o);
    }
    
    private final void F0(final x1 x1) {
        x1.k((s)new c2());
        androidx.concurrent.futures.b.a(y1.e, (Object)this, (Object)x1, (Object)x1.r());
    }
    
    private final int I0(final Object o) {
        if (o instanceof z0) {
            if (((z0)o).c()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(y1.e, (Object)this, o, (Object)z1.c())) {
                return -1;
            }
            this.D0();
            return 1;
        }
        else {
            if (!(o instanceof k1)) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(y1.e, (Object)this, o, (Object)((k1)o).d())) {
                return -1;
            }
            this.D0();
            return 1;
        }
    }
    
    private final String J0(final Object o) {
        final boolean b = o instanceof y1$c;
        final String s = "Active";
        String s2;
        if (b) {
            final y1$c y1$c = (y1$c)o;
            if (y1$c.g()) {
                s2 = "Cancelling";
            }
            else {
                s2 = s;
                if (y1$c.h()) {
                    s2 = "Completing";
                }
            }
        }
        else if (o instanceof l1) {
            if (((l1)o).c()) {
                s2 = s;
            }
            else {
                s2 = "New";
            }
        }
        else if (o instanceof a0) {
            s2 = "Cancelled";
        }
        else {
            s2 = "Completed";
        }
        return s2;
    }
    
    public static /* synthetic */ CancellationException L0(final y1 y1, final Throwable t, String s, final int n, final Object o) {
        if (o == null) {
            if ((n & 0x1) != 0x0) {
                s = null;
            }
            return y1.K0(t, s);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }
    
    private final boolean N0(final l1 l1, final Object o) {
        if (!androidx.concurrent.futures.b.a(y1.e, (Object)this, (Object)l1, z1.g(o))) {
            return false;
        }
        this.B0(null);
        this.C0(o);
        this.a0(l1, o);
        return true;
    }
    
    private final boolean O(final Object o, final c2 c2, final x1 x1) {
        final s.a a = new s.a(x1, this, o) {
            final y1 d;
            final Object e;
            
            public Object f(final s s) {
                Object a;
                if (this.d.l0() == this.e) {
                    a = null;
                }
                else {
                    a = r.a();
                }
                return a;
            }
        };
        boolean b;
        while (true) {
            final int x2 = ((s)c2).s().x((s)x1, (s)c2, (s.a)a);
            b = true;
            if (x2 == 1) {
                break;
            }
            if (x2 != 2) {
                continue;
            }
            b = false;
            break;
        }
        return b;
    }
    
    private final boolean O0(final l1 l1, final Throwable t) {
        final c2 j0 = this.j0(l1);
        if (j0 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(y1.e, (Object)this, (Object)l1, (Object)new y1$c(j0, false, t))) {
            return false;
        }
        this.z0(j0, t);
        return true;
    }
    
    private final void P(final Throwable t, final List list) {
        if (list.size() <= 1) {
            return;
        }
        final Set setFromMap = Collections.newSetFromMap((Map)new IdentityHashMap(list.size()));
        for (final Throwable t2 : list) {
            if (t2 != t && t2 != t && !(t2 instanceof CancellationException) && setFromMap.add((Object)t2)) {
                u3.a.a(t, t2);
            }
        }
    }
    
    private final Object P0(final Object o, final Object o2) {
        if (!(o instanceof l1)) {
            return z1.a();
        }
        if ((!(o instanceof z0) && !(o instanceof x1)) || o instanceof t || o2 instanceof a0) {
            return this.Q0((l1)o, o2);
        }
        if (this.N0((l1)o, o2)) {
            return o2;
        }
        return z1.b();
    }
    
    private final Object Q0(final l1 l1, final Object o) {
        final c2 j0 = this.j0(l1);
        if (j0 == null) {
            return z1.b();
        }
        final boolean b = l1 instanceof y1$c;
        final Throwable t = null;
        y1$c y1$c;
        if (b) {
            y1$c = (y1$c)l1;
        }
        else {
            y1$c = null;
        }
        boolean b2 = false;
        y1$c y1$c2 = y1$c;
        if (y1$c == null) {
            y1$c2 = new y1$c(j0, false, (Throwable)null);
        }
        final w w = new w();
        synchronized (y1$c2) {
            if (y1$c2.h()) {
                return z1.a();
            }
            y1$c2.k(true);
            if (y1$c2 != l1 && !androidx.concurrent.futures.b.a(y1.e, (Object)this, (Object)l1, (Object)y1$c2)) {
                return z1.b();
            }
            final boolean g = y1$c2.g();
            a0 a0;
            if (o instanceof a0) {
                a0 = (a0)o;
            }
            else {
                a0 = null;
            }
            if (a0 != null) {
                y1$c2.a(a0.a);
            }
            final Throwable f = y1$c2.f();
            if (!g) {
                b2 = true;
            }
            Throwable e = t;
            if ((boolean)b2) {
                e = f;
            }
            w.e = e;
            final q a2 = q.a;
            monitorexit(y1$c2);
            if (e != null) {
                this.z0(j0, e);
            }
            final t e2 = this.e0(l1);
            if (e2 != null && this.R0(y1$c2, e2, o)) {
                return z1.b;
            }
            return this.d0(y1$c2, o);
        }
    }
    
    private final boolean R0(final y1$c y1$c, t y0, final Object o) {
        while (q1$a.d((q1)y0.i, false, false, (h4.l)new b(this, y1$c, y0, o), 1, (Object)null) == d2.e) {
            if ((y0 = this.y0(y0)) == null) {
                return false;
            }
        }
        return true;
    }
    
    private final Object S(final d d) {
        final a a = new a(z3.b.b(d), this);
        a.B();
        p.a((m)a, this.t((h4.l)new g2(a)));
        final Object y = a.y();
        if (y == z3.b.c()) {
            h.c(d);
        }
        return y;
    }
    
    private final Object W(final Object o) {
        Object p;
        do {
            final Object l0 = this.l0();
            if (!(l0 instanceof l1) || (l0 instanceof y1$c && ((y1$c)l0).h())) {
                return z1.a();
            }
            p = this.P0(l0, new a0(this.c0(o), false, 2, (g)null));
        } while (p == z1.b());
        return p;
    }
    
    private final boolean X(final Throwable t) {
        final boolean q0 = this.q0();
        final boolean b = true;
        if (q0) {
            return true;
        }
        final boolean b2 = t instanceof CancellationException;
        final r4.s k0 = this.k0();
        if (k0 != null && k0 != d2.e) {
            boolean b3 = b;
            if (!k0.g(t)) {
                b3 = (b2 && b);
            }
            return b3;
        }
        return b2;
    }
    
    private final void a0(final l1 l1, final Object o) {
        final r4.s k0 = this.k0();
        if (k0 != null) {
            ((x0)k0).a();
            this.H0((r4.s)d2.e);
        }
        final boolean b = o instanceof a0;
        final Throwable t = null;
        a0 a0;
        if (b) {
            a0 = (a0)o;
        }
        else {
            a0 = null;
        }
        Throwable a2 = t;
        if (a0 != null) {
            a2 = a0.a;
        }
        if (l1 instanceof x1) {
            try {
                ((x1)l1).y(a2);
            }
            finally {
                final StringBuilder sb = new StringBuilder();
                sb.append("Exception in completion handler ");
                sb.append((Object)l1);
                sb.append(" for ");
                sb.append((Object)this);
                final Throwable t2;
                this.n0((Throwable)new d0(sb.toString(), t2));
            }
        }
        else {
            final c2 d = l1.d();
            if (d != null) {
                this.A0(d, a2);
            }
        }
    }
    
    private final void b0(final y1$c y1$c, t y0, final Object o) {
        y0 = this.y0(y0);
        if (y0 != null && this.R0(y1$c, y0, o)) {
            return;
        }
        this.Q(this.d0(y1$c, o));
    }
    
    private final Throwable c0(Object f) {
        if (f == null || f instanceof Throwable) {
            if ((f = f) == null) {
                f = new r1(this.Y(), (Throwable)null, (q1)this);
            }
        }
        else {
            l.c(f, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
            f = ((f2)f).f();
        }
        return (Throwable)f;
    }
    
    private final Object d0(final y1$c y1$c, Object o) {
        a0 a0;
        if (o instanceof a0) {
            a0 = (a0)o;
        }
        else {
            a0 = null;
        }
        Throwable a2;
        if (a0 != null) {
            a2 = a0.a;
        }
        else {
            a2 = null;
        }
        synchronized (y1$c) {
            final boolean g = y1$c.g();
            final List j = y1$c.j(a2);
            final Throwable g2 = this.g0(y1$c, j);
            if (g2 != null) {
                this.P(g2, j);
            }
            monitorexit(y1$c);
            boolean b = false;
            if (g2 != null) {
                if (g2 != a2) {
                    o = new a0(g2, false, 2, (g)null);
                }
            }
            if (g2 != null) {
                if (this.X(g2) || this.m0(g2)) {
                    b = true;
                }
                if (b) {
                    l.c(o, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    ((a0)o).b();
                }
            }
            if (!g) {
                this.B0(g2);
            }
            this.C0(o);
            androidx.concurrent.futures.b.a(y1.e, (Object)this, (Object)y1$c, z1.g(o));
            this.a0((l1)y1$c, o);
            return o;
        }
    }
    
    private final t e0(final l1 l1) {
        final boolean b = l1 instanceof t;
        final t t = null;
        t t2;
        if (b) {
            t2 = (t)l1;
        }
        else {
            t2 = null;
        }
        t y0;
        if (t2 == null) {
            final c2 d = l1.d();
            y0 = t;
            if (d != null) {
                y0 = this.y0((s)d);
            }
        }
        else {
            y0 = t2;
        }
        return y0;
    }
    
    private final Throwable f0(final Object o) {
        final boolean b = o instanceof a0;
        Throwable a = null;
        a0 a2;
        if (b) {
            a2 = (a0)o;
        }
        else {
            a2 = null;
        }
        if (a2 != null) {
            a = a2.a;
        }
        return a;
    }
    
    private final Throwable g0(final y1$c y1$c, final List list) {
        final boolean empty = list.isEmpty();
        final Throwable t = null;
        if (empty) {
            if (y1$c.g()) {
                return (Throwable)new r1(this.Y(), (Throwable)null, (q1)this);
            }
            return null;
        }
        else {
            final Iterator iterator = ((Iterable)list).iterator();
            Object next;
            do {
                next = t;
                if (!iterator.hasNext()) {
                    break;
                }
                next = iterator.next();
            } while (!(((Throwable)next) instanceof CancellationException ^ true));
            final Throwable t2 = (Throwable)next;
            if (t2 != null) {
                return t2;
            }
            return (Throwable)list.get(0);
        }
    }
    
    private final c2 j0(final l1 l1) {
        c2 d;
        if ((d = l1.d()) == null) {
            if (l1 instanceof z0) {
                d = new c2();
            }
            else {
                if (!(l1 instanceof x1)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("State should have list: ");
                    sb.append((Object)l1);
                    throw new IllegalStateException(sb.toString().toString());
                }
                this.F0((x1)l1);
                d = null;
            }
        }
        return d;
    }
    
    private final boolean r0() {
        Object l0;
        do {
            l0 = this.l0();
            if (!(l0 instanceof l1)) {
                return false;
            }
        } while (this.I0(l0) < 0);
        return true;
    }
    
    private final Object s0(final d d) {
        final n n = new n(z3.b.b(d), 1);
        n.B();
        p.a((m)n, this.t((h4.l)new h2((d)n)));
        final Object y = n.y();
        if (y == z3.b.c()) {
            h.c(d);
        }
        if (y == z3.b.c()) {
            return y;
        }
        return q.a;
    }
    
    private final Object t0(Object o) {
        final Throwable t = null;
        Throwable t2 = null;
        while (true) {
            final Object l0 = this.l0();
            if (l0 instanceof y1$c) {
                synchronized (l0) {
                    if (((y1$c)l0).i()) {
                        return z1.f();
                    }
                    final boolean g = ((y1$c)l0).g();
                    if (o != null || !g) {
                        Throwable c0;
                        if ((c0 = t2) == null) {
                            c0 = this.c0(o);
                        }
                        ((y1$c)l0).a(c0);
                    }
                    final Throwable f = ((y1$c)l0).f();
                    Throwable t3 = t;
                    if (g ^ true) {
                        t3 = f;
                    }
                    monitorexit(l0);
                    if (t3 != null) {
                        this.z0(((y1$c)l0).d(), t3);
                    }
                    return z1.a();
                }
            }
            if (!(l0 instanceof l1)) {
                return z1.f();
            }
            Throwable c2;
            if ((c2 = t2) == null) {
                c2 = this.c0(o);
            }
            final l1 l2 = (l1)l0;
            if (l2.c()) {
                t2 = c2;
                if (this.O0(l2, c2)) {
                    return z1.a();
                }
                continue;
            }
            else {
                final Object p = this.P0(l0, new a0(c2, false, 2, (g)null));
                if (p == z1.a()) {
                    o = new StringBuilder();
                    ((StringBuilder)o).append("Cannot happen in ");
                    ((StringBuilder)o).append(l0);
                    throw new IllegalStateException(((StringBuilder)o).toString().toString());
                }
                t2 = c2;
                if (p != z1.b()) {
                    return p;
                }
                continue;
            }
        }
    }
    
    private final x1 w0(final h4.l l, final boolean b) {
        x1 x1 = null;
        s1 s1 = null;
        if (b) {
            if (l instanceof s1) {
                s1 = (s1)l;
            }
            if ((x1 = s1) == null) {
                x1 = new o1(l);
            }
        }
        else {
            if (l instanceof x1) {
                x1 = (x1)l;
            }
            if (x1 == null) {
                x1 = new p1(l);
            }
        }
        x1.A(this);
        return x1;
    }
    
    private final t y0(s s) {
        s r;
        while (true) {
            r = s;
            if (!s.t()) {
                break;
            }
            s = s.s();
        }
        while (true) {
            s = (r = r.r());
            if (!s.t()) {
                if (s instanceof t) {
                    return (t)s;
                }
                r = s;
                if (s instanceof c2) {
                    return null;
                }
                continue;
            }
        }
    }
    
    private final void z0(final c2 c2, final Throwable t) {
        this.B0(t);
        final Object q = ((s)c2).q();
        l.c(q, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        s r = (s)q;
        Throwable t2 = null;
        while (!l.a((Object)r, (Object)c2)) {
            Object o = t2;
            if (r instanceof s1) {
                final x1 x1 = (x1)r;
                try {
                    x1.y(t);
                }
                finally {
                    if (t2 != null) {
                        final Throwable t3;
                        u3.a.a(t2, t3);
                        o = t2;
                    }
                    else {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Exception in completion handler ");
                        sb.append((Object)x1);
                        sb.append(" for ");
                        sb.append((Object)this);
                        final Throwable t3;
                        o = new d0(sb.toString(), t3);
                        final q a = u3.q.a;
                    }
                }
            }
            r = r.r();
            t2 = (Throwable)o;
        }
        if (t2 != null) {
            this.n0(t2);
        }
        this.X(t);
    }
    
    public y3.g A(final y3.g g) {
        return q1$a.f((q1)this, g);
    }
    
    protected void B0(final Throwable t) {
    }
    
    protected void C0(final Object o) {
    }
    
    protected void D0() {
    }
    
    @Override
    public final r4.s F(final u u) {
        final x0 d = q1$a.d((q1)this, true, false, (h4.l)new t(u), 2, (Object)null);
        l.c((Object)d, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (r4.s)d;
    }
    
    public final void G0(final x1 x1) {
        Object l0;
        do {
            l0 = this.l0();
            if (!(l0 instanceof x1)) {
                if (l0 instanceof l1 && ((l1)l0).d() != null) {
                    x1.u();
                }
                return;
            }
            if (l0 != x1) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(y1.e, (Object)this, l0, (Object)z1.c()));
    }
    
    public final void H0(final r4.s s) {
        y1.f.set((Object)this, (Object)s);
    }
    
    @Override
    public final Object I(final d d) {
        if (!this.r0()) {
            u1.f(d.d());
            return q.a;
        }
        final Object s0 = this.s0(d);
        if (s0 == z3.b.c()) {
            return s0;
        }
        return q.a;
    }
    
    protected final CancellationException K0(final Throwable t, final String s) {
        CancellationException ex;
        if (t instanceof CancellationException) {
            ex = (CancellationException)t;
        }
        else {
            ex = null;
        }
        Object o = ex;
        if (ex == null) {
            String m;
            if ((m = s) == null) {
                m = this.Y();
            }
            o = new r1(m, t, (q1)this);
        }
        return (CancellationException)o;
    }
    
    @Override
    public final void L(final f2 f2) {
        this.U(f2);
    }
    
    public final String M0() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.x0());
        sb.append('{');
        sb.append(this.J0(this.l0()));
        sb.append('}');
        return sb.toString();
    }
    
    protected void Q(final Object o) {
    }
    
    protected final Object R(final d d) {
        Object l0;
        do {
            l0 = this.l0();
            if (!(l0 instanceof l1)) {
                if (!(l0 instanceof a0)) {
                    return z1.h(l0);
                }
                throw ((a0)l0).a;
            }
        } while (this.I0(l0) < 0);
        return this.S(d);
    }
    
    public final boolean T(final Throwable t) {
        return this.U(t);
    }
    
    public final boolean U(final Object o) {
        Object o2 = z1.a();
        final boolean i0 = this.i0();
        boolean b = true;
        if (i0 && (o2 = this.W(o)) == z1.b) {
            return true;
        }
        Object t0;
        if ((t0 = o2) == z1.a()) {
            t0 = this.t0(o);
        }
        if (t0 != z1.a()) {
            if (t0 != z1.b) {
                if (t0 == z1.f()) {
                    b = false;
                }
                else {
                    this.Q(t0);
                }
            }
        }
        return b;
    }
    
    public void V(final Throwable t) {
        this.U(t);
    }
    
    protected String Y() {
        return "Job was cancelled";
    }
    
    public boolean Z(final Throwable t) {
        final boolean b = t instanceof CancellationException;
        boolean b2 = true;
        if (b) {
            return true;
        }
        if (!this.U(t) || !this.h0()) {
            b2 = false;
        }
        return b2;
    }
    
    public g$b a(final g$c g$c) {
        return q1$a.c((q1)this, g$c);
    }
    
    @Override
    public void b(final CancellationException ex) {
        Object o = ex;
        if (ex == null) {
            o = new r1(this.Y(), (Throwable)null, (q1)this);
        }
        this.V((Throwable)o);
    }
    
    @Override
    public boolean c() {
        final Object l0 = this.l0();
        return l0 instanceof l1 && ((l1)l0).c();
    }
    
    @Override
    public CancellationException f() {
        final Object l0 = this.l0();
        final boolean b = l0 instanceof y1$c;
        CancellationException ex = null;
        Throwable t;
        if (b) {
            t = ((y1$c)l0).f();
        }
        else if (l0 instanceof a0) {
            t = ((a0)l0).a;
        }
        else {
            if (l0 instanceof l1) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Cannot be cancelling child in this state: ");
                sb.append(l0);
                throw new IllegalStateException(sb.toString().toString());
            }
            t = null;
        }
        if (t instanceof CancellationException) {
            ex = (CancellationException)t;
        }
        Object o;
        if ((o = ex) == null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Parent job is ");
            sb2.append(this.J0(l0));
            o = new r1(sb2.toString(), t, (q1)this);
        }
        return (CancellationException)o;
    }
    
    public final g$c getKey() {
        return (g$c)q1.b;
    }
    
    @Override
    public q1 getParent() {
        final r4.s k0 = this.k0();
        q1 parent;
        if (k0 != null) {
            parent = k0.getParent();
        }
        else {
            parent = null;
        }
        return parent;
    }
    
    public y3.g h(final g$c g$c) {
        return q1$a.e((q1)this, g$c);
    }
    
    public boolean h0() {
        return true;
    }
    
    public boolean i0() {
        return false;
    }
    
    public Object j(final Object o, final h4.p p2) {
        return q1$a.b((q1)this, o, p2);
    }
    
    public final r4.s k0() {
        return (r4.s)y1.f.get((Object)this);
    }
    
    @Override
    public final CancellationException l() {
        final Object l0 = this.l0();
        if (l0 instanceof y1$c) {
            final Throwable f = ((y1$c)l0).f();
            if (f != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append(n0.a((Object)this));
                sb.append(" is cancelling");
                final Object o = this.K0(f, sb.toString());
                if (o != null) {
                    return (CancellationException)o;
                }
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Job is still new or active: ");
            sb2.append((Object)this);
            throw new IllegalStateException(sb2.toString().toString());
        }
        if (l0 instanceof l1) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Job is still new or active: ");
            sb3.append((Object)this);
            throw new IllegalStateException(sb3.toString().toString());
        }
        Object o;
        if (l0 instanceof a0) {
            o = L0(this, ((a0)l0).a, null, 1, null);
        }
        else {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(n0.a((Object)this));
            sb4.append(" has completed normally");
            o = new r1(sb4.toString(), (Throwable)null, (q1)this);
        }
        return (CancellationException)o;
    }
    
    public final Object l0() {
        final AtomicReferenceFieldUpdater e = y1.e;
        Object value;
        while (true) {
            value = e.get((Object)this);
            if (!(value instanceof w4.a0)) {
                break;
            }
            ((w4.a0)value).a((Object)this);
        }
        return value;
    }
    
    protected boolean m0(final Throwable t) {
        return false;
    }
    
    public void n0(final Throwable t) {
        throw t;
    }
    
    protected final void o0(final q1 q1) {
        if (q1 == null) {
            this.H0((r4.s)d2.e);
            return;
        }
        q1.start();
        final r4.s f = q1.F(this);
        this.H0(f);
        if (this.p()) {
            ((x0)f).a();
            this.H0((r4.s)d2.e);
        }
    }
    
    @Override
    public final boolean p() {
        return this.l0() instanceof l1 ^ true;
    }
    
    public final boolean p0() {
        final Object l0 = this.l0();
        return l0 instanceof a0 || (l0 instanceof y1$c && ((y1$c)l0).g());
    }
    
    protected boolean q0() {
        return false;
    }
    
    @Override
    public final boolean start() {
        while (true) {
            final int i0 = this.I0(this.l0());
            if (i0 == 0) {
                return false;
            }
            if (i0 != 1) {
                continue;
            }
            return true;
        }
    }
    
    @Override
    public final x0 t(final h4.l l) {
        return this.w(false, true, l);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.M0());
        sb.append('@');
        sb.append(n0.b((Object)this));
        return sb.toString();
    }
    
    public final boolean u0(final Object o) {
        Object p;
        do {
            p = this.P0(this.l0(), o);
            if (p == z1.a()) {
                return false;
            }
            if (p == z1.b) {
                return true;
            }
        } while (p == z1.b());
        this.Q(p);
        return true;
    }
    
    public final Object v0(final Object o) {
        Object p;
        do {
            p = this.P0(this.l0(), o);
            if (p != z1.a()) {
                continue;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Job ");
            sb.append((Object)this);
            sb.append(" is already complete or completing, but is being completed with ");
            sb.append(o);
            throw new IllegalStateException(sb.toString(), this.f0(o));
        } while (p == z1.b());
        return p;
    }
    
    @Override
    public final x0 w(final boolean b, final boolean b2, final h4.l l) {
        final x1 w0 = this.w0(l, b);
        while (true) {
            final Object l2 = this.l0();
            if (l2 instanceof z0) {
                final z0 z0 = (z0)l2;
                if (z0.c()) {
                    if (b.a(y1.e, (Object)this, l2, (Object)w0)) {
                        return (x0)w0;
                    }
                    continue;
                }
                else {
                    this.E0(z0);
                }
            }
            else {
                final boolean b3 = l2 instanceof l1;
                Object a = null;
                final Object o = null;
                if (!b3) {
                    if (b2) {
                        a0 a2;
                        if (l2 instanceof a0) {
                            a2 = (a0)l2;
                        }
                        else {
                            a2 = null;
                        }
                        if (a2 != null) {
                            a = a2.a;
                        }
                        l.p(a);
                    }
                    return (x0)d2.e;
                }
                final c2 d = ((l1)l2).d();
                if (d == null) {
                    l.c(l2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    this.F0((x1)l2);
                }
                else {
                    final d2 e = d2.e;
                    Object f = o;
                    x0 x0 = (x0)e;
                    if (b) {
                        f = o;
                        x0 = (x0)e;
                        if (l2 instanceof y1$c) {
                            synchronized (l2) {
                                f = ((y1$c)l2).f();
                                Label_0236: {
                                    if (f != null) {
                                        x0 = (x0)e;
                                        if (!(l instanceof t)) {
                                            break Label_0236;
                                        }
                                        x0 = (x0)e;
                                        if (((y1$c)l2).h()) {
                                            break Label_0236;
                                        }
                                    }
                                    if (!this.O(l2, d, w0)) {
                                        continue;
                                    }
                                    if (f == null) {
                                        return (x0)w0;
                                    }
                                    x0 = (x0)w0;
                                }
                                final q a3 = q.a;
                            }
                        }
                    }
                    if (f != null) {
                        if (b2) {
                            l.p(f);
                        }
                        return x0;
                    }
                    if (this.O(l2, d, w0)) {
                        return (x0)w0;
                    }
                    continue;
                }
            }
        }
    }
    
    public String x0() {
        return n0.a((Object)this);
    }
    
    private static final class a extends n
    {
        private final y1 m;
        
        public a(final d d, final y1 m) {
            super(d, 1);
            this.m = m;
        }
        
        @Override
        protected String I() {
            return "AwaitContinuation";
        }
        
        @Override
        public Throwable v(final q1 q1) {
            final Object l0 = this.m.l0();
            if (l0 instanceof y1$c) {
                final Throwable f = ((y1$c)l0).f();
                if (f != null) {
                    return f;
                }
            }
            if (l0 instanceof a0) {
                return ((a0)l0).a;
            }
            return (Throwable)q1.l();
        }
    }
    
    private static final class b extends x1
    {
        private final y1 i;
        private final y1$c j;
        private final t k;
        private final Object l;
        
        public b(final y1 i, final y1$c j, final t k, final Object l) {
            this.i = i;
            this.j = j;
            this.k = k;
            this.l = l;
        }
        
        @Override
        public void y(final Throwable t) {
            this.i.b0(this.j, this.k, this.l);
        }
    }
}
