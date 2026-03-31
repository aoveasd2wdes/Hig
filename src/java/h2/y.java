package h2;

import android.os.Parcelable;
import r1.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import r1.a;

public final class y extends a
{
    public static final Parcelable$Creator<y> CREATOR;
    private final x a;
    private final double b;
    
    static {
        CREATOR = (Parcelable$Creator)new g0();
    }
    
    public y(final x a, final double b) {
        if (b > 0.0) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
    }
    
    public double a() {
        return this.b;
    }
    
    public x b() {
        return this.a;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.p(parcel, 2, (Parcelable)this.b(), n, false);
        c.g(parcel, 3, this.a());
        c.b(parcel, a);
    }
}
