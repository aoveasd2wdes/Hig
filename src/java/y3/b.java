package y3;

import h4.l;

public abstract class b implements g$c
{
    private final l e;
    private final g$c f;
    
    public b(final g$c g$c, final l e) {
        i4.l.e((Object)g$c, "baseKey");
        i4.l.e((Object)e, "safeCast");
        this.e = e;
        g$c f = g$c;
        if (g$c instanceof b) {
            f = ((b)g$c).f;
        }
        this.f = f;
    }
    
    public final boolean a(final g$c g$c) {
        i4.l.e((Object)g$c, "key");
        return g$c == this || this.f == g$c;
    }
    
    public final g.b b(final g.b b) {
        i4.l.e((Object)b, "element");
        return (g.b)this.e.p((Object)b);
    }
}
