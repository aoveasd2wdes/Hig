package p3;

import java.util.Iterator;
import java.util.List;
import h2.c0;
import h2.b0;
import r2.b;
import java.util.HashMap;
import f2.c;
import java.util.Map;

public class r
{
    private final Map a;
    private c b;
    
    r() {
        this.a = (Map)new HashMap();
    }
    
    private void a(final String s, final b b) {
        this.a.put((Object)s, (Object)new p(b, this.b.e(new b0().f((c0)b))));
    }
    
    private void c(final Map map) {
        if (map == null) {
            return;
        }
        final o o = new o();
        this.a(f.j(map, (q)o), this.d(o));
    }
    
    private void f(final Map map) {
        if (map == null) {
            return;
        }
        final p p = (p)this.a.get((Object)g(map));
        if (p != null) {
            f.j(map, (q)p);
            p.f();
        }
    }
    
    private static String g(final Map map) {
        return (String)map.get((Object)"heatmapId");
    }
    
    void b(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            this.c(((x.f0)iterator.next()).b());
        }
    }
    
    public b d(final o o) {
        return o.f();
    }
    
    void e(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            this.f(((x.f0)iterator.next()).b());
        }
    }
    
    void h(final List list) {
        for (final String s : list) {
            final p p = (p)this.a.remove((Object)s);
            if (p != null) {
                p.g();
                this.a.remove((Object)s);
            }
        }
    }
    
    void i(final c b) {
        this.b = b;
    }
}
