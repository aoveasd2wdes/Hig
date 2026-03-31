package q1;

import java.util.ArrayList;
import android.util.Log;

public abstract class t0
{
    private Object a;
    private boolean b;
    final c c;
    
    public t0(final c c, final Object a) {
        this.c = c;
        this.a = a;
        this.b = false;
    }
    
    protected abstract void a(final Object p0);
    
    protected abstract void b();
    
    public final void c() {
        synchronized (this) {
            final Object a = this.a;
            if (this.b) {
                final String string = this.toString();
                final StringBuilder sb = new StringBuilder();
                sb.append("Callback proxy ");
                sb.append(string);
                sb.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb.toString());
            }
            monitorexit(this);
            if (a != null) {
                this.a(a);
            }
            synchronized (this) {
                this.b = true;
                monitorexit(this);
                this.e();
            }
        }
    }
    
    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }
    
    public final void e() {
        this.d();
        final ArrayList w = q1.c.W(this.c);
        synchronized (w) {
            q1.c.W(this.c).remove((Object)this);
        }
    }
}
