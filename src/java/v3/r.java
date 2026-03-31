package v3;

import java.util.Collections;
import i4.l;
import java.util.Comparator;
import java.util.List;

abstract class r extends q
{
    public static final void n(final List list, final Comparator comparator) {
        l.e((Object)list, "<this>");
        l.e((Object)comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
