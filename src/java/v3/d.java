package v3;

import i4.f;
import i4.b;
import java.util.Iterator;
import i4.l;
import java.util.Collection;

final class d implements Collection
{
    private final Object[] e;
    private final boolean f;
    
    public d(final Object[] e, final boolean f) {
        l.e((Object)e, "values");
        this.e = e;
        this.f = f;
    }
    
    public boolean add(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public boolean contains(final Object o) {
        return j.l(this.e, o);
    }
    
    public boolean containsAll(final Collection collection) {
        l.e((Object)collection, "elements");
        final boolean empty = collection.isEmpty();
        final boolean b = true;
        boolean b2;
        if (empty) {
            b2 = b;
        }
        else {
            final Iterator iterator = ((Iterable)collection).iterator();
            do {
                b2 = b;
                if (iterator.hasNext()) {
                    continue;
                }
                return b2;
            } while (this.contains(iterator.next()));
            b2 = false;
        }
        return b2;
    }
    
    public int h() {
        return this.e.length;
    }
    
    public boolean isEmpty() {
        return this.e.length == 0;
    }
    
    public Iterator iterator() {
        return b.a(this.e);
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
        return this.h();
    }
    
    public final Object[] toArray() {
        return m.b(this.e, this.f);
    }
    
    public Object[] toArray(final Object[] array) {
        l.e((Object)array, "array");
        return i4.f.b((Collection)this, array);
    }
}
