package p3;

import java.util.List;
import h2.e;
import h2.r;

class h2 implements i2
{
    private final r a;
    private final String b;
    private boolean c;
    private final float d;
    
    h2(final r a, final boolean c, final float d) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = a.a();
    }
    
    public void a(final float n) {
        this.a.m(n);
    }
    
    public void b(final boolean c) {
        this.c = c;
        this.a.c(c);
    }
    
    public void c(final e e) {
        this.a.e(e);
    }
    
    public void d(final boolean b) {
        this.a.f(b);
    }
    
    public void e(final List list) {
        this.a.h(list);
    }
    
    public void f(final e e) {
        this.a.j(e);
    }
    
    public void g(final List list) {
        this.a.i(list);
    }
    
    public void h(final int n) {
        this.a.d(n);
    }
    
    public void i(final int n) {
        this.a.g(n);
    }
    
    public void j(final float n) {
        this.a.l(n * this.d);
    }
    
    boolean k() {
        return this.c;
    }
    
    String l() {
        return this.b;
    }
    
    void m() {
        this.a.b();
    }
    
    public void setVisible(final boolean b) {
        this.a.k(b);
    }
}
