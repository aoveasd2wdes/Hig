package d0;

import i4.u;
import u3.k$a;
import r4.x;
import u3.i;
import z3.b;
import q4.a$a;
import u4.b0$a;
import u3.f;
import u4.c0;
import q4.a;
import u4.b0;
import h4.p;
import i4.l;
import java.util.List;
import i4.g;
import u4.e;
import u4.v;
import r4.j0;

public final class j implements h
{
    public static final j.j$a l;
    private final w a;
    private final d b;
    private final j0 c;
    private final v d;
    private final e e;
    private final e f;
    private final k g;
    private final b h;
    private final u3.e i;
    private final u3.e j;
    private final t k;
    
    static {
        l = new j.j$a((g)null);
    }
    
    public j(final w a, final List list, final d b, final j0 c) {
        i4.l.e((Object)a, "storage");
        i4.l.e((Object)list, "initTasksList");
        i4.l.e((Object)b, "corruptionHandler");
        i4.l.e((Object)c, "scope");
        this.a = a;
        this.b = b;
        this.c = c;
        final e o = u4.g.o((p)new j$r(this, (y3.d)null));
        final b0$a a2 = b0.a;
        final a$a e = q4.a.e;
        this.d = u4.g.u(o, c, c0.a(a2, e.a(), e.a()), 0);
        this.e = u4.g.o((p)new j$g(this, (y3.d)null));
        this.f = u4.g.d((p)new j$d(this, (y3.d)null));
        this.g = new k();
        this.h = new b(list);
        this.i = u3.f.a((h4.a)new j$p(this));
        this.j = u3.f.a((h4.a)new j$c(this));
        this.k = new t(c, (h4.l)new j$t(this), (p)j$u.f, (p)new j$v(this, (y3.d)null));
    }
    
    public static final /* synthetic */ k d(final j j) {
        return j.g;
    }
    
    private final Object q(final boolean b, final h4.l l, final y3.d d) {
        if (b) {
            return l.p(d);
        }
        return this.r().c((h4.l)new j$e(l, (y3.d)null), d);
    }
    
    private final n r() {
        return (n)this.j.getValue();
    }
    
