package w4;

import i4.l;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class n0
{
    private static final AtomicIntegerFieldUpdater b;
    private volatile int _size;
    private o0[] a;
    
    static {
        b = AtomicIntegerFieldUpdater.newUpdater((Class)n0.class, "_size");
    }
    
    private final o0[] f() {
        final o0[] a = this.a;
        o0[] array;
        if (a == null) {
            array = new o0[4];
            this.a = array;
        }
        else {
            array = a;
            if (this.c() >= a.length) {
                final Object[] copy = Arrays.copyOf((Object[])a, this.c() * 2);
                l.d((Object)copy, "copyOf(this, newSize)");
                array = (o0[])copy;
                this.a = array;
            }
        }
        return array;
    }
    
    private final void j(final int n) {
        n0.b.set((Object)this, n);
    }
    
    private final void k(int n) {
        int n2 = n;
        while (true) {
            final int n3 = n2 * 2 + 1;
            if (n3 >= this.c()) {
                return;
            }
            final o0[] a = this.a;
            l.b((Object)a);
            final int n4 = n3 + 1;
            n = n3;
            if (n4 < this.c()) {
                final o0 o0 = a[n4];
                l.b((Object)o0);
                final Comparable comparable = (Comparable)o0;
                final o0 o2 = a[n3];
                l.b((Object)o2);
                n = n3;
                if (comparable.compareTo((Object)o2) < 0) {
                    n = n4;
                }
            }
            final o0 o3 = a[n2];
            l.b((Object)o3);
            final Comparable comparable2 = (Comparable)o3;
            final o0 o4 = a[n];
            l.b((Object)o4);
            if (comparable2.compareTo((Object)o4) <= 0) {
                return;
            }
            this.m(n2, n);
            n2 = n;
        }
    }
    
    private final void l(int i) {
        while (i > 0) {
            final o0[] a = this.a;
            l.b((Object)a);
            final int n = (i - 1) / 2;
            final o0 o0 = a[n];
            l.b((Object)o0);
            final Comparable comparable = (Comparable)o0;
            final o0 o2 = a[i];
            l.b((Object)o2);
            if (comparable.compareTo((Object)o2) <= 0) {
                return;
            }
            this.m(i, n);
            i = n;
        }
    }
    
    private final void m(final int n, final int n2) {
        final o0[] a = this.a;
        l.b((Object)a);
        final o0 o0 = a[n2];
        l.b((Object)o0);
        final o0 o2 = a[n];
        l.b((Object)o2);
        a[n] = o0;
        a[n2] = o2;
        o0.d(n);
        o2.d(n2);
    }
    
    public final void a(final o0 o0) {
        o0.b(this);
        final o0[] f = this.f();
        final int c = this.c();
        this.j(c + 1);
        (f[c] = o0).d(c);
        this.l(c);
    }
    
    public final o0 b() {
        final o0[] a = this.a;
        o0 o0;
        if (a != null) {
            o0 = a[0];
        }
        else {
            o0 = null;
        }
        return o0;
    }
    
    public final int c() {
        return n0.b.get((Object)this);
    }
    
    public final boolean d() {
        return this.c() == 0;
    }
    
    public final o0 e() {
        synchronized (this) {
            return this.b();
        }
    }
    
    public final boolean g(final o0 o0) {
        synchronized (this) {
            boolean b;
            if (o0.f() == null) {
                b = false;
            }
            else {
                this.h(o0.j());
                b = true;
            }
            return b;
        }
    }
    
    public final o0 h(final int n) {
        final o0[] a = this.a;
        l.b((Object)a);
        this.j(this.c() - 1);
        Label_0104: {
            if (n < this.c()) {
                this.m(n, this.c());
                final int n2 = (n - 1) / 2;
                if (n > 0) {
                    final o0 o0 = a[n];
                    l.b((Object)o0);
                    final Comparable comparable = (Comparable)o0;
                    final o0 o2 = a[n2];
                    l.b((Object)o2);
                    if (comparable.compareTo((Object)o2) < 0) {
                        this.m(n, n2);
                        this.l(n2);
                        break Label_0104;
                    }
                }
                this.k(n);
            }
        }
        final o0 o3 = a[this.c()];
        l.b((Object)o3);
        o3.b(null);
        o3.d(-1);
        a[this.c()] = null;
        return o3;
    }
    
    public final o0 i() {
        synchronized (this) {
            o0 h;
            if (this.c() > 0) {
                h = this.h(0);
            }
            else {
                h = null;
            }
            return h;
        }
    }
}
