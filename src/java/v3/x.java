package v3;

import i4.f;
import java.util.ListIterator;
import java.util.Iterator;
import i4.l;
import java.util.Collection;
import java.util.RandomAccess;
import java.io.Serializable;
import java.util.List;

public final class x implements List, Serializable, RandomAccess
{
    public static final x e;
    
    static {
        e = new x();
    }
    
    private x() {
    }
    
    public boolean addAll(final int n, final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
        return o instanceof List && ((List)o).isEmpty();
    }
    
    public boolean h(final Void void1) {
        l.e((Object)void1, "element");
        return false;
    }
    
    @Override
    public int hashCode() {
        return 1;
    }
    
    public Void i(final int n) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Empty list doesn't contain element at index ");
        sb.append(n);
        sb.append('.');
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    public final /* bridge */ int indexOf(final Object o) {
        if (!(o instanceof Void)) {
            return -1;
        }
        return this.k((Void)o);
    }
    
    public boolean isEmpty() {
        return true;
    }
    
    public Iterator iterator() {
        return (Iterator)w.e;
    }
    
    public int j() {
        return 0;
    }
    
    public int k(final Void void1) {
        l.e((Object)void1, "element");
        return -1;
    }
    
    public int l(final Void void1) {
        l.e((Object)void1, "element");
        return -1;
    }
    
    public final /* bridge */ int lastIndexOf(final Object o) {
        if (!(o instanceof Void)) {
            return -1;
        }
        return this.l((Void)o);
    }
    
    public ListIterator listIterator() {
        return (ListIterator)w.e;
    }
    
    public ListIterator listIterator(final int n) {
        if (n == 0) {
            return (ListIterator)w.e;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(n);
        throw new IndexOutOfBoundsException(sb.toString());
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
        return this.j();
    }
    
    public List subList(final int n, final int n2) {
        if (n == 0 && n2 == 0) {
            return (List)this;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("fromIndex: ");
        sb.append(n);
        sb.append(", toIndex: ");
        sb.append(n2);
        throw new IndexOutOfBoundsException(sb.toString());
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
