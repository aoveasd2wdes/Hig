package o;

import java.util.Map$Entry;
import java.util.HashMap;

public class a extends b
{
    private final HashMap i;
    
    public a() {
        this.i = new HashMap();
    }
    
    public boolean contains(final Object o) {
        return this.i.containsKey(o);
    }
    
    protected b$c j(final Object o) {
        return (b$c)this.i.get(o);
    }
    
    public Object n(final Object o, final Object o2) {
        final b$c j = this.j(o);
        if (j != null) {
            return j.f;
        }
        this.i.put(o, (Object)this.m(o, o2));
        return null;
    }
    
    public Object o(final Object o) {
        final Object o2 = super.o(o);
        this.i.remove(o);
        return o2;
    }
    
    public Map$Entry p(final Object o) {
        if (this.contains(o)) {
            return (Map$Entry)((b$c)this.i.get(o)).h;
        }
        return null;
    }
}
