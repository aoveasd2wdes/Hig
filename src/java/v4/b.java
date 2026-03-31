package v4;

import u4.h0;
import u3.k$a;
import u3.q;
import u3.k;
import i4.l;
import java.util.Arrays;

public abstract class b
{
    private d[] e;
    private int f;
    private int g;
    private v h;
    
    protected final d i() {
        synchronized (this) {
            final d[] e = this.e;
            d[] k;
            if (e == null) {
                k = this.k(2);
                this.e = k;
            }
            else {
                k = e;
                if (this.f >= e.length) {
                    final Object[] copy = Arrays.copyOf((Object[])e, e.length * 2);
                    l.d((Object)copy, "copyOf(this, newSize)");
                    this.e = (d[])copy;
                    k = (d[])copy;
                }
            }
            int g = this.g;
            d j;
            int g2;
            do {
                if ((j = k[g]) == null) {
                    j = this.j();
                    k[g] = j;
                }
                g2 = ++g;
                if (g >= k.length) {
                    g2 = 0;
                }
                l.c((Object)j, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                g = g2;
            } while (!j.a(this));
            this.g = g2;
            ++this.f;
            final v h = this.h;
            monitorexit(this);
            if (h != null) {
                h.a0(1);
            }
            return j;
        }
    }
    
    protected abstract d j();
    
    protected abstract d[] k(final int p0);
    
    protected final void l(final d d) {
        synchronized (this) {
            final int f = this.f - 1;
            this.f = f;
            final v h = this.h;
            int i = 0;
            if (f == 0) {
                this.g = 0;
            }
            l.c((Object)d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            final y3.d[] b = d.b(this);
            monitorexit(this);
            while (i < b.length) {
                final y3.d d2 = b[i];
                if (d2 != null) {
                    final k$a e = k.e;
                    d2.u(k.a((Object)q.a));
                }
                ++i;
            }
            if (h != null) {
                h.a0(-1);
            }
        }
    }
    
    protected final int m() {
        return this.f;
    }
    
    protected final d[] n() {
        return this.e;
    }
    
    public final h0 o() {
        synchronized (this) {
            v h;
            if ((h = this.h) == null) {
                h = new v(this.f);
                this.h = h;
            }
            return (h0)h;
        }
    }
}
