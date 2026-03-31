package j2;

import android.os.Parcelable;
import android.os.Parcel;
import android.content.Intent;
import android.os.Parcelable$Creator;
import o1.i;
import r1.a;

public final class b extends a implements i
{
    public static final Parcelable$Creator<b> CREATOR;
    final int a;
    private int b;
    private Intent c;
    
    static {
        CREATOR = (Parcelable$Creator)new c();
    }
    
    b(final int a, final int b, final Intent c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = this.a;
        final int a2 = r1.c.a(parcel);
        r1.c.k(parcel, 1, a);
        r1.c.k(parcel, 2, this.b);
        r1.c.p(parcel, 3, (Parcelable)this.c, n, false);
        r1.c.b(parcel, a2);
    }
}
