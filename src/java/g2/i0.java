package g2;

import x1.b;
import c2.d;
import android.os.IInterface;
import c2.r;
import c2.c;
import android.os.Parcel;
import c2.q;

public abstract class i0 extends q implements j0
{
    public i0() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }
    
    protected final boolean G(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        b b;
        if (n != 1) {
            if (n != 2) {
                return false;
            }
            final d j = c.J(parcel.readStrongBinder());
            r.b(parcel);
            b = ((j0)this).a(j);
        }
        else {
            final d i = c.J(parcel.readStrongBinder());
            r.b(parcel);
            b = ((j0)this).P(i);
        }
        parcel2.writeNoException();
        r.d(parcel2, (IInterface)b);
        return true;
    }
}
