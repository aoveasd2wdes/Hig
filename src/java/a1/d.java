package a1;

import java.util.concurrent.locks.Lock;
import i4.x;
import androidx.window.extensions.layout.WindowLayoutInfo;
import android.app.Activity;
import java.util.concurrent.Executor;
import u3.q;
import v0.d$b;
import android.content.Context;
import java.util.LinkedHashMap;
import i4.l;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import androidx.window.extensions.layout.WindowLayoutComponent;
import z0.a;

public final class d implements a
{
    private final WindowLayoutComponent a;
    private final v0.d b;
    private final ReentrantLock c;
    private final Map d;
    private final Map e;
    private final Map f;
    
    public d(final WindowLayoutComponent a, final v0.d b) {
        l.e((Object)a, "component");
        l.e((Object)b, "consumerAdapter");
        this.a = a;
        this.b = b;
        this.c = new ReentrantLock();
        this.d = (Map)new LinkedHashMap();
        this.e = (Map)new LinkedHashMap();
        this.f = (Map)new LinkedHashMap();
    }
    
    @Override
    public void a(final v.a a) {
        l.e((Object)a, "callback");
        final ReentrantLock c = this.c;
        ((Lock)c).lock();
        try {
            final Context context = (Context)this.e.get((Object)a);
            if (context == null) {
                return;
            }
            final g g = (g)this.d.get((Object)context);
            if (g == null) {
                return;
            }
            g.d(a);
            this.e.remove((Object)a);
            if (g.c()) {
                this.d.remove((Object)context);
                final d$b d$b = (d$b)this.f.remove((Object)g);
                if (d$b != null) {
                    d$b.a();
                }
            }
            final q a2 = q.a;
        }
        finally {
            ((Lock)c).unlock();
        }
    }
    
    @Override
    public void b(final Context context, final Executor executor, final v.a a) {
        l.e((Object)context, "context");
        l.e((Object)executor, "executor");
        l.e((Object)a, "callback");
        final ReentrantLock c = this.c;
        ((Lock)c).lock();
        try {
            final g g = (g)this.d.get((Object)context);
            q a2;
            if (g != null) {
                g.b(a);
                this.e.put((Object)a, (Object)context);
                a2 = q.a;
            }
            else {
                a2 = null;
            }
            if (a2 == null) {
                final g g2 = new g(context);
                this.d.put((Object)context, (Object)g2);
                this.e.put((Object)a, (Object)context);
                g2.b(a);
                if (!(context instanceof Activity)) {
                    g2.a(new WindowLayoutInfo(v3.l.h()));
                    return;
                }
                this.f.put((Object)g2, (Object)this.b.c((Object)this.a, x.b((Class)WindowLayoutInfo.class), "addWindowLayoutInfoListener", "removeWindowLayoutInfoListener", (Activity)context, (h4.l)new d$a((Object)g2)));
            }
            final q a3 = q.a;
        }
        finally {
            ((Lock)c).unlock();
        }
    }
}
