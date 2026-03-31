package b2;

import com.google.android.gms.common.api.internal.c$a;
import com.google.android.gms.common.api.internal.c;
import p1.i;

final class h implements i, z
{
    private final g a;
    private c b;
    private boolean c;
    final b2.i d;
    
    h(final b2.i d, final c b, final g a) {
        this.d = d;
        this.c = true;
        this.b = b;
        this.a = a;
    }
    
    public final void k() {
        synchronized (this) {
            this.c = false;
            final c$a b = this.b.b();
            monitorexit(this);
            if (b != null) {
                this.d.j(b, 2441);
            }
        }
    }
    
    public final c l() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public final void m(final c b) {
        synchronized (this) {
            final c b2 = this.b;
            if (b2 != b) {
                b2.a();
                this.b = b;
            }
        }
    }
}
