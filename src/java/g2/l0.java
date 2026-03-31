package g2;

import android.os.Parcel;
import c2.q;

public abstract class l0 extends q implements m0
{
    public l0() {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
    }
    
    protected final boolean G(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n == 1) {
            ((m0)this).g();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
