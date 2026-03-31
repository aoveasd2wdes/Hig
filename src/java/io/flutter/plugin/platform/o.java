package io.flutter.plugin.platform;

import java.util.HashMap;
import java.util.Map;

class o implements n
{
    private final Map a;
    
    o() {
        this.a = (Map)new HashMap();
    }
    
    public boolean a(final String s, final m m) {
        if (this.a.containsKey((Object)s)) {
            return false;
        }
        this.a.put((Object)s, (Object)m);
        return true;
    }
    
    m b(final String s) {
        return (m)this.a.get((Object)s);
    }
}
