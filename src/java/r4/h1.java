package r4;

import y3.d;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.RejectedExecutionException;
import y3.g;
import w4.c;
import java.util.concurrent.Executor;

public final class h1 extends g1 implements r0
{
    private final Executor h;
    
    public h1(final Executor h) {
        this.h = h;
        c.a(this.M());
    }
    
    private final void K(final g g, final RejectedExecutionException ex) {
        u1.c(g, f1.a("The task was rejected", (Throwable)ex));
    }
    
    private final ScheduledFuture N(final ScheduledExecutorService scheduledExecutorService, final Runnable runnable, final g g, final long n) {
        ScheduledFuture schedule;
        try {
            schedule = scheduledExecutorService.schedule(runnable, n, TimeUnit.MILLISECONDS);
        }
        catch (final RejectedExecutionException ex) {
            this.K(g, ex);
            schedule = null;
        }
        return schedule;
    }
    
    public Executor M() {
        return this.h;
    }
    
    public void close() {
        final Executor m = this.M();
        ExecutorService executorService;
        if (m instanceof ExecutorService) {
            executorService = (ExecutorService)m;
        }
        else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }
    
    public boolean equals(final Object o) {
        return o instanceof h1 && ((h1)o).M() == this.M();
    }
    
    public int hashCode() {
        return System.identityHashCode((Object)this.M());
    }
    
    public String toString() {
        return this.M().toString();
    }
    
    public void u(final long n, final m m) {
        final Executor i = this.M();
        final boolean b = i instanceof ScheduledExecutorService;
        Object n2 = null;
        ScheduledExecutorService scheduledExecutorService;
        if (b) {
            scheduledExecutorService = (ScheduledExecutorService)i;
        }
        else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            n2 = this.N(scheduledExecutorService, (Runnable)new i2((g0)this, m), ((d)m).d(), n);
        }
        if (n2 != null) {
            u1.d(m, (Future)n2);
            return;
        }
        o0.m.u(n, m);
    }
    
    public void z(final g g, final Runnable runnable) {
        try {
            final Executor m = this.M();
            r4.c.a();
            m.execute(runnable);
        }
        catch (final RejectedExecutionException ex) {
            r4.c.a();
            this.K(g, ex);
            w0.b().z(g, runnable);
        }
    }
}
