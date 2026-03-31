package g2;

import c2.d;
import c2.r;
import c2.c;
import android.os.Parcel;
import c2.q;

public abstract class i extends q implements j
{
    public i() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
    }
    
    protected final boolean G(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n == 1) {
            final d j = c.J(parcel.readStrongBinder());
            r.b(parcel);
            ((j)this).a(j);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
