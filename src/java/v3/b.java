package v3;

import java.util.NoSuchElementException;
import java.util.ListIterator;
import java.util.Iterator;
import i4.l;
import java.util.Collection;
import i4.g;
import java.util.List;

public abstract class b extends a implements List
{
    public static final b.b$a e;
    
    static {
        e = new b.b$a((g)null);
    }
    
    protected b() {
    }
    
    public void add(final int n, final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public boolean addAll(final int n, final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public boolean equals(final Object o) {
        return o == this || (o instanceof List && b.e.e((Collection)this, (Collection)o));
    }
    
    public abstract Object get(final int p0);
    
    public int hashCode() {
        return b.e.f((Collection)this);
    }
    
    public int indexOf(final Object o) {
        final Iterator iterator = ((List)this).iterator();
        int n = 0;
        while (iterator.hasNext()) {
            if (l.a(iterator.next(), o)) {
                return n;
            }
            ++n;
        }
        n = -1;
        return n;
    }
    
    public Iterator iterator() {
        return (Iterator)new b$b(this);
    }
    
    public int lastIndexOf(final Object o) {
        final ListIterator listIterator = ((List)this).listIterator(((List)this).size());
        while (listIterator.hasPrevious()) {
            if (l.a(listIterator.previous(), o)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }
    
    public ListIterator listIterator() {
        return (ListIterator)new c(0);
    }
    
    public ListIterator listIterator(final int n) {
        return (ListIterator)new c(n);
    }
    
    public Object remove(final int n) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public Object set(final int n, final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public List subList(final int n, final int n2) {
        return (List)new b.b$d(this, n, n2);
    }
    
    private class c extends b$b implements ListIterator
    {
        final b g;
        
        public c(final b g, final int n) {
            super(this.g = g);
            b.e.b(n, g.size());
            this.c(n);
        }
        
        public void add(final Object o) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        public boolean hasPrevious() {
            return this.b() > 0;
        }
        
        public int nextIndex() {
            return this.b();
        }
        
        public Object previous() {
            if (this.hasPrevious()) {
                final b g = this.g;
                this.c(this.b() - 1);
                return g.get(this.b());
            }
            throw new NoSuchElementException();
        }
        
        public int previousIndex() {
            return this.b() - 1;
        }
        
        public void set(final Object o) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
