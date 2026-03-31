package n1;

import android.os.Parcel;
import q1.n$a;
import q1.n;
import android.os.Parcelable$Creator;
import r1.a;

public class c extends a
{
    public static final Parcelable$Creator<c> CREATOR;
    private final String a;
    private final int b;
    private final long c;
    
    static {
        CREATOR = (Parcelable$Creator)new q();
    }
    
    public c(final String a, final int b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public c(final String a, final long c) {
        this.a = a;
        this.c = c;
        this.b = -1;
    }
    
    public String a() {
        return this.a;
    }
    
    public long b() {
        long c;
        if ((c = this.c) == -1L) {
            c = this.b;
        }
        return c;
    }
    
    public final boolean equals(final Object o) {
        if (o instanceof c) {
            final c c = (c)o;
            if (((this.a() != null && this.a().equals((Object)c.a())) || (this.a() == null && c.a() == null)) && this.b() == c.b()) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return n.b(new Object[] { this.a(), this.b() });
    }
    
    public final String toString() {
        final n$a c = n.c((Object)this);
        c.a("name", (Object)this.a());
        c.a("version", (Object)this.b());
        return c.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = r1.c.a(parcel);
        r1.c.q(parcel, 1, this.a(), false);
        r1.c.k(parcel, 2, this.b);
        r1.c.o(parcel, 3, this.b());
        r1.c.b(parcel, a);
    }
}
