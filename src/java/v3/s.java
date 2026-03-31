package v3;

import java.util.List;
import java.util.Iterator;
import i4.l;
import java.util.Collection;

abstract class s extends r
{
    public static boolean o(final Collection collection, final Iterable iterable) {
        l.e((Object)collection, "<this>");
        l.e((Object)iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection)iterable);
        }
        final Iterator iterator = iterable.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            if (collection.add(iterator.next())) {
                b = true;
            }
        }
        return b;
    }
    
    private static final boolean p(final Iterable iterable, final h4.l l, final boolean b) {
        final Iterator iterator = iterable.iterator();
        boolean b2 = false;
        while (iterator.hasNext()) {
            if ((boolean)l.p(iterator.next()) == b) {
                iterator.remove();
                b2 = true;
            }
        }
        return b2;
    }
    
    public static Object q(final List list) {
        l.e((Object)list, "<this>");
        Object remove;
        if (list.isEmpty()) {
            remove = null;
        }
        else {
            remove = list.remove(v3.l.i(list));
        }
        return remove;
    }
    
    public static boolean r(final Iterable iterable, final h4.l l) {
        l.e((Object)iterable, "<this>");
        l.e((Object)l, "predicate");
        return p(iterable, l, false);
    }
}
