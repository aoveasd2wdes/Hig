package v3;

import java.util.List;
import java.util.AbstractList;

public abstract class c extends AbstractList implements List
{
    protected c() {
    }
    
    public abstract int h();
    
    public abstract Object i(final int p0);
    
    public final /* bridge */ Object remove(final int n) {
        return this.i(n);
    }
    
    public final /* bridge */ int size() {
        return this.h();
    }
}
