package p3;

import java.util.Objects;
import io.flutter.plugin.platform.l;
import android.content.Context;
import k3.c;
import io.flutter.plugin.platform.m;

public class j extends m
{
    private final c b;
    private final s c;
    private final k d;
    
    j(final c b, final Context context, final s c) {
        super(u0.a());
        this.b = b;
        this.c = c;
        this.d = new k(context, b);
    }
    
    public l a(final Context context, final int n, final Object o) {
        final x$n0 x$n0 = (x$n0)o;
        Objects.requireNonNull((Object)x$n0);
        final g g = new g();
        final x$l0 j = x$n0.j();
        f.l(j, (p3.m)g);
        g.b(f.a(x$n0.b()));
        g.d(x$n0.d());
        g.g(x$n0.f());
        g.h(x$n0.g());
        g.i(x$n0.h());
        g.c(x$n0.c());
        g.e(x$n0.e());
        g.j(x$n0.i());
        final String d = j.d();
        if (d != null) {
            g.k(d);
        }
        return (l)g.a(n, context, this.b, this.c);
    }
}
