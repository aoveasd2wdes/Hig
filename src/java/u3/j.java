package u3;

import i4.l;
import java.io.Serializable;

public final class j implements Serializable
{
    private final Object e;
    private final Object f;
    
    public j(final Object e, final Object f) {
        this.e = e;
        this.f = f;
    }
    
    public final Object a() {
        return this.e;
    }
    
    public final Object b() {
        return this.f;
    }
    
    public final Object c() {
        return this.e;
    }
    
    public final Object d() {
        return this.f;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof j)) {
            return false;
        }
        final j j = (j)o;
        return l.a(this.e, j.e) && l.a(this.f, j.f);
    }
    
    @Override
    public int hashCode() {
        final Object e = this.e;
        int hashCode = 0;
        int hashCode2;
        if (e == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = e.hashCode();
        }
        final Object f = this.f;
        if (f != null) {
            hashCode = f.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.f);
        sb.append(')');
        return sb.toString();
    }
}
