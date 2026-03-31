package i4;

import n4.a;
import n4.e;

public abstract class i extends c implements h, e
{
    private final int l;
    private final int m;
    
    public i(final int l, final Object o, final Class clazz, final String s, final String s2, final int n) {
        super(o, clazz, s, s2, (n & 0x1) == 0x1);
        this.l = l;
        this.m = n >> 1;
    }
    
    protected a b() {
        return (a)x.a(this);
    }
    
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof i) {
            final i i = (i)o;
            if (!this.d().equals((Object)i.d()) || !this.k().equals((Object)i.k()) || this.m != i.m || this.l != i.l || !i4.l.a(this.c(), i.c()) || !i4.l.a((Object)this.g(), (Object)i.g())) {
                b = false;
            }
            return b;
        }
        return o instanceof e && o.equals(this.a());
    }
    
    public int f() {
        return this.l;
    }
    
    public int hashCode() {
        int n;
        if (this.g() == null) {
            n = 0;
        }
        else {
            n = this.g().hashCode() * 31;
        }
        return (n + this.d().hashCode()) * 31 + this.k().hashCode();
    }
    
    public String toString() {
        final a a = this.a();
        if (a != this) {
            return a.toString();
        }
        String string;
        if ("<init>".equals((Object)this.d())) {
            string = "constructor (Kotlin reflection is not available)";
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append("function ");
            sb.append(this.d());
            sb.append(" (Kotlin reflection is not available)");
            string = sb.toString();
        }
        return string;
    }
}
