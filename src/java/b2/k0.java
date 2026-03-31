package b2;

import android.os.Parcelable;
import r1.c;
import android.os.Parcel;
import android.os.IInterface;
import e2.y;
import e2.b0;
import android.os.IBinder;
import android.app.PendingIntent;
import e2.z;
import e2.c0;
import android.os.Parcelable$Creator;
import r1.a;

public final class k0 extends a
{
    public static final Parcelable$Creator<k0> CREATOR;
    private final int a;
    private final i0 b;
    private final c0 c;
    private final z d;
    private final PendingIntent e;
    private final f1 f;
    private final String g;
    
    static {
        CREATOR = (Parcelable$Creator)new l0();
    }
    
    k0(final int a, final i0 b, final IBinder binder, final IBinder binder2, final PendingIntent e, final IBinder binder3, final String g) {
        this.a = a;
        this.b = b;
        final f1 f1 = null;
        c0 j;
        if (binder != null) {
            j = b0.J(binder);
        }
        else {
            j = null;
        }
        this.c = j;
        this.e = e;
        z i;
        if (binder2 != null) {
            i = y.J(binder2);
        }
        else {
            i = null;
        }
        this.d = i;
        Object f2 = f1;
        if (binder3 != null) {
            final IInterface queryLocalInterface = binder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof f1) {
                f2 = queryLocalInterface;
            }
            else {
                f2 = new d1(binder3);
            }
        }
        this.f = (f1)f2;
        this.g = g;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = this.a;
        final int a2 = r1.c.a(parcel);
        r1.c.k(parcel, 1, a);
        r1.c.p(parcel, 2, (Parcelable)this.b, n, false);
        final c0 c = this.c;
        final IBinder binder = null;
        IBinder binder2;
        if (c == null) {
            binder2 = null;
        }
        else {
            binder2 = ((IInterface)c).asBinder();
        }
        r1.c.j(parcel, 3, binder2, false);
        r1.c.p(parcel, 4, (Parcelable)this.e, n, false);
        final z d = this.d;
        IBinder binder3;
        if (d == null) {
            binder3 = null;
        }
        else {
            binder3 = ((IInterface)d).asBinder();
        }
        r1.c.j(parcel, 5, binder3, false);
        final f1 f = this.f;
        IBinder binder4;
        if (f == null) {
            binder4 = binder;
        }
        else {
            binder4 = ((IInterface)f).asBinder();
        }
        r1.c.j(parcel, 6, binder4, false);
        r1.c.q(parcel, 8, this.g, false);
        r1.c.b(parcel, a2);
    }
}
