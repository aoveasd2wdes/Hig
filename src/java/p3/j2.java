package p3;

import java.util.Iterator;
import java.util.List;
import h2.r;
import h2.s;
import java.util.HashMap;
import android.content.res.AssetManager;
import f2.c;
import java.util.Map;

class j2
{
    private final Map a;
    private final Map b;
    private final x.c c;
    private c d;
    private final float e;
    private final AssetManager f;
    
    j2(final x.c c, final AssetManager f, final float e) {
        this.f = f;
        this.a = (Map)new HashMap();
        this.b = (Map)new HashMap();
        this.c = c;
        this.e = e;
    }
    
    private void a(final String s, final s s2, final boolean b) {
        final r d = this.d.d(s2);
        this.a.put((Object)s, (Object)new h2(d, b, this.e));
        this.b.put((Object)d.a(), (Object)s);
    }
    
    private void b(final x.t0 t0) {
        final g2 g2 = new g2(this.e);
        this.a(p3.f.o(t0, (i2)g2, this.f, this.e), g2.k(), g2.l());
    }
    
    private void d(final x.t0 t0) {
        final h2 h2 = (h2)this.a.get((Object)t0.i());
        if (h2 != null) {
            p3.f.o(t0, (i2)h2, this.f, this.e);
        }
    }
    
    void c(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            this.b((x.t0)iterator.next());
        }
    }
    
    void e(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            this.d((x.t0)iterator.next());
        }
    }
    
    boolean f(String s) {
        s = (String)this.b.get((Object)s);
        if (s == null) {
            return false;
        }
        this.c.S(s, (x.a1)new b2());
        final h2 h2 = (h2)this.a.get((Object)s);
        return h2 != null && h2.k();
    }
    
    void g(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final h2 h2 = (h2)this.a.remove((Object)iterator.next());
            if (h2 != null) {
                h2.m();
                this.b.remove((Object)h2.l());
            }
        }
    }
    
    void h(final c d) {
        this.d = d;
    }
}
