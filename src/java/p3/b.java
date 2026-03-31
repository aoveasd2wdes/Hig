package p3;

import com.google.android.gms.maps.model.LatLng;
import h2.f;

class b implements c
{
    private final f a;
    private final String b;
    private final float c;
    private boolean d;
    
    b(final f a, final boolean d, final float c) {
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = a.a();
    }
    
    public void a(final float n) {
        this.a.j(n);
    }
    
    public void b(final boolean d) {
        this.d = d;
        this.a.d(d);
    }
    
    public void c(final int n) {
        this.a.g(n);
    }
    
    boolean d() {
        return this.d;
    }
    
    public void e(final int n) {
        this.a.e(n);
    }
    
    public void f(final float n) {
        this.a.h(n * this.c);
    }
    
    public void g(final double n) {
        this.a.f(n);
    }
    
    public void h(final LatLng latLng) {
        this.a.c(latLng);
    }
    
    String i() {
        return this.b;
    }
    
    void j() {
        this.a.b();
    }
    
    public void setVisible(final boolean b) {
        this.a.i(b);
    }
}
