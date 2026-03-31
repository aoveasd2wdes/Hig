package p3;

import java.util.List;
import h2.p;

class d2 implements e2
{
    private final p a;
    private final String b;
    private final float c;
    private boolean d;
    
    d2(final p a, final boolean d, final float c) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = a.a();
    }
    
    public void a(final float n) {
        this.a.k(n);
    }
    
    public void b(final boolean d) {
        this.d = d;
        this.a.c(d);
    }
    
    public void c(final int n) {
        this.a.h(n);
    }
    
    public void d(final boolean b) {
        this.a.e(b);
    }
    
    public void e(final int n) {
        this.a.d(n);
    }
    
    public void f(final float n) {
        this.a.i(n * this.c);
    }
    
    public void g(final List list) {
        this.a.g(list);
    }
    
    public void h(final List list) {
        this.a.f(list);
    }
    
    boolean i() {
        return this.d;
    }
    
    String j() {
        return this.b;
    }
    
    void k() {
        this.a.b();
    }
    
    public void setVisible(final boolean b) {
        this.a.j(b);
    }
}
