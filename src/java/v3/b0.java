package v3;

import java.util.Iterator;

public abstract class b0 implements Iterator
{
    public abstract long b();
    
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
