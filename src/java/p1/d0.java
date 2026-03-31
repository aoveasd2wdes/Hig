package p1;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

final class d0 implements Runnable
{
    final LifecycleCallback e;
    final String f;
    final e0 g;
    
    d0(final e0 g, final LifecycleCallback e, final String f) {
        this.g = g;
        this.e = e;
        this.f = f;
    }
    
    public final void run() {
        final e0 g = this.g;
        if (e0.a(g) > 0) {
            final LifecycleCallback e = this.e;
            Bundle bundle;
            if (e0.b(g) != null) {
                bundle = e0.b(g).getBundle(this.f);
            }
            else {
                bundle = null;
            }
            e.f(bundle);
        }
        if (e0.a(this.g) >= 2) {
            this.e.j();
        }
        if (e0.a(this.g) >= 3) {
            this.e.h();
        }
        if (e0.a(this.g) >= 4) {
            this.e.k();
        }
        if (e0.a(this.g) >= 5) {
            this.e.g();
        }
    }
}
