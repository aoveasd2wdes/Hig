package v4;

import a4.k;
import h4.p;
import t4.r;
import y3.g$c;
import u3.q;
import z3.b;
import i4.l;
import r4.f0;
import y3.d;
import u4.f;
import t4.a;

public abstract class g extends e
{
    protected final u4.e h;
    
    public g(final u4.e h, final y3.g g, final int n, final a a) {
        super(g, n, a);
        this.h = h;
    }
    
    static /* synthetic */ Object n(final g g, final f f, final d d) {
        if (g.f == -3) {
            final y3.g d2 = d.d();
            final y3.g e = f0.e(d2, g.e);
            if (l.a((Object)e, (Object)d2)) {
                final Object r = g.r(f, d);
                if (r == b.c()) {
                    return r;
                }
                return q.a;
            }
            else {
                final y3.e.e$b d3 = y3.e.d;
                if (l.a((Object)e.a((g$c)d3), (Object)d2.a((g$c)d3))) {
                    final Object q = g.q(f, e, d);
                    if (q == b.c()) {
                        return q;
                    }
                    return u3.q.a;
                }
            }
        }
        final Object a = g.a(f, d);
        if (a == b.c()) {
            return a;
        }
        return q.a;
    }
    
    static /* synthetic */ Object p(final g g, final r r, final d d) {
        final Object r2 = g.r((f)new t((t4.t)r), d);
        if (r2 == b.c()) {
            return r2;
        }
        return q.a;
    }
    
    private final Object q(final f f, final y3.g g, final d d) {
        final Object c = f.c(g, (Object)f.a(f, d.d()), (Object)null, (p)new p(this, null) {
            int i;
            Object j;
            final g k;
            
            public final d a(final Object j, final d d) {
                final p p2 = (p)new p(this.k, d) {
                    int i;
                    Object j;
                    final g k;
                };
                p2.j = j;
                return (d)p2;
            }
            
            public final Object s(final Object o) {
                final Object c = b.c();
                final int i = this.i;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u3.l.b(o);
                }
                else {
                    u3.l.b(o);
                    final f f = (f)this.j;
                    final g k = this.k;
                    this.i = 1;
                    if (k.r(f, (d)this) == c) {
                        return c;
                    }
                }
                return q.a;
            }
            
            public final Object w(final f f, final d d) {
                return ((g$a)this.a(f, d)).s(q.a);
            }
        }, d, 4, (Object)null);
        if (c == b.c()) {
            return c;
        }
        return q.a;
    }
    
    @Override
    public Object a(final f f, final d d) {
        return n(this, f, d);
    }
    
    @Override
    protected Object h(final r r, final d d) {
        return p(this, r, d);
    }
    
    protected abstract Object r(final f p0, final d p1);
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)this.h);
        sb.append(" -> ");
        sb.append(super.toString());
        return sb.toString();
    }
}
