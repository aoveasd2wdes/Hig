package k4;

import i4.l;
import java.util.Random;

public final class b extends a
{
    private final b$a g;
    
    public b() {
        this.g = new b$a();
    }
    
    @Override
    public Random c() {
        final Object value = ((ThreadLocal)this.g).get();
        l.d(value, "get(...)");
        return (Random)value;
    }
}
