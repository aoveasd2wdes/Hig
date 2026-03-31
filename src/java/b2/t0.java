package b2;

import java.util.Arrays;
import java.util.Spliterator;
import java.util.Collection;
import java.io.Serializable;
import java.util.AbstractCollection;

public abstract class t0 extends AbstractCollection implements Serializable
{
    private static final Object[] e;
    
    static {
        e = new Object[0];
    }
    
    t0() {
    }
    
    public final boolean add(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    public final boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    public final void clear() {
        throw new UnsupportedOperationException();
    }
    
    abstract Object[] h();
    
    abstract int i();
    
    abstract int j();
    
    public abstract w0 k();
    
    abstract boolean l();
    
    abstract int m(final Object[] p0, final int p1);
    
    public final boolean remove(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    public final boolean removeAll(final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    public final boolean retainAll(final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    public final Spliterator spliterator() {
        return s0.a((Collection)this, 1296);
    }
    
    public final Object[] toArray() {
        return this.toArray(t0.e);
    }
    
    public final Object[] toArray(final Object[] array) {
        array.getClass();
        final int size = this.size();
        final int length = array.length;
        Object[] copy2;
        if (length < size) {
            final Object[] h = this.h();
            if (h != null) {
                return Arrays.copyOfRange(h, this.i(), this.j(), (Class)array.getClass());
            }
            Object[] copy = array;
            if (length != 0) {
                copy = Arrays.copyOf(array, 0);
            }
            copy2 = Arrays.copyOf(copy, size);
        }
        else {
            copy2 = array;
            if (length > size) {
                array[size] = null;
                copy2 = array;
            }
        }
        this.m(copy2, 0);
        return copy2;
    }
}
