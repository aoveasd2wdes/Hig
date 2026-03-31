package p3;

import java.util.List;
import h2.e;
import h2.s;

class g2 implements i2
{
    private final s a;
    private boolean b;
    private final float c;
    
    g2(final float c) {
        this.a = new s();
        this.c = c;
    }
    
    public void a(final float n) {
        this.a.v(n);
    }
    
    public void b(final boolean b) {
        this.b = b;
        this.a.b(b);
    }
    
    public void c(final e e) {
        this.a.d(e);
    }
    
    public void d(final boolean b) {
        this.a.e(b);
    }
    
    public void e(final List list) {
        this.a.r(list);
    }
    
    public void f(final e e) {
        this.a.s(e);
    }
    
    public void g(final List list) {
        this.a.a((Iterable)list);
    }
    
    public void h(final int n) {
        this.a.c(n);
    }
    
    public void i(final int n) {
        this.a.q(n);
    }
    
    public void j(final float n) {
        this.a.u(n * this.c);
    }
    
    s k() {
        return this.a;
    }
    
    boolean l() {
        return this.b;
    }
    
    public void setVisible(final boolean b) {
        this.a.t(b);
    }
}
