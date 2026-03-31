package p3;

import f2.e;
import f2.e$a;
import k3.c;
import android.content.Context;
import f2.g;

final class k implements g, x$d
{
    private static x$z0 c;
    private final Context a;
    private boolean b;
    
    k(final Context a, final c c) {
        this.b = false;
        this.a = a;
        l1.d(c, (x$d)this);
    }
    
    public void a(final e$a e$a) {
        this.b = true;
        if (k.c != null) {
            final int n = k$a.a[((Enum)e$a).ordinal()];
            Label_0082: {
                x$z0 x$z0;
                x$u0 x$u0;
                if (n != 1) {
                    if (n != 2) {
                        k.c.b((Throwable)new x$a("Unknown renderer type", "Initialized with unknown renderer type", (Object)((Enum)e$a).name()));
                        break Label_0082;
                    }
                    x$z0 = k.c;
                    x$u0 = p3.x$u0.f;
                }
                else {
                    x$z0 = k.c;
                    x$u0 = p3.x$u0.g;
                }
                x$z0.a((Object)x$u0);
            }
            k.c = null;
        }
    }
    
    public void b(final x$u0 x$u0, final x$z0 c) {
        if (!this.b && k.c == null) {
            k.c = c;
            this.c(f.N(x$u0));
        }
        else {
            c.b((Throwable)new x$a("Renderer already initialized", "Renderer initialization called multiple times", (Object)null));
        }
    }
    
    public void c(final e$a e$a) {
        e.b(this.a, e$a, (g)this);
    }
}
