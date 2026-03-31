package d0;

import e0.a;
import i4.l;
import r4.j0;
import java.util.List;
import e0.b;

public final class i
{
    public static final i a;
    
    static {
        a = new i();
    }
    
    private i() {
    }
    
    public final h a(final w w, final b b, final List list, final j0 j0) {
        l.e(w, "storage");
        l.e(list, "migrations");
        l.e(j0, "scope");
        return (h)new j(w, v3.l.d((Object)g.a.b(list)), (d)new a(), j0);
    }
}
