package n2;

import m2.b;
import java.util.LinkedHashSet;
import java.util.Collection;
import com.google.android.gms.maps.model.LatLng;
import m2.a;

public class g implements a
{
    private final LatLng a;
    private final Collection b;
    
    public g(final LatLng a) {
        this.b = (Collection)new LinkedHashSet();
        this.a = a;
    }
    
    public boolean a(final b b) {
        return this.b.add((Object)b);
    }
    
    public boolean b(final b b) {
        return this.b.remove((Object)b);
    }
    
    public LatLng c() {
        return this.a;
    }
    
    public Collection d() {
        return this.b;
    }
    
    public int e() {
        return this.b.size();
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof g;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final g g = (g)o;
        boolean b3 = b2;
        if (g.a.equals((Object)this.a)) {
            b3 = b2;
            if (g.b.equals((Object)this.b)) {
                b3 = true;
            }
        }
        return b3;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("StaticCluster{mCenter=");
        sb.append((Object)this.a);
        sb.append(", mItems.size=");
        sb.append(this.b.size());
        sb.append('}');
        return sb.toString();
    }
}
