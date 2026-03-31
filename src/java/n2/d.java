package n2;

import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import p.e;

public class d extends a
{
    private final b b;
    private final e c;
    private final ReadWriteLock d;
    private final Executor e;
    
    public d(final b b) {
        this.c = new e(5);
        this.d = (ReadWriteLock)new ReentrantReadWriteLock();
        this.e = (Executor)Executors.newCachedThreadPool();
        this.b = b;
    }
    
    private void k() {
        this.c.c();
    }
    
    private Set l(final int n) {
        this.d.readLock().lock();
        final Set set = (Set)this.c.d((Object)n);
        this.d.readLock().unlock();
        Set e = set;
        if (set == null) {
            this.d.writeLock().lock();
            if ((e = (Set)this.c.d((Object)n)) == null) {
                e = this.b.e((float)n);
                this.c.e((Object)n, (Object)e);
            }
            this.d.writeLock().unlock();
        }
        return e;
    }
    
    public int b() {
        return this.b.b();
    }
    
    public void d() {
        this.b.d();
        this.k();
    }
    
    public Set e(final float n) {
        final int n2 = (int)n;
        final Set l = this.l(n2);
        final e c = this.c;
        final int n3 = n2 + 1;
        if (c.d((Object)n3) == null) {
            this.e.execute((Runnable)new d.d$a(this, n3));
        }
        final e c2 = this.c;
        final int n4 = n2 - 1;
        if (c2.d((Object)n4) == null) {
            this.e.execute((Runnable)new d.d$a(this, n4));
        }
        return l;
    }
    
    public boolean f(final m2.b b) {
        final boolean f = this.b.f(b);
        if (f) {
            this.k();
        }
        return f;
    }
    
    public boolean h(final m2.b b) {
        final boolean h = this.b.h(b);
        if (h) {
            this.k();
        }
        return h;
    }
}
