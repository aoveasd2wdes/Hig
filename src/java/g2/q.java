package g2;

import c2.d;
import c2.c;
import android.os.Parcel;

public abstract class q extends c2.q implements r
{
    public q() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }
    
    protected final boolean G(int a, final Parcel parcel, final Parcel parcel2, final int n) {
        if (a == 1) {
            final d j = c.J(parcel.readStrongBinder());
            c2.r.b(parcel);
            a = (((r)this).a(j) ? 1 : 0);
            parcel2.writeNoException();
            parcel2.writeInt(a);
            return true;
        }
        return false;
    }
}
