package c2;

import android.os.IInterface;
import android.os.Parcel;
import android.os.IBinder;

public final class k extends a implements m
{
    k(final IBinder binder) {
        super(binder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
    }
    
    public final void E0(final float n) {
        final Parcel j = this.J();
        j.writeFloat(n);
        this.W(4, j);
    }
    
    public final void Y(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(10, j);
    }
    
    public final float b() {
        final Parcel g = this.G(13, this.J());
        final float float1 = g.readFloat();
        g.recycle();
        return float1;
    }
    
    public final void e0(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(6, j);
    }
    
    public final boolean h() {
        final Parcel g = this.G(11, this.J());
        final boolean e = r.e(g);
        g.recycle();
        return e;
    }
    
    public final void i() {
        this.W(1, this.J());
    }
    
    public final float l() {
        final Parcel g = this.G(5, this.J());
        final float float1 = g.readFloat();
        g.recycle();
        return float1;
    }
    
    public final boolean m1(final m m) {
        final Parcel j = this.J();
        r.d(j, (IInterface)m);
        final Parcel g = this.G(8, j);
        final boolean e = r.e(g);
        g.recycle();
        return e;
    }
    
    public final boolean r() {
        final Parcel g = this.G(7, this.J());
        final boolean e = r.e(g);
        g.recycle();
        return e;
    }
    
    public final int t() {
        final Parcel g = this.G(9, this.J());
        final int int1 = g.readInt();
        g.recycle();
        return int1;
    }
    
    public final void t0(final float n) {
        final Parcel j = this.J();
        j.writeFloat(n);
        this.W(12, j);
    }
    
    public final void u() {
        this.W(2, this.J());
    }
}
