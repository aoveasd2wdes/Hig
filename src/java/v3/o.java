package v3;

import java.util.Collection;
import i4.l;

abstract class o extends n
{
    public static int m(final Iterable iterable, int size) {
        l.e((Object)iterable, "<this>");
        if (iterable instanceof Collection) {
            size = ((Collection)iterable).size();
        }
        return size;
    }
}
