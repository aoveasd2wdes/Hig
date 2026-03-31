package v4;

import a4.e;
import z3.b;
import i4.l;
import r4.u1;
import h4.p;
import y3.h;
import y3.g;
import u4.f;
import a4.d;

public final class q extends d implements f
{
    public final f h;
    public final g i;
    public final int j;
    private g k;
    private y3.d l;
    
    public q(final f h, final g i) {
        super((y3.d)n.e, (g)y3.h.e);
        this.h = h;
        this.i = i;
        this.j = ((Number)i.j((Object)0, (p)q$a.f)).intValue();
    }
    
    private final void w(final g g, final g g2, final Object o) {
        if (g2 instanceof k) {
            this.z((k)g2, o);
        }
        s.a(this, g);
    }
    
    private final Object y(final y3.d l, final Object o) {
        final g d = l.d();
        u1.f(d);
        final g k = this.k;
        if (k != d) {
            this.w(d, k, o);
            this.k = d;
        }
        this.l = l;
        final h4.q a = r.a();
        final f h = this.h;
        l.c((Object)h, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        l.c((Object)this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        final Object i = a.i((Object)h, o, (Object)this);
        if (!l.a(i, b.c())) {
            this.l = null;
        }
        return i;
    }
    
    private final void z(final k k, final Object o) {
        final StringBuilder sb = new StringBuilder();
        sb.append("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
        sb.append((Object)k.e);
        sb.append(", but then emission attempt of value '");
        sb.append(o);
        sb.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(p4.f.e(sb.toString()).toString());
    }
    
    public g d() {
        Object o;
        if ((o = this.k) == null) {
            o = y3.h.e;
        }
        return (g)o;
    }
    
    public Object h(Object y, final y3.d d) {
        try {
            y = this.y(d, y);
            if (y == b.c()) {
                a4.h.c(d);
            }
            if (y == b.c()) {
                return y;
            }
            return u3.q.a;
        }
        finally {
            final Throwable t;
            this.k = (g)new k(t, d.d());
        }
    }
    
    public e n() {
        final y3.d l = this.l;
        e e;
        if (l instanceof e) {
            e = (e)l;
        }
        else {
            e = null;
        }
        return e;
    }
    
    public StackTraceElement r() {
        return null;
    }
    
    public Object s(final Object o) {
        final Throwable b = u3.k.b(o);
        if (b != null) {
            this.k = (g)new k(b, this.d());
        }
        final y3.d l = this.l;
        if (l != null) {
            l.u(o);
        }
        return z3.b.c();
    }
    
    public void t() {
        super.t();
    }
}
