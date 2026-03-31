package b2;

import android.os.Parcelable;
import r1.c;
import android.os.Parcel;
import e2.z;
import android.os.IInterface;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcelable$Creator;
import r1.a;

public final class g0 extends a
{
    public static final Parcelable$Creator<g0> CREATOR;
    private final int a;
    private final IBinder b;
    private final IBinder c;
    private final PendingIntent d;
    private final String e;
    
    static {
        CREATOR = (Parcelable$Creator)new h0();
    }
    
    g0(final int a, final IBinder b, final IBinder c, final PendingIntent d, final String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static g0 a(final IInterface interface1, final z z, final String s) {
        Object o = interface1;
        if (interface1 == null) {
            o = null;
        }
        return new g0(2, (IBinder)o, (IBinder)z, null, s);
    }
    
    public static g0 b(final j1 j1) {
        return new g0(4, null, (IBinder)j1, null, null);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = this.a;
        final int a2 = r1.c.a(parcel);
        r1.c.k(parcel, 1, a);
        r1.c.j(parcel, 2, this.b, false);
        r1.c.j(parcel, 3, this.c, false);
        r1.c.p(parcel, 4, (Parcelable)this.d, n, false);
        r1.c.q(parcel, 6, this.e, false);
        r1.c.b(parcel, a2);
    }
}
