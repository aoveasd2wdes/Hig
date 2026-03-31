package c2;

import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import android.os.IInterface;
import android.os.Parcel;
import android.os.IBinder;

public final class v extends a implements x
{
    v(final IBinder binder) {
        super(binder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }
    
    public final void D0(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(15, j);
    }
    
    public final boolean T1(final x x) {
        final Parcel j = this.J();
        r.d(j, (IInterface)x);
        final Parcel g = this.G(17, j);
        final boolean e = r.e(g);
        g.recycle();
        return e;
    }
    
    public final void V(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(19, j);
    }
    
    public final void c1(final double n) {
        final Parcel j = this.J();
        j.writeDouble(n);
        this.W(5, j);
    }
    
    public final String e() {
        final Parcel g = this.G(2, this.J());
        final String string = g.readString();
        g.recycle();
        return string;
    }
    
    public final void f(final float n) {
        final Parcel j = this.J();
        j.writeFloat(n);
        this.W(13, j);
    }
    
    public final int i() {
        final Parcel g = this.G(18, this.J());
        final int int1 = g.readInt();
        g.recycle();
        return int1;
    }
    
    public final void i2(final float n) {
        final Parcel j = this.J();
        j.writeFloat(n);
        this.W(7, j);
    }
    
    public final void o2(final LatLng latLng) {
        final Parcel j = this.J();
        r.c(j, (Parcelable)latLng);
        this.W(3, j);
    }
    
    public final void p(final int n) {
        final Parcel j = this.J();
        j.writeInt(n);
        this.W(11, j);
    }
    
    public final void p0(final int n) {
        final Parcel j = this.J();
        j.writeInt(n);
        this.W(9, j);
    }
    
    public final void q() {
        this.W(1, this.J());
    }
}
