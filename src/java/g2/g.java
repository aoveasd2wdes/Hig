package g2;

import c2.d;
import c2.r;
import c2.c;
import android.os.Parcel;
import c2.q;

public abstract class g extends q implements h
{
    public g() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
    }
    
    protected final boolean G(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n == 1) {
            final d j = c.J(parcel.readStrongBinder());
            r.b(parcel);
            ((h)this).a(j);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
