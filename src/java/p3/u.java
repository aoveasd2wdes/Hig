package p3;

import java.lang.ref.Reference;
import com.google.android.gms.maps.model.LatLng;
import h2.b;
import h2.m;
import java.lang.ref.WeakReference;

class u implements v
{
    private final WeakReference a;
    private final String b;
    private boolean c;
    
    u(final m m, final boolean c) {
        this.a = new WeakReference((Object)m);
        this.c = c;
        this.b = m.a();
    }
    
    public void a(final float n) {
        final m m = (m)((Reference)this.a).get();
        if (m == null) {
            return;
        }
        m.s(n);
    }
    
    public void b(final boolean c) {
        if (((Reference)this.a).get() == null) {
            return;
        }
        this.c = c;
    }
    
    boolean c() {
        return this.c;
    }
    
    public void d(final float n) {
        final m m = (m)((Reference)this.a).get();
        if (m == null) {
            return;
        }
        m.h(n);
    }
    
    public void e(final b b) {
        final m m = (m)((Reference)this.a).get();
        if (m == null) {
            return;
        }
        m.l(b);
    }
    
    public void f(final boolean b) {
        final m m = (m)((Reference)this.a).get();
        if (m == null) {
            return;
        }
        m.j(b);
    }
    
    public void g(final boolean b) {
        final m m = (m)((Reference)this.a).get();
        if (m == null) {
            return;
        }
        m.k(b);
    }
    
    String h() {
        return this.b;
    }
    
    public void i(final float n, final float n2) {
        final m m = (m)((Reference)this.a).get();
        if (m == null) {
            return;
        }
        m.m(n, n2);
    }
    
    public void j(final float n) {
        final m m = (m)((Reference)this.a).get();
        if (m == null) {
            return;
        }
        m.o(n);
    }
    
    public void k(final float n, final float n2) {
        final m m = (m)((Reference)this.a).get();
        if (m == null) {
            return;
        }
        m.i(n, n2);
    }
    
    public void l(final LatLng latLng) {
        final m m = (m)((Reference)this.a).get();
        if (m == null) {
            return;
        }
        m.n(latLng);
    }
    
    public void m() {
        final m m = (m)((Reference)this.a).get();
        if (m == null) {
            return;
        }
        m.e();
    }
    
    public void n(final String s, final String s2) {
        final m m = (m)((Reference)this.a).get();
        if (m == null) {
            return;
        }
        m.q(s);
        m.p(s2);
    }
    
    public boolean o() {
        final m m = (m)((Reference)this.a).get();
        return m != null && m.f();
    }
    
    void p(final p2.b.a a) {
        final m m = (m)((Reference)this.a).get();
        if (m == null) {
            return;
        }
        a.j(m);
    }
    
    public void q() {
        final m m = (m)((Reference)this.a).get();
        if (m == null) {
            return;
        }
        m.t();
    }
    
    public void setVisible(final boolean b) {
        final m m = (m)((Reference)this.a).get();
        if (m == null) {
            return;
        }
        m.r(b);
    }
}
