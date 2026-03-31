package d0;

import i4.g;

public final class l extends v
{
    private final Throwable b;
    
    public l(final Throwable b) {
        i4.l.e((Object)b, "finalException");
        super(Integer.MAX_VALUE, (g)null);
        this.b = b;
    }
    
    public final Throwable b() {
        return this.b;
    }
}
