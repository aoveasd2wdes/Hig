package y4;

import java.util.concurrent.TimeUnit;
import w4.i0;

public abstract class l
{
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static g f;
    public static final i g;
    public static final i h;
    
    static {
        a = i0.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");
        b = i0.h("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        c = i0.g("kotlinx.coroutines.scheduler.core.pool.size", m4.g.a(i0.a(), 2), 1, 0, 8, null);
        d = i0.g("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        e = TimeUnit.SECONDS.toNanos(i0.h("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null));
        l.f = (g)y4.e.a;
        g = (i)new j(0);
        h = (i)new j(1);
    }
}
