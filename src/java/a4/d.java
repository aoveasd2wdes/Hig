package a4;

import y3.g$c;
import y3.e;
import i4.l;
import y3.g;

public abstract class d extends a
{
    private final g f;
    private transient y3.d g;
    
    public d(final y3.d d) {
        g d2;
        if (d != null) {
            d2 = d.d();
        }
        else {
            d2 = null;
        }
        this(d, d2);
    }
    
    public d(final y3.d d, final g f) {
        super(d);
        this.f = f;
    }
    
    public g d() {
        final g f = this.f;
        l.b((Object)f);
        return f;
    }
    
    protected void t() {
        final y3.d g = this.g;
        if (g != null && g != this) {
            final g.b a = this.d().a((g$c)e.d);
            l.b((Object)a);
            ((e)a).D(g);
        }
        this.g = (y3.d)c.e;
    }
    
    public final y3.d v() {
        Object g;
        if ((g = this.g) == null) {
            final e e = (e)this.d().a((g$c)y3.e.d);
            if (e == null || (g = e.v((y3.d)this)) == null) {
                g = this;
            }
            this.g = (y3.d)g;
        }
        return (y3.d)g;
    }
}
