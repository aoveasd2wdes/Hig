package q1;

import android.os.Parcelable;
import android.os.Parcel;
import n1.c;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import r1.a;

public final class y0 extends a
{
    public static final Parcelable$Creator<y0> CREATOR;
    Bundle a;
    c[] b;
    int c;
    f d;
    
    static {
        CREATOR = (Parcelable$Creator)new z0();
    }
    
    y0(final Bundle a, final c[] b, final int c, final f d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = r1.c.a(parcel);
        r1.c.d(parcel, 1, this.a, false);
        r1.c.s(parcel, 2, (Parcelable[])this.b, n, false);
        r1.c.k(parcel, 3, this.c);
        r1.c.p(parcel, 4, (Parcelable)this.d, n, false);
        r1.c.b(parcel, a);
    }
}
