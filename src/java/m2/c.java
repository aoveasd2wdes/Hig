package m2;

import android.os.AsyncTask;
import h2.m;
import n2.d;
import o2.f;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import android.content.Context;
import java.util.concurrent.locks.ReadWriteLock;
import com.google.android.gms.maps.model.CameraPosition;
import o2.a;
import n2.e;
import p2.b;
import f2.c$f;
import f2.c$j;
import f2.c$b;

public class c implements c$b, c$j, c$f
{
    private final b c;
    private final b.a d;
    private final b.a e;
    private e f;
    private a g;
    private f2.c h;
    private CameraPosition i;
    private c.c$b j;
    private final ReadWriteLock k;
    private c.c$f l;
    private c.c$c m;
    
    public c(final Context context, final f2.c h, final b c) {
        this.k = (ReadWriteLock)new ReentrantReadWriteLock();
        this.h = h;
        this.c = c;
        this.e = c.j();
        this.d = c.j();
        this.g = (a)new f(context, h, this);
        this.f = (e)new n2.f((n2.b)new d((n2.b)new n2.c()));
        this.j = new c.c$b(this, (c$a)null);
        this.g.h();
    }
    
    public void G0() {
        final a g = this.g;
        if (g instanceof c$b) {
            ((c$b)g).G0();
        }
        this.f.a(this.h.g());
        if (!this.f.c()) {
            final CameraPosition i = this.i;
            if (i != null && i.b == this.h.g().b) {
                return;
            }
            this.i = this.h.g();
        }
        this.d();
    }
    
    public boolean b(final m2.b b) {
        final n2.b e = this.e();
        e.i();
        try {
            return e.h(b);
        }
        finally {
            e.g();
        }
    }
    
    public boolean b0(final m m) {
        return this.h().b0(m);
    }
    
    public void c() {
        final n2.b e = this.e();
        e.i();
        try {
            e.d();
        }
        finally {
            e.g();
        }
    }
    
    public void d() {
        this.k.writeLock().lock();
        try {
            ((AsyncTask)this.j).cancel(true);
            ((AsyncTask)(this.j = new c.c$b(this, (c$a)null))).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Float[] { this.h.g().b });
        }
        finally {
            this.k.writeLock().unlock();
        }
    }
    
    public n2.b e() {
        return (n2.b)this.f;
    }
    
    public b.a f() {
        return this.e;
    }
    
    public b.a g() {
        return this.d;
    }
    
    public b h() {
        return this.c;
    }
    
    public boolean i(final m2.b b) {
        final n2.b e = this.e();
        e.i();
        try {
            return e.f(b);
        }
        finally {
            e.g();
        }
    }
    
    public void j(final c.c$c m) {
        this.m = m;
        this.g.b(m);
    }
    
    public void k(final c.c$f l) {
        this.l = l;
        this.g.d(l);
    }
    
    public void l(final a g) {
        this.g.b((c.c$c)null);
        this.g.d((c.c$f)null);
        this.e.b();
        this.d.b();
        this.g.i();
        (this.g = g).h();
        this.g.b(this.m);
        this.g.a((c.c$d)null);
        this.g.g((c.c$e)null);
        this.g.d(this.l);
        this.g.c((c.c$g)null);
        this.g.e((c.c$h)null);
        this.d();
    }
    
    public void u0(final m m) {
        this.h().u0(m);
    }
}
