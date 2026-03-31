package p2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;
import f2.c;

abstract class a
{
    protected final c c;
    private final Map d;
    protected final Map e;
    
    public a(final c c) {
        this.d = (Map)new HashMap();
        this.e = (Map)new HashMap();
        this.c = c;
        new Handler(Looper.getMainLooper()).post((Runnable)new Runnable(this) {
            final a e;
            
            public void run() {
                this.e.i();
            }
        });
    }
    
    public boolean f(final Object o) {
        final b b = (b)this.e.get(o);
        return b != null && b.c(o);
    }
    
    protected abstract void g(final Object p0);
    
    abstract void i();
    
    public abstract class b
    {
        private final Set a;
        final a b;
        
        public b(final a b) {
            this.b = b;
            this.a = (Set)new LinkedHashSet();
        }
        
        protected void a(final Object o) {
            this.a.add(o);
            this.b.e.put(o, (Object)this);
        }
        
        public void b() {
            for (final Object next : this.a) {
                this.b.g(next);
                this.b.e.remove(next);
            }
            this.a.clear();
        }
        
        protected boolean c(final Object o) {
            if (this.a.remove(o)) {
                this.b.e.remove(o);
                this.b.g(o);
                return true;
            }
            return false;
        }
    }
}
