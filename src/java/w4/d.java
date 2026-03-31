package w4;

import h4.p;

public abstract class d
{
    private static final h0 a;
    
    static {
        a = new h0("CLOSED");
    }
    
    public static final /* synthetic */ h0 a() {
        return d.a;
    }
    
    public static final e b(e e) {
        while (true) {
            final Object a = e.a(e);
            if (a == a()) {
                return e;
            }
            final e e2 = (e)a;
            if (e2 == null) {
                if (e.j()) {
                    return e;
                }
                continue;
            }
            else {
                e = e2;
            }
        }
    }
    
    public static final Object c(e0 e0, final long n, final p p3) {
        e0 e2 = e0;
        while (e2.g < n || e2.h()) {
            final Object a = e.a((e)e2);
            if (a == a()) {
                return f0.a(d.a);
            }
            e0 = (e0)a;
            if (e0 == null) {
                final Object o = p3.j(e2.g + 1L, e2);
                if (!((e)e2).l((e)o)) {
                    continue;
                }
                e0 = (e0)o;
                if (e2.h()) {
                    ((e)e2).k();
                    e0 = (e0)o;
                }
            }
            e2 = e0;
        }
        return f0.a(e2);
    }
}
