package h0;

import java.util.Arrays;
import i4.l;
import java.util.Map;

public abstract class g
{
    public static final f a() {
        return (f)new c((Map)null, true, 1, (i4.g)null);
    }
    
    public static final c b(final f.b... array) {
        l.e(array, "pairs");
        final c c = new c((Map)null, false, 1, (i4.g)null);
        c.h((f.b[])Arrays.copyOf((Object[])array, array.length));
        return c;
    }
}
