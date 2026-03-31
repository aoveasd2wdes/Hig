package f0;

import java.util.concurrent.atomic.AtomicBoolean;

public final class a
{
    private final AtomicBoolean a;
    
    public a(final boolean b) {
        this.a = new AtomicBoolean(b);
    }
    
    public final boolean a() {
        return this.a.get();
    }
    
    public final void b(final boolean b) {
        this.a.set(b);
    }
}
