package q1;

import r1.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import r1.a;

public class m extends a
{
    public static final Parcelable$Creator<m> CREATOR;
    private final int a;
    private final int b;
    private final int c;
    private final long d;
    private final long e;
    private final String f;
    private final String g;
    private final int h;
    private final int i;
    
    static {
        CREATOR = (Parcelable$Creator)new g0();
    }
    
    public m(final int a, final int b, final int c, final long d, final long e, final String f, final String g, final int h, final int i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        final int a2 = this.a;
        a = r1.c.a(parcel);
        r1.c.k(parcel, 1, a2);
        r1.c.k(parcel, 2, this.b);
        r1.c.k(parcel, 3, this.c);
        r1.c.o(parcel, 4, this.d);
        r1.c.o(parcel, 5, this.e);
        r1.c.q(parcel, 6, this.f, false);
        r1.c.q(parcel, 7, this.g, false);
        r1.c.k(parcel, 8, this.h);
        r1.c.k(parcel, 9, this.i);
        r1.c.b(parcel, a);
    }
}
