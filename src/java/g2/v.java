package g2;

import c2.g;
import c2.r;
import c2.f;
import android.os.Parcel;
import c2.q;

public abstract class v extends q implements w
{
    public v() {
        super("com.google.android.gms.maps.internal.IOnPolygonClickListener");
    }
    
    protected final boolean G(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n == 1) {
            final g j = f.J(parcel.readStrongBinder());
            r.b(parcel);
            ((w)this).R1(j);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
