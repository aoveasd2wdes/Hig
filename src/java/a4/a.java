package a4;

import u3.k$a;
import u3.k;
import z3.b;
import i4.l;
import java.io.Serializable;
import y3.d;

public abstract class a implements d, e, Serializable
{
    private final d e;
    
    public a(final d e) {
        this.e = e;
    }
    
    public d a(final Object o, final d d) {
        l.e((Object)d, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
    
    public e n() {
        final d e = this.e;
        e e2;
        if (e instanceof e) {
            e2 = (e)e;
        }
        else {
            e2 = null;
        }
        return e2;
    }
    
    public final d q() {
        return this.e;
    }
    
    public StackTraceElement r() {
        return g.d(this);
    }
    
    protected abstract Object s(final Object p0);
    
    protected void t() {
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object o = this.r();
        if (o == null) {
            o = this.getClass().getName();
        }
        sb.append(o);
        return sb.toString();
    }
    
    @Override
    public final void u(Object o) {
        d e = this;
        do {
            h.b(e);
            final a a = (a)e;
            e = a.e;
            l.b((Object)e);
            try {
                o = a.s(o);
                if (o == b.c()) {
                    return;
                }
                o = k.a(o);
            }
            finally {
                final k$a e2 = k.e;
                final Throwable t;
                o = k.a(u3.l.a(t));
            }
            a.t();
        } while (e instanceof a);
        e.u(o);
    }
}
