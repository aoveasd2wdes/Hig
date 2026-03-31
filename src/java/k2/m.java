package k2;

import java.util.concurrent.Executor;

final class m implements r
{
    private final Executor a;
    private final Object b;
    private c c;
    
    public m(final Executor a, final c c) {
        this.b = new Object();
        this.a = a;
        this.c = c;
    }
    
    public final void a(final g g) {
        final Object b = this.b;
        synchronized (b) {
            if (this.c == null) {
                return;
            }
            monitorexit(b);
            this.a.execute((Runnable)new l(this, g));
        }
    }
    
    public final void k() {
        final Object b = this.b;
        synchronized (b) {
            this.c = null;
        }
    }
}
