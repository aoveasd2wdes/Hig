package j2;

import r1.c;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;
import o1.i;
import r1.a;

public final class h extends a implements i
{
    public static final Parcelable$Creator<h> CREATOR;
    private final List a;
    private final String b;
    
    static {
        CREATOR = (Parcelable$Creator)new j2.i();
    }
    
    public h(final List a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        final List a2 = this.a;
        a = c.a(parcel);
        c.r(parcel, 1, a2, false);
        c.q(parcel, 2, this.b, false);
        c.b(parcel, a);
    }
}
