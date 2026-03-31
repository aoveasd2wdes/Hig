package q1;

import android.os.IInterface;
import a2.c;
import android.os.Parcel;
import a2.b;

public abstract class l1 extends b implements m0
{
    public l1() {
        super("com.google.android.gms.common.internal.ICertData");
    }
    
    protected final boolean G(int k, final Parcel parcel, final Parcel parcel2, final int n) {
        if (k != 1) {
            if (k != 2) {
                return false;
            }
            k = ((m0)this).k();
            parcel2.writeNoException();
            parcel2.writeInt(k);
        }
        else {
            final x1.b b = ((m0)this).b();
            parcel2.writeNoException();
            c.c(parcel2, (IInterface)b);
        }
        return true;
    }
}
