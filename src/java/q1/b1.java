package q1;

import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import android.accounts.Account;
import android.os.Bundle;
import r1.b;
import android.os.Parcelable;
import r1.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class b1 implements Parcelable$Creator
{
    static void a(final g g, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.k(parcel, 1, g.a);
        c.k(parcel, 2, g.b);
        c.k(parcel, 3, g.c);
        c.q(parcel, 4, g.d, false);
        c.j(parcel, 5, g.e, false);
        c.s(parcel, 6, (Parcelable[])g.f, n, false);
        c.d(parcel, 7, g.g, false);
        c.p(parcel, 8, (Parcelable)g.h, n, false);
        c.s(parcel, 10, (Parcelable[])g.i, n, false);
        c.s(parcel, 11, (Parcelable[])g.j, n, false);
        c.c(parcel, 12, g.k);
        c.k(parcel, 13, g.l);
        c.c(parcel, 14, g.m);
        c.q(parcel, 15, g.a(), false);
        c.b(parcel, a);
    }
}
