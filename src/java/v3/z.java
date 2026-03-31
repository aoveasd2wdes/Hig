package v3;

import i4.f;
import java.util.Iterator;
import i4.l;
import java.util.Collection;
import java.io.Serializable;
import java.util.Set;

public final class z implements Set, Serializable
{
    public static final z e;
    
    static {
        e = new z();
    }
    
    private z() {
    }
    
    public boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final /* bridge */ boolean contains(final Object o) {
        return o instanceof Void && this.h((Void)o);
    }
    
    public boolean containsAll(final Collection collection) {
        l.e((Object)collection, "elements");
        return collection.isEmpty();
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Set && ((Set)o).isEmpty();
    }
    
    public boolean h(final Void void1) {
        l.e((Object)void1, "element");
        return false;
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    public int i() {
        return 0;
    }
    
    public boolean isEmpty() {
        return true;
    }
    
    public Iterator iterator() {
        return (Iterator)w.e;
    }
    
    public boolean remove(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public boolean removeAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public boolean retainAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final /* bridge */ int size() {
        return this.i();
    }
    
    public Object[] toArray() {
        return f.a((Collection)this);
    }
    
    public Object[] toArray(final Object[] array) {
        l.e((Object)array, "array");
        return f.b((Collection)this, array);
    }
    
    @Override
    public String toString() {
        return "[]";
    }
}
