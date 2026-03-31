package j2;

import android.os.Parcelable;
import r1.c;
import android.os.Parcel;
import q1.j0;
import android.os.Parcelable$Creator;
import r1.a;

public final class l extends a
{
    public static final Parcelable$Creator<l> CREATOR;
    final int a;
    private final n1.a b;
    private final j0 c;
    
    static {
        CREATOR = (Parcelable$Creator)new m();
    }
    
    l(final int a, final n1.a b, final j0 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final n1.a a() {
        return this.b;
    }
    
    public final j0 b() {
        return this.c;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = r1.c.a(parcel);
        r1.c.k(parcel, 1, this.a);
        r1.c.p(parcel, 2, (Parcelable)this.b, n, false);
        r1.c.p(parcel, 3, (Parcelable)this.c, n, false);
        r1.c.b(parcel, a);
    }
}
