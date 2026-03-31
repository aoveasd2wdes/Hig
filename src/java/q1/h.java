package q1;

import java.util.concurrent.Executor;
import java.util.Collections;
import java.util.Iterator;
import o1.f$b;
import o1.f$a;
import android.os.Looper;
import android.content.Context;
import android.accounts.Account;
import java.util.Set;
import o1.a$f;

public abstract class h extends c implements a$f
{
    private final e F;
    private final Set G;
    private final Account H;
    
    protected h(final Context context, final Looper looper, final int n, final e e, final f$a f$a, final f$b f$b) {
        this(context, looper, n, e, (p1.c)f$a, (p1.h)f$b);
    }
    
    protected h(final Context context, final Looper looper, final int n, final e e, final p1.c c, final p1.h h) {
        this(context, looper, i.a(context), n1.h.l(), n, e, (p1.c)o.h((Object)c), (p1.h)o.h((Object)h));
    }
    
    protected h(final Context context, final Looper looper, final i i, final n1.h h, final int n, final e f, final p1.c c, final p1.h h2) {
        Object o;
        if (c == null) {
            o = null;
        }
        else {
            o = new d0(c);
        }
        Object o2;
        if (h2 == null) {
            o2 = null;
        }
        else {
            o2 = new e0(h2);
        }
        super(context, looper, i, (n1.i)h, n, (c$a)o, (c$b)o2, f.h());
        this.F = f;
        this.H = f.a();
        this.G = this.i0(f.c());
    }
    
    private final Set i0(final Set set) {
        final Set h0 = this.h0(set);
        final Iterator iterator = h0.iterator();
        while (iterator.hasNext()) {
            if (set.contains((Object)iterator.next())) {
                continue;
            }
            throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
        }
        return h0;
    }
    
    protected final Set B() {
        return this.G;
    }
    
    public Set h() {
        Set set;
        if (this.k()) {
            set = this.G;
        }
        else {
            set = Collections.emptySet();
        }
        return set;
    }
    
    protected Set h0(final Set set) {
        return set;
    }
    
    public final Account t() {
        return this.H;
    }
    
    protected Executor v() {
        return null;
    }
}
