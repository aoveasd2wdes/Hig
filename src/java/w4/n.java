package w4;

import i4.l;
import java.util.ArrayList;
import i4.g;

public abstract class n
{
    public static Object a(final Object o) {
        return o;
    }
    
    public static final Object c(Object o, final Object o2) {
        if (o == null) {
            o = a(o2);
        }
        else if (o instanceof ArrayList) {
            l.c(o, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList)o).add(o2);
            o = a(o);
        }
        else {
            final ArrayList list = new ArrayList(4);
            list.add(o);
            list.add(o2);
            o = a(list);
        }
        return o;
    }
}
