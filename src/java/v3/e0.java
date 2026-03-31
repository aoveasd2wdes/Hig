package v3;

import java.util.Map$Entry;
import java.util.Collections;
import i4.l;
import java.util.Map;
import u3.j;

abstract class e0 extends d0
{
    public static int a(int n) {
        if (n >= 0) {
            if (n < 3) {
                ++n;
            }
            else if (n < 1073741824) {
                n = (int)(n / 0.75f + 1.0f);
            }
            else {
                n = Integer.MAX_VALUE;
            }
        }
        return n;
    }
    
    public static final Map b(final j j) {
        l.e((Object)j, "pair");
        final Map singletonMap = Collections.singletonMap(j.c(), j.d());
        l.d((Object)singletonMap, "singletonMap(...)");
        return singletonMap;
    }
    
    public static final Map c(Map singletonMap) {
        l.e((Object)singletonMap, "<this>");
        final Map$Entry map$Entry = (Map$Entry)singletonMap.entrySet().iterator().next();
        singletonMap = Collections.singletonMap(map$Entry.getKey(), map$Entry.getValue());
        l.d((Object)singletonMap, "with(...)");
        return singletonMap;
    }
}
