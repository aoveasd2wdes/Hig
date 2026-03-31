package b2;

import java.util.NoSuchElementException;

abstract class r0 extends a1
{
    private final int e;
    private int f;
    
    protected r0(final int e, final int f) {
        p0.b(f, e, "index");
        this.e = e;
        this.f = f;
    }
    
    protected abstract Object b(final int p0);
    
    public final boolean hasNext() {
        return this.f < this.e;
    }
    
    public final boolean hasPrevious() {
        return this.f > 0;
    }
    
    public final Object next() {
        if (this.hasNext()) {
            return this.b(this.f++);
        }
        throw new NoSuchElementException();
    }
    
    public final int nextIndex() {
        return this.f;
    }
    
    public final Object previous() {
        if (this.hasPrevious()) {
            final int f = this.f - 1;
            this.f = f;
            return this.b(f);
        }
        throw new NoSuchElementException();
    }
    
    public final int previousIndex() {
        return this.f - 1;
    }
}
