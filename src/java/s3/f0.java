package s3;

import java.util.Collection;
import f3.a$b;
import java.util.ArrayList;
import i4.w;
import java.util.Map;
import android.util.Log;
import k3.c;
import u4.g;
import u4.f;
import u4.e;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import h0.f$a;
import u3.q;
import h4.p;
import h0.i;
import i4.l;
import h0.h;
import java.util.List;
import y3.d;
import android.content.Context;
import f3.a;

public final class f0 implements a, b0
{
    private Context c;
    private c0 d;
    private d0 e;
    
    public f0() {
        this.e = (d0)new b();
    }
    
    private final Object t(final String s, final String s2, final d d) {
        final f$a g = h.g(s);
        Context c;
        if ((c = this.c) == null) {
            l.n("context");
            c = null;
        }
        final Object a = i.a(g0.a(c), (p)new f0$b(g, s2, (d)null), d);
        if (a == z3.b.c()) {
            return a;
        }
        return q.a;
    }
    
    private final Object u(final List list, final d d) {
        f0$h f0$h2 = null;
        Label_0051: {
            if (d instanceof f0$h) {
                final f0$h f0$h = (f0$h)d;
                final int o = f0$h.o;
                if ((o & Integer.MIN_VALUE) != 0x0) {
                    f0$h.o = o + Integer.MIN_VALUE;
                    f0$h2 = f0$h;
                    break Label_0051;
                }
            }
            f0$h2 = new f0$h(this, d);
        }
        Object o2 = f0$h2.m;
        final Object c = z3.b.c();
        final int o3 = f0$h2.o;
        while (true) {
            f$a l = null;
            Iterator iterator = null;
            Object o4 = null;
            Set set = null;
            f0 f0 = null;
            Object o5 = null;
            Label_0393: {
                Object o6;
                Set i;
                f0 f2;
                if (o3 != 0) {
                    if (o3 != 1) {
                        if (o3 == 2) {
                            l = (f$a)f0$h2.l;
                            iterator = (Iterator)f0$h2.k;
                            o4 = f0$h2.j;
                            set = (Set)f0$h2.i;
                            f0 = (f0)f0$h2.h;
                            u3.l.b(o2);
                            o5 = o2;
                            break Label_0393;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        o6 = f0$h2.j;
                        i = (Set)f0$h2.i;
                        f2 = (f0)f0$h2.h;
                        u3.l.b(o2);
                    }
                }
                else {
                    u3.l.b(o2);
                    Set j;
                    if (list != null) {
                        j = v3.l.I((Iterable)list);
                    }
                    else {
                        j = null;
                    }
                    i = j;
                    o6 = new LinkedHashMap();
                    f0$h2.h = this;
                    f0$h2.i = i;
                    f0$h2.j = o6;
                    f0$h2.o = 1;
                    o2 = this.w((d)f0$h2);
                    if (o2 == c) {
                        return c;
                    }
                    f2 = this;
                }
                final Set set2 = (Set)o2;
                Object o7 = o6;
                if (set2 == null) {
                    return o7;
                }
                final Iterator iterator2 = ((Iterable)set2).iterator();
                final Set k = i;
                final f0 h = f2;
                final d d2 = (d)f0$h2;
                if (!iterator2.hasNext()) {
                    o7 = o6;
                    return o7;
                }
                l = (f$a)iterator2.next();
                ((f0$h)d2).h = h;
                ((f0$h)d2).i = k;
                ((f0$h)d2).j = o6;
                ((f0$h)d2).k = iterator2;
                ((f0$h)d2).l = l;
                ((f0$h)d2).o = 2;
                final Object v = h.v(l, d2);
                f0$h2 = (f0$h)d2;
                iterator = iterator2;
                o4 = o6;
                set = k;
                f0 = h;
                if ((o5 = v) == c) {
                    return c;
                }
            }
            d d2 = (d)f0$h2;
            Iterator iterator2 = iterator;
            Object o6 = o4;
            Set k = set;
            f0 h = f0;
            if (!g0.c(l.toString(), o5, set)) {
                continue;
            }
            final Object d3 = g0.d(o5, f0.e);
            d2 = (d)f0$h2;
            iterator2 = iterator;
            o6 = o4;
            k = set;
            h = f0;
            if (d3 != null) {
                ((Map)o4).put((Object)l.toString(), d3);
                d2 = (d)f0$h2;
                iterator2 = iterator;
                o6 = o4;
                k = set;
                h = f0;
            }
            continue;
        }
    }
    
    private final Object v(final f$a f$a, final d d) {
        Context c;
        if ((c = this.c) == null) {
            l.n("context");
            c = null;
        }
        return g.n((e)new e(g0.a(c).b(), f$a) {
            final e e;
            final f$a f;
            
            public Object a(final f f, final d d) {
                final Object a = this.e.a((f)new f(f, this.f) {
                    final f e;
                    final f$a f;
                    
                    public final Object h(Object b, final d d) {
                        f0$j$a$a f0$j$a$a2 = null;
                        Label_0051: {
                            if (d instanceof f0$j$a$a) {
                                final f0$j$a$a f0$j$a$a = (f0$j$a$a)d;
                                final int i = f0$j$a$a.i;
                                if ((i & Integer.MIN_VALUE) != 0x0) {
                                    f0$j$a$a.i = i + Integer.MIN_VALUE;
                                    f0$j$a$a2 = f0$j$a$a;
                                    break Label_0051;
                                }
                            }
                            f0$j$a$a2 = new f0$j$a$a(this, d);
                        }
                        final Object h = f0$j$a$a2.h;
                        final Object c = z3.b.c();
                        final int j = f0$j$a$a2.i;
                        if (j != 0) {
                            if (j != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            u3.l.b(h);
                        }
                        else {
                            u3.l.b(h);
                            final f e = this.e;
                            b = ((h0.f)b).b(this.f);
                            f0$j$a$a2.i = 1;
                            if (e.h(b, (d)f0$j$a$a2) == c) {
                                return c;
                            }
                        }
                        return q.a;
                    }
                }, d);
                if (a == z3.b.c()) {
                    return a;
                }
                return q.a;
            }
        }, d);
    }
    
    private final Object w(final d d) {
        Context c;
        if ((c = this.c) == null) {
            l.n("context");
            c = null;
        }
        return g.n((e)new e(g0.a(c).b()) {
            final e e;
            
            public Object a(final f f, final d d) {
                final Object a = this.e.a((f)new f(f) {
                    final f e;
                    
                    public final Object h(final Object o, final d d) {
                        f0$k$a$a f0$k$a$a2 = null;
                        Label_0051: {
                            if (d instanceof f0$k$a$a) {
                                final f0$k$a$a f0$k$a$a = (f0$k$a$a)d;
                                final int i = f0$k$a$a.i;
                                if ((i & Integer.MIN_VALUE) != 0x0) {
                                    f0$k$a$a.i = i + Integer.MIN_VALUE;
                                    f0$k$a$a2 = f0$k$a$a;
                                    break Label_0051;
                                }
                            }
                            f0$k$a$a2 = new f0$k$a$a(this, d);
                        }
                        final Object h = f0$k$a$a2.h;
                        final Object c = z3.b.c();
                        final int j = f0$k$a$a2.i;
                        if (j != 0) {
                            if (j != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            u3.l.b(h);
                        }
                        else {
                            u3.l.b(h);
                            final f e = this.e;
                            final Set keySet = ((h0.f)o).a().keySet();
                            f0$k$a$a2.i = 1;
                            if (e.h((Object)keySet, (d)f0$k$a$a2) == c) {
                                return c;
                            }
                        }
                        return q.a;
                    }
                }, d);
                if (a == z3.b.c()) {
                    return a;
                }
                return q.a;
            }
        }, d);
    }
    
    private final void x(final c c, final Context c2) {
        this.c = c2;
        try {
            b0.b.o(c, (b0)this, "data_store");
            this.d = new c0(c, c2, this.e);
        }
        catch (final Exception ex) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", (Throwable)ex);
        }
    }
    
    public Map a(final List list, final e0 e0) {
        l.e((Object)e0, "options");
        return (Map)r4.g.d((y3.g)null, (p)new f0$c(this, list, (d)null), 1, (Object)null);
    }
    
    public Double b(final String s, final e0 e0) {
        l.e((Object)s, "key");
        l.e((Object)e0, "options");
        final w w = new w();
        r4.g.d((y3.g)null, (p)new f0$e(s, this, w, (d)null), 1, (Object)null);
        return (Double)w.e;
    }
    
    public Long c(final String s, final e0 e0) {
        l.e((Object)s, "key");
        l.e((Object)e0, "options");
        final w w = new w();
        r4.g.d((y3.g)null, (p)new f0$f(s, this, w, (d)null), 1, (Object)null);
        return (Long)w.e;
    }
    
    public void d(final String s, final List list, final e0 e0) {
        l.e((Object)s, "key");
        l.e((Object)list, "value");
        l.e((Object)e0, "options");
        final String a = this.e.a(list);
        final StringBuilder sb = new StringBuilder();
        sb.append("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu");
        sb.append(a);
        r4.g.d((y3.g)null, (p)new f0$p(this, s, sb.toString(), (d)null), 1, (Object)null);
    }
    
    public List e(final String s, final e0 e0) {
        l.e((Object)s, "key");
        l.e((Object)e0, "options");
        final List list = (List)g0.d((Object)this.l(s, e0), this.e);
        List list3;
        if (list != null) {
            final ArrayList list2 = new ArrayList();
            final Iterator iterator = ((Iterable)list).iterator();
            while (true) {
                list3 = (List)list2;
                if (!iterator.hasNext()) {
                    break;
                }
                final Object next = iterator.next();
                if (!(next instanceof String)) {
                    continue;
                }
                ((Collection)list2).add(next);
            }
        }
        else {
            list3 = null;
        }
        return list3;
    }
    
    public void f(final String s, final String s2, final e0 e0) {
        l.e((Object)s, "key");
        l.e((Object)s2, "value");
        l.e((Object)e0, "options");
        r4.g.d((y3.g)null, (p)new f0$o(this, s, s2, (d)null), 1, (Object)null);
    }
    
    public void g(final a$b a$b) {
        l.e((Object)a$b, "binding");
        final c b = a$b.b();
        l.d((Object)b, "binding.binaryMessenger");
        final Context a = a$b.a();
        l.d((Object)a, "binding.applicationContext");
        this.x(b, a);
        new s3.a().g(a$b);
    }
    
    public List h(final List list, final e0 e0) {
        l.e((Object)e0, "options");
        return v3.l.F((Iterable)((Map)r4.g.d((y3.g)null, (p)new f0$g(this, list, (d)null), 1, (Object)null)).keySet());
    }
    
    public void i(final String s, final double n, final e0 e0) {
        l.e((Object)s, "key");
        l.e((Object)e0, "options");
        r4.g.d((y3.g)null, (p)new f0$m(s, this, n, (d)null), 1, (Object)null);
    }
    
    public Boolean j(final String s, final e0 e0) {
        l.e((Object)s, "key");
        l.e((Object)e0, "options");
        final w w = new w();
        r4.g.d((y3.g)null, (p)new f0$d(s, this, w, (d)null), 1, (Object)null);
        return (Boolean)w.e;
    }
    
    public void k(final a$b a$b) {
        l.e((Object)a$b, "binding");
        final b0$a b = b0.b;
        final c b2 = a$b.b();
        l.d((Object)b2, "binding.binaryMessenger");
        b.o(b2, (b0)null, "data_store");
        final c0 d = this.d;
        if (d != null) {
            d.k();
        }
        this.d = null;
    }
    
    public String l(final String s, final e0 e0) {
        l.e((Object)s, "key");
        l.e((Object)e0, "options");
        final w w = new w();
        r4.g.d((y3.g)null, (p)new f0$i(s, this, w, (d)null), 1, (Object)null);
        return (String)w.e;
    }
    
    public void m(final List list, final e0 e0) {
        l.e((Object)e0, "options");
        r4.g.d((y3.g)null, (p)new f0$a(this, list, (d)null), 1, (Object)null);
    }
    
    public void n(final String s, final boolean b, final e0 e0) {
        l.e((Object)s, "key");
        l.e((Object)e0, "options");
        r4.g.d((y3.g)null, (p)new f0$l(s, this, b, (d)null), 1, (Object)null);
    }
    
    public void o(final String s, final long n, final e0 e0) {
        l.e((Object)s, "key");
        l.e((Object)e0, "options");
        r4.g.d((y3.g)null, (p)new f0$n(s, this, n, (d)null), 1, (Object)null);
    }
}
