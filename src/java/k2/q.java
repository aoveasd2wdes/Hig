package k2;

import java.util.concurrent.Executor;

final class q implements r
{
    private final Executor a;
    private final Object b;
    private e c;
    
    public q(final Executor a, final e c) {
        this.b = new Object();
        this.a = a;
        this.c = c;
    }
    
    public final void a(final g g) {
        if (g.l()) {
            final Object b = this.b;
            synchronized (b) {
                if (this.c == null) {
                    return;
                }
                monitorexit(b);
                this.a.execute((Runnable)new p(this, g));
            }
        }
    }
    
    public final void k() {
        final Object b = this.b;
        synchronized (b) {
            this.c = null;
        }
    }
}
