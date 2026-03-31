package q1;

import android.os.IBinder;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import a2.c;
import android.os.Parcel;
import a2.b;

public abstract class n0 extends b implements k
{
    public n0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }
    
    protected final boolean G(int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    return false;
                }
                n = parcel.readInt();
                final IBinder strongBinder = parcel.readStrongBinder();
                final y0 y0 = (y0)c.a(parcel, (Parcelable$Creator)q1.y0.CREATOR);
                c.b(parcel);
                ((k)this).k1(n, strongBinder, y0);
            }
            else {
                n = parcel.readInt();
                final Bundle bundle = (Bundle)c.a(parcel, Bundle.CREATOR);
                c.b(parcel);
                ((k)this).u0(n, bundle);
            }
        }
        else {
            n = parcel.readInt();
            final IBinder strongBinder2 = parcel.readStrongBinder();
            final Bundle bundle2 = (Bundle)c.a(parcel, Bundle.CREATOR);
            c.b(parcel);
            ((k)this).r2(n, strongBinder2, bundle2);
        }
        parcel2.writeNoException();
        return true;
    }
}
