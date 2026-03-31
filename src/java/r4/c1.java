package r4;

import java.util.concurrent.locks.LockSupport;

public abstract class c1 extends a1
{
    protected abstract Thread Y();
    
    protected void Z(final long n, final b1$b b1$b) {
        o0.m.j0(n, b1$b);
    }
    
    protected final void a0() {
        final Thread y = this.Y();
        if (Thread.currentThread() != y) {
            c.a();
            LockSupport.unpark(y);
        }
    }
}
