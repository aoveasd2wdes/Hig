package q3;

import android.content.Context;
import android.app.Activity;
import android.app.Application;
import k3.c;
import f3.a$b;
import f3.a;

public class n implements a, g3.a, r$f
{
    private a$b c;
    n.n$b d;
    
    private l l() {
        final n.n$b d = this.d;
        if (d != null && d.a() != null) {
            return this.d.b();
        }
        return null;
    }
    
    private void m(final l l, final r$l r$l) {
        final r$k b = r$l.b();
        if (b != null) {
            l$c l$c;
            if (n$a.a[((Enum)b).ordinal()] != 1) {
                l$c = q3.l$c.e;
            }
            else {
                l$c = q3.l$c.f;
            }
            l.X(l$c);
        }
    }
    
    private void n(final c c, final Application application, final Activity activity, final g3.c c2) {
        this.d = new n.n$b(this, application, activity, c, (r$f)this, c2);
    }
    
    private void o() {
        final n.n$b d = this.d;
        if (d != null) {
            d.c();
            this.d = null;
        }
    }
    
    public void a(final r$h r$h, final r$e r$e, final r$j r$j) {
        final l l = this.l();
        if (l == null) {
            r$j.b((Throwable)new r$d("no_activity", "image_picker plugin requires a foreground activity.", (Object)null));
            return;
        }
        l.l(r$h, r$e, r$j);
    }
    
    public void b(final r$l r$l, final r$g r$g, final r$e r$e, final r$j r$j) {
        final l l = this.l();
        if (l == null) {
            r$j.b((Throwable)new r$d("no_activity", "image_picker plugin requires a foreground activity.", (Object)null));
            return;
        }
        this.m(l, r$l);
        if (r$e.b()) {
            l.m(r$g, r$e.d(), p.a(r$e), r$j);
        }
        else {
            final int n = n$a.b[((Enum)r$l.c()).ordinal()];
            if (n != 1) {
                if (n == 2) {
                    l.Z(r$g, r$j);
                }
            }
            else {
                l.k(r$g, r$e.d(), r$j);
            }
        }
    }
    
    public void c(final g3.c c) {
        this.h(c);
    }
    
    public r$b d() {
        final l l = this.l();
        if (l != null) {
            return l.V();
        }
        throw new r$d("no_activity", "image_picker plugin requires a foreground activity.", (Object)null);
    }
    
    public void e() {
        this.o();
    }
    
    public void f(final r$l r$l, final r$n r$n, final r$e r$e, final r$j r$j) {
        final l l = this.l();
        if (l == null) {
            r$j.b((Throwable)new r$d("no_activity", "image_picker plugin requires a foreground activity.", (Object)null));
            return;
        }
        this.m(l, r$l);
        if (r$e.b()) {
            r$j.b((Throwable)new RuntimeException("Multi-video selection is not implemented"));
        }
        else {
            final int n = n$a.b[((Enum)r$l.c()).ordinal()];
            if (n != 1) {
                if (n == 2) {
                    l.a0(r$n, r$j);
                }
            }
            else {
                l.n(r$n, r$e.d(), r$j);
            }
        }
    }
    
    public void g(final a$b c) {
        this.c = c;
    }
    
    public void h(final g3.c c) {
        this.n(this.c.b(), (Application)this.c.a(), c.e(), c);
    }
    
    public void i() {
        this.e();
    }
    
    final l j(final Activity activity) {
        return new l(activity, new q((Context)activity, new q3.a()), new q3.c((Context)activity));
    }
    
    public void k(final a$b a$b) {
        this.c = null;
    }
}
