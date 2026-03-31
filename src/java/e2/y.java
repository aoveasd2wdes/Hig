package e2;

import com.google.android.gms.location.LocationResult;
import b2.n;
import com.google.android.gms.location.LocationAvailability;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import b2.d;

public abstract class y extends d implements z
{
    public y() {
        super("com.google.android.gms.location.ILocationCallback");
    }
    
    public static z J(final IBinder binder) {
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        if (queryLocalInterface instanceof z) {
            return (z)queryLocalInterface;
        }
        return (z)new x(binder);
    }
    
    protected final boolean G(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    return false;
                }
                ((z)this).t();
            }
            else {
                final LocationAvailability locationAvailability = (LocationAvailability)n.a(parcel, LocationAvailability.CREATOR);
                n.d(parcel);
                ((z)this).z0(locationAvailability);
            }
        }
        else {
            final LocationResult locationResult = (LocationResult)n.a(parcel, LocationResult.CREATOR);
            n.d(parcel);
            ((z)this).l1(locationResult);
        }
        return true;
    }
}
