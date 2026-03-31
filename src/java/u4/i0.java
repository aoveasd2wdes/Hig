package u4;

import t4.a;
import y3.g;
import v4.p;
import r4.u1;
import y3.g$c;
import r4.q1;
import v4.d;
import u3.q;
import i4.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v4.m;
import v4.b;

final class i0 extends b implements s, e, m
{
    private static final AtomicReferenceFieldUpdater j;
    private volatile Object _state;
    private int i;
    
    static {
        j = AtomicReferenceFieldUpdater.newUpdater((Class)i0.class, (Class)Object.class, "_state");
    }
    
    public i0(final Object state) {
        this._state = state;
    }
    
    private final boolean r(final Object o, final Object o2) {
        synchronized (this) {
            final AtomicReferenceFieldUpdater j = i0.j;
            final Object value = j.get((Object)this);
            if (o != null && !l.a(value, o)) {
                return false;
            }
            if (l.a(value, o2)) {
                return true;
            }
            j.set((Object)this, o2);
            int i = this.i;
            if ((i & 0x1) == 0x0) {
                ++i;
                this.i = i;
                final d[] n = this.n();
                final q a = q.a;
                monitorexit(this);
                while (true) {
                    final k0[] array = (k0[])n;
                    if (array != null) {
                        for (final k0 k2 : array) {
                            if (k2 != null) {
                                k2.g();
                            }
                        }
                    }
                    synchronized (this) {
                        final int l = this.i;
                        if (l == i) {
                            this.i = i + 1;
                            return true;
                        }
                        this.n();
                        final q a2 = q.a;
                        monitorexit(this);
                        i = l;
                        continue;
                    }
                    break;
                }
            }
            this.i = i + 2;
            return true;
        }
    }
    
    public Object a(f f, y3.d d) {
        Object j = null;
        Label_0049: {
            if (d instanceof i0$a) {
                j = d;
                final int o = ((i0$a)j).o;
                if ((o & Integer.MIN_VALUE) != 0x0) {
                    ((i0$a)j).o = o + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            j = new a4.d(this, d) {
                Object h;
                Object i;
                Object j;
                Object k;
                Object l;
                Object m;
                final i0 n;
                int o;
                
                public final Object s(final Object m) {
                    this.m = m;
                    this.o |= Integer.MIN_VALUE;
                    return this.n.a(null, (y3.d)this);
                }
            };
        }
        Object m = ((i0$a)j).m;
        final Object c = z3.b.c();
        final int o2 = ((i0$a)j).o;
        while (true) {
            Object l2 = null;
            Object k2 = null;
            Object i3 = null;
            Object h2 = null;
            Object o3 = null;
            Label_0567: {
                Object k = null;
                Object i = null;
                Object h = null;
                Label_0299: {
                    Label_0279: {
                        if (o2 != 0) {
                            Label_0731: {
                                Label_0230: {
                                    if (o2 == 1) {
                                        break Label_0230;
                                    }
                                    Label_0161: {
                                        if (o2 == 2) {
                                            break Label_0161;
                                        }
                                        Label_0151: {
                                            if (o2 != 3) {
                                                break Label_0151;
                                            }
                                            final Object l = ((i0$a)j).l;
                                            k = ((i0$a)j).k;
                                            i = ((i0$a)j).j;
                                            final Object i2 = ((i0$a)j).i;
                                            h = ((i0$a)j).h;
                                            d = (y3.d)i;
                                            f = (f)h;
                                            try {
                                                u3.l.b(m);
                                                m = j;
                                                break Label_0340;
                                                l2 = ((i0$a)j).l;
                                                k2 = ((i0$a)j).k;
                                                h = ((i0$a)j).j;
                                                i3 = ((i0$a)j).i;
                                                h2 = ((i0$a)j).h;
                                                d = (y3.d)h;
                                                f = (f)h2;
                                                u3.l.b(m);
                                                o3 = j;
                                                break Label_0567;
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                i = ((i0$a)j).j;
                                                k = ((i0$a)j).i;
                                                h = ((i0$a)j).h;
                                                d = (y3.d)i;
                                                f = (f)h;
                                                u3.l.b(m);
                                                break Label_0299;
                                            }
                                            finally {
                                                break Label_0731;
                                            }
                                        }
                                    }
                                }
                                break Label_0279;
                            }
                            ((b)f).l((d)d);
                        }
                    }
                    u3.l.b(m);
                    i = this.i();
                    h = this;
                    k = f;
                }
                final q1 q1 = (q1)((y3.d)j).d().a((g$c)r4.q1.b);
                final Object i2 = k;
                k = q1;
                final Object l = null;
                m = j;
                final Object value = i0.j.get(h);
                if (k != null) {
                    u1.e((q1)k);
                }
                if (l != null) {
                    o3 = m;
                    k2 = k;
                    j = i;
                    i3 = i2;
                    h2 = h;
                    l2 = l;
                    if (i4.l.a(l, value)) {
                        break Label_0567;
                    }
                }
                Object o4;
                if (value == p.a) {
                    o4 = null;
                }
                else {
                    o4 = value;
                }
                ((i0$a)m).h = h;
                ((i0$a)m).i = i2;
                ((i0$a)m).j = i;
                ((i0$a)m).k = k;
                ((i0$a)m).l = value;
                ((i0$a)m).o = 2;
                if (((f)i2).h(o4, (y3.d)m) == c) {
                    return c;
                }
                l2 = value;
                h2 = h;
                i3 = i2;
                j = i;
                k2 = k;
                o3 = m;
            }
            m = o3;
            Object k = k2;
            Object i = j;
            Object i2 = i3;
            Object h = h2;
            Object l = l2;
            if (((k0)j).h()) {
                continue;
            }
            ((i0$a)o3).h = h2;
            ((i0$a)o3).i = i3;
            ((i0$a)o3).j = j;
            ((i0$a)o3).k = k2;
            ((i0$a)o3).l = l2;
            ((i0$a)o3).o = 3;
            final Object e = ((k0)j).e((y3.d)o3);
            m = o3;
            k = k2;
            i = j;
            i2 = i3;
            h = h2;
            l = l2;
            if (e == c) {
                return c;
            }
            continue;
        }
    }
    
    public void b() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }
    
    public boolean c(final Object value) {
        this.setValue(value);
        return true;
    }
    
    public e d(final g g, final int n, final a a) {
        return j0.d((h0)this, g, n, a);
    }
    
    public boolean g(Object a, final Object o) {
        Object a2 = a;
        if (a == null) {
            a2 = p.a;
        }
        if ((a = o) == null) {
            a = p.a;
        }
        return this.r(a2, a);
    }
    
    public Object getValue() {
        Object value;
        if ((value = i0.j.get((Object)this)) == p.a) {
            value = null;
        }
        return value;
    }
    
    public Object h(final Object value, final y3.d d) {
        this.setValue(value);
        return q.a;
    }
    
    protected k0 p() {
        return new k0();
    }
    
    protected k0[] q(final int n) {
        return new k0[n];
    }
    
    public void setValue(final Object o) {
        Object a = o;
        if (o == null) {
            a = p.a;
        }
        this.r(null, a);
    }
}
