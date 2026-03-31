package o4;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import h4.l;

abstract class h extends g
{
    public static b c(final b b, final l l) {
        i4.l.e((Object)b, "<this>");
        i4.l.e((Object)l, "transform");
        return (b)new i(b, l);
    }
    
    public static List d(final b b) {
        i4.l.e((Object)b, "<this>");
        final Iterator iterator = b.iterator();
        if (!iterator.hasNext()) {
            return v3.l.h();
        }
        Object o = iterator.next();
        if (!iterator.hasNext()) {
            return v3.l.d(o);
        }
        final ArrayList list = new ArrayList();
        while (true) {
            list.add(o);
            if (!iterator.hasNext()) {
                break;
            }
            o = iterator.next();
        }
        return (List)list;
    }
}
