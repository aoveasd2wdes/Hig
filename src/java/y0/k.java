package y0;

import androidx.core.view.f0$b;
import i4.g;
import i4.l;
import android.graphics.Rect;
import androidx.core.view.f0;
import v0.b;

public final class k
{
    private final b a;
    private final f0 b;
    
    public k(final Rect rect, final f0 f0) {
        l.e((Object)rect, "bounds");
        l.e((Object)f0, "insets");
        this(new b(rect), f0);
    }
    
    public k(final b a, final f0 b) {
        l.e((Object)a, "_bounds");
        l.e((Object)b, "_windowInsetsCompat");
        this.a = a;
        this.b = b;
    }
    
    public final Rect a() {
        return this.a.f();
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
        if (!l.a((Object)k.class, (Object)class1)) {
            return false;
        }
        l.c(o, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        final k k = (k)o;
        return l.a((Object)this.a, (Object)k.a) && l.a((Object)this.b, (Object)k.b);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("WindowMetrics( bounds=");
        sb.append((Object)this.a);
        sb.append(", windowInsetsCompat=");
        sb.append((Object)this.b);
        sb.append(')');
        return sb.toString();
    }
}
