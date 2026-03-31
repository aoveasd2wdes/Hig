package g2;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.CameraPosition;
import android.os.Parcelable;
import c2.r;
import com.google.android.gms.maps.model.LatLngBounds;
import android.os.Parcel;
import x1.b$a;
import x1.b;
import android.os.IBinder;
import c2.a;

public final class u extends a implements g2.a
{
    u(final IBinder binder) {
        super(binder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }
    
    public final b N0(final float n) {
        final Parcel j = this.J();
        j.writeFloat(n);
        final Parcel g = this.G(4, j);
        final b i = b$a.J(g.readStrongBinder());
        g.recycle();
        return i;
    }
    
    public final b Q0() {
        final Parcel g = this.G(1, this.J());
        final b j = b$a.J(g.readStrongBinder());
        g.recycle();
        return j;
    }
    
    public final b a2(final float n, final int n2, final int n3) {
        final Parcel j = this.J();
        j.writeFloat(n);
        j.writeInt(n2);
        j.writeInt(n3);
        final Parcel g = this.G(6, j);
        final b i = b$a.J(g.readStrongBinder());
        g.recycle();
        return i;
    }
    
    public final b j0(final LatLngBounds latLngBounds, final int n) {
        final Parcel j = this.J();
        r.c(j, (Parcelable)latLngBounds);
        j.writeInt(n);
        final Parcel g = this.G(10, j);
        final b i = b$a.J(g.readStrongBinder());
        g.recycle();
        return i;
    }
    
    public final b j2() {
        final Parcel g = this.G(2, this.J());
        final b j = b$a.J(g.readStrongBinder());
        g.recycle();
        return j;
    }
    
    public final b q1(final CameraPosition cameraPosition) {
        final Parcel j = this.J();
        r.c(j, (Parcelable)cameraPosition);
        final Parcel g = this.G(7, j);
        final b i = b$a.J(g.readStrongBinder());
        g.recycle();
        return i;
    }
    
    public final b t2(final LatLng latLng) {
        final Parcel j = this.J();
        r.c(j, (Parcelable)latLng);
        final Parcel g = this.G(8, j);
        final b i = b$a.J(g.readStrongBinder());
        g.recycle();
        return i;
    }
    
    public final b v1(final LatLng latLng, final float n) {
        final Parcel j = this.J();
        r.c(j, (Parcelable)latLng);
        j.writeFloat(n);
        final Parcel g = this.G(9, j);
        final b i = b$a.J(g.readStrongBinder());
        g.recycle();
        return i;
    }
    
    public final b x0(final float n) {
        final Parcel j = this.J();
        j.writeFloat(n);
        final Parcel g = this.G(5, j);
        final b i = b$a.J(g.readStrongBinder());
        g.recycle();
        return i;
    }
    
    public final b z1(final float n, final float n2) {
        final Parcel j = this.J();
        j.writeFloat(n);
        j.writeFloat(n2);
        final Parcel g = this.G(3, j);
        final b i = b$a.J(g.readStrongBinder());
        g.recycle();
        return i;
    }
}
