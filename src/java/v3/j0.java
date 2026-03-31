package v3;

import i4.l;
import java.util.Collections;
import java.util.Set;

abstract class j0
{
    public static final Set a(final Object o) {
        final Set singleton = Collections.singleton(o);
        l.d((Object)singleton, "singleton(...)");
        return singleton;
    }
}
