package h2;

import android.os.Parcelable;
import r1.c;
import android.os.Parcel;
import q1.n;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.LatLng;
import android.os.Parcelable$Creator;
import r1.a;

public final class d0 extends a
{
    public static final Parcelable$Creator<d0> CREATOR;
    public final LatLng a;
    public final LatLng b;
    public final LatLng c;
    public final LatLng d;
    public final LatLngBounds e;
    
    static {
        CREATOR = (Parcelable$Creator)new l0();
    }
    
    public d0(final LatLng a, final LatLng b, final LatLng c, final LatLng d, final LatLngBounds e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d0)) {
            return false;
        }
        final d0 d0 = (d0)o;
        return this.a.equals((Object)d0.a) && this.b.equals((Object)d0.b) && this.c.equals((Object)d0.c) && this.d.equals((Object)d0.d) && this.e.equals((Object)d0.e);
    }
    
    public int hashCode() {
        return n.b(new Object[] { this.a, this.b, this.c, this.d, this.e });
    }
    
    public String toString() {
        return n.c((Object)this).a("nearLeft", (Object)this.a).a("nearRight", (Object)this.b).a("farLeft", (Object)this.c).a("farRight", (Object)this.d).a("latLngBounds", (Object)this.e).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final LatLng a = this.a;
        final int a2 = r1.c.a(parcel);
        r1.c.p(parcel, 2, (Parcelable)a, n, false);
        r1.c.p(parcel, 3, (Parcelable)this.b, n, false);
        r1.c.p(parcel, 4, (Parcelable)this.c, n, false);
        r1.c.p(parcel, 5, (Parcelable)this.d, n, false);
        r1.c.p(parcel, 6, (Parcelable)this.e, n, false);
        r1.c.b(parcel, a2);
    }
}
