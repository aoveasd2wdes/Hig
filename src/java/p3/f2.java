package p3;

import java.util.Iterator;
import java.util.List;
import h2.p;
import h2.q;
import java.util.HashMap;
import f2.c;
import java.util.Map;

class f2
{
    private final Map a;
    private final Map b;
    private final x.c c;
    private final float d;
    private c e;
    
    f2(final x.c c, final float d) {
        this.a = (Map)new HashMap();
        this.b = (Map)new HashMap();
        this.c = c;
        this.d = d;
    }
    
    private void a(final String s, final q q, final boolean b) {
        final p c = this.e.c(q);
        this.a.put((Object)s, (Object)new d2(c, b, this.d));
        this.b.put((Object)c.a(), (Object)s);
    }
    
    private void b(final x.s0 s0) {
        final c2 c2 = new c2(this.d);
        this.a(f.n(s0, (e2)c2), c2.i(), c2.j());
    }
    
    private void d(final x.s0 s0) {
        final d2 d2 = (d2)this.a.get((Object)s0.g());
        if (d2 != null) {
            f.n(s0, (e2)d2);
        }
    }
    
    void c(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            this.b((x.s0)iterator.next());
        }
    }
    
    void e(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            this.d((x.s0)iterator.next());
        }
    }
    
    boolean f(String s) {
        s = (String)this.b.get((Object)s);
        if (s == null) {
            return false;
        }
        this.c.R(s, (x.a1)new b2());
        final d2 d2 = (d2)this.a.get((Object)s);
        return d2 != null && d2.i();
    }
    
    void g(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final d2 d2 = (d2)this.a.remove((Object)iterator.next());
            if (d2 != null) {
                d2.k();
                this.b.remove((Object)d2.j());
            }
        }
    }
    
    void h(final c e) {
        this.e = e;
    }
}
