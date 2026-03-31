package b2;

import android.os.Parcelable;
import r1.c;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import android.os.Parcelable$Creator;
import o1.i;
import r1.a;

public final class b1 extends a implements i
{
    public static final Parcelable$Creator<b1> CREATOR;
    public static final b1 b;
    private final Status a;
    
    static {
        b = new b1(Status.f);
        CREATOR = (Parcelable$Creator)new c1();
    }
    
    public b1(final Status a) {
        this.a = a;
    }
    
    public final Status a() {
        return this.a;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.p(parcel, 1, (Parcelable)this.a, n, false);
        c.b(parcel, a);
    }
}
