package w2;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.Collection;
import java.util.ListIterator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.LinkedList;

class s implements q
{
    final String a;
    final int b;
    final int c;
    private final LinkedList d;
    private final Set e;
    private final Set f;
    private final Map g;
    
    s(final String a, final int b, final int c) {
        this.d = new LinkedList();
        this.e = (Set)new HashSet();
        this.f = (Set)new HashSet();
        this.g = (Map)new HashMap();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private m f(final o o) {
        synchronized (this) {
            final ListIterator listIterator = ((AbstractList)this.d).listIterator();
            while (true) {
                final boolean hasNext = listIterator.hasNext();
                o o2 = null;
                if (!hasNext) {
                    return null;
                }
                final m m = (m)listIterator.next();
                if (m.a() != null) {
                    o2 = (o)this.g.get((Object)m.a());
                }
                if (o2 != null && o2 != o) {
                    continue;
                }
                listIterator.remove();
                return m;
            }
        }
    }
    
    private void h(final o o) {
        synchronized (this) {
            final HashSet set = new HashSet((Collection)this.e);
            this.f.remove((Object)o);
            this.e.add((Object)o);
            if (!o.b() && o.d() != null) {
                this.g.remove((Object)o.d());
            }
            this.i(o);
            final Iterator iterator = ((Set)set).iterator();
            while (iterator.hasNext()) {
                this.i((o)iterator.next());
            }
        }
    }
    
    private void i(final o o) {
        synchronized (this) {
            final m f = this.f(o);
            if (f != null) {
                this.f.add((Object)o);
                this.e.remove((Object)o);
                if (f.a() != null) {
                    this.g.put((Object)f.a(), (Object)o);
                }
                o.e(f);
            }
        }
    }
    
    public void a(final m m) {
        synchronized (this) {
            this.d.add((Object)m);
            final Iterator iterator = ((Set)new HashSet((Collection)this.e)).iterator();
            while (iterator.hasNext()) {
                this.i((o)iterator.next());
            }
        }
    }
    
    public void b() {
        synchronized (this) {
            final Iterator iterator = this.e.iterator();
            while (iterator.hasNext()) {
                ((o)iterator.next()).f();
            }
            final Iterator iterator2 = this.f.iterator();
            while (iterator2.hasNext()) {
                ((o)iterator2.next()).f();
            }
        }
    }
    
    protected o e(final String s, final int n) {
        return new o(s, n);
    }
    
    public void start() {
        monitorenter(this);
        int i = 0;
        try {
            while (i < this.b) {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.a);
                sb.append(i);
                final o e = this.e(sb.toString(), this.c);
                e.g((Runnable)new r(this, e));
                this.e.add((Object)e);
                ++i;
            }
        }
        finally {
            monitorexit(this);
        }
    }
}
