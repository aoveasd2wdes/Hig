package k2;

import java.lang.ref.Reference;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import android.app.Activity;
import java.util.ArrayList;
import p1.f;
import java.util.List;
import com.google.android.gms.common.api.internal.LifecycleCallback;

final class v extends LifecycleCallback
{
    private final List d;
    
    private v(final f f) {
        super(f);
        this.d = (List)new ArrayList();
        super.c.c("TaskOnStopCallback", (LifecycleCallback)this);
    }
    
    public static v l(final Activity activity) {
        final f c = LifecycleCallback.c(activity);
        synchronized (c) {
            v v;
            if ((v = (v)c.e("TaskOnStopCallback", (Class)v.class)) == null) {
                v = new v(c);
            }
            return v;
        }
    }
    
    public final void k() {
        final List d = this.d;
        synchronized (d) {
            final Iterator iterator = this.d.iterator();
            while (iterator.hasNext()) {
                final r r = (r)((Reference)iterator.next()).get();
                if (r != null) {
                    r.k();
                }
            }
            this.d.clear();
        }
    }
    
    public final void m(final r r) {
        final List d = this.d;
        synchronized (d) {
            this.d.add((Object)new WeakReference((Object)r));
        }
    }
}
