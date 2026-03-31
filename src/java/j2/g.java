package j2;

import android.os.Parcel;
import android.os.IInterface;
import android.os.Parcelable;
import z1.c;
import android.os.IBinder;
import z1.a;

public final class g extends a
{
    g(final IBinder binder) {
        super(binder, "com.google.android.gms.signin.internal.ISignInService");
    }
    
    public final void u2(final j j, final f f) {
        final Parcel g = this.G();
        c.c(g, (Parcelable)j);
        c.d(g, (IInterface)f);
        this.J(12, g);
    }
}
