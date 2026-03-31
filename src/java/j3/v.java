package j3;

import java.util.Map;
import java.util.HashMap;
import a3.b;
import k3.i;
import k3.c;
import k3.f;
import k3.a;

public class v
{
    public final a a;
    
    public v(final b3.a a) {
        this.a = new a((c)a, "flutter/system", (i)f.a);
    }
    
    public void a() {
        b.f("SystemChannel", "Sending memory pressure warning to Flutter.");
        final HashMap hashMap = new HashMap(1);
        ((Map)hashMap).put((Object)"type", (Object)"memoryPressure");
        this.a.c(hashMap);
    }
}
