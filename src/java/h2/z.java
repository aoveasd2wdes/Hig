package h2;

import r1.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import r1.a;

public final class z extends a
{
    public static final Parcelable$Creator<z> CREATOR;
    public final int a;
    public final int b;
    public final byte[] c;
    
    static {
        CREATOR = (Parcelable$Creator)new h0();
    }
    
    public z(final int a, final int b, final byte[] c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void writeToParcel(final Parcel parcel, int a) {
        a = this.a;
        final int a2 = r1.c.a(parcel);
        r1.c.k(parcel, 2, a);
        r1.c.k(parcel, 3, this.b);
        r1.c.f(parcel, 4, this.c, false);
        r1.c.b(parcel, a2);
    }
}
