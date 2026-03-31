package b2;

import java.util.concurrent.Executor;
import com.google.android.gms.common.api.internal.d;
import q1.o;
import android.os.Looper;
import k2.g;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.location.LocationRequest;
import android.content.Context;
import o1.e$a;
import o1.a$d;
import android.app.Activity;
import o1.a$a;
import o1.a;
import o1.a$g;
import e2.b;
import o1.e;

public final class i extends e implements b
{
    static final a$g k;
    public static final a l;
    private static final Object m;
    
    static {
        l = new a("LocationServices.API", (a$a)new f(), k = new a$g());
        m = new Object();
    }
    
    public i(final Activity activity) {
        super(activity, i.l, (a$d)a$d.a, e$a.c);
    }
    
    public i(final Context context) {
        super(context, i.l, (a$d)a$d.a, e$a.c);
    }
    
    private final g r(final LocationRequest locationRequest, final c c) {
        final h h = new h(this, c, (b2.g)b2.m.a);
        return this.i(com.google.android.gms.common.api.internal.f.a().b((p1.i)new j(h, locationRequest)).d((p1.i)h).e(c).c(2436).a());
    }
    
    public final g a(final LocationRequest locationRequest, final e2.e e, final Looper looper) {
        Looper myLooper = looper;
        if (looper == null) {
            myLooper = Looper.myLooper();
            o.i((Object)myLooper, (Object)"invalid null looper");
        }
        return this.r(locationRequest, d.a((Object)e, myLooper, e2.e.class.getSimpleName()));
    }
    
    public final g b() {
        return this.h(com.google.android.gms.common.api.internal.g.a().b((p1.i)b2.l.a).e(2414).a());
    }
    
    public final g e(final e2.e e) {
        return this.j(d.b((Object)e, e2.e.class.getSimpleName()), 2418).g((Executor)b2.o.e, (k2.a)b2.k.a);
    }
    
    protected final String k(final Context context) {
        return null;
    }
}
