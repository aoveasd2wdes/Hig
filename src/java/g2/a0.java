package g2;

import x1.b;
import android.graphics.Bitmap;
import c2.r;
import x1.b$a;
import android.os.Parcel;
import c2.q;

public abstract class a0 extends q implements b0
{
    public a0() {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
    }
    
    protected final boolean G(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n != 1) {
            if (n != 2) {
                return false;
            }
            final b j = b$a.J(parcel.readStrongBinder());
            r.b(parcel);
            ((b0)this).T0(j);
        }
        else {
            final Bitmap bitmap = (Bitmap)r.a(parcel, Bitmap.CREATOR);
            r.b(parcel);
            ((b0)this).s0(bitmap);
        }
        parcel2.writeNoException();
        return true;
    }
}
