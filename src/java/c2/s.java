package c2;

import android.os.Parcelable;
import android.graphics.Bitmap;
import android.os.Parcel;
import x1.b$a;
import x1.b;
import android.os.IBinder;

public final class s extends a implements u
{
    s(final IBinder binder) {
        super(binder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }
    
    public final b G1(final String s) {
        final Parcel j = this.J();
        j.writeString(s);
        final Parcel g = this.G(2, j);
        final b i = b$a.J(g.readStrongBinder());
        g.recycle();
        return i;
    }
    
    public final b b() {
        final Parcel g = this.G(4, this.J());
        final b j = b$a.J(g.readStrongBinder());
        g.recycle();
        return j;
    }
    
    public final b f2(final Bitmap bitmap) {
        final Parcel j = this.J();
        r.c(j, (Parcelable)bitmap);
        final Parcel g = this.G(6, j);
        final b i = b$a.J(g.readStrongBinder());
        g.recycle();
        return i;
    }
    
    public final b n1(final float n) {
        final Parcel j = this.J();
        j.writeFloat(n);
        final Parcel g = this.G(5, j);
        final b i = b$a.J(g.readStrongBinder());
        g.recycle();
        return i;
    }
}
