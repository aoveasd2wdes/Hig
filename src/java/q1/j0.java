package q1;

import android.os.Parcelable;
import r1.c;
import android.os.Parcel;
import android.os.IBinder;
import android.os.Parcelable$Creator;
import r1.a;

public final class j0 extends a
{
    public static final Parcelable$Creator<j0> CREATOR;
    final int a;
    final IBinder b;
    private final n1.a c;
    private final boolean d;
    private final boolean e;
    
    static {
        CREATOR = (Parcelable$Creator)new k0();
    }
    
    j0(final int a, final IBinder b, final n1.a c, final boolean d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final n1.a a() {
        return this.c;
    }
    
    public final j b() {
        final IBinder b = this.b;
        if (b == null) {
            return null;
        }
        return j.a.J(b);
    }
    
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (!(o instanceof j0)) {
            return false;
        }
        final j0 j0 = (j0)o;
        return this.c.equals(j0.c) && n.a((Object)this.b(), (Object)j0.b());
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = r1.c.a(parcel);
        r1.c.k(parcel, 1, this.a);
        r1.c.j(parcel, 2, this.b, false);
        r1.c.p(parcel, 3, (Parcelable)this.c, n, false);
        r1.c.c(parcel, 4, this.d);
        r1.c.c(parcel, 5, this.e);
        r1.c.b(parcel, a);
    }
}
