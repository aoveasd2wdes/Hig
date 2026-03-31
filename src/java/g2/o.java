package g2;

import android.os.IInterface;
import android.os.IBinder;
import c2.r;
import android.os.Parcel;
import c2.q;

public abstract class o extends q implements p
{
    public o() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }
    
    protected final boolean G(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n == 1) {
            final IBinder strongBinder = parcel.readStrongBinder();
            Object o;
            if (strongBinder == null) {
                o = null;
            }
            else {
                final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (queryLocalInterface instanceof b) {
                    o = queryLocalInterface;
                }
                else {
                    o = new h0(strongBinder);
                }
            }
            r.b(parcel);
            ((p)this).J0((b)o);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
