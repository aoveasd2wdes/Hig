package y3;

import h4.p;
import i4.l;
import java.io.Serializable;

public final class c implements g, Serializable
{
    private final g e;
    private final g.b f;
    
    public c(final g e, final g.b f) {
        l.e((Object)e, "left");
        l.e((Object)f, "element");
        this.e = e;
        this.f = f;
    }
    
    private final boolean d(final g.b b) {
        return l.a((Object)this.a(b.getKey()), (Object)b);
    }
    
    private final boolean g(c c) {
        while (this.d(c.f)) {
            final g e = c.e;
            if (!(e instanceof c)) {
                l.c((Object)e, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return this.d((g.b)e);
            }
            c = (c)e;
        }
        return false;
    }
    
    private final int k() {
        int n = 2;
        c c = this;
        while (true) {
            final g e = c.e;
            if (e instanceof c) {
                c = (c)e;
            }
            else {
                c = null;
            }
            if (c == null) {
                break;
            }
            ++n;
        }
        return n;
    }
    
    public g A(final g g) {
        return g$a.a((g)this, g);
    }
    
    public g.b a(final g$c g$c) {
        l.e((Object)g$c, "key");
        c c = this;
        while (true) {
            final g.b a = c.f.a(g$c);
            if (a != null) {
                return a;
            }
            final g e = c.e;
            if (!(e instanceof c)) {
                return e.a(g$c);
            }
            c = (c)e;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof c) {
                final c c = (c)o;
                if (c.k() == this.k() && c.g(this)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public g h(final g$c g$c) {
        l.e((Object)g$c, "key");
        if (this.f.a(g$c) != null) {
            return this.e;
        }
        final g h = this.e.h(g$c);
        Object f;
        if (h == this.e) {
            f = this;
        }
        else if (h == y3.h.e) {
            f = this.f;
        }
        else {
            f = new c(h, this.f);
        }
        return (g)f;
    }
    
    @Override
    public int hashCode() {
        return this.e.hashCode() + this.f.hashCode();
    }
    
    public Object j(final Object o, final p p2) {
        l.e((Object)p2, "operation");
        return p2.j(this.e.j(o, p2), (Object)this.f);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append((String)this.j("", (p)c$a.f));
        sb.append(']');
        return sb.toString();
    }
}
