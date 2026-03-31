package y2;

import w2.f0;
import java.util.HashMap;
import java.util.Map;

public abstract class h
{
    public static Map a(final e e) {
        final f0 d = e.d();
        Object o;
        if (d != null) {
            o = new HashMap();
            ((Map)o).put((Object)"sql", (Object)d.c());
            ((Map)o).put((Object)"arguments", (Object)d.b());
        }
        else {
            o = null;
        }
        return (Map)o;
    }
}
