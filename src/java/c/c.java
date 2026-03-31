package c;

import java.util.Iterator;
import h4.a;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class c
{
    private boolean a;
    private final CopyOnWriteArrayList b;
    private a c;
    
    public c(final boolean a) {
        this.a = a;
        this.b = new CopyOnWriteArrayList();
    }
    
    public final void a() {
        final Iterator iterator = ((Iterable)this.b).iterator();
        while (iterator.hasNext()) {
            ((c.a)iterator.next()).cancel();
        }
    }
    
    public final void b(final boolean a) {
        this.a = a;
        final a c = this.c;
        if (c != null) {
            c.e();
        }
    }
}
