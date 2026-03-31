package c2;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import h2.z;
import android.os.IBinder;

public final class n extends a implements p
{
    n(final IBinder binder) {
        super(binder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }
    
    public final z u1(final int n, final int n2, final int n3) {
        final Parcel j = this.J();
        j.writeInt(n);
        j.writeInt(n2);
        j.writeInt(n3);
        final Parcel g = this.G(1, j);
        final z z = (z)r.a(g, (Parcelable$Creator)h2.z.CREATOR);
        g.recycle();
        return z;
    }
}
