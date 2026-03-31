package d;

import i4.l;
import e.e$b;
import e.e;

public final class a
{
    private e.e a;
    
    public a() {
        this.a = (e.e)e$b.a;
    }
    
    public final e.e a() {
        return this.a;
    }
    
    public final void b(final e.e a) {
        l.e(a, "<set-?>");
        this.a = a;
    }
    
    public static final class a
    {
        private e.e a;
        
        public a() {
            this.a = (e.e)e$b.a;
        }
        
        public final d.a a() {
            final d.a a = new d.a();
            a.b(this.a);
            return a;
        }
        
        public final a b(final e.e a) {
            l.e(a, "mediaType");
            this.a = a;
            return this;
        }
    }
}
