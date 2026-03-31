package b2;

import com.google.android.gms.location.LocationRequest;
import e2.g;
import android.location.Location;
import android.os.Parcel;
import android.os.IInterface;
import android.os.Parcelable;
import e2.d;
import android.os.IBinder;

public final class g1 extends a implements h1
{
    g1(final IBinder binder) {
        super(binder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }
    
    public final void W1(final d d, final j1 j1) {
        final Parcel g = this.G();
        n.b(g, (Parcelable)d);
        n.c(g, (IInterface)j1);
        this.W(82, g);
    }
    
    public final Location Z0() {
        final Parcel j = this.J(7, this.G());
        final Location location = (Location)n.a(j, Location.CREATOR);
        j.recycle();
        return location;
    }
    
    public final void c0(final d d, final g0 g0) {
        final Parcel g2 = this.G();
        n.b(g2, (Parcelable)d);
        n.b(g2, (Parcelable)g0);
        this.W(90, g2);
    }
    
    public final void f1(final g g, final c c, final String s) {
        final Parcel g2 = this.G();
        n.b(g2, (Parcelable)g);
        n.c(g2, (IInterface)c);
        g2.writeString((String)null);
        this.W(63, g2);
    }
    
    public final void h0(final g0 g0, final LocationRequest locationRequest, final p1.d d) {
        final Parcel g2 = this.G();
        n.b(g2, (Parcelable)g0);
        n.b(g2, (Parcelable)locationRequest);
        n.c(g2, (IInterface)d);
        this.W(88, g2);
    }
    
    public final void i1(final g0 g0, final p1.d d) {
        final Parcel g2 = this.G();
        n.b(g2, (Parcelable)g0);
        n.c(g2, (IInterface)d);
        this.W(89, g2);
    }
    
    public final void l0(final k0 k0) {
        final Parcel g = this.G();
        n.b(g, (Parcelable)k0);
        this.W(59, g);
    }
}
