package p3;

import java.util.Iterator;
import java.util.List;
import h2.q;

class c2 implements e2
{
    private final q a;
    private final float b;
    private boolean c;
    
    c2(final float b) {
        this.a = new q();
        this.b = b;
    }
    
    public void a(final float n) {
        this.a.s(n);
    }
    
    public void b(final boolean c) {
        this.c = c;
        this.a.c(c);
    }
    
    public void c(final int n) {
        this.a.p(n);
    }
    
    public void d(final boolean b) {
        this.a.e(b);
    }
    
    public void e(final int n) {
        this.a.d(n);
    }
    
    public void f(final float n) {
        this.a.q(n * this.b);
    }
    
    public void g(final List list) {
        this.a.a((Iterable)list);
    }
    
    public void h(List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list = (List)iterator.next();
            this.a.b((Iterable)list);
        }
    }
    
    q i() {
        return this.a;
    }
    
    boolean j() {
        return this.c;
    }
    
    public void setVisible(final boolean b) {
        this.a.r(b);
    }
}
