package r4;

import u3.k$a;
import java.util.concurrent.CancellationException;
import y3.g;
import y4.i;
import u3.q;
import u3.k;
import y3.g$c;
import w4.l0;
import w4.j;
import i4.l;
import u3.a;
import y3.d;
import y4.h;

public abstract class u0 extends h
{
    public int g;
    
    public u0(final int g) {
        this.g = g;
    }
    
    public abstract void a(final Object p0, final Throwable p1);
    
    public abstract d c();
    
    public Throwable e(final Object o) {
        final boolean b = o instanceof a0;
        Throwable a = null;
        a0 a2;
        if (b) {
            a2 = (a0)o;
        }
        else {
            a2 = null;
        }
        if (a2 != null) {
            a = a2.a;
        }
        return a;
    }
    
    public Object f(final Object o) {
        return o;
    }
    
    public final void g(final Throwable t, final Throwable t2) {
        if (t == null && t2 == null) {
            return;
        }
        if (t != null && t2 != null) {
            a.a(t, t2);
        }
        Throwable t3;
        if ((t3 = t) == null) {
            t3 = t2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fatal exception in coroutines machinery for ");
        sb.append((Object)this);
        sb.append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
        final String string = sb.toString();
        l.b((Object)t3);
        i0.a(this.c().d(), (Throwable)new m0(string, t3));
    }
    
    public abstract Object h();
    
    public final void run() {
        final i f = super.f;
        try {
            final d c = this.c();
            l.c((Object)c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            final j j = (j)c;
            final d i = j.i;
            final Object k = j.k;
            final g d = i.d();
            final Object c2 = l0.c(d, k);
            Object g;
            if (c2 != l0.a) {
                g = f0.g(i, d, c2);
            }
            else {
                g = null;
            }
            try {
                final g d2 = i.d();
                final Object h = this.h();
                final Throwable e = this.e(h);
                q1 q1;
                if (e == null && v0.b(this.g)) {
                    q1 = (q1)d2.a((g$c)r4.q1.b);
                }
                else {
                    q1 = null;
                }
                Object o;
                if (q1 != null && !q1.c()) {
                    final CancellationException l = q1.l();
                    this.a(h, (Throwable)l);
                    final k$a e2 = u3.k.e;
                    o = u3.k.a(u3.l.a((Throwable)l));
                }
                else if (e != null) {
                    final k$a e3 = u3.k.e;
                    o = u3.k.a(u3.l.a(e));
                }
                else {
                    final k$a e4 = u3.k.e;
                    o = u3.k.a(this.f(h));
                }
                i.u(o);
                final q a = q.a;
                if (g == null || ((p2)g).W0()) {
                    l0.a(d, c2);
                }
                Object a2;
                try {
                    f.b();
                    u3.k.a((Object)q.a);
                }
                finally {
                    final k$a e5 = u3.k.e;
                    a2 = u3.k.a(u3.l.a((Throwable)g));
                }
                this.g(null, u3.k.b(a2));
            }
            finally {
                if (g == null || ((p2)g).W0()) {
                    l0.a(d, c2);
                }
            }
        }
        finally {
            Object a3;
            try {
                final k$a e6 = k.e;
                f.b();
                k.a((Object)q.a);
            }
            finally {
                final k$a e7 = k.e;
                final Throwable t;
                a3 = k.a(u3.l.a(t));
            }
            final Throwable t2;
            this.g(t2, k.b(a3));
        }
    }
}
