package p3;

import h2.m;
import java.util.Set;
import java.util.List;
import m2.a;
import java.util.Iterator;
import java.util.Map$Entry;
import m2.c$f;
import f2.c;
import p2.b;
import java.util.HashMap;
import android.content.Context;
import m2.c$c;
import f2.c$b;

class e implements c$b, c$c
{
    private final Context c;
    private final HashMap d;
    private final x$c e;
    private b f;
    private c g;
    private c$f h;
    private e.e$b i;
    
    e(final x$c e, final Context c) {
        this.d = new HashMap();
        this.c = c;
        this.e = e;
    }
    
    private void g(final m2.c c, final c$c c$c, final c$f c$f) {
        c.j(c$c);
        c.k(c$f);
    }
    
    private void h() {
        final Iterator iterator = this.d.entrySet().iterator();
        while (iterator.hasNext()) {
            this.g((m2.c)((Map$Entry)iterator.next()).getValue(), (c$c)this, this.h);
        }
    }
    
    private void j(final Object o) {
        final m2.c c = (m2.c)this.d.remove(o);
        if (c == null) {
            return;
        }
        this.g(c, null, null);
        c.c();
        c.d();
    }
    
    public void G0() {
        final Iterator iterator = this.d.entrySet().iterator();
        while (iterator.hasNext()) {
            ((m2.c)((Map$Entry)iterator.next()).getValue()).G0();
        }
    }
    
    public boolean a(final a a) {
        if (a.e() > 0) {
            this.e.K(p3.f.e(((t[])a.d().toArray((Object[])new t[0]))[0].p(), a), (x$a1)new b2());
        }
        return false;
    }
    
    void b(final String s) {
        final m2.c c = new m2.c(this.c, this.g, this.f);
        c.l((o2.a)new e.e$a(this.c, this.g, c, this));
        this.g(c, (c$c)this, this.h);
        this.d.put((Object)s, (Object)c);
    }
    
    void c(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            this.b(((x$c0)iterator.next()).b());
        }
    }
    
    public void d(final t t) {
        final m2.c c = (m2.c)this.d.get((Object)t.p());
        if (c != null) {
            c.b((m2.b)t);
            c.d();
        }
    }
    
    public Set e(final String s) {
        final m2.c c = (m2.c)this.d.get((Object)s);
        if (c != null) {
            return c.e().e(this.g.g().b);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("getClusters called with invalid clusterManagerId:");
        sb.append(s);
        throw new x$a("Invalid clusterManagerId", sb.toString(), (Object)null);
    }
    
    void f(final c g, final b f) {
        this.f = f;
        this.g = g;
    }
    
    void i(final t t, final m m) {
        final e.e$b i = this.i;
        if (i != null) {
            i.R((m2.b)t, m);
        }
    }
    
    public void k(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            this.j(iterator.next());
        }
    }
    
    public void l(final t t) {
        final m2.c c = (m2.c)this.d.get((Object)t.p());
        if (c != null) {
            c.i((m2.b)t);
            c.d();
        }
    }
    
    void m(final c$f h) {
        this.h = h;
        this.h();
    }
    
    void n(final e.e$b i) {
        this.i = i;
    }
}
