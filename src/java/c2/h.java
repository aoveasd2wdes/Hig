package c2;

import android.os.Parcelable;
import h2.e;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import android.os.IBinder;

public final class h extends a implements j
{
    h(final IBinder binder) {
        super(binder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }
    
    public final void F0(final List list) {
        final Parcel j = this.J();
        j.writeTypedList(list);
        this.W(25, j);
    }
    
    public final void M0(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(17, j);
    }
    
    public final void Q1(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(11, j);
    }
    
    public final void U(final int n) {
        final Parcel j = this.J();
        j.writeInt(n);
        this.W(23, j);
    }
    
    public final void U1(final List list) {
        final Parcel j = this.J();
        j.writeTypedList(list);
        this.W(3, j);
    }
    
    public final void Z1(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(13, j);
    }
    
    public final String e() {
        final Parcel g = this.G(2, this.J());
        final String string = g.readString();
        g.recycle();
        return string;
    }
    
    public final boolean f0(final j j) {
        final Parcel i = this.J();
        r.d(i, (IInterface)j);
        final Parcel g = this.G(15, i);
        final boolean e = r.e(g);
        g.recycle();
        return e;
    }
    
    public final void i0(final float n) {
        final Parcel j = this.J();
        j.writeFloat(n);
        this.W(5, j);
    }
    
    public final void o1(final e e) {
        final Parcel j = this.J();
        r.c(j, (Parcelable)e);
        this.W(21, j);
    }
    
    public final void r() {
        this.W(1, this.J());
    }
    
    public final int u() {
        final Parcel g = this.G(16, this.J());
        final int int1 = g.readInt();
        g.recycle();
        return int1;
    }
    
    public final void w1(final int n) {
        final Parcel j = this.J();
        j.writeInt(n);
        this.W(7, j);
    }
    
    public final void y(final float n) {
        final Parcel j = this.J();
        j.writeFloat(n);
        this.W(9, j);
    }
    
    public final void y0(final e e) {
        final Parcel j = this.J();
        r.c(j, (Parcelable)e);
        this.W(19, j);
    }
}
