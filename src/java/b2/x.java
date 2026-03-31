package b2;

import p1.k;
import android.location.Location;
import com.google.android.gms.common.api.Status;
import k2.h;

final class x extends i1
{
    final h b;
    
    x(final h b) {
        this.b = b;
    }
    
    public final void B1(final Status status, final Location location) {
        k.a(status, (Object)location, this.b);
    }
}
