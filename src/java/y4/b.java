package y4;

import y3.h;
import m4.g;
import w4.i0;
import r4.g0;
import java.util.concurrent.Executor;
import r4.g1;

public final class b extends g1 implements Executor
{
    public static final b h;
    private static final g0 i;
    
    static {
        h = new b();
        i = m.g.J(i0.g("kotlinx.coroutines.io.parallelism", m4.g.a(64, i0.a()), 0, 0, 12, (Object)null));
    }
    
    private b() {
    }
    
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }
    
    public void execute(final Runnable runnable) {
        this.z((y3.g)y3.h.e, runnable);
    }
    
    public String toString() {
        return "Dispatchers.IO";
    }
    
    public void z(final y3.g g, final Runnable runnable) {
        b.i.z(g, runnable);
    }
}
