package i4;

import java.util.NoSuchElementException;
import java.util.Iterator;

final class a implements Iterator
{
    private final Object[] e;
    private int f;
    
    public a(final Object[] e) {
        l.e(e, "array");
        this.e = e;
    }
    
    public boolean hasNext() {
        return this.f < this.e.length;
    }
    
    public Object next() {
        try {
            return this.e[this.f++];
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            --this.f;
            throw new NoSuchElementException(((Throwable)ex).getMessage());
        }
    }
    
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
