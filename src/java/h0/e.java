package h0;

import i4.g;
import h4.p;
import f0.c;
import h4.a;
import d0.i;
import i4.l;
import d0.h;
import r4.j0;
import java.util.List;
import e0.b;
import d0.w;

public final class e
{
    public static final e a;
    
    static {
        a = new e();
    }
    
    private e() {
    }
    
    public final h a(final w w, final b b, final List list, final j0 j0) {
        l.e(w, "storage");
        l.e(list, "migrations");
        l.e(j0, "scope");
        return (h)new d(i.a.a(w, b, list, j0));
    }
    
    public final h b(final b b, final List list, final j0 j0, final a a) {
        l.e(list, "migrations");
        l.e(j0, "scope");
        l.e(a, "produceFile");
        return (h)new d(this.a((w)new f0.d(b5.h.b, (c)j.a, (p)null, (a)new e$a(a), 4, (g)null), b, list, j0));
    }
}
