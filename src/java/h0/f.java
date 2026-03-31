package h0;

import i4.l;
import v3.c0;
import java.util.Map;

public abstract class f
{
    public abstract Map a();
    
    public abstract Object b(final a p0);
    
    public final c c() {
        return new c(c0.n(this.a()), false);
    }
    
    public final f d() {
        return (f)new c(c0.n(this.a()), true);
    }
    
    public static final class a
    {
        private final String a;
        
        public a(final String a) {
            l.e(a, "name");
            this.a = a;
        }
        
        public final String a() {
            return this.a;
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof a && l.a(this.a, ((a)o).a);
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public String toString() {
            return this.a;
        }
    }
    
    public abstract static final class b
    {
    }
}
