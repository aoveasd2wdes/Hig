package b4;

import v3.f;
import i4.l;
import java.io.Serializable;
import v3.b;

final class c extends b implements a, Serializable
{
    private final Enum[] f;
    
    public c(final Enum[] f) {
        l.e((Object)f, "entries");
        this.f = f;
    }
    
    public final /* bridge */ boolean contains(final Object o) {
        return o instanceof Enum && this.i((Enum)o);
    }
    
    public int h() {
        return this.f.length;
    }
    
    public boolean i(final Enum enum1) {
        l.e((Object)enum1, "element");
        return v3.f.o((Object[])this.f, enum1.ordinal()) == enum1;
    }
    
    @Override
    public final /* bridge */ int indexOf(final Object o) {
        if (!(o instanceof Enum)) {
            return -1;
        }
        return this.k((Enum)o);
    }
    
    public Enum j(final int n) {
        b.e.a(n, this.f.length);
        return this.f[n];
    }
    
    public int k(final Enum enum1) {
        l.e((Object)enum1, "element");
        int ordinal = enum1.ordinal();
        if (v3.f.o((Object[])this.f, ordinal) != enum1) {
            ordinal = -1;
        }
        return ordinal;
    }
    
    public int l(final Enum enum1) {
        l.e((Object)enum1, "element");
        return this.indexOf(enum1);
    }
    
    @Override
    public final /* bridge */ int lastIndexOf(final Object o) {
        if (!(o instanceof Enum)) {
            return -1;
        }
        return this.l((Enum)o);
    }
}
