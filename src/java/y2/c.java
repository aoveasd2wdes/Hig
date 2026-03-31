package y2;

import java.util.List;
import k3.k$d;
import java.util.HashMap;
import java.util.Map;

public class c extends a
{
    final Map a;
    final c.c$a b;
    final boolean c;
    
    public c(final Map a, final boolean c) {
        this.b = new c.c$a(this);
        this.a = a;
        this.c = c;
    }
    
    public Object c(final String s) {
        return this.a.get((Object)s);
    }
    
    @Override
    public boolean e() {
        return this.c;
    }
    
    public String g() {
        return (String)this.a.get((Object)"method");
    }
    
    public boolean j(final String s) {
        return this.a.containsKey((Object)s);
    }
    
    public f o() {
        return (f)this.b;
    }
    
    public Map p() {
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        ((Map)hashMap2).put((Object)"code", (Object)this.b.b);
        ((Map)hashMap2).put((Object)"message", (Object)this.b.c);
        ((Map)hashMap2).put((Object)"data", this.b.d);
        ((Map)hashMap).put((Object)"error", (Object)hashMap2);
        return (Map)hashMap;
    }
    
    public Map q() {
        final HashMap hashMap = new HashMap();
        ((Map)hashMap).put((Object)"result", this.b.a);
        return (Map)hashMap;
    }
    
    public void r(final k$d k$d) {
        final c.c$a b = this.b;
        k$d.b(b.b, b.c, b.d);
    }
    
    public void s(final List list) {
        if (!this.e()) {
            list.add((Object)this.p());
        }
    }
    
    public void t(final List list) {
        if (!this.e()) {
            list.add((Object)this.q());
        }
    }
}
