package a1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.Executor;
import u3.q;
import androidx.window.extensions.core.util.function.Consumer;
import android.content.Context;
import java.util.LinkedHashMap;
import i4.l;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import androidx.window.extensions.layout.WindowLayoutComponent;
import z0.a;

public final class e implements a
{
    private final WindowLayoutComponent a;
    private final ReentrantLock b;
    private final Map c;
    private final Map d;
    
    public e(final WindowLayoutComponent a) {
        l.e((Object)a, "component");
        this.a = a;
        this.b = new ReentrantLock();
        this.c = (Map)new LinkedHashMap();
        this.d = (Map)new LinkedHashMap();
    }
    
    @Override
    public void a(final v.a a) {
        l.e((Object)a, "callback");
        final ReentrantLock b = this.b;
        ((Lock)b).lock();
        try {
            final Context context = (Context)this.d.get((Object)a);
            if (context == null) {
                return;
            }
            final g g = (g)this.c.get((Object)context);
            if (g == null) {
                return;
            }
            g.d(a);
            this.d.remove((Object)a);
            if (g.c()) {
                this.c.remove((Object)context);
                this.a.removeWindowLayoutInfoListener((Consumer)g);
            }
            final q a2 = q.a;
        }
        finally {
            ((Lock)b).unlock();
        }
    }
    
    @Override
    public void b(final Context context, final Executor executor, final v.a a) {
        l.e((Object)context, "context");
        l.e((Object)executor, "executor");
        l.e((Object)a, "callback");
        final ReentrantLock b = this.b;
        ((Lock)b).lock();
        try {
            final g g = (g)this.c.get((Object)context);
            q a2;
            if (g != null) {
                g.b(a);
                this.d.put((Object)a, (Object)context);
                a2 = q.a;
            }
            else {
                a2 = null;
            }
            if (a2 == null) {
                final g g2 = new g(context);
                this.c.put((Object)context, (Object)g2);
                this.d.put((Object)a, (Object)context);
                g2.b(a);
                this.a.addWindowLayoutInfoListener(context, (Consumer)g2);
            }
            final q a3 = q.a;
        }
        finally {
            ((Lock)b).unlock();
        }
    }
}
