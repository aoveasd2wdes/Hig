package g2;

import x1.b$a;
import android.os.Parcelable;
import android.os.IInterface;
import com.google.android.gms.maps.model.LatLng;
import x1.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import c2.r;
import h2.d0;
import android.os.IBinder;
import c2.a;

public final class z extends a implements d
{
    z(final IBinder binder) {
        super(binder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }
    
    public final d0 D() {
        final Parcel g = this.G(3, this.J());
        final d0 d0 = (d0)r.a(g, (Parcelable$Creator)h2.d0.CREATOR);
        g.recycle();
        return d0;
    }
    
    public final LatLng a0(final b b) {
        final Parcel j = this.J();
        r.d(j, (IInterface)b);
        final Parcel g = this.G(1, j);
        final LatLng latLng = (LatLng)r.a(g, LatLng.CREATOR);
        g.recycle();
        return latLng;
    }
    
    public final b d0(final LatLng latLng) {
        final Parcel j = this.J();
        r.c(j, (Parcelable)latLng);
        final Parcel g = this.G(2, j);
        final b i = b$a.J(g.readStrongBinder());
        g.recycle();
        return i;
    }
}
