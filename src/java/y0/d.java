package y0;

import android.graphics.Rect;
import i4.l;
import i4.g;
import v0.b;

public final class d implements c
{
    public static final d.d$a d;
    private final b a;
    private final d.d$b b;
    private final c$b c;
    
    static {
        d = new d.d$a((g)null);
    }
    
    public d(final b a, final d.d$b b, final c$b c) {
        l.e((Object)a, "featureBounds");
        l.e((Object)b, "type");
        l.e((Object)c, "state");
        this.a = a;
        this.b = b;
        this.c = c;
        y0.d.d.a(a);
    }
    
    public c$b a() {
        return this.c;
    }
    
    public Rect b() {
        return this.a.f();
    }
    
    public c$a c() {
        c$a c$a;
        if (this.a.d() != 0 && this.a.a() != 0) {
            c$a = y0.c$a.d;
        }
        else {
            c$a = y0.c$a.c;
        }
        return c$a;
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
        if (!l.a((Object)d.class, (Object)class1)) {
            return false;
        }
        l.c(o, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        final d d = (d)o;
        return l.a((Object)this.a, (Object)d.a) && l.a((Object)this.b, (Object)d.b) && l.a((Object)this.a(), (Object)d.a());
    }
    
    @Override
    public int hashCode() {
        return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.a().hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(d.class.getSimpleName());
        sb.append(" { ");
        sb.append((Object)this.a);
        sb.append(", type=");
        sb.append((Object)this.b);
        sb.append(", state=");
        sb.append((Object)this.a());
        sb.append(" }");
        return sb.toString();
    }
}
