package u4;

import u3.q;
import z3.b;
import y3.d;
import t4.r;
import y3.h;
import t4.a;
import y3.g;
import h4.p;
import v4.e;

class c extends e
{
    private final p h;
    
    public c(final p h, final g g, final int n, final a a) {
        super(g, n, a);
        this.h = h;
    }
    
    static /* synthetic */ Object n(final c c, final r r, final d d) {
        final Object j = c.h.j((Object)r, (Object)d);
        if (j == b.c()) {
            return j;
        }
        return q.a;
    }
    
    @Override
    protected Object h(final r r, final d d) {
        return n(this, r, d);
    }
    
    @Override
    protected e i(final g g, final int n, final a a) {
        return new c(this.h, g, n, a);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("block[");
        sb.append((Object)this.h);
        sb.append("] -> ");
        sb.append(super.toString());
        return sb.toString();
    }
}
