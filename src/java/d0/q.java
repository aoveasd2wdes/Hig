package d0;

import i4.g;
import i4.l;

public final class q extends v
{
    private final Throwable b;
    
    public q(final Throwable b, final int n) {
        l.e((Object)b, "readException");
        super(n, (g)null);
        this.b = b;
    }
    
    public final Throwable b() {
        return this.b;
    }
}
