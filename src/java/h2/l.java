package h2;

import r1.c;
import android.os.Parcel;
import q1.o;
import android.os.Parcelable$Creator;
import r1.a;

public final class l extends a
{
    public static final Parcelable$Creator<l> CREATOR;
    private final String a;
    
    static {
        CREATOR = (Parcelable$Creator)new q0();
    }
    
    public l(final String a) {
        o.i((Object)a, (Object)"json must not be null");
        this.a = a;
    }
    
    public void writeToParcel(final Parcel parcel, int a) {
        final String a2 = this.a;
        a = c.a(parcel);
        c.q(parcel, 2, a2, false);
        c.b(parcel, a);
    }
}
