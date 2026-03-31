package v0;

import i4.l;
import android.graphics.Rect;

public final class b
{
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    
    public b(int a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        final int n = 1;
        if (a > c) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Left must be less than or equal to right, left: ");
            sb.append(a);
            sb.append(", right: ");
            sb.append(c);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (b <= d) {
            a = n;
        }
        else {
            a = 0;
        }
        if (a != 0) {
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("top must be less than or equal to bottom, top: ");
        sb2.append(b);
        sb2.append(", bottom: ");
        sb2.append(d);
        throw new IllegalArgumentException(sb2.toString().toString());
    }
    
    public b(final Rect rect) {
        l.e((Object)rect, "rect");
        this(rect.left, rect.top, rect.right, rect.bottom);
    }
    
    public final int a() {
        return this.d - this.b;
    }
    
    public final int b() {
        return this.a;
    }
    
    public final int c() {
        return this.b;
    }
    
    public final int d() {
        return this.c - this.a;
    }
    
    public final boolean e() {
        return this.a() == 0 && this.d() == 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        Class<?> class1;
        if (o != null) {
            class1 = o.getClass();
        }
        else {
            class1 = null;
        }
        if (!l.a((Object)b.class, (Object)class1)) {
            return false;
        }
        l.c(o, "null cannot be cast to non-null type androidx.window.core.Bounds");
        final b b = (b)o;
        return this.a == b.a && this.b == b.b && this.c == b.c && this.d == b.d;
    }
    
    public final Rect f() {
        return new Rect(this.a, this.b, this.c, this.d);
    }
    
    @Override
    public int hashCode() {
        return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(b.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.a);
        sb.append(',');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        sb.append(',');
        sb.append(this.d);
        sb.append("] }");
        return sb.toString();
    }
}
