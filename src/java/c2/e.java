package c2;

import android.os.IInterface;
import java.util.List;
import android.os.Parcel;
import android.os.IBinder;

public final class e extends a implements g
{
    e(final IBinder binder) {
        super(binder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
    }
    
    public final void C1(final float n) {
        final Parcel j = this.J();
        j.writeFloat(n);
        this.W(13, j);
    }
    
    public final String K() {
        final Parcel g = this.G(2, this.J());
        final String string = g.readString();
        g.recycle();
        return string;
    }
    
    public final void M(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(17, j);
    }
    
    public final void R0(final List list) {
        final Parcel j = this.J();
        j.writeTypedList(list);
        this.W(3, j);
    }
    
    public final void U(final int n) {
        final Parcel j = this.J();
        j.writeInt(n);
        this.W(9, j);
    }
    
    public final void V(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(21, j);
    }
    
    public final void f(final float n) {
        final Parcel j = this.J();
        j.writeFloat(n);
        this.W(7, j);
    }
    
    public final void h() {
        this.W(1, this.J());
    }
    
    public final int i() {
        final Parcel g = this.G(20, this.J());
        final int int1 = g.readInt();
        g.recycle();
        return int1;
    }
    
    public final void k2(final List list) {
        final Parcel j = this.J();
        j.writeList(list);
        this.W(5, j);
    }
    
    public final void p(final int n) {
        final Parcel j = this.J();
        j.writeInt(n);
        this.W(11, j);
    }
    
    public final boolean p2(final g g) {
        final Parcel j = this.J();
        r.d(j, (IInterface)g);
        final Parcel g2 = this.G(19, j);
        final boolean e = r.e(g2);
        g2.recycle();
        return e;
    }
    
    public final void r1(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(15, j);
    }
}
