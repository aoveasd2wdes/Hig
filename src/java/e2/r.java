package e2;

import r1.c;
import android.os.Parcel;
import q1.n;
import android.os.Parcelable$Creator;
import r1.a;

public final class r extends a
{
    public static final Parcelable$Creator<r> CREATOR;
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    
    static {
        CREATOR = (Parcelable$Creator)new s();
    }
    
    r(final int a, final int b, final long c, final long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final boolean equals(final Object o) {
        if (o instanceof r) {
            final r r = (r)o;
            if (this.a == r.a && this.b == r.b && this.c == r.c && this.d == r.d) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return n.b(new Object[] { this.b, this.a, this.d, this.c });
    }
    
    public final String toString() {
        final int a = this.a;
        final int length = String.valueOf(a).length();
        final int b = this.b;
        final int length2 = String.valueOf(b).length();
        final long d = this.d;
        final int length3 = String.valueOf(d).length();
        final long c = this.c;
        final StringBuilder sb = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(c).length());
        sb.append("NetworkLocationStatus: Wifi status: ");
        sb.append(a);
        sb.append(" Cell status: ");
        sb.append(b);
        sb.append(" elapsed time NS: ");
        sb.append(d);
        sb.append(" system time ms: ");
        sb.append(c);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        final int a2 = this.a;
        a = r1.c.a(parcel);
        r1.c.k(parcel, 1, a2);
        r1.c.k(parcel, 2, this.b);
        r1.c.o(parcel, 3, this.c);
        r1.c.o(parcel, 4, this.d);
        r1.c.b(parcel, a);
    }
}
