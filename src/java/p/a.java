package p;

import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Collection;
import java.util.Set;
import java.util.Map;

public class a extends g implements Map
{
    f l;
    
    public a() {
    }
    
    public a(final int n) {
        super(n);
    }
    
    public a(final g g) {
        super(g);
    }
    
    private f n() {
        if (this.l == null) {
            this.l = new f(this) {
                final a d;
                
                protected void a() {
                    this.d.clear();
                }
                
                protected Object b(final int n, final int n2) {
                    return this.d.f[(n << 1) + n2];
                }
                
                protected Map c() {
                    return (Map)this.d;
                }
                
                protected int d() {
                    return this.d.g;
                }
                
                protected int e(final Object o) {
                    return this.d.f(o);
                }
                
                protected int f(final Object o) {
                    return this.d.h(o);
                }
                
                protected void g(final Object o, final Object o2) {
                    this.d.put(o, o2);
                }
                
                protected void h(final int n) {
                    this.d.k(n);
                }
                
                protected Object i(final int n, final Object o) {
                    return this.d.l(n, o);
                }
            };
        }
        return this.l;
    }
    
    public Set entrySet() {
        return this.n().l();
    }
    
    public Set keySet() {
        return this.n().m();
    }
    
    public boolean o(final Collection collection) {
        return f.p((Map)this, collection);
    }
    
    public void putAll(final Map map) {
        this.c(super.g + map.size());
        for (final Map$Entry map$Entry : map.entrySet()) {
            this.put(map$Entry.getKey(), map$Entry.getValue());
        }
    }
    
    public Collection values() {
        return this.n().n();
    }
}
