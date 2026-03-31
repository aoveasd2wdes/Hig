package p3;

import com.google.android.gms.maps.model.LatLng;
import java.util.Iterator;
import java.util.List;
import h2.m;
import java.util.Objects;
import android.content.res.AssetManager;
import p2.b$a;
import java.util.HashMap;

class w
{
    private final HashMap a;
    private final HashMap b;
    private final HashMap c;
    private final x.c d;
    private b$a e;
    private final e f;
    private final AssetManager g;
    private final float h;
    private final f.b i;
    
    w(final x.c d, final e f, final AssetManager g, final float h, final f.b i) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = d;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    private void a(final t t) {
        if (t == null) {
            return;
        }
        final String r = t.r();
        this.a.put((Object)r, (Object)t);
        if (t.p() == null) {
            this.d(r, t);
        }
        else {
            this.c(t);
        }
    }
    
    private void b(final x.o0 o0) {
        final t t = new t(o0.j(), o0.d());
        p3.f.m(o0, (v)t, this.g, this.h, this.i);
        this.a(t);
    }
    
    private void c(final t t) {
        this.f.d(t);
    }
    
    private void d(final String s, final t t) {
        this.h(s, this.e.i(t.o()), t.q());
    }
    
    private void f(final x.o0 o0) {
        final String j = o0.j();
        final t t = (t)this.a.get((Object)j);
        if (t == null) {
            return;
        }
        if (!Objects.equals((Object)o0.d(), (Object)t.p())) {
            this.r(j);
            this.b(o0);
            return;
        }
        p3.f.m(o0, (v)t, this.g, this.h, this.i);
        final u u = (u)this.b.get((Object)j);
        if (u != null) {
            p3.f.m(o0, (v)u, this.g, this.h, this.i);
        }
    }
    
    private void h(final String s, final m m, final boolean b) {
        this.b.put((Object)s, (Object)new u(m, b));
        this.c.put((Object)m.a(), (Object)s);
    }
    
    private void r(final String s) {
        final t t = (t)this.a.remove((Object)s);
        if (t == null) {
            return;
        }
        final u u = (u)this.b.remove((Object)s);
        if (t.p() != null) {
            this.f.l(t);
        }
        else if (u != null) {
            final b$a e = this.e;
            if (e != null) {
                u.p(e);
            }
        }
        if (u != null) {
            this.c.remove((Object)u.h());
        }
    }
    
    void e(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            this.b((x.o0)iterator.next());
        }
    }
    
    void g(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            this.f((x.o0)iterator.next());
        }
    }
    
    void i(final String s) {
        final u u = (u)this.b.get((Object)s);
        if (u != null) {
            u.m();
            return;
        }
        throw new x.a("Invalid markerId", "hideInfoWindow called with invalid markerId", null);
    }
    
    boolean j(final String s) {
        final u u = (u)this.b.get((Object)s);
        if (u != null) {
            return u.o();
        }
        throw new x.a("Invalid markerId", "isInfoWindowShown called with invalid markerId", null);
    }
    
    public void k(final t t, final m m) {
        if (this.a.get((Object)t.r()) == t) {
            this.h(t.r(), m, t.q());
        }
    }
    
    void l(String s) {
        s = (String)this.c.get((Object)s);
        if (s == null) {
            return;
        }
        this.d.L(s, (x.a1)new b2());
    }
    
    boolean m(String s) {
        s = (String)this.c.get((Object)s);
        return s != null && this.q(s);
    }
    
    void n(String s, final LatLng latLng) {
        s = (String)this.c.get((Object)s);
        if (s == null) {
            return;
        }
        this.d.N(s, p3.f.u(latLng), (x.a1)new b2());
    }
    
    void o(String s, final LatLng latLng) {
        s = (String)this.c.get((Object)s);
        if (s == null) {
            return;
        }
        this.d.O(s, p3.f.u(latLng), (x.a1)new b2());
    }
    
    void p(String s, final LatLng latLng) {
        s = (String)this.c.get((Object)s);
        if (s == null) {
            return;
        }
        this.d.P(s, p3.f.u(latLng), (x.a1)new b2());
    }
    
    boolean q(final String s) {
        this.d.Q(s, (x.a1)new b2());
        final u u = (u)this.b.get((Object)s);
        return u != null && u.c();
    }
    
    void s(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            this.r((String)iterator.next());
        }
    }
    
    void t(final b$a e) {
        this.e = e;
    }
    
    void u(final String s) {
        final u u = (u)this.b.get((Object)s);
        if (u != null) {
            u.q();
            return;
        }
        throw new x.a("Invalid markerId", "showInfoWindow called with invalid markerId", null);
    }
}
