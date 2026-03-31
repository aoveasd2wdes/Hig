package b2;

import android.os.Parcelable$Creator;
import e2.i;
import android.os.Parcel;

public abstract class b extends d implements c
{
    public b() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }
    
    protected final boolean G(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n == 1) {
            final i i = (i)n.a(parcel, (Parcelable$Creator)e2.i.CREATOR);
            n.d(parcel);
            ((c)this).C0(i);
            return true;
        }
        return false;
    }
}
