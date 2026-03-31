package j3;

import java.util.Map;
import java.util.HashMap;
import a3.b;
import k3.l;
import k3.c;
import k3.g;
import b3.a;
import k3.k;

public class n
{
    public final k a;
    private final k.c b;
    
    public n(final a a) {
        final n$a b = new n$a(this);
        this.b = (k.c)b;
        (this.a = new k((c)a, "flutter/navigation", (l)g.a)).e((k.c)b);
    }
    
    public void a() {
        a3.b.f("NavigationChannel", "Sending message to pop route.");
        this.a.c("popRoute", null);
    }
    
    public void b(final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Sending message to push route information '");
        sb.append(s);
        sb.append("'");
        a3.b.f("NavigationChannel", sb.toString());
        final HashMap hashMap = new HashMap();
        ((Map)hashMap).put((Object)"location", (Object)s);
        this.a.c("pushRouteInformation", hashMap);
    }
    
    public void c(final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Sending message to set initial route to '");
        sb.append(s);
        sb.append("'");
        a3.b.f("NavigationChannel", sb.toString());
        this.a.c("setInitialRoute", s);
    }
}
