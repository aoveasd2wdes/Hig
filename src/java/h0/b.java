package h0;

import java.util.concurrent.atomic.AtomicBoolean;

public final class b
{
    private final AtomicBoolean a;
    
    public b(final boolean b) {
        this.a = new AtomicBoolean(b);
    }
    
    public final boolean a() {
        return this.a.get();
    }
    
    public final void b(final boolean b) {
        this.a.set(b);
    }
}
