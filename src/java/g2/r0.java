package g2;

import c2.x;
import c2.r;
import c2.w;
import android.os.Parcel;
import c2.q;

public abstract class r0 extends q implements s0
{
    public r0() {
        super("com.google.android.gms.maps.internal.IOnCircleClickListener");
    }
    
    protected final boolean G(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n == 1) {
            final x j = w.J(parcel.readStrongBinder());
            r.b(parcel);
            ((s0)this).A0(j);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
