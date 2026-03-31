package b2;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;

public abstract class i1 extends d implements j1
{
    public i1() {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
    }
    
    protected final boolean G(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n == 1) {
            final Status status = (Status)n.a(parcel, Status.CREATOR);
            final Location location = (Location)n.a(parcel, Location.CREATOR);
            n.d(parcel);
            ((j1)this).B1(status, location);
            return true;
        }
        return false;
    }
}
