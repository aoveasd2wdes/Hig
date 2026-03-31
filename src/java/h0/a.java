package h0;

import java.util.Map;
import java.util.Collections;
import i4.l;
import java.util.Set;

public abstract class a
{
    public static final Set a(Set unmodifiableSet) {
        l.e(unmodifiableSet, "set");
        unmodifiableSet = Collections.unmodifiableSet(v3.l.I((Iterable)unmodifiableSet));
        l.d(unmodifiableSet, "unmodifiableSet(set.toSet())");
        return unmodifiableSet;
    }
    
    public static final Map b(Map unmodifiableMap) {
        l.e(unmodifiableMap, "map");
        unmodifiableMap = Collections.unmodifiableMap(unmodifiableMap);
        l.d(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }
}
