package g2;

import c2.j;
import c2.r;
import c2.i;
import android.os.Parcel;
import c2.q;

public abstract class x extends q implements y
{
    public x() {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
    }
    
    protected final boolean G(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n == 1) {
            final j j = i.J(parcel.readStrongBinder());
            r.b(parcel);
            ((y)this).e1(j);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
