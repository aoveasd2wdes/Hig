package e1;

import android.util.Log;
import f3.a$b;
import f3.a;

public final class e implements a
{
    private f c;
    private d d;
    
    public void g(final a$b a$b) {
        final d d = new d(a$b.a());
        this.d = d;
        (this.c = new f(d)).g(a$b.b());
    }
    
    public void k(final a$b a$b) {
        final f c = this.c;
        if (c == null) {
            Log.wtf("GeocodingPlugin", "Already detached from the engine.");
            return;
        }
        c.h();
        this.c = null;
        this.d = null;
    }
}
