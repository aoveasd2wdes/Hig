package h2;

import r1.c;
import android.os.Parcel;
import q1.n;
import android.os.Parcelable$Creator;
import r1.a;

public class o extends a
{
    public static final Parcelable$Creator<o> CREATOR;
    private final int a;
    private final Float b;
    
    static {
        CREATOR = (Parcelable$Creator)new s0();
    }
    
    public o(final int a, final Float b) {
        boolean b2 = true;
        if (a != 1) {
            b2 = (b != null && b >= 0.0f && b2);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid PatternItem: type=");
        sb.append(a);
        sb.append(" length=");
        sb.append((Object)b);
        q1.o.b(b2, (Object)sb.toString());
        this.a = a;
        this.b = b;
    }
    
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof o)) {
            return false;
        }
        final o o2 = (o)o;
        return this.a == o2.a && n.a((Object)this.b, (Object)o2.b);
    }
    
    public int hashCode() {
        return n.b(new Object[] { this.a, this.b });
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[PatternItem: type=");
        sb.append(this.a);
        sb.append(" length=");
        sb.append((Object)this.b);
        sb.append("]");
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, int a) {
        a = this.a;
        final int a2 = c.a(parcel);
        c.k(parcel, 2, a);
        c.i(parcel, 3, this.b, false);
        c.b(parcel, a2);
    }
}
