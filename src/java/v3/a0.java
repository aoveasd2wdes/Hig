package v3;

import java.util.Iterator;

public abstract class a0 implements Iterator
{
    public abstract int b();
    
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
