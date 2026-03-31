package w0;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.CancellationException;
import r4.q1$a;
import r4.q1;
import u3.q;
import h4.p;
import r4.l0;
import y3.d;
import y3.g;
import r4.k0;
import r4.i1;
import i4.l;
import u4.e;
import java.util.concurrent.Executor;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public final class a
{
    private final ReentrantLock a;
    private final Map b;
    
    public a() {
        this.a = new ReentrantLock();
        this.b = (Map)new LinkedHashMap();
    }
    
    public final void a(final Executor executor, final v.a a, final e e) {
        l.e((Object)executor, "executor");
        l.e((Object)a, "consumer");
        l.e((Object)e, "flow");
        final ReentrantLock a2 = this.a;
        ((Lock)a2).lock();
        try {
            if (this.b.get((Object)a) == null) {
                this.b.put((Object)a, (Object)r4.g.b(k0.a((g)i1.a(executor)), (g)null, (l0)null, (p)new a$a(e, a, (d)null), 3, (Object)null));
            }
            final q a3 = q.a;
        }
        finally {
            ((Lock)a2).unlock();
        }
    }
    
    public final void b(final v.a a) {
        l.e((Object)a, "consumer");
        final ReentrantLock a2 = this.a;
        ((Lock)a2).lock();
        try {
            final q1 q1 = (q1)this.b.get((Object)a);
            if (q1 != null) {
                q1$a.a(q1, (CancellationException)null, 1, (Object)null);
            }
            final q1 q2 = (q1)this.b.remove((Object)a);
        }
        finally {
            ((Lock)a2).unlock();
        }
    }
}
