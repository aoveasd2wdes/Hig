package y0;

import r4.w0;
import h4.p;
import u4.g;
import y3.d;
import u4.e;
import android.app.Activity;
import i4.l;
import z0.a;

public final class i implements f
{
    private final m b;
    private final a c;
    
    public i(final m b, final a c) {
        l.e((Object)b, "windowMetricsCalculator");
        l.e((Object)c, "windowBackend");
        this.b = b;
        this.c = c;
    }
    
    public e a(final Activity activity) {
        l.e((Object)activity, "activity");
        return g.q(g.c((p)new i$a(this, activity, (d)null)), (y3.g)w0.c());
    }
}
