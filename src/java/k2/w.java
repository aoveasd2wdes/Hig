package k2;

import android.app.Activity;
import java.util.concurrent.Executor;
import java.util.concurrent.CancellationException;
import q1.o;

final class w extends g
{
    private final Object a;
    private final s b;
    private boolean c;
    private volatile boolean d;
    private Object e;
    private Exception f;
    
    w() {
        this.a = new Object();
        this.b = new s();
    }
    
    private final void t() {
        o.k(this.c, (Object)"Task is not yet complete");
    }
    
    private final void u() {
        if (!this.d) {
            return;
        }
        throw new CancellationException("Task is already canceled.");
    }
    
    private final void v() {
        if (!this.c) {
            return;
        }
        throw k2.b.a((g)this);
    }
    
    private final void w() {
        final Object a = this.a;
        synchronized (a) {
            if (!this.c) {
                return;
            }
            monitorexit(a);
            this.b.b((g)this);
        }
    }
    
    public final g a(final Executor executor, final c c) {
        this.b.a((r)new m(executor, c));
        this.w();
        return this;
    }
    
    public final g b(final c c) {
        this.b.a((r)new m(i.a, c));
        this.w();
        return this;
    }
    
    public final g c(final Activity activity, final d d) {
        final k2.o o = new k2.o(i.a, d);
        this.b.a((r)o);
        v.l(activity).m((r)o);
        this.w();
        return this;
    }
    
    public final g d(final d d) {
        this.m(i.a, d);
        return this;
    }
    
    public final g e(final Activity activity, final e e) {
        final q q = new q(i.a, e);
        this.b.a((r)q);
        v.l(activity).m((r)q);
        this.w();
        return this;
    }
    
    public final g f(final e e) {
        this.n(i.a, e);
        return this;
    }
    
    public final g g(final Executor executor, final a a) {
        final w w = new w();
        this.b.a((r)new k(executor, a, w));
        this.w();
        return w;
    }
    
    public final Exception h() {
        final Object a = this.a;
        synchronized (a) {
            return this.f;
        }
    }
    
    public final Object i() {
        final Object a = this.a;
        synchronized (a) {
            this.t();
            this.u();
            final Exception f = this.f;
            if (f == null) {
                return this.e;
            }
            throw new f((Throwable)f);
        }
    }
    
    public final boolean j() {
        return this.d;
    }
    
    public final boolean k() {
        final Object a = this.a;
        synchronized (a) {
            return this.c;
        }
    }
    
    public final boolean l() {
        final Object a = this.a;
        synchronized (a) {
            final boolean c = this.c;
            boolean b2;
            final boolean b = b2 = false;
            if (c) {
                b2 = b;
                if (!this.d) {
                    b2 = b;
                    if (this.f == null) {
                        b2 = true;
                    }
                }
            }
            return b2;
        }
    }
    
    public final g m(final Executor executor, final d d) {
        this.b.a((r)new k2.o(executor, d));
        this.w();
        return this;
    }
    
    public final g n(final Executor executor, final e e) {
        this.b.a((r)new q(executor, e));
        this.w();
        return this;
    }
    
    public final void o(final Exception f) {
        o.i((Object)f, (Object)"Exception must not be null");
        final Object a = this.a;
        synchronized (a) {
            this.v();
            this.c = true;
            this.f = f;
            monitorexit(a);
            this.b.b((g)this);
        }
    }
    
    public final void p(final Object e) {
        final Object a = this.a;
        synchronized (a) {
            this.v();
            this.c = true;
            this.e = e;
            monitorexit(a);
            this.b.b((g)this);
        }
    }
    
    public final boolean q() {
        final Object a = this.a;
        synchronized (a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = true;
            monitorexit(a);
            this.b.b((g)this);
            return true;
        }
    }
    
    public final boolean r(final Exception f) {
        o.i((Object)f, (Object)"Exception must not be null");
        final Object a = this.a;
        synchronized (a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f = f;
            monitorexit(a);
            this.b.b((g)this);
            return true;
        }
    }
    
    public final boolean s(final Object e) {
        final Object a = this.a;
        synchronized (a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.e = e;
            monitorexit(a);
            this.b.b((g)this);
            return true;
        }
    }
}
