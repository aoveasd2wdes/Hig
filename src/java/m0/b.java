package m0;

import i4.l;
import i4.g;

public final class b extends a
{
    public b() {
        this(null, 1, null);
    }
    
    public b(final a a) {
        l.e((Object)a, "initialExtras");
        this.a().putAll(a.a());
    }
    
    public final void b(final a$b a$b, final Object o) {
        l.e((Object)a$b, "key");
        this.a().put((Object)a$b, o);
    }
}
