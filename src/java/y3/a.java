package y3;

import h4.p;
import i4.l;

public abstract class a implements g$b
{
    private final g$c e;
    
    public a(final g$c e) {
        l.e((Object)e, "key");
        this.e = e;
    }
    
    public g A(final g g) {
        return g$b$a.d((g$b)this, g);
    }
    
    public g$b a(final g$c g$c) {
        return g$b$a.b((g$b)this, g$c);
    }
    
    public g$c getKey() {
        return this.e;
    }
    
    public g h(final g$c g$c) {
        return g$b$a.c((g$b)this, g$c);
    }
    
    public Object j(final Object o, final p p2) {
        return g$b$a.a((g$b)this, o, p2);
    }
}
