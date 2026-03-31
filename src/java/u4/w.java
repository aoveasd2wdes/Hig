package u4;

import y3.g;
import w4.h0;
import java.util.Arrays;
import u3.k$a;
import a4.h;
import r4.x0;
import r4.p;
import u3.k;
import v4.c;
import r4.n;
import r4.u1;
import y3.g$c;
import r4.q1;
import y3.d;
import u3.q;
import i4.l;
import t4.a;
import v4.m;
import v4.b;

public class w extends b implements r, e, m
{
    private final int i;
    private final int j;
    private final a k;
    private Object[] l;
    private long m;
    private long n;
    private int o;
    private int p;
    
    public w(final int i, final int j, final a k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    private final void A(final w.w$a w$a) {
        synchronized (this) {
            if (w$a.f < this.M()) {
                return;
            }
            final Object[] l = this.l;
            i4.l.b((Object)l);
            if (x.b(l, w$a.f) != w$a) {
                return;
            }
            x.c(l, w$a.f, (Object)x.a);
            this.B();
            final q a = q.a;
        }
    }
    
    private final void B() {
        if (this.j == 0 && this.p <= 1) {
            return;
        }
        final Object[] l = this.l;
        i4.l.b((Object)l);
        while (this.p > 0 && x.b(l, this.M() + this.R() - 1L) == x.a) {
            --this.p;
            x.c(l, this.M() + this.R(), (Object)null);
        }
    }
    
    static /* synthetic */ Object C(w w, f f, final d d) {
        Object o2 = null;
        Label_0051: {
            if (d instanceof w$c) {
                final Object o = d;
                final int n = ((w$c)o).n;
                if ((n & Integer.MIN_VALUE) != 0x0) {
                    ((w$c)o).n = n + Integer.MIN_VALUE;
                    o2 = o;
                    break Label_0051;
                }
            }
            o2 = new a4.d(w, d) {
                Object h;
                Object i;
                Object j;
                Object k;
                Object l;
                final w m;
                int n;
                
                public final Object s(final Object l) {
                    this.l = l;
                    this.n |= Integer.MIN_VALUE;
                    return w.C(this.m, null, (d)this);
                }
            };
        }
        final Object l = ((w$c)o2).l;
        final Object c = z3.b.c();
        final int n2 = ((w$c)o2).n;
    Label_0142:
        while (true) {
            Label_0298: {
                Label_0278: {
                    if (n2 == 0) {
                        break Label_0278;
                    }
                    Label_0232: {
                        if (n2 == 1) {
                            break Label_0232;
                        }
                        Label_0172: {
                            if (n2 == 2) {
                                break Label_0172;
                            }
                            Label_0162: {
                                if (n2 != 3) {
                                    break Label_0162;
                                }
                                Object o3 = ((w$c)o2).k;
                                Object o4 = ((w$c)o2).j;
                                Object o5 = ((w$c)o2).i;
                                Object o = f = (f)((w$c)o2).h;
                                w = (w)o4;
                                try {
                                    u3.l.b(l);
                                    w = (w)o4;
                                    o4 = o3;
                                    f = (f)o2;
                                    final Object o6 = o5;
                                    o5 = o4;
                                    o3 = o;
                                    o = w;
                                    o4 = o6;
                                    break Label_0298;
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    o4 = ((w$c)o2).k;
                                    final Object o7 = ((w$c)o2).j;
                                    o5 = ((w$c)o2).i;
                                    o = (f = (f)((w$c)o2).h);
                                    w = (w)o7;
                                    u3.l.b(l);
                                    o3 = o2;
                                    break Label_0298;
                                }
                                finally {
                                    break Label_0142;
                                }
                            }
                        }
                    }
                    final Object o8 = ((w$c)o2).j;
                    Object o4 = ((w$c)o2).i;
                    w = (w)((w$c)o2).h;
                    try {
                        u3.l.b(l);
                        break Label_0298;
                    }
                    finally {
                        f = (f)w;
                        w = (w)o8;
                        break Label_0142;
                    }
                }
                u3.l.b(l);
                final Object o9 = w.i();
                Object o4 = f;
                f = (f)o9;
                try {
                    Object o5 = ((d)o2).d().a((g$c)q1.b);
                    Object o = f;
                    Object o3 = w;
                    f = (f)o2;
                    w = (w)o5;
                    o5 = o4;
                    o2 = o;
                    o4 = w;
                    o = o3;
                    o3 = f;
                    do {
                        f = (f)o;
                        w = (w)o2;
                        final Object w2 = ((w)o).W((y)o2);
                        f = (f)o;
                        w = (w)o2;
                        if (w2 == x.a) {
                            f = (f)o;
                            w = (w)o2;
                            ((w$c)o3).h = o;
                            f = (f)o;
                            w = (w)o2;
                            ((w$c)o3).i = o5;
                            f = (f)o;
                            w = (w)o2;
                            ((w$c)o3).j = o2;
                            f = (f)o;
                            w = (w)o2;
                            ((w$c)o3).k = o4;
                            f = (f)o;
                            w = (w)o2;
                            ((w$c)o3).n = 2;
                            f = (f)o;
                            w = (w)o2;
                        }
                        else {
                            if (o4 != null) {
                                f = (f)o;
                                w = (w)o2;
                                u1.e((q1)o4);
                            }
                            f = (f)o;
                            w = (w)o2;
                            ((w$c)o3).h = o;
                            f = (f)o;
                            w = (w)o2;
                            ((w$c)o3).i = o5;
                            f = (f)o;
                            w = (w)o2;
                            ((w$c)o3).j = o2;
                            f = (f)o;
                            w = (w)o2;
                            ((w$c)o3).k = o4;
                            f = (f)o;
                            w = (w)o2;
                            ((w$c)o3).n = 3;
                            f = (f)o;
                            w = (w)o2;
                            final Object h = ((f)o5).h(w2, (d)o3);
                            f = (f)o3;
                            w = (w)o2;
                            if (h == c) {
                                return c;
                            }
                            continue Label_0142;
                        }
                    } while (((w)o).z((y)o2, (d)o3) != c);
                    return c;
                }
                finally {
                    final Object o = w;
                    w = (w)f;
                    f = (f)o;
                }
            }
            break;
        }
        ((b)f).l((v4.d)w);
        throw o2;
    }
    
    private final void D(final long n) {
        if (b.e((b)this) != 0) {
            final v4.d[] f = b.f((b)this);
            if (f != null) {
                for (final v4.d d : f) {
                    if (d != null) {
                        final y y = (y)d;
                        final long a = y.a;
                        if (a >= 0L && a < n) {
                            y.a = n;
                        }
                    }
                }
            }
        }
        this.n = n;
    }
    
    private final void G() {
        final Object[] l = this.l;
        i4.l.b((Object)l);
        x.c(l, this.M(), (Object)null);
        --this.o;
        final long m = this.M() + 1L;
        if (this.m < m) {
            this.m = m;
        }
        if (this.n < m) {
            this.D(m);
        }
    }
    
    static /* synthetic */ Object H(final w w, final Object o, final d d) {
        if (w.c(o)) {
            return q.a;
        }
        final Object i = w.I(o, d);
        if (i == z3.b.c()) {
            return i;
        }
        return q.a;
    }
    
    private final Object I(Object y, final d d) {
        final n n = new n(z3.b.b(d), 1);
        n.B();
        final d[] a = c.a;
        synchronized (this) {
            d[] array;
            Object o;
            if (this.T(y)) {
                final k$a e = u3.k.e;
                ((d)n).u(u3.k.a((Object)q.a));
                array = this.K(a);
                o = null;
            }
            else {
                o = new w.w$a(this, this.R() + this.M(), y, (d)n);
                this.J(o);
                w(this, u(this) + 1);
                array = a;
                if (s(this) == 0) {
                    array = this.K(a);
                }
            }
            monitorexit(this);
            if (o != null) {
                r4.p.a((r4.m)n, (x0)o);
            }
            for (final d d2 : array) {
                if (d2 != null) {
                    final k$a e2 = u3.k.e;
                    d2.u(u3.k.a((Object)q.a));
                }
            }
            y = n.y();
            if (y == z3.b.c()) {
                h.c(d);
            }
            if (y == z3.b.c()) {
                return y;
            }
            return q.a;
        }
    }
    
    private final void J(final Object o) {
        final int r = this.R();
        final Object[] l = this.l;
        Object[] array;
        if (l == null) {
            array = this.S(null, 0, 2);
        }
        else {
            array = l;
            if (r >= l.length) {
                array = this.S(l, r, l.length * 2);
            }
        }
        x.c(array, this.M() + r, o);
    }
    
    private final d[] K(d[] array) {
        int length = array.length;
        d[] array2 = array;
        if (b.e((b)this) != 0) {
            final v4.d[] f = b.f((b)this);
            array2 = array;
            if (f != null) {
                final int length2 = f.length;
                int n = 0;
                while (true) {
                    array2 = array;
                    if (n >= length2) {
                        break;
                    }
                    final v4.d d = f[n];
                    int n2 = length;
                    Object[] copy = array;
                    if (d != null) {
                        final y y = (y)d;
                        final d b = y.b;
                        if (b == null) {
                            n2 = length;
                            copy = array;
                        }
                        else {
                            n2 = length;
                            copy = array;
                            if (this.V(y) >= 0L) {
                                copy = array;
                                if (length >= array.length) {
                                    copy = Arrays.copyOf((Object[])array, Math.max(2, array.length * 2));
                                    i4.l.d((Object)copy, "copyOf(this, newSize)");
                                }
                                copy[length] = b;
                                y.b = null;
                                n2 = length + 1;
                            }
                        }
                    }
                    ++n;
                    length = n2;
                    array = (d[])copy;
                }
            }
        }
        return array2;
    }
    
    private final long L() {
        return this.M() + this.o;
    }
    
    private final long M() {
        return Math.min(this.n, this.m);
    }
    
    private final Object O(final long n) {
        final Object[] l = this.l;
        i4.l.b((Object)l);
        Object o2;
        final Object o = o2 = x.b(l, n);
        if (o instanceof w.w$a) {
            o2 = ((w.w$a)o).g;
        }
        return o2;
    }
    
    private final long P() {
        return this.M() + this.o + this.p;
    }
    
    private final int Q() {
        return (int)(this.M() + this.o - this.m);
    }
    
    private final int R() {
        return this.o + this.p;
    }
    
    private final Object[] S(final Object[] array, final int n, int i) {
        final int n2 = 0;
        if (i <= 0) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        final Object[] l = new Object[i];
        this.l = l;
        if (array == null) {
            return l;
        }
        final long m = this.M();
        long n3;
        for (i = n2; i < n; ++i) {
            n3 = i + m;
            x.c(l, n3, x.b(array, n3));
        }
        return l;
    }
    
    private final boolean T(final Object o) {
        if (this.m() == 0) {
            return this.U(o);
        }
        if (this.o >= this.j && this.n <= this.m) {
            final int n = w.w$b.a[((Enum)this.k).ordinal()];
            if (n == 1) {
                return false;
            }
            if (n == 2) {
                return true;
            }
        }
        this.J(o);
        if (++this.o > this.j) {
            this.G();
        }
        if (this.Q() > this.i) {
            this.X(this.m + 1L, this.n, this.L(), this.P());
        }
        return true;
    }
    
    private final boolean U(final Object o) {
        if (this.i == 0) {
            return true;
        }
        this.J(o);
        if (++this.o > this.i) {
            this.G();
        }
        this.n = this.M() + this.o;
        return true;
    }
    
    private final long V(final y y) {
        final long a = y.a;
        if (a < this.L()) {
            return a;
        }
        if (this.j > 0) {
            return -1L;
        }
        if (a > this.M()) {
            return -1L;
        }
        if (this.p == 0) {
            return -1L;
        }
        return a;
    }
    
    private final Object W(final y y) {
        d[] array = c.a;
        synchronized (this) {
            final long v = this.V(y);
            h0 a;
            if (v < 0L) {
                a = x.a;
            }
            else {
                final long a2 = y.a;
                final Object o = this.O(v);
                y.a = v + 1L;
                array = this.Y(a2);
                a = (h0)o;
            }
            monitorexit(this);
            for (final d d : array) {
                if (d != null) {
                    final k$a e = u3.k.e;
                    d.u(u3.k.a((Object)q.a));
                }
            }
            return a;
        }
    }
    
    private final void X(final long m, final long n, final long n2, final long n3) {
        final long min = Math.min(n, m);
        for (long i = this.M(); i < min; ++i) {
            final Object[] l = this.l;
            i4.l.b((Object)l);
            x.c(l, i, (Object)null);
        }
        this.m = m;
        this.n = n;
        this.o = (int)(n2 - min);
        this.p = (int)(n3 - n2);
    }
    
    public static final /* synthetic */ int s(final w w) {
        return w.j;
    }
    
    public static final /* synthetic */ int u(final w w) {
        return w.p;
    }
    
    public static final /* synthetic */ void w(final w w, final int p2) {
        w.p = p2;
    }
    
    private final Object z(final y y, final d d) {
        final n b = new n(z3.b.b(d), 1);
        b.B();
        synchronized (this) {
            if (this.V(y) < 0L) {
                y.b = (d)b;
            }
            else {
                final k$a e = u3.k.e;
                ((d)b).u(u3.k.a((Object)q.a));
            }
            final q a = q.a;
            monitorexit(this);
            final Object y2 = b.y();
            if (y2 == z3.b.c()) {
                h.c(d);
            }
            if (y2 == z3.b.c()) {
                return y2;
            }
            return q.a;
        }
    }
    
    protected y E() {
        return new y();
    }
    
    protected y[] F(final int n) {
        return new y[n];
    }
    
    protected final Object N() {
        final Object[] l = this.l;
        i4.l.b((Object)l);
        return x.b(l, this.m + this.Q() - 1L);
    }
    
    public final d[] Y(long n) {
        if (n > this.n) {
            return c.a;
        }
        final long m = this.M();
        long n2;
        n = (n2 = this.o + m);
        if (this.j == 0) {
            n2 = n;
            if (this.p > 0) {
                n2 = n + 1L;
            }
        }
        n = n2;
        if (b.e((b)this) != 0) {
            final v4.d[] f = b.f((b)this);
            n = n2;
            if (f != null) {
                final int length = f.length;
                int n3 = 0;
                while (true) {
                    n = n2;
                    if (n3 >= length) {
                        break;
                    }
                    final v4.d d = f[n3];
                    n = n2;
                    if (d != null) {
                        final long a = ((y)d).a;
                        n = n2;
                        if (a >= 0L) {
                            n = n2;
                            if (a < n2) {
                                n = a;
                            }
                        }
                    }
                    ++n3;
                    n2 = n;
                }
            }
        }
        if (n <= this.n) {
            return c.a;
        }
        final long l = this.L();
        int n4;
        if (this.m() > 0) {
            n4 = Math.min(this.p, this.j - (int)(l - n));
        }
        else {
            n4 = this.p;
        }
        d[] a2 = c.a;
        final long n5 = this.p + l;
        long n12;
        long n13;
        if (n4 > 0) {
            a2 = new d[n4];
            final Object[] i = this.l;
            i4.l.b((Object)i);
            final long n6 = l;
            int n7 = 0;
            long n8 = l;
            long n9 = n6;
            while (n8 < n5) {
                final Object b = x.b(i, n8);
                final h0 a3 = x.a;
                if (b != a3) {
                    i4.l.c(b, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    final w.w$a w$a = (w.w$a)b;
                    final int n10 = n7 + 1;
                    a2[n7] = w$a.h;
                    x.c(i, n8, (Object)a3);
                    x.c(i, n9, w$a.g);
                    final long n11 = ++n9;
                    if (n10 >= n4) {
                        break;
                    }
                    n7 = n10;
                    n9 = n11;
                }
                ++n8;
            }
            n12 = n5;
            n13 = n;
            n = n9;
        }
        else {
            n12 = n5;
            n13 = n;
            n = l;
        }
        final int n14 = (int)(n - m);
        if (this.m() == 0) {
            n13 = n;
        }
        long max;
        final long n15 = max = Math.max(this.m, n - Math.min(this.i, n14));
        long n16 = n;
        if (this.j == 0) {
            max = n15;
            n16 = n;
            if (n15 < n12) {
                final Object[] j = this.l;
                i4.l.b((Object)j);
                max = n15;
                n16 = n;
                if (i4.l.a(x.b(j, n15), (Object)x.a)) {
                    n16 = n + 1L;
                    max = n15 + 1L;
                }
            }
        }
        this.X(max, n13, n16, n12);
        this.B();
        final boolean b2 = a2.length == 0;
        d[] k = a2;
        if (b2 ^ true) {
            k = this.K(a2);
        }
        return k;
    }
    
    public final long Z() {
        final long m = this.m;
        if (m < this.n) {
            this.n = m;
        }
        return m;
    }
    
    public Object a(final f f, final d d) {
        return C(this, f, d);
    }
    
    public void b() {
        synchronized (this) {
            this.X(this.L(), this.n, this.L(), this.P());
            final q a = q.a;
        }
    }
    
    public boolean c(final Object o) {
        final d[] a = c.a;
        synchronized (this) {
            final boolean t = this.T(o);
            int i = 0;
            d[] k;
            boolean b;
            if (t) {
                k = this.K(a);
                b = true;
            }
            else {
                b = false;
                k = a;
            }
            monitorexit(this);
            while (i < k.length) {
                final d d = k[i];
                if (d != null) {
                    final k$a e = u3.k.e;
                    d.u(u3.k.a((Object)q.a));
                }
                ++i;
            }
            return b;
        }
    }
    
    public e d(final g g, final int n, final a a) {
        return x.d((v)this, g, n, a);
    }
    
    public Object h(final Object o, final d d) {
        return H(this, o, d);
    }
}
