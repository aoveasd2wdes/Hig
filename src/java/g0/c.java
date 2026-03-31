package g0;

import java.util.List;
import h0.e;
import android.content.Context;
import e0.b;
import d0.h;
import r4.j0;
import h4.l;
import j4.a;

public final class c implements a
{
    private final String a;
    private final l b;
    private final j0 c;
    private final Object d;
    private volatile h e;
    
    public c(final String a, final b b, final l b2, final j0 c) {
        i4.l.e((Object)a, "name");
        i4.l.e((Object)b2, "produceMigrations");
        i4.l.e((Object)c, "scope");
        this.a = a;
        this.b = b2;
        this.c = c;
        this.d = new Object();
    }
    
    public h c(final Context context, n4.h h) {
        i4.l.e((Object)context, "thisRef");
        i4.l.e((Object)h, "property");
        if ((h = (n4.h)this.e) == null) {
            final Object d = this.d;
            synchronized (d) {
                if (this.e == null) {
                    h = (n4.h)context.getApplicationContext();
                    final e a = h0.e.a;
                    final l b = this.b;
                    i4.l.d((Object)h, "applicationContext");
                    this.e = a.b((b)null, (List)b.p(h), this.c, (h4.a)new c$a((Context)h, this));
                }
                h = (n4.h)this.e;
                i4.l.b((Object)h);
            }
        }
        return (h)h;
    }
}
