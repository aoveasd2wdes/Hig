package v3;

import i4.f;
import java.util.Iterator;
import i4.l;
import java.util.Collection;

public abstract class a implements Collection
{
    protected a() {
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
        final boolean empty = ((Collection)this).isEmpty();
        final boolean b = false;
        boolean b2;
        if (empty) {
            b2 = b;
        }
        else {
            final Iterator iterator = ((Iterable)this).iterator();
            do {
                b2 = b;
                if (iterator.hasNext()) {
                    continue;
                }
                return b2;
            } while (!l.a(iterator.next(), o));
            b2 = true;
        }
        return b2;
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
    
    public abstract int h();
    
    public boolean isEmpty() {
        return this.size() == 0;
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
    
    public Object[] toArray() {
        return f.a((Collection)this);
    }
    
    public Object[] toArray(final Object[] array) {
        l.e((Object)array, "array");
        return f.b((Collection)this, array);
    }
    
    @Override
    public String toString() {
        return v3.l.x((Iterable)this, (CharSequence)", ", (CharSequence)"[", (CharSequence)"]", 0, (CharSequence)null, (h4.l)new a$a(this), 24, (Object)null);
    }
}
