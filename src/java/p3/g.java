package p3;

import com.google.android.gms.maps.model.CameraPosition;
import k3.c;
import android.content.Context;
import com.google.android.gms.maps.model.LatLngBounds;
import android.graphics.Rect;
import java.util.List;
import com.google.android.gms.maps.GoogleMapOptions;

class g implements m
{
    private final GoogleMapOptions c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private List j;
    private List k;
    private List l;
    private List m;
    private List n;
    private List o;
    private List p;
    private Rect q;
    private String r;
    
    g() {
        this.c = new GoogleMapOptions();
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = true;
        this.h = false;
        this.i = true;
        this.q = new Rect(0, 0, 0, 0);
    }
    
    public void A(final boolean b) {
        this.c.t(b);
    }
    
    public void B(final boolean e) {
        this.e = e;
    }
    
    public void C(final boolean b) {
        this.c.b(b);
    }
    
    public void E(final boolean b) {
        this.c.v(b);
    }
    
    public void F(final boolean b) {
        this.c.n(b);
    }
    
    public void J(final LatLngBounds latLngBounds) {
        this.c.k(latLngBounds);
    }
    
    public void N(final boolean b) {
        this.c.s(b);
    }
    
    public void O(final boolean b) {
        this.c.u(b);
    }
    
    public void Q(final boolean h) {
        this.h = h;
    }
    
    public void T(final boolean b) {
        this.c.r(b);
    }
    
    i a(final int n, final Context context, final c c, final s s) {
        final i i = new i(n, context, c, s, this.c);
        i.N0();
        i.B(this.e);
        i.z(this.f);
        i.w(this.g);
        i.Q(this.h);
        i.o(this.i);
        i.k0(this.d);
        i.W0(this.k);
        i.Y0(this.j);
        i.a1(this.l);
        i.b1(this.m);
        i.V0(this.n);
        i.X0(this.o);
        final Rect q = this.q;
        i.f((float)q.top, (float)q.left, (float)q.bottom, (float)q.right);
        i.c1(this.p);
        i.h0(this.r);
        return i;
    }
    
    void b(final CameraPosition cameraPosition) {
        this.c.a(cameraPosition);
    }
    
    public void c(final List n) {
        this.n = n;
    }
    
    public void d(final List k) {
        this.k = k;
    }
    
    public void e(final List o) {
        this.o = o;
    }
    
    public void f(final float n, final float n2, final float n3, final float n4) {
        this.q = new Rect((int)n2, (int)n, (int)n4, (int)n3);
    }
    
    public void g(final List j) {
        this.j = j;
    }
    
    public void h(final List l) {
        this.l = l;
    }
    
    public void h0(final String r) {
        this.r = r;
    }
    
    public void i(final List m) {
        this.m = m;
    }
    
    public void j(final List p) {
        this.p = p;
    }
    
    public void k(final String s) {
        this.c.m(s);
    }
    
    public void k0(final boolean d) {
        this.d = d;
    }
    
    public void m(final int n) {
        this.c.o(n);
    }
    
    public void o(final boolean i) {
        this.i = i;
    }
    
    public void v0(final boolean b) {
        this.c.l(b);
    }
    
    public void w(final boolean g) {
        this.g = g;
    }
    
    public void w0(final Float n, final Float n2) {
        if (n != null) {
            this.c.q((float)n);
        }
        if (n2 != null) {
            this.c.p((float)n2);
        }
    }
    
    public void z(final boolean f) {
        this.f = f;
    }
}
