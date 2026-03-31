package g2;

import c2.r;
import com.google.android.gms.maps.model.LatLng;
import android.os.Parcel;
import c2.q;

public abstract class k extends q implements l
{
    public k() {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }
    
    protected final boolean G(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n == 1) {
            final LatLng latLng = (LatLng)r.a(parcel, LatLng.CREATOR);
            r.b(parcel);
            ((l)this).I(latLng);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
