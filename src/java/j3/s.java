package j3;

import java.util.HashMap;
import java.util.Map;
import k3.l;
import k3.c;
import k3.p;
import b3.a;
import k3.k;

public class s
{
    public final boolean a;
    private byte[] b;
    private k c;
    private k.d d;
    private boolean e;
    private boolean f;
    private final k.c g;
    
    public s(final a a, final boolean b) {
        this(new k((c)a, "flutter/restoration", (l)p.b), b);
    }
    
    s(final k c, final boolean a) {
        this.e = false;
        this.f = false;
        final s$b g = new s$b(this);
        this.g = (k.c)g;
        this.c = c;
        this.a = a;
        c.e((k.c)g);
    }
    
    private Map i(final byte[] array) {
        final HashMap hashMap = new HashMap();
        ((Map)hashMap).put((Object)"enabled", (Object)Boolean.TRUE);
        ((Map)hashMap).put((Object)"data", (Object)array);
        return (Map)hashMap;
    }
    
    public void g() {
        this.b = null;
    }
    
    public byte[] h() {
        return this.b;
    }
    
    public void j(final byte[] b) {
        this.e = true;
        final k.d d = this.d;
        if (d != null) {
            d.a(this.i(b));
            this.d = null;
        }
        else if (this.f) {
            this.c.d("push", this.i(b), (k.d)new s$a(this, b));
            return;
        }
        this.b = b;
    }
}
