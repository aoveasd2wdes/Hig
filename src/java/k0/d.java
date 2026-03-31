package k0;

import i4.l;
import j0.o;

public abstract class d extends RuntimeException
{
    private final o e;
    
    public d(final o e, final String s) {
        l.e((Object)e, "fragment");
        super(s);
        this.e = e;
    }
    
    public final o a() {
        return this.e;
    }
}
