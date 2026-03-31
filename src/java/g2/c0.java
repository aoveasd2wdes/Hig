package g2;

import android.os.Parcel;
import c2.r;
import android.os.IBinder;
import c2.a;

public final class c0 extends a implements e
{
    c0(final IBinder binder) {
        super(binder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }
    
    public final void A(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(6, j);
    }
    
    public final void C(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(2, j);
    }
    
    public final void E(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(5, j);
    }
    
    public final void F(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(18, j);
    }
    
    public final boolean F1() {
        final Parcel g = this.G(9, this.J());
        final boolean e = r.e(g);
        g.recycle();
        return e;
    }
    
    public final boolean G0() {
        final Parcel g = this.G(12, this.J());
        final boolean e = r.e(g);
        g.recycle();
        return e;
    }
    
    public final boolean H1() {
        final Parcel g = this.G(15, this.J());
        final boolean e = r.e(g);
        g.recycle();
        return e;
    }
    
    public final void N(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(4, j);
    }
    
    public final void O(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(1, j);
    }
    
    public final void T(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(7, j);
    }
    
    public final boolean n() {
        final Parcel g = this.G(19, this.J());
        final boolean e = r.e(g);
        g.recycle();
        return e;
    }
    
    public final boolean n2() {
        final Parcel g = this.G(14, this.J());
        final boolean e = r.e(g);
        g.recycle();
        return e;
    }
    
    public final boolean s2() {
        final Parcel g = this.G(13, this.J());
        final boolean e = r.e(g);
        g.recycle();
        return e;
    }
    
    public final boolean v() {
        final Parcel g = this.G(10, this.J());
        final boolean e = r.e(g);
        g.recycle();
        return e;
    }
    
    public final boolean x() {
        final Parcel g = this.G(11, this.J());
        final boolean e = r.e(g);
        g.recycle();
        return e;
    }
    
    public final void z(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(3, j);
    }
}
