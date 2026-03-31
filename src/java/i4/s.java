package i4;

import n4.a;
import n4.h;

public abstract class s extends c implements h
{
    private final boolean l;
    
    public s(final Object o, final Class clazz, final String s, final String s2, final int n) {
        final boolean b = false;
        super(o, clazz, s, s2, (n & 0x1) == 0x1);
        boolean l = b;
        if ((n & 0x2) == 0x2) {
            l = true;
        }
        this.l = l;
    }
    
    public a a() {
        Object a;
        if (this.l) {
            a = this;
        }
        else {
            a = super.a();
        }
        return (a)a;
    }
    
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof s) {
            final s s = (s)o;
            if (!this.g().equals(s.g()) || !this.d().equals((Object)s.d()) || !this.k().equals((Object)s.k()) || !i4.l.a(this.c(), s.c())) {
                b = false;
            }
            return b;
        }
        return o instanceof h && o.equals(this.a());
    }
    
    public int hashCode() {
        return (this.g().hashCode() * 31 + this.d().hashCode()) * 31 + this.k().hashCode();
    }
    
    protected h m() {
        if (!this.l) {
            return (h)super.h();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }
    
    public String toString() {
        final a a = this.a();
        if (a != this) {
            return a.toString();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("property ");
        sb.append(this.d());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
