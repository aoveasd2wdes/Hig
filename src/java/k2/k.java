package k2;

import java.util.concurrent.Executor;

final class k implements r
{
    private final Executor a;
    private final a b;
    private final w c;
    
    public k(final Executor a, final a b, final w c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final g g) {
        this.a.execute((Runnable)new j(this, g));
    }
    
    public final void k() {
        throw new UnsupportedOperationException();
    }
}
