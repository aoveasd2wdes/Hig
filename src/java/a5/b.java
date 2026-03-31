package a5;

import r4.n0;
import r4.n;
import a4.h;
import r4.m;
import r4.p;
import h4.q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class b extends d implements a
{
    private static final AtomicReferenceFieldUpdater i;
    private final q h;
    private volatile Object owner;
    
    static {
        i = AtomicReferenceFieldUpdater.newUpdater((Class)b.class, (Class)Object.class, "owner");
    }
    
    public b(final boolean b) {
        super(1, (int)(b ? 1 : 0));
        Object c;
        if ((b ? 1 : 0) != 0) {
            c = null;
        }
        else {
            c = a5.c.c();
        }
        this.owner = c;
        this.h = (q)new b$b(this);
    }
    
    private final int n(final Object o) {
        while (this.o()) {
            final Object value = b.i.get((Object)this);
            if (value != c.c()) {
                int n;
                if (value == o) {
                    n = 1;
                }
                else {
                    n = 2;
                }
                return n;
            }
        }
        return 0;
    }
    
    static /* synthetic */ Object p(final b b, final Object o, final y3.d d) {
        if (b.b(o)) {
            return u3.q.a;
        }
        final Object q = b.q(o, d);
        if (q == b.c()) {
            return q;
        }
        return u3.q.a;
    }
    
    private final Object q(Object y, final y3.d d) {
        final n b = p.b(z3.b.b(d));
        try {
            this.d((m)new b.b$a(this, b, y));
            y = b.y();
            if (y == z3.b.c()) {
                a4.h.c(d);
            }
            if (y == z3.b.c()) {
                return y;
            }
            return u3.q.a;
        }
        finally {
            b.M();
        }
    }
    
    private final int r(final Object o) {
        while (!this.j()) {
            if (o == null) {
                return 1;
            }
            final int n = this.n(o);
            if (n == 1) {
                return 2;
            }
            if (n != 2) {
                continue;
            }
            return 1;
        }
        b.i.set((Object)this, o);
        return 0;
    }
    
    public void a(final Object o) {
        while (this.o()) {
            final AtomicReferenceFieldUpdater i = b.i;
            final Object value = i.get((Object)this);
            if (value != c.c()) {
                if (value != o && o != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("This mutex is locked by ");
                    sb.append(value);
                    sb.append(", but ");
                    sb.append(o);
                    sb.append(" is expected");
                    throw new IllegalStateException(sb.toString().toString());
                }
                if (androidx.concurrent.futures.b.a(i, (Object)this, value, (Object)c.c())) {
                    this.i();
                    return;
                }
                continue;
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }
    
    public boolean b(final Object o) {
        final int r = this.r(o);
        boolean b = true;
        if (r != 0) {
            if (r != 1) {
                if (r != 2) {
                    throw new IllegalStateException("unexpected".toString());
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("This mutex is already locked by the specified owner: ");
                sb.append(o);
                throw new IllegalStateException(sb.toString().toString());
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public Object c(final Object o, final y3.d d) {
        return p(this, o, d);
    }
    
    public boolean o() {
        return this.h() == 0;
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Mutex@");
        sb.append(n0.b((Object)this));
        sb.append("[isLocked=");
        sb.append(this.o());
        sb.append(",owner=");
        sb.append(b.i.get((Object)this));
        sb.append(']');
        return sb.toString();
    }
}
