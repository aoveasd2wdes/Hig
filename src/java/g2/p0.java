package g2;

import c2.r;
import android.os.Parcel;
import c2.q;

public abstract class p0 extends q implements q0
{
    public p0() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }
    
    protected final boolean G(int int1, final Parcel parcel, final Parcel parcel2, final int n) {
        if (int1 == 1) {
            int1 = parcel.readInt();
            r.b(parcel);
            ((q0)this).Z(int1);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
