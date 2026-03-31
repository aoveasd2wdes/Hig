package g2;

import android.os.Parcel;
import c2.q;

public abstract class n0 extends q implements o0
{
    public n0() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener");
    }
    
    protected final boolean G(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n == 1) {
            ((o0)this).g();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
