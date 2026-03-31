package p3;

import h2.a0;
import java.util.Iterator;
import java.util.List;
import h2.c0;
import java.util.HashMap;
import f2.c;
import java.util.Map;

class n2
{
    private final Map a;
    private final x.c b;
    private c c;
    
    n2(final x.c b) {
        this.a = (Map)new HashMap();
        this.b = b;
    }
    
    private void a(final x.x0 x0) {
        final k2 k2 = new k2();
        final String p = f.p(x0, (m2)k2);
        k2.e((c0)new p2(this.b, p));
        this.a.put((Object)p, (Object)new l2(this.c.e(k2.d())));
    }
    
    private void c(final x.x0 x0) {
        final l2 l2 = (l2)this.a.get((Object)x0.c());
        if (l2 != null) {
            f.p(x0, (m2)l2);
        }
    }
    
    private void g(final String s) {
        final l2 l2 = (l2)this.a.get((Object)s);
        if (l2 != null) {
            l2.f();
            this.a.remove((Object)s);
        }
    }
    
    void b(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            this.a((x.x0)iterator.next());
        }
    }
    
    void d(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            this.c((x.x0)iterator.next());
        }
    }
    
    void e(final String s) {
        if (s == null) {
            return;
        }
        final l2 l2 = (l2)this.a.get((Object)s);
        if (l2 != null) {
            l2.d();
        }
    }
    
    a0 f(final String s) {
        if (s == null) {
            return null;
        }
        final l2 l2 = (l2)this.a.get((Object)s);
        if (l2 == null) {
            return null;
        }
        return l2.e();
    }
    
    void h(final List list) {
        if (list == null) {
            return;
        }
        for (final String s : list) {
            if (s == null) {
                continue;
            }
            this.g(s);
        }
    }
    
    void i(final c c) {
        this.c = c;
    }
}
