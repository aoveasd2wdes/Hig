package i4;

import g4.b;
import n4.d;
import java.io.Serializable;
import n4.a;

public abstract class c implements a, Serializable
{
    public static final Object k;
    private transient a e;
    protected final Object f;
    private final Class g;
    private final String h;
    private final String i;
    private final boolean j;
    
    static {
        k = c.c$a.a();
    }
    
    protected c(final Object f, final Class g, final String h, final String i, final boolean j) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public a a() {
        a e;
        if ((e = this.e) == null) {
            e = this.b();
            this.e = e;
        }
        return e;
    }
    
    protected abstract a b();
    
    public Object c() {
        return this.f;
    }
    
    public String d() {
        return this.h;
    }
    
    public d g() {
        final Class g = this.g;
        Object o;
        if (g == null) {
            o = null;
        }
        else if (this.j) {
            o = x.c(g);
        }
        else {
            o = x.b(g);
        }
        return (d)o;
    }
    
    protected a h() {
        final a a = this.a();
        if (a != this) {
            return a;
        }
        throw new b();
    }
    
    public String k() {
        return this.i;
    }
}
