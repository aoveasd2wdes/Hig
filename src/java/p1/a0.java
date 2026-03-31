package p1;

import o1.a$f;
import j2.f;
import android.os.Bundle;
import n1.a;
import android.util.Log;
import q1.j0;
import j2.l;
import q1.o;
import q1.e;
import java.util.Set;
import android.os.Handler;
import android.content.Context;
import o1.a$a;
import o1.f$b;
import o1.f$a;
import j2.d;

public final class a0 extends d implements f$a, f$b
{
    private static final a$a i;
    private final Context b;
    private final Handler c;
    private final a$a d;
    private final Set e;
    private final e f;
    private i2.e g;
    private z h;
    
    static {
        i = i2.d.c;
    }
    
    public a0(final Context b, final Handler c, final e e) {
        final a$a i = a0.i;
        this.b = b;
        this.c = c;
        this.f = (e)o.i((Object)e, (Object)"ClientSettings must not be null");
        this.e = e.e();
        this.d = i;
    }
    
    public final void G(final int n) {
        this.h.d(n);
    }
    
    public final void J(final a a) {
        this.h.a(a);
    }
    
    public final void W(final Bundle bundle) {
        this.g.l((f)this);
    }
    
    public final void x1(final l l) {
        this.c.post((Runnable)new y(this, l));
    }
    
    public final void x2(final z h) {
        final i2.e g = this.g;
        if (g != null) {
            ((a$f)g).i();
        }
        this.f.i(Integer.valueOf(System.identityHashCode((Object)this)));
        final a$a d = this.d;
        final Context b = this.b;
        final Handler c = this.c;
        final e f = this.f;
        this.g = (i2.e)d.a(b, c.getLooper(), f, (Object)f.f(), (f$a)this, (f$b)this);
        this.h = h;
        final Set e = this.e;
        if (e != null && !e.isEmpty()) {
            this.g.n();
            return;
        }
        this.c.post((Runnable)new x(this));
    }
    
    public final void y2() {
        final i2.e g = this.g;
        if (g != null) {
            ((a$f)g).i();
        }
    }
}
