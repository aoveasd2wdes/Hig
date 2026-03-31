package y3;

import h4.p;
import i4.l;
import java.io.Serializable;

public final class h implements g, Serializable
{
    public static final h e;
    
    static {
        e = new h();
    }
    
    private h() {
    }
    
    public g A(final g g) {
        l.e((Object)g, "context");
        return g;
    }
    
    public g.b a(final g$c g$c) {
        l.e((Object)g$c, "key");
        return null;
    }
    
    public g h(final g$c g$c) {
        l.e((Object)g$c, "key");
        return (g)this;
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    public Object j(final Object o, final p p2) {
        l.e((Object)p2, "operation");
        return o;
    }
    
    @Override
    public String toString() {
        return "EmptyCoroutineContext";
    }
}
