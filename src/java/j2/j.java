package j2;

import android.os.Parcelable;
import r1.c;
import android.os.Parcel;
import q1.h0;
import android.os.Parcelable$Creator;
import r1.a;

public final class j extends a
{
    public static final Parcelable$Creator<j> CREATOR;
    final int a;
    final h0 b;
    
    static {
        CREATOR = (Parcelable$Creator)new k();
    }
    
    j(final int a, final h0 b) {
        this.a = a;
        this.b = b;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.k(parcel, 1, this.a);
        c.p(parcel, 2, (Parcelable)this.b, n, false);
        c.b(parcel, a);
    }
}
