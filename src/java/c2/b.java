package c2;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import android.os.IBinder;

public final class b extends a implements d
{
    b(final IBinder binder) {
        super(binder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }
    
    public final void J1(final LatLng latLng) {
        final Parcel j = this.J();
        r.c(j, (Parcelable)latLng);
        this.W(3, j);
    }
    
    public final String K() {
        final Parcel g = this.G(2, this.J());
        final String string = g.readString();
        g.recycle();
        return string;
    }
    
    public final void L0(final float n, final float n2) {
        final Parcel j = this.J();
        j.writeFloat(n);
        j.writeFloat(n2);
        this.W(24, j);
    }
    
    public final String L1() {
        final Parcel g = this.G(6, this.J());
        final String string = g.readString();
        g.recycle();
        return string;
    }
    
    public final void M(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(9, j);
    }
    
    public final boolean S0() {
        final Parcel g = this.G(13, this.J());
        final boolean e = r.e(g);
        g.recycle();
        return e;
    }
    
    public final int S1() {
        final Parcel g = this.G(17, this.J());
        final int int1 = g.readInt();
        g.recycle();
        return int1;
    }
    
    public final void U0(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(20, j);
    }
    
    public final void V0(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(14, j);
    }
    
    public final void W0(final String s) {
        final Parcel j = this.J();
        j.writeString(s);
        this.W(7, j);
    }
    
    public final void X0(final x1.b b) {
        final Parcel j = this.J();
        r.d(j, (IInterface)b);
        this.W(18, j);
    }
    
    public final String e() {
        final Parcel g = this.G(8, this.J());
        final String string = g.readString();
        g.recycle();
        return string;
    }
    
    public final void f(final float n) {
        final Parcel j = this.J();
        j.writeFloat(n);
        this.W(22, j);
    }
    
    public final void g0(final String s) {
        final Parcel j = this.J();
        j.writeString(s);
        this.W(5, j);
    }
    
    public final void h() {
        this.W(1, this.J());
    }
    
    public final void j1() {
        this.W(11, this.J());
    }
    
    public final void k0(final float n, final float n2) {
        final Parcel j = this.J();
        j.writeFloat(n);
        j.writeFloat(n2);
        this.W(19, j);
    }
    
    public final void q() {
        this.W(12, this.J());
    }
    
    public final boolean q2(final d d) {
        final Parcel j = this.J();
        r.d(j, (IInterface)d);
        final Parcel g = this.G(16, j);
        final boolean e = r.e(g);
        g.recycle();
        return e;
    }
    
    public final LatLng s() {
        final Parcel g = this.G(4, this.J());
        final LatLng latLng = (LatLng)r.a(g, LatLng.CREATOR);
        g.recycle();
        return latLng;
    }
    
    public final void s1(final float n) {
        final Parcel j = this.J();
        j.writeFloat(n);
        this.W(25, j);
    }
    
    public final void y(final float n) {
        final Parcel j = this.J();
        j.writeFloat(n);
        this.W(27, j);
    }
}
