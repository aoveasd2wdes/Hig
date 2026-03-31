package p1;

import q1.n;
import o1.a$d;
import o1.a;

public final class b
{
    private final int a;
    private final a b;
    private final a$d c;
    private final String d;
    
    private b(final a b, final a$d c, final String d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = n.b(b, c, d);
    }
    
    public static b a(final a a, final a$d a$d, final String s) {
        return new b(a, a$d, s);
    }
    
    public final String b() {
        return this.b.b();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        return n.a(this.b, b.b) && n.a(this.c, b.c) && n.a(this.d, b.d);
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
}
