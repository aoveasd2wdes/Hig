package e2;

import android.os.Parcelable;
import r1.c;
import android.os.Parcel;
import b2.m0;
import q1.n;
import b2.f0;
import android.os.Parcelable$Creator;
import r1.a;

public final class d extends a
{
    public static final Parcelable$Creator<d> CREATOR;
    private final long a;
    private final int b;
    private final boolean c;
    private final f0 d;
    
    static {
        CREATOR = (Parcelable$Creator)new m();
    }
    
    d(final long a, final int b, final boolean c, final f0 d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public int a() {
        return this.b;
    }
    
    public long b() {
        return this.a;
    }
    
    public boolean equals(final Object o) {
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        return this.a == d.a && this.b == d.b && this.c == d.c && n.a((Object)this.d, (Object)d.d);
    }
    
    public int hashCode() {
        return n.b(new Object[] { this.a, this.b, this.c });
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("LastLocationRequest[");
        if (this.a != Long.MAX_VALUE) {
            sb.append("maxAge=");
            m0.c(this.a, sb);
        }
        if (this.b != 0) {
            sb.append(", ");
            sb.append(w.b(this.b));
        }
        if (this.c) {
            sb.append(", bypass");
        }
        if (this.d != null) {
            sb.append(", impersonation=");
            sb.append((Object)this.d);
        }
        sb.append(']');
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final int a = r1.c.a(parcel);
        r1.c.o(parcel, 1, this.b());
        r1.c.k(parcel, 2, this.a());
        r1.c.c(parcel, 3, this.c);
        r1.c.p(parcel, 5, (Parcelable)this.d, n, false);
        r1.c.b(parcel, a);
    }
}
