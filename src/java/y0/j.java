package y0;

import i4.l;
import java.util.List;

public final class j
{
    private final List a;
    
    public j(final List a) {
        l.e((Object)a, "displayFeatures");
        this.a = a;
    }
    
    public final List a() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && l.a((Object)j.class, (Object)o.getClass()) && l.a((Object)this.a, (Object)((j)o).a));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public String toString() {
        return v3.l.x((Iterable)this.a, (CharSequence)", ", (CharSequence)"WindowLayoutInfo{ DisplayFeatures[", (CharSequence)"] }", 0, (CharSequence)null, (h4.l)null, 56, (Object)null);
    }
}
