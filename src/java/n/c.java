package n;

import java.util.concurrent.Executor;

public class c extends e
{
    private static volatile c c;
    private static final Executor d;
    private static final Executor e;
    private e a;
    private final e b;
    
    static {
        d = (Executor)new a();
        e = (Executor)new b();
    }
    
    private c() {
        final d d = new d();
        this.b = d;
        this.a = d;
    }
    
    public static c f() {
        if (n.c.c != null) {
            return n.c.c;
        }
        synchronized (c.class) {
            if (n.c.c == null) {
                n.c.c = new c();
            }
            return n.c.c;
        }
    }
    
    public void a(final Runnable runnable) {
        this.a.a(runnable);
    }
    
    public boolean b() {
        return this.a.b();
    }
    
    public void c(final Runnable runnable) {
        this.a.c(runnable);
    }
}
