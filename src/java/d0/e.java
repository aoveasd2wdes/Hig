package d0;

import i4.g;

public final class e extends v
{
    private final Object b;
    private final int c;
    
    public e(final Object b, final int c, final int n) {
        super(n, (g)null);
        this.b = b;
        this.c = c;
    }
    
    public final void b() {
        final Object b = this.b;
        boolean b2 = false;
        int hashCode;
        if (b != null) {
            hashCode = b.hashCode();
        }
        else {
            hashCode = 0;
        }
        if (hashCode == this.c) {
            b2 = true;
        }
        if (b2) {
            return;
        }
        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
    }
    
    public final Object c() {
        return this.b;
    }
}
