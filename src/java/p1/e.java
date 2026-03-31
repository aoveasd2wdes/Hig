package p1;

import l.d;
import j0.p;
import q1.o;
import android.app.Activity;

public class e
{
    private final Object a;
    
    public e(final Activity a) {
        o.i(a, "Activity must not be null");
        this.a = a;
    }
    
    public final Activity a() {
        return (Activity)this.a;
    }
    
    public final p b() {
        d.a(this.a);
        return null;
    }
    
    public final boolean c() {
        return this.a instanceof Activity;
    }
    
    public final boolean d() {
        return false;
    }
}
