package o4;

import java.util.Iterator;
import h4.l;

public final class i implements b
{
    private final b a;
    private final l b;
    
    public i(final b a, final l b) {
        i4.l.e((Object)a, "sequence");
        i4.l.e((Object)b, "transformer");
        this.a = a;
        this.b = b;
    }
    
    public Iterator iterator() {
        return (Iterator)new i$a(this);
    }
}
