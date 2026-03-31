package p3;

import com.google.android.gms.maps.model.LatLng;
import h2.g;

class a implements c
{
    private final g a;
    private final float b;
    private boolean c;
    
    a(final float b) {
        this.a = new g();
        this.b = b;
    }
    
    public void a(final float n) {
        this.a.q(n);
    }
    
    public void b(final boolean c) {
        this.c = c;
        this.a.b(c);
    }
    
    public void c(final int n) {
        this.a.n(n);
    }
    
    g d() {
        return this.a;
    }
    
    public void e(final int n) {
        this.a.c(n);
    }
    
    public void f(final float n) {
        this.a.o(n * this.b);
    }
    
    public void g(final double n) {
        this.a.m(n);
    }
    
    public void h(final LatLng latLng) {
        this.a.a(latLng);
    }
    
    boolean i() {
        return this.c;
    }
    
    public void setVisible(final boolean b) {
        this.a.p(b);
    }
}
