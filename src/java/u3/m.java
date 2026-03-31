package u3;

import i4.g;
import i4.l;
import h4.a;
import java.io.Serializable;

final class m implements e, Serializable
{
    private a e;
    private volatile Object f;
    private final Object g;
    
    public m(final a e, final Object o) {
        l.e((Object)e, "initializer");
        this.e = e;
        this.f = o.a;
        Object g = o;
        if (o == null) {
            g = this;
        }
        this.g = g;
    }
    
    public boolean a() {
        return this.f != o.a;
    }
    
    public Object getValue() {
        final Object f = this.f;
        final o a = o.a;
        if (f != a) {
            return f;
        }
        final Object g = this.g;
        synchronized (g) {
            Object f2 = this.f;
            if (f2 == a) {
                final a e = this.e;
                l.b((Object)e);
                f2 = e.e();
                this.f = f2;
                this.e = null;
            }
            return f2;
        }
    }
    
    @Override
    public String toString() {
        String value;
        if (this.a()) {
            value = String.valueOf(this.getValue());
        }
        else {
            value = "Lazy value not initialized yet.";
        }
        return value;
    }
}
