package k2;

import java.util.concurrent.Executor;

final class o implements r
{
    private final Executor a;
    private final Object b;
    private d c;
    
    public o(final Executor a, final d c) {
        this.b = new Object();
        this.a = a;
        this.c = c;
    }
    
    public final void a(final g g) {
        if (!g.l() && !g.j()) {
            final Object b = this.b;
            synchronized (b) {
                if (this.c == null) {
                    return;
                }
                monitorexit(b);
                this.a.execute((Runnable)new n(this, g));
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