    private final Object t(d0.p.a h, final y3.d d) {
        j$f j$f = null;
        Label_0049: {
            if (d instanceof j$f) {
                j$f = (j$f)d;
                final int m = j$f.m;
                if ((m & Integer.MIN_VALUE) != 0x0) {
                    j$f.m = m + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            j$f = new j$f(this, d);
        }
        Object o = j$f.k;
        final Object c = z3.b.c();
        final int i = j$f.m;
        boolean b = true;
        Object a = null;
        Label_0571: {
            Label_0472: {
                if (i != 0) {
                    Label_0153: {
                        if (i == 1) {
                            break Label_0153;
                        }
                        while (true) {
                            if (i != 2) {
                                if (i == 3) {
                                    final Object o2 = j$f.h;
                                    break Label_0162;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            final Object o3 = j$f.j;
                            final Object o4 = j$f.i;
                            final Object o5 = j$f.h;
                            h = (d0.p.a)o3;
                            try {
                                u3.l.b(o);
                                h = (d0.p.a)o4;
                                break Label_0472;
                                final Object o2;
                                h = (d0.p.a)o2;
                                u3.l.b(o);
                                break Label_0472;
                                o2 = j$f.h;
                                continue;
                            }
                            finally {
                                break Label_0472;
                            }
                            break;
                        }
                    }
                }
                u3.l.b(o);
                a = (o = h.a());
                try {
                    final k$a e = u3.k.e;
                    o = a;
                    final d0.v a2 = this.g.a();
                    o = a;
                    Object o6;
                    if (a2 instanceof d0.e) {
                        o = a;
                        final p d2 = h.d();
                        o = a;
                        final y3.g b2 = h.b();
                        o = a;
                        j$f.h = a;
                        o = a;
                        j$f.m = 1;
                        o = a;
                        if ((o6 = this.z(d2, b2, (y3.d)j$f)) == c) {
                            return c;
                        }
                    }
                    else {
                        o = a;
                        if (!(a2 instanceof q)) {
                            o = a;
                            b = (a2 instanceof z);
                        }
                        if (b) {
                            o = a;
                            if (a2 != h.c()) {
                                o = a;
                                i4.l.c((Object)a2, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$0>");
                                o = a;
                                throw ((q)a2).b();
                            }
                            o = a;
                            j$f.h = h;
                            o = a;
                            j$f.i = this;
                            o = a;
                            j$f.j = a;
                            o = a;
                            j$f.m = 2;
                            o = a;
                            if (this.u((y3.d)j$f) == c) {
                                return c;
                            }
                            o = this;
                            final Object o5 = h;
                            h = (d0.p.a)o;
                            o = a;
                            final p d3 = ((d0.p.a)o5).d();
                            o = a;
                            final y3.g b3 = ((d0.p.a)o5).b();
                            o = a;
                            j$f.h = a;
                            o = a;
                            j$f.i = null;
                            o = a;
                            j$f.j = null;
                            o = a;
                            j$f.m = 3;
                            o = a;
                            if ((o6 = ((j)h).z(d3, b3, (y3.d)j$f)) == c) {
                                return c;
                            }
                        }
                        else {
                            o = a;
                            if (a2 instanceof d0.l) {
                                o = a;
                                throw ((d0.l)a2).b();
                            }
                            o = a;
                            o = a;
                            final i j = new i();
                            o = a;
                            throw j;
                        }
                    }
                    o = o6;
                    o = u3.k.a(o);
                    break Label_0571;
                }
                finally {
                    h = (d0.p.a)o;
                }
            }
            final k$a e2 = u3.k.e;
            a = u3.k.a(u3.l.a((Throwable)a));
        }
        x.c((r4.v)h, a);
        return u3.q.a;
    }
    
    private final Object u(y3.d h) {
        Object o = null;
        Label_0045: {
            if (h instanceof j$h) {
                o = h;
                final int l = ((j$h)o).l;
                if ((l & Integer.MIN_VALUE) != 0x0) {
                    ((j$h)o).l = l + Integer.MIN_VALUE;
                    break Label_0045;
                }
            }
            o = new j$h(this, h);
        }
        Object o2 = ((j$h)o).j;
        final Object c = z3.b.c();
        final int i = ((j$h)o).l;
        int j = 0;
        Label_0213: {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        j = ((j$h)o).i;
                        h = (y3.d)((j$h)o).h;
                        try {
                            u3.l.b(o2);
                            break Label_0213;
                        }
                        finally {
                            break Label_0213;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h = (y3.d)((j$h)o).h;
                u3.l.b(o2);
            }
            else {
                u3.l.b(o2);
                final n r = this.r();
                ((j$h)o).h = this;
                ((j$h)o).l = 1;
                o2 = r.e((y3.d)o);
                if (o2 == c) {
                    return c;
                }
                h = (y3.d)this;
            }
            j = ((Number)o2).intValue();
            try {
                final b h2 = ((j)h).h;
                ((j$h)o).h = h;
                ((j$h)o).i = j;
                ((j$h)o).l = 2;
                if (h2.c((y3.d)o) == c) {
                    return c;
                }
                return u3.q.a;
            }
            finally {}
        }
        final Throwable t;
        ((j)h).g.c((d0.v)new q(t, j));
        throw t;
    }
    
    private final Object v(boolean j, final y3.d d) {
        j$i j$i = null;
        Label_0049: {
            if (d instanceof j$i) {
                j$i = (j$i)d;
                final int m = j$i.m;
                if ((m & Integer.MIN_VALUE) != 0x0) {
                    j$i.m = m + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            j$i = new j$i(this, d);
        }
        Object k = j$i.k;
        final Object c = z3.b.c();
        final int i = j$i.m;
        j l = null;
        Label_0344: {
            d0.v a;
            Object e;
            j j3;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l = (j)j$i.h;
                    u3.l.b(k);
                    break Label_0344;
                }
                else {
                    j = j$i.j;
                    a = (d0.v)j$i.i;
                    final j j2 = (j)j$i.h;
                    u3.l.b(k);
                    e = k;
                    j3 = j2;
                }
            }
            else {
                u3.l.b(k);
                a = this.g.a();
                if (!(a instanceof z ^ true)) {
                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542".toString());
                }
                final n r = this.r();
                j$i.h = this;
                j$i.i = a;
                j$i.j = j;
                j$i.m = 1;
                e = r.e((y3.d)j$i);
                if (e == c) {
                    return c;
                }
                j3 = this;
            }
            final int intValue = ((Number)e).intValue();
            final boolean b = a instanceof d0.e;
            int a2;
            if (b) {
                a2 = a.a();
            }
            else {
                a2 = -1;
            }
            if (b && intValue == a2) {
                return a;
            }
            if (j) {
                final n r2 = j3.r();
                final j$j j$j = new j$j(j3, (y3.d)null);
                j$i.h = j3;
                j$i.i = null;
                j$i.m = 2;
                final Object c2 = r2.c((h4.l)j$j, (y3.d)j$i);
                l = j3;
                if ((k = c2) == c) {
                    return c;
                }
            }
            else {
                final n r3 = j3.r();
                final j$k j$k = new j$k(j3, a2, (y3.d)null);
                j$i.h = j3;
                j$i.i = null;
                j$i.m = 3;
                final Object d2 = r3.d((p)j$k, (y3.d)j$i);
                l = j3;
                if ((k = d2) == c) {
                    return c;
                }
            }
        }
        final u3.j j4 = (u3.j)k;
        final d0.v v = (d0.v)j4.a();
        if (j4.b()) {
            l.g.c(v);
        }
        return v;
    }
    
    private final Object w(final y3.d d) {
        return y.a(this.s(), d);
    }
    
    private final Object x(boolean l, y3.d h) {
        Object o = null;
        Label_0049: {
            if (h instanceof j$l) {
                o = h;
                final int p = ((j$l)o).p;
                if ((p & Integer.MIN_VALUE) != 0x0) {
                    ((j$l)o).p = p + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            o = new j$l(this, h);
        }
        Object e = ((j$l)o).n;
        final Object c = z3.b.c();
        final int p2 = ((j$l)o).p;
        final boolean b = true;
        final int n = 0;
        Label_0985: {
            Object i = null;
            Object o2 = null;
            Object o3 = null;
            Label_0844: {
            Label_0602_Outer:
                while (true) {
                    Label_0440: {
                        while (true) {
                            Label_0553: {
                                int m2 = 0;
                                Label_0296: {
                                    switch (p2) {
                                        default: {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        case 6: {
                                            final u u = (u)((j$l)o).j;
                                            final i4.w w = (i4.w)((j$l)o).i;
                                            i = ((j$l)o).h;
                                            try {
                                                u3.l.b(e);
                                            }
                                            finally {
                                                h = (y3.d)i;
                                                break Label_0985;
                                            }
                                        }
                                        case 5: {
                                            l = ((j$l)o).l;
                                            o2 = ((j$l)o).k;
                                            i = ((j$l)o).j;
                                            h = (y3.d)((j$l)o).i;
                                            o3 = ((j$l)o).h;
                                            u3.l.b(e);
                                            break Label_0844;
                                        }
                                        case 3: {
                                            break Label_0296;
                                        }
                                        case 2: {
                                            break Label_0296;
                                        }
                                        case 4:
                                        case 1: {
                                            Label_0351: {
                                                break Label_0351;
                                                final boolean j = ((j$l)o).l;
                                                final Object o4 = h = (y3.d)((j$l)o).h;
                                                l = j;
                                                try {
                                                    u3.l.b(e);
                                                    h = (y3.d)o4;
                                                    l = j;
                                                    break Label_0602_Outer;
                                                    break Label_0602_Outer;
                                                    final boolean k = ((j$l)o).l;
                                                    final Object o5 = h = (y3.d)((j$l)o).h;
                                                    l = k;
                                                    u3.l.b(e);
                                                    h = (y3.d)o5;
                                                    l = k;
                                                    break Label_0440;
                                                    final boolean m = ((j$l)o).l;
                                                    final j h2 = (j)(h = (y3.d)((j$l)o).h);
                                                    l = m;
                                                    u3.l.b(e);
                                                    break Label_0602;
                                                    m2 = ((j$l)o).m;
                                                    final boolean l2 = ((j$l)o).l;
                                                    final Object i2 = ((j$l)o).i;
                                                    final Object o6 = ((j$l)o).h;
                                                    l = l2;
                                                    h = (y3.d)o6;
                                                    try {
                                                        u3.l.b(e);
                                                        l = l2;
                                                        h = (y3.d)o6;
                                                        break Label_0553;
                                                    }
                                                    catch (final c c2) {}
                                                    continue Label_0602_Outer;
                                                }
                                                catch (final c e) {
                                                    break Label_0602_Outer;
                                                }
                                            }
                                        }
                                        case 0: {
                                            u3.l.b(e);
                                            if (l) {
                                                break;
                                            }
                                            break Label_0553;
                                        }
                                    }
                                }
                                try {
                                    ((j$l)o).h = this;
                                    ((j$l)o).l = l;
                                    ((j$l)o).p = 1;
                                    e = this.w((y3.d)o);
                                    if (e == c) {
                                        return c;
                                    }
                                    h = (y3.d)this;
                                    Label_0461: {
                                        if (e != null) {
                                            try {
                                                m2 = e.hashCode();
                                                break Label_0461;
                                            }
                                            catch (final c e) {
                                                continue Label_0602_Outer;
                                            }
                                        }
                                        m2 = 0;
                                    }
                                    final n r = ((j)h).r();
                                    ((j$l)o).h = h;
                                    ((j$l)o).i = e;
                                    ((j$l)o).l = l;
                                    ((j$l)o).m = m2;
                                    ((j$l)o).p = 2;
                                    final Object e2 = r.e((y3.d)o);
                                    if (e2 == c) {
                                        return c;
                                    }
                                    final Object i2 = e;
                                    e = e2;
                                    return new d0.e(i2, m2, ((Number)e).intValue());
                                    final n r2 = this.r();
                                    ((j$l)o).h = this;
                                    ((j$l)o).l = l;
                                    ((j$l)o).p = 3;
                                    e = r2.e((y3.d)o);
                                    iftrue(Label_0596:)(e != c);
                                    return c;
                                    final boolean m;
                                    l = m;
                                    final int intValue = ((Number)e).intValue();
                                    l = m;
                                    final j h2;
                                    final n r3 = h2.r();
                                    l = m;
                                    l = m;
                                    final j$m j$m = new j$m(h2, intValue, (y3.d)null);
                                    l = m;
                                    ((j$l)o).h = h2;
                                    l = m;
                                    ((j$l)o).l = m;
                                    l = m;
                                    ((j$l)o).p = 4;
                                    l = m;
                                    final Object d = r3.d((p)j$m, (y3.d)o);
                                    l = m;
                                    e = d;
                                    iftrue(Label_0733:)(d != c);
                                    return c;
                                    Label_0596: {
                                        h2 = this;
                                    }
                                    m = l;
                                    continue;
                                    e3 = (d0.e)e;
                                    return e3;
                                }
                                catch (final c e) {
                                    h = (y3.d)this;
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
                i = new i4.w();
                final d b2 = ((j)h).b;
                ((j$l)o).h = h;
                ((j$l)o).i = e;
                ((j$l)o).j = i;
                ((j$l)o).k = i;
                ((j$l)o).l = l;
                ((j$l)o).p = 5;
                final Object a = b2.a((c)e, (y3.d)o);
                if (a == c) {
                    return c;
                }
                final Object o7 = e;
                e = a;
                o2 = i;
                o3 = h;
                h = (y3.d)o7;
            }
            ((i4.w)o2).e = e;
            final Object j2 = new u();
            boolean b3;
            if (l) {
                b3 = b;
            }
            else {
                b3 = false;
            }
            try {
                final j$n j$n = new j$n((i4.w)i, (j)o3, (u)j2, (y3.d)null);
                ((j$l)o).h = h;
                ((j$l)o).i = i;
                ((j$l)o).j = j2;
                ((j$l)o).k = null;
                ((j$l)o).p = 6;
                if (((j)o3).q(b3, (h4.l)j$n, (y3.d)o) == c) {
                    return c;
                }
                h = (y3.d)j2;
                final Object e4 = ((i4.w)i).e;
                int hashCode = n;
                if (e4 != null) {
                    hashCode = e4.hashCode();
                }
                return new d0.e(e4, hashCode, ((u)h).e);
            }
            finally {}
        }
        final Throwable t;
        u3.a.a((Throwable)h, t);
        throw h;
    }
    
    private final Object y(final boolean b, final y3.d d) {
        return r4.g.e(this.c.s(), (p)new j$o(this, b, (y3.d)null), d);
    }
    
    private final Object z(final p p3, final y3.g g, final y3.d d) {
        return this.r().c((h4.l)new j$q(this, g, p3, (y3.d)null), d);
    }
    
    public final Object A(Object o, final boolean b, final y3.d d) {
        j$w j$w2 = null;
        Label_0054: {
            if (d instanceof j$w) {
                final j$w j$w = (j$w)d;
                final int k = j$w.k;
                if ((k & Integer.MIN_VALUE) != 0x0) {
                    j$w.k = k + Integer.MIN_VALUE;
                    j$w2 = j$w;
                    break Label_0054;
                }
            }
            j$w2 = new j$w(this, d);
        }
        final Object i = j$w2.i;
        final Object c = b.c();
        final int j = j$w2.k;
        if (j != 0) {
            if (j != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o = j$w2.h;
            u3.l.b(i);
        }
        else {
            u3.l.b(i);
            final u h = new u();
            final d0.x s = this.s();
            o = new j$x(h, this, o, b, (y3.d)null);
            j$w2.h = h;
            j$w2.k = 1;
            if (s.d((p)o, (y3.d)j$w2) == c) {
                return c;
            }
            o = h;
        }
        return a4.b.c(((u)o).e);
    }
    
    public Object a(final p p2, final y3.d d) {
        final a0 a0 = (a0)d.d().a((y3.g.c)a0$a.a.e);
        if (a0 != null) {
            a0.d((h)this);
        }
        return r4.g.e((y3.g)new a0(a0, this), (p)new j$s(this, p2, (y3.d)null), d);
    }
    
    public e b() {
        return this.f;
    }
    
    public final d0.x s() {
        return (d0.x)this.i.getValue();
    }
    
    private final class b extends s
    {
        private List c;
        final j d;
        
        public b(final j d, final List list) {
            i4.l.e((Object)list, "initTasksList");
            this.d = d;
            this.c = v3.l.F((Iterable)list);
        }
        
        protected Object b(final y3.d d) {
            Object o = null;
            Label_0047: {
                if (d instanceof j$b$a) {
                    final j$b$a j$b$a = (j$b$a)d;
                    final int k = j$b$a.k;
                    if ((k & Integer.MIN_VALUE) != 0x0) {
                        j$b$a.k = k + Integer.MIN_VALUE;
                        o = j$b$a;
                        break Label_0047;
                    }
                }
                o = new j$b$a(this, d);
            }
            Object i = ((j$b$a)o).i;
            final Object c = z3.b.c();
            final int j = ((j$b$a)o).k;
            b b;
            if (j != 0) {
                if (j != 1 && j != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b = (b)((j$b$a)o).h;
                u3.l.b(i);
            }
            else {
                u3.l.b(i);
                final List c2 = this.c;
                Object o2 = null;
                Label_0223: {
                    if (c2 != null) {
                        i4.l.b((Object)c2);
                        if (!c2.isEmpty()) {
                            final n c3 = this.d.r();
                            final j$b$b j$b$b = new j$b$b(this.d, this, (y3.d)null);
                            ((j$b$a)o).h = this;
                            ((j$b$a)o).k = 2;
                            if ((o2 = c3.c((h4.l)j$b$b, (y3.d)o)) == c) {
                                return c;
                            }
                            break Label_0223;
                        }
                    }
                    final j d2 = this.d;
                    ((j$b$a)o).h = this;
                    ((j$b$a)o).k = 1;
                    if ((o2 = d2.x(false, (y3.d)o)) == c) {
                        return c;
                    }
                }
                i = o2;
                b = this;
            }
            d0.j.d(b.d).c((d0.v)i);
            return u3.q.a;
        }
    }
}
