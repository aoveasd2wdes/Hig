package r4;

import java.util.concurrent.locks.LockSupport;
import m4.g;
import java.util.concurrent.RejectedExecutionException;
import i4.l;
import java.util.concurrent.TimeUnit;

public final class o0 extends b1 implements Runnable
{
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final o0 m;
    private static final long n;
    
    static {
        a1.R(m = new o0(), false, 1, null);
        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
        Long n2;
        try {
            n2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        }
        catch (final SecurityException ex) {
            n2 = 1000L;
        }
        n = milliseconds.toNanos((long)n2);
    }
    
    private o0() {
    }
    
    private final void n0() {
        synchronized (this) {
            if (!this.q0()) {
                return;
            }
            o0.debugStatus = 3;
            this.i0();
            i4.l.c((Object)this, "null cannot be cast to non-null type java.lang.Object");
            this.notifyAll();
        }
    }
    
    private final Thread o0() {
        synchronized (this) {
            Thread thread;
            if ((thread = o0._thread) == null) {
                thread = new Thread((Runnable)this, "kotlinx.coroutines.DefaultExecutor");
                (o0._thread = thread).setDaemon(true);
                thread.start();
            }
            return thread;
        }
    }
    
    private final boolean p0() {
        return o0.debugStatus == 4;
    }
    
    private final boolean q0() {
        final int debugStatus = o0.debugStatus;
        return debugStatus == 2 || debugStatus == 3;
    }
    
    private final boolean r0() {
        synchronized (this) {
            if (this.q0()) {
                return false;
            }
            o0.debugStatus = 1;
            i4.l.c((Object)this, "null cannot be cast to non-null type java.lang.Object");
            this.notifyAll();
            return true;
        }
    }
    
    private final void s0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }
    
    @Override
    public void X() {
        o0.debugStatus = 4;
        super.X();
    }
    
    protected Thread Y() {
        Thread thread;
        if ((thread = o0._thread) == null) {
            thread = this.o0();
        }
        return thread;
    }
    
    protected void Z(final long n, final b1$b b1$b) {
        this.s0();
    }
    
    @Override
    public void e0(final Runnable runnable) {
        if (this.p0()) {
            this.s0();
        }
        super.e0(runnable);
    }
    
    public void run() {
        n2.a.d((a1)this);
        c.a();
        try {
            if (!this.r0()) {
                return;
            }
            long n = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long n2 = this.U();
                long n3;
                if (n2 == Long.MAX_VALUE) {
                    c.a();
                    final long nanoTime = System.nanoTime();
                    n3 = n;
                    if (n == Long.MAX_VALUE) {
                        n3 = o0.n + nanoTime;
                    }
                    final long n4 = n3 - nanoTime;
                    if (n4 <= 0L) {
                        return;
                    }
                    n2 = m4.g.d(n2, n4);
                }
                else {
                    n3 = Long.MAX_VALUE;
                }
                n = n3;
                if (n2 > 0L) {
                    if (this.q0()) {
                        return;
                    }
                    c.a();
                    LockSupport.parkNanos((Object)this, n2);
                    n = n3;
                }
            }
        }
        finally {
            o0._thread = null;
            this.n0();
            c.a();
            if (!this.g0()) {
                this.Y();
            }
        }
    }
}
