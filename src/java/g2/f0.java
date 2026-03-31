package g2;

import android.os.Parcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import c2.t;
import android.os.Parcel;
import android.os.IInterface;
import c2.r;
import x1.b;
import android.os.IBinder;
import c2.a;

public final class f0 extends a implements g0
{
    f0(final IBinder binder) {
        super(binder, "com.google.android.gms.maps.internal.ICreator");
    }
    
    public final void D1(final b b) {
        final Parcel j = this.J();
        r.d(j, (IInterface)b);
        this.W(11, j);
    }
    
    public final void K1(final b b, final int n) {
        final Parcel j = this.J();
        r.d(j, (IInterface)b);
        j.writeInt(18020000);
        this.W(6, j);
    }
    
    public final void V1(final b b, final int n) {
        final Parcel j = this.J();
        r.d(j, (IInterface)b);
        j.writeInt(n);
        this.W(10, j);
    }
    
    public final int b() {
        final Parcel g = this.G(9, this.J());
        final int int1 = g.readInt();
        g.recycle();
        return int1;
    }
    
    public final g2.a l() {
        final Parcel g = this.G(4, this.J());
        final IBinder strongBinder = g.readStrongBinder();
        Object o;
        if (strongBinder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (queryLocalInterface instanceof g2.a) {
                o = queryLocalInterface;
            }
            else {
                o = new u(strongBinder);
            }
        }
        g.recycle();
        return (g2.a)o;
    }
    
    public final c2.u s() {
        final Parcel g = this.G(5, this.J());
        final c2.u j = t.J(g.readStrongBinder());
        g.recycle();
        return j;
    }
    
    public final c w0(final b b, final GoogleMapOptions googleMapOptions) {
        final Parcel j = this.J();
        r.d(j, (IInterface)b);
        r.c(j, (Parcelable)googleMapOptions);
        final Parcel g = this.G(3, j);
        final IBinder strongBinder = g.readStrongBinder();
        Object o;
        if (strongBinder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (queryLocalInterface instanceof c) {
                o = queryLocalInterface;
            }
            else {
                o = new k0(strongBinder);
            }
        }
        g.recycle();
        return (c)o;
    }
}
