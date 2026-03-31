package v3;

import i4.l;
import java.util.Set;

abstract class k0 extends j0
{
    public static Set b() {
        return (Set)z.e;
    }
    
    public static final Set c(Set set) {
        l.e((Object)set, "<this>");
        final int size = set.size();
        if (size != 0) {
            if (size == 1) {
                set = j0.a(set.iterator().next());
            }
        }
        else {
            set = i0.b();
        }
        return set;
    }
    
    public static Set d(final Object... array) {
        l.e((Object)array, "elements");
        Set set;
        if (array.length > 0) {
            set = j.z(array);
        }
        else {
            set = i0.b();
        }
        return set;
    }
}
