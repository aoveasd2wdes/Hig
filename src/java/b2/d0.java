package b2;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.common.api.internal.c$b;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.common.api.internal.c;
import e2.y;

final class d0 extends y
{
    private final z b;
    
    d0(final z b) {
        this.b = b;
    }
    
    final d0 W(final c c) {
        this.b.m(c);
        return this;
    }
    
    public final void l1(final LocationResult locationResult) {
        this.b.l().c((c$b)new a0(this, locationResult));
    }
    
    public final void t() {
        this.b.l().c((c$b)new c0(this));
    }
    
    final void u2() {
        this.b.l().a();
    }
    
    public final void z0(final LocationAvailability locationAvailability) {
        this.b.l().c((c$b)new b0(this, locationAvailability));
    }
}
