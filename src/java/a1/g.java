package a1;

import java.util.concurrent.locks.Lock;
import java.util.Iterator;
import u3.q;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashSet;
import i4.l;
import java.util.Set;
import y0.j;
import java.util.concurrent.locks.ReentrantLock;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import v.a;

public final class g implements a, Consumer
{
    private final Context a;
    private final ReentrantLock b;
    private j c;
    private final Set d;
    
    public g(final Context a) {
        l.e((Object)a, "context");
        this.a = a;
        this.b = new ReentrantLock();
        this.d = (Set)new LinkedHashSet();
    }
    
    public void a(final WindowLayoutInfo windowLayoutInfo) {
        l.e((Object)windowLayoutInfo, "value");
        final ReentrantLock b = this.b;
        ((Lock)b).lock();
        try {
            this.c = f.a.b(this.a, windowLayoutInfo);
            final Iterator iterator = ((Iterable)this.d).iterator();
            while (iterator.hasNext()) {
                ((a)iterator.next()).accept((Object)this.c);
            }
            final q a = q.a;
        }
        finally {
            ((Lock)b).unlock();
        }
    }
    
    public final void b(final a a) {
        l.e((Object)a, "listener");
        final ReentrantLock b = this.b;
        ((Lock)b).lock();
        try {
            final j c = this.c;
            if (c != null) {
                a.accept((Object)c);
            }
            this.d.add((Object)a);
        }
        finally {
            ((Lock)b).unlock();
        }
    }
    
    public final boolean c() {
        return this.d.isEmpty();
    }
    
    public final void d(final a a) {
        l.e((Object)a, "listener");
        final ReentrantLock b = this.b;
        ((Lock)b).lock();
        try {
            this.d.remove((Object)a);
        }
        finally {
            ((Lock)b).unlock();
        }
    }
}
