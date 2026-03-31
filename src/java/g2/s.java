package g2;

import c2.d;
import c2.r;
import c2.c;
import android.os.Parcel;
import c2.q;

public abstract class s extends q implements t
{
    public s() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }
    
    protected final boolean G(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    return false;
                }
                final d j = c.J(parcel.readStrongBinder());
                r.b(parcel);
                ((t)this).P(j);
            }
            else {
                final d i = c.J(parcel.readStrongBinder());
                r.b(parcel);
                ((t)this).a(i);
            }
        }
        else {
            final d k = c.J(parcel.readStrongBinder());
            r.b(parcel);
            ((t)this).P0(k);
        }
        parcel2.writeNoException();
        return true;
    }
}
