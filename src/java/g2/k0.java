package g2;

import android.os.IInterface;
import x1.b$a;
import x1.b;
import android.os.Parcel;
import android.os.Parcelable;
import c2.r;
import android.os.Bundle;
import android.os.IBinder;
import c2.a;

public final class k0 extends a implements c
{
    k0(final IBinder binder) {
        super(binder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }
    
    public final void H() {
        this.W(13, this.J());
    }
    
    public final void R() {
        this.W(5, this.J());
    }
    
    public final void S(final Bundle bundle) {
        final Parcel j = this.J();
        r.c(j, (Parcelable)bundle);
        this.W(2, j);
    }
    
    public final b X() {
        final Parcel g = this.G(8, this.J());
        final b j = b$a.J(g.readStrongBinder());
        g.recycle();
        return j;
    }
    
    public final void c(final Bundle bundle) {
        final Parcel j = this.J();
        r.c(j, (Parcelable)bundle);
        final Parcel g = this.G(7, j);
        if (g.readInt() != 0) {
            bundle.readFromParcel(g);
        }
        g.recycle();
    }
    
    public final void d() {
        this.W(3, this.J());
    }
    
    public final void j() {
        this.W(12, this.J());
    }
    
    public final void m2(final p p) {
        final Parcel j = this.J();
        r.d(j, (IInterface)p);
        this.W(9, j);
    }
}
