package p3;

import com.google.android.gms.maps.model.LatLng;
import h2.n;
import m2.b;

class t implements v, b
{
    private final n a;
    private String b;
    private String c;
    private boolean d;
    
    t(final String c, final String b) {
        this.a = new n();
        this.c = c;
        this.b = b;
    }
    
    public void a(final float n) {
        this.a.z(n);
    }
    
    public void b(final boolean d) {
        this.d = d;
    }
    
    public LatLng c() {
        return this.a.k();
    }
    
    public void d(final float n) {
        this.a.a(n);
    }
    
    public void e(final h2.b b) {
        this.a.p(b);
    }
    
    public void f(final boolean b) {
        this.a.c(b);
    }
    
    public void g(final boolean b) {
        this.a.d(b);
    }
    
    public String getTitle() {
        return this.a.n();
    }
    
    public Float h() {
        return this.a.o();
    }
    
    public void i(final float n, final float n2) {
        this.a.q(n, n2);
    }
    
    public void j(final float n) {
        this.a.v(n);
    }
    
    public void k(final float n, final float n2) {
        this.a.b(n, n2);
    }
    
    public void l(final LatLng latLng) {
        this.a.u(latLng);
    }
    
    public String m() {
        return this.a.m();
    }
    
    public void n(final String s, final String s2) {
        this.a.x(s);
        this.a.w(s2);
    }
    
    n o() {
        return this.a;
    }
    
    String p() {
        return this.b;
    }
    
    boolean q() {
        return this.d;
    }
    
    String r() {
        return this.c;
    }
    
    void s(final n n) {
        n.a(this.a.e());
        n.b(this.a.f(), this.a.g());
        n.c(this.a.r());
        n.d(this.a.s());
        n.p(this.a.h());
        n.q(this.a.i(), this.a.j());
        n.x(this.a.n());
        n.w(this.a.m());
        n.u(this.a.k());
        n.v(this.a.l());
        n.y(this.a.t());
        n.z(this.a.o());
    }
    
    public void setVisible(final boolean b) {
        this.a.y(b);
    }
}
