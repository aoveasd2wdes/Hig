package b2;

import android.os.Parcelable$Creator;
import android.os.Parcel;

public abstract class e1 extends d implements f1
{
    public e1() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }
    
    protected final boolean G(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n != 1) {
            if (n != 2) {
                return false;
            }
            ((f1)this).l();
        }
        else {
            final b1 b1 = (b1)n.a(parcel, (Parcelable$Creator)b2.b1.CREATOR);
            n.d(parcel);
            ((f1)this).I0(b1);
        }
        return true;
    }
}
