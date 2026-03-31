package d0;

import u3.i;
import u4.e;
import u4.j0;
import i4.l;
import u4.s;

public final class k
{
    private final s a;
    
    public k() {
        final z b = z.b;
        l.c(b, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.a = j0.a((Object)b);
    }
    
    public final v a() {
        return (v)this.a.getValue();
    }
    
    public final e b() {
        return (e)this.a;
    }
    
    public final v c(final v v) {
        l.e(v, "newState");
        final s a = this.a;
        Object value;
        v v2;
        do {
            value = a.getValue();
            final v v3 = (v)value;
            if (!(v3 instanceof q) && !l.a(v3, z.b)) {
                if (v3 instanceof d0.e) {
                    v2 = v3;
                    if (v.a() <= v3.a()) {
                        continue;
                    }
                }
                else {
                    if (v3 instanceof d0.l) {
                        v2 = v3;
                        continue;
                    }
                    throw new i();
                }
            }
            v2 = v;
        } while (!a.g(value, (Object)v2));
        return v2;
    }
}
