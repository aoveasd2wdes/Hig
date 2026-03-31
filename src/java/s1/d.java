package s1;

import com.google.android.gms.common.api.internal.g$a;
import p1.i;
import k2.g;
import q1.r;
import o1.a$d;
import o1.e$a;
import q1.u;
import android.content.Context;
import o1.a;
import q1.t;
import o1.e;

public final class d extends e implements t
{
    private static final a.g k;
    private static final a.a l;
    private static final a m;
    public static final int n = 0;
    
    static {
        m = new a("ClientTelemetry.API", l = (a.a)new c(), k = new a.g());
    }
    
    public d(final Context context, final u u) {
        super(context, d.m, (a$d)u, e$a.c);
    }
    
    public final g d(final r r) {
        final g$a a = com.google.android.gms.common.api.internal.g.a();
        a.d(new n1.c[] { z1.d.a });
        a.c(false);
        a.b((i)new b(r));
        return this.g(a.a());
    }
}
