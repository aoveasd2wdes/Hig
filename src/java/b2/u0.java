package b2;

import java.util.List;
import java.util.AbstractCollection;

final class u0 extends r0
{
    private final w0 g;
    
    u0(final w0 g, final int n) {
        super(((AbstractCollection)g).size(), n);
        this.g = g;
    }
    
    protected final Object b(final int n) {
        return ((List)this.g).get(n);
    }
}
