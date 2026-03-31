package p3;

import java.util.Iterator;
import java.util.List;
import h2.f;
import h2.g;
import java.util.HashMap;
import f2.c;
import java.util.Map;

class d
{
    final Map a;
    private final Map b;
    private final x.c c;
    private final float d;
    private c e;
    
    d(final x.c c, final float d) {
        this.a = (Map)new HashMap();
        this.b = (Map)new HashMap();
        this.c = c;
        this.d = d;
    }
    
    private void a(final String s, final g g, final boolean b) {
        final f a = this.e.a(g);
        this.a.put((Object)s, (Object)new b(a, b, this.d));
        this.b.put((Object)a.a(), (Object)s);
    }
    
    private void d(final x.a0 a0) {
        final b b = (b)this.a.get((Object)a0.c());
        if (b != null) {
            p3.f.i(a0, (p3.c)b);
        }
    }
    
    void b(final x.a0 a0) {
        final a a2 = new a(this.d);
        this.a(p3.f.i(a0, (p3.c)a2), a2.d(), a2.i());
    }
    
    void c(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            this.b((x.a0)iterator.next());
        }
    }
    
    void e(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            this.d((x.a0)iterator.next());
        }
    }
    
    boolean f(String s) {
        s = (String)this.b.get((Object)s);
        if (s == null) {
            return false;
        }
        this.c.J(s, (x.a1)new b2());
        final b b = (b)this.a.get((Object)s);
        return b != null && b.d();
    }
    
    void g(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final b b = (b)this.a.remove((Object)iterator.next());
            if (b != null) {
                b.j();
                this.b.remove((Object)b.i());
            }
        }
    }
    
    void h(final c e) {
        this.e = e;
    }
}
