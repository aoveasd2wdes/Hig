package d0;

import java.util.concurrent.atomic.AtomicInteger;

public final class a
{
    private final AtomicInteger a;
    
    public a(final int n) {
        this.a = new AtomicInteger(n);
    }
    
    public final int a() {
        return this.a.decrementAndGet();
    }
    
    public final int b() {
        return this.a.get();
    }
    
    public final int c() {
        return this.a.getAndIncrement();
    }
    
    public final int d() {
        return this.a.incrementAndGet();
    }
}
