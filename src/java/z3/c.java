package z3;

import y3.g;
import a4.a;
import a4.h;
import i4.l;
import y3.d;
import h4.p;

abstract class c
{
    public static d a(final p p3, final Object o, final d d) {
        l.e((Object)p3, "<this>");
        l.e((Object)d, "completion");
        final d a = h.a(d);
        Object a2;
        if (p3 instanceof a) {
            a2 = ((a)p3).a(o, a);
        }
        else {
            final g d2 = a.d();
            if (d2 == y3.h.e) {
                a2 = new c$a(a, p3, o);
            }
            else {
                a2 = new c$b(a, d2, p3, o);
            }
        }
        return (d)a2;
    }
    
    public static d b(final d d) {
        l.e((Object)d, "<this>");
        a4.d d2;
        if (d instanceof a4.d) {
            d2 = (a4.d)d;
        }
        else {
            d2 = null;
        }
        d v = d;
        if (d2 != null) {
            v = d2.v();
            if (v == null) {
                v = d;
            }
        }
        return v;
    }
}
