package y4;

import y3.g;
import r4.g1;

public abstract class f extends g1
{
    private final int h;
    private final int i;
    private final long j;
    private final String k;
    private y4.a l;
    
    public f(final int h, final int i, final long j, final String k) {
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = this.K();
    }
    
    private final y4.a K() {
        return new y4.a(this.h, this.i, this.j, this.k);
    }
    
    public final void M(final Runnable runnable, final i i, final boolean b) {
        this.l.h(runnable, i, b);
    }
    
    @Override
    public void z(final g g, final Runnable runnable) {
        y4.a.i(this.l, runnable, (i)null, false, 6, (Object)null);
    }
}
