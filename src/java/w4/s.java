package w4;

import r4.n0;
import i4.l;
import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class s
{
    private static final AtomicReferenceFieldUpdater e;
    private static final AtomicReferenceFieldUpdater f;
    private static final AtomicReferenceFieldUpdater g;
    private volatile Object _next;
    private volatile Object _prev;
    private volatile Object _removedRef;
    
    static {
        e = AtomicReferenceFieldUpdater.newUpdater((Class)s.class, (Class)Object.class, "_next");
        f = AtomicReferenceFieldUpdater.newUpdater((Class)s.class, (Class)Object.class, "_prev");
        g = AtomicReferenceFieldUpdater.newUpdater((Class)s.class, (Class)Object.class, "_removedRef");
    }
    
    public s() {
        this._next = this;
        this._prev = this;
    }
    
    private final s m(final a0 a0) {
    Label_0000:
        while (true) {
            while (true) {
                s s;
                final Object o = s = (s)w4.s.f.get((Object)this);
                while (true) {
                    s s2 = null;
                    while (true) {
                        final AtomicReferenceFieldUpdater e = w4.s.e;
                        final Object value = e.get((Object)s);
                        if (value == this) {
                            if (o == s) {
                                return s;
                            }
                            if (!b.a(w4.s.f, (Object)this, o, (Object)s)) {
                                continue Label_0000;
                            }
                            return s;
                        }
                        else {
                            if (this.t()) {
                                return null;
                            }
                            if (value == a0) {
                                return s;
                            }
                            if (value instanceof a0) {
                                ((a0)value).a(s);
                                continue Label_0000;
                            }
                            if (value instanceof b0) {
                                if (s2 != null) {
                                    if (!b.a(e, (Object)s2, (Object)s, (Object)((b0)value).a)) {
                                        continue Label_0000;
                                    }
                                    s = s2;
                                    break;
                                }
                                else {
                                    s = (s)w4.s.f.get((Object)s);
                                }
                            }
                            else {
                                l.c(value, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                                final s s3 = (s)value;
                                s2 = s;
                                s = s3;
                            }
                        }
                    }
                }
            }
            break;
        }
    }
    
    private final s n(s s) {
        while (s.t()) {
            s = (s)s.f.get((Object)s);
        }
        return s;
    }
    
    private final void o(final s s) {
        final AtomicReferenceFieldUpdater f = s.f;
        s s2;
        do {
            s2 = (s)f.get((Object)s);
            if (this.q() != s) {
                return;
            }
        } while (!b.a(s.f, (Object)s, (Object)s2, (Object)this));
        if (this.t()) {
            s.m(null);
        }
    }
    
    private final b0 w() {
        final AtomicReferenceFieldUpdater g = s.g;
        b0 b0;
        if ((b0 = (b0)g.get((Object)this)) == null) {
            b0 = new b0(this);
            g.lazySet((Object)this, (Object)b0);
        }
        return b0;
    }
    
    public final boolean k(final s s) {
        s.f.lazySet((Object)s, (Object)this);
        s.e.lazySet((Object)s, (Object)this);
        while (this.q() == this) {
            if (b.a(s.e, (Object)this, (Object)this, (Object)s)) {
                s.o(this);
                return true;
            }
        }
        return false;
    }
    
    public final Object q() {
        final AtomicReferenceFieldUpdater e = s.e;
        Object value;
        while (true) {
            value = e.get((Object)this);
            if (!(value instanceof a0)) {
                break;
            }
            ((a0)value).a(this);
        }
        return value;
    }
    
    public final s r() {
        return r.b(this.q());
    }
    
    public final s s() {
        s s;
        if ((s = this.m(null)) == null) {
            s = this.n((s)w4.s.f.get((Object)this));
        }
        return s;
    }
    
    public boolean t() {
        return this.q() instanceof b0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)new s$b((Object)this));
        sb.append('@');
        sb.append(n0.b((Object)this));
        return sb.toString();
    }
    
    public boolean u() {
        return this.v() == null;
    }
    
    public final s v() {
        Object q;
        s s;
        do {
            q = this.q();
            if (q instanceof b0) {
                return ((b0)q).a;
            }
            if (q == this) {
                return (s)q;
            }
            l.c(q, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            s = (s)q;
        } while (!b.a(w4.s.e, (Object)this, q, (Object)s.w()));
        s.m(null);
        return null;
    }
    
    public final int x(final s s, final s c, final s.s$a s$a) {
        s.f.lazySet((Object)s, (Object)this);
        final AtomicReferenceFieldUpdater e = s.e;
        e.lazySet((Object)s, (Object)c);
        s$a.c = c;
        if (!b.a(e, (Object)this, (Object)c, (Object)s$a)) {
            return 0;
        }
        int n;
        if (((w4.b)s$a).a((Object)this) == null) {
            n = 1;
        }
        else {
            n = 2;
        }
        return n;
    }
}
