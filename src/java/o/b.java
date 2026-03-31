package o;

import java.util.Iterator;
import java.util.Map$Entry;
import java.util.WeakHashMap;

public class b implements Iterable
{
    c e;
    private c f;
    private final WeakHashMap g;
    private int h;
    
    public b() {
        this.g = new WeakHashMap();
        this.h = 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b2 = (b)o;
        if (this.size() != b2.size()) {
            return false;
        }
        final Iterator iterator = this.iterator();
        final Iterator iterator2 = b2.iterator();
        while (iterator.hasNext() && iterator2.hasNext()) {
            final Map$Entry map$Entry = (Map$Entry)iterator.next();
            final Object next = iterator2.next();
            if ((map$Entry == null && next != null) || (map$Entry != null && !map$Entry.equals(next))) {
                return false;
            }
        }
        if (iterator.hasNext() || iterator2.hasNext()) {
            b = false;
        }
        return b;
    }
    
    public Iterator h() {
        final b.b$b b$b = new b.b$b(this.f, this.e);
        this.g.put((Object)b$b, (Object)Boolean.FALSE);
        return (Iterator)b$b;
    }
    
    @Override
    public int hashCode() {
        final Iterator iterator = this.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n += ((Map$Entry)iterator.next()).hashCode();
        }
        return n;
    }
    
    public Map$Entry i() {
        return (Map$Entry)this.e;
    }
    
    public Iterator iterator() {
        final b.b$a b$a = new b.b$a(this.e, this.f);
        this.g.put((Object)b$a, (Object)Boolean.FALSE);
        return (Iterator)b$a;
    }
    
    protected c j(final Object obj) {
        c c;
        for (c = this.e; c != null && !c.e.equals(obj); c = c.g) {}
        return c;
    }
    
    public b.b$d k() {
        final b.b$d b$d = new b.b$d(this);
        this.g.put((Object)b$d, (Object)Boolean.FALSE);
        return b$d;
    }
    
    public Map$Entry l() {
        return (Map$Entry)this.f;
    }
    
    c m(final Object o, final Object o2) {
        final c f = new c(o, o2);
        ++this.h;
        final c f2 = this.f;
        if (f2 == null) {
            this.e = f;
        }
        else {
            f2.g = f;
            f.h = f2;
        }
        return this.f = f;
    }
    
    public Object n(final Object o, final Object o2) {
        final c j = this.j(o);
        if (j != null) {
            return j.f;
        }
        this.m(o, o2);
        return null;
    }
    
    public Object o(final Object o) {
        final c j = this.j(o);
        if (j == null) {
            return null;
        }
        --this.h;
        if (!this.g.isEmpty()) {
            final Iterator iterator = this.g.keySet().iterator();
            while (iterator.hasNext()) {
                ((f)iterator.next()).b(j);
            }
        }
        final c h = j.h;
        final c g = j.g;
        if (h != null) {
            h.g = g;
        }
        else {
            this.e = g;
        }
        final c g2 = j.g;
        if (g2 != null) {
            g2.h = h;
        }
        else {
            this.f = h;
        }
        j.g = null;
        j.h = null;
        return j.f;
    }
    
    public int size() {
        return this.h;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        final Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next().toString());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    static class c implements Map$Entry
    {
        final Object e;
        final Object f;
        c g;
        c h;
        
        c(final Object e, final Object f) {
            this.e = e;
            this.f = f;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (o == this) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            if (!this.e.equals(c.e) || !this.f.equals(c.f)) {
                b = false;
            }
            return b;
        }
        
        public Object getKey() {
            return this.e;
        }
        
        public Object getValue() {
            return this.f;
        }
        
        @Override
        public int hashCode() {
            return this.e.hashCode() ^ this.f.hashCode();
        }
        
        public Object setValue(final Object o) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.e);
            sb.append("=");
            sb.append(this.f);
            return sb.toString();
        }
    }
    
    public abstract static class f
    {
        abstract void b(final c p0);
    }
}
