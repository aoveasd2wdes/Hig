package o4;

import i4.l;
import java.util.Iterator;

abstract class f extends e
{
    public static b a(final Iterator iterator) {
        l.e((Object)iterator, "<this>");
        return b((b)new f$a(iterator));
    }
    
    public static final b b(b b) {
        l.e((Object)b, "<this>");
        if (!(b instanceof a)) {
            b = (b)new a(b);
        }
        return b;
    }
}
