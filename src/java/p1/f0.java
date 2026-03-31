package p1;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

final class f0 implements Runnable
{
    final LifecycleCallback e;
    final String f;
    final g0 g;
    
    f0(final g0 g, final LifecycleCallback e, final String f) {
        this.g = g;
        this.e = e;
        this.f = f;
    }
    
    public final void run() {
        final g0 g = this.g;
        if (g0.T0(g) > 0) {
            final LifecycleCallback e = this.e;
            Bundle bundle;
            if (g0.U0(g) != null) {
                bundle = g0.U0(g).getBundle(this.f);
            }
            else {
                bundle = null;
            }
            e.f(bundle);
        }
        if (g0.T0(this.g) >= 2) {
            this.e.j();
        }
        if (g0.T0(this.g) >= 3) {
            this.e.h();
        }
        if (g0.T0(this.g) >= 4) {
            this.e.k();
        }
        if (g0.T0(this.g) >= 5) {
            this.e.g();
        }
    }
}
