package v3;

import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import u3.j;
import i4.l;
import java.util.Map;

abstract class f0 extends e0
{
    public static Map d() {
        final y e = y.e;
        l.c((Object)e, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return (Map)e;
    }
    
    public static Map e(final j... array) {
        l.e((Object)array, "pairs");
        Map map;
        if (array.length > 0) {
            map = m(array, (Map)new LinkedHashMap(c0.a(array.length)));
        }
        else {
            map = c0.d();
        }
        return map;
    }
    
    public static Map f(final j... array) {
        l.e((Object)array, "pairs");
        final LinkedHashMap linkedHashMap = new LinkedHashMap(c0.a(array.length));
        i((Map)linkedHashMap, array);
        return (Map)linkedHashMap;
    }
    
    public static final Map g(Map map) {
        l.e((Object)map, "<this>");
        final int size = map.size();
        if (size != 0) {
            if (size == 1) {
                map = e0.c(map);
            }
        }
        else {
            map = c0.d();
        }
        return map;
    }
    
    public static final void h(final Map map, final Iterable iterable) {
        l.e((Object)map, "<this>");
        l.e((Object)iterable, "pairs");
        for (final j j : iterable) {
            map.put(j.a(), j.b());
        }
    }
    
    public static final void i(final Map map, final j[] array) {
        l.e((Object)map, "<this>");
        l.e((Object)array, "pairs");
        for (final j j : array) {
            map.put(j.a(), j.b());
        }
    }
    
    public static Map j(final Iterable iterable) {
        l.e((Object)iterable, "<this>");
        if (iterable instanceof Collection) {
            final Collection collection = (Collection)iterable;
            final int size = collection.size();
            Map map;
            if (size != 0) {
                if (size != 1) {
                    map = k(iterable, (Map)new LinkedHashMap(c0.a(collection.size())));
                }
                else {
                    Object o;
                    if (iterable instanceof List) {
                        o = ((List)iterable).get(0);
                    }
                    else {
                        o = iterable.iterator().next();
                    }
                    map = e0.b((j)o);
                }
            }
            else {
                map = c0.d();
            }
            return map;
        }
        return g(k(iterable, (Map)new LinkedHashMap()));
    }
    
    public static final Map k(final Iterable iterable, final Map map) {
        l.e((Object)iterable, "<this>");
        l.e((Object)map, "destination");
        h(map, iterable);
        return map;
    }
    
    public static Map l(Map map) {
        l.e((Object)map, "<this>");
        final int size = map.size();
        if (size != 0) {
            if (size != 1) {
                map = c0.n(map);
            }
            else {
                map = e0.c(map);
            }
        }
        else {
            map = c0.d();
        }
        return map;
    }
    
    public static final Map m(final j[] array, final Map map) {
        l.e((Object)array, "<this>");
        l.e((Object)map, "destination");
        i(map, array);
        return map;
    }
    
    public static Map n(final Map map) {
        l.e((Object)map, "<this>");
        return (Map)new LinkedHashMap(map);
    }
}
