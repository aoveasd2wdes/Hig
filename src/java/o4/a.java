package o4;

import java.util.Iterator;
import i4.l;
import java.util.concurrent.atomic.AtomicReference;

public final class a implements b
{
    private final AtomicReference a;
    
    public a(final b b) {
        l.e((Object)b, "sequence");
        this.a = new AtomicReference((Object)b);
    }
    
    public Iterator iterator() {
        final b b = (b)this.a.getAndSet((Object)null);
        if (b != null) {
            return b.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
