package q1;

import r1.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import r1.a;

public class d extends a
{
    public static final Parcelable$Creator<d> CREATOR;
    public final int a;
    public final String b;
    
    static {
        CREATOR = (Parcelable$Creator)new v();
    }
    
    public d(final int a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        return d.a == this.a && n.a((Object)d.b, (Object)this.b);
    }
    
    public final int hashCode() {
        return this.a;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(":");
        sb.append(this.b);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        final int a2 = this.a;
        a = c.a(parcel);
        c.k(parcel, 1, a2);
        c.q(parcel, 2, this.b, false);
        c.b(parcel, a);
    }
}
