package s4;

import u3.q;
import r4.m;
import r4.b2;
import i4.l;
import android.os.Looper;
import r4.w0;
import r4.u1;
import java.util.concurrent.CancellationException;
import i4.g;
import android.os.Handler;

public final class c extends d
{
    private volatile c _immediate;
    private final Handler g;
    private final String h;
    private final boolean i;
    private final c j;
    
    public c(final Handler handler, final String s) {
        this(handler, s, false);
    }
    
    private c(final Handler g, final String h, final boolean i) {
        c immediate = null;
        super(null);
        this.g = g;
        this.h = h;
        this.i = i;
        if (i) {
            immediate = this;
        }
        this._immediate = immediate;
        c immediate2;
        if ((immediate2 = this._immediate) == null) {
            immediate2 = new c(g, h, true);
            this._immediate = immediate2;
        }
        this.j = immediate2;
    }
    
    public static final /* synthetic */ Handler N(final c c) {
        return c.g;
    }
    
    private final void O(final y3.g g, final Runnable runnable) {
        final StringBuilder sb = new StringBuilder();
        sb.append("The task was rejected, the handler underlying the dispatcher '");
        sb.append((Object)this);
        sb.append("' was closed");
        u1.c(g, new CancellationException(sb.toString()));
        w0.b().z(g, runnable);
    }
    
    public boolean B(final y3.g g) {
        return !this.i || !l.a((Object)Looper.myLooper(), (Object)this.g.getLooper());
    }
    
    public c P() {
        return this.j;
    }
    
    public boolean equals(final Object o) {
        return o instanceof c && ((c)o).g == this.g;
    }
    
    public int hashCode() {
        return System.identityHashCode((Object)this.g);
    }
    
    public String toString() {
        String s;
        if ((s = this.M()) == null) {
            String s2;
            if ((s2 = this.h) == null) {
                s2 = this.g.toString();
            }
            s = s2;
            if (this.i) {
                final StringBuilder sb = new StringBuilder();
                sb.append(s2);
                sb.append(".immediate");
                s = sb.toString();
            }
        }
        return s;
    }
    
    public void u(final long n, final m m) {
        final c$a c$a = new c$a(m, this);
        if (this.g.postDelayed((Runnable)c$a, m4.g.d(n, 4611686018427387903L))) {
            m.k((h4.l)new h4.l(this, c$a) {
                final c f;
                final Runnable g;
                
                public final void a(final Throwable t) {
                    c.N(this.f).removeCallbacks(this.g);
                }
            });
        }
        else {
            this.O(((y3.d)m).d(), (Runnable)c$a);
        }
    }
    
    public void z(final y3.g g, final Runnable runnable) {
        if (!this.g.post(runnable)) {
            this.O(g, runnable);
        }
    }
}
