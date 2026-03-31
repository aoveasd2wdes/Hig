package b2;

import android.os.Parcelable;
import r1.c;
import android.os.Parcel;
import q1.n;
import java.util.Iterator;
import u1.g;
import q1.d;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest$a;
import java.util.List;
import com.google.android.gms.location.LocationRequest;
import android.os.Parcelable$Creator;
import r1.a;

public final class i0 extends a
{
    public static final Parcelable$Creator<i0> CREATOR;
    LocationRequest a;
    
    static {
        CREATOR = (Parcelable$Creator)new j0();
    }
    
    i0(final LocationRequest locationRequest, final List list, final boolean b, final boolean b2, final boolean b3, final boolean b4, final String s, final long n) {
        final LocationRequest$a locationRequest$a = new LocationRequest$a(locationRequest);
        if (list != null) {
            WorkSource workSource;
            if (list.isEmpty()) {
                workSource = null;
            }
            else {
                final WorkSource workSource2 = new WorkSource();
                final Iterator iterator = list.iterator();
                while (true) {
                    workSource = workSource2;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final d d = (d)iterator.next();
                    g.a(workSource2, d.a, d.b);
                }
            }
            locationRequest$a.n(workSource);
        }
        if (b) {
            locationRequest$a.c(1);
        }
        if (b2) {
            locationRequest$a.l(2);
        }
        if (b3) {
            locationRequest$a.m(true);
        }
        if (b4) {
            locationRequest$a.k(true);
        }
        if (n != Long.MAX_VALUE) {
            locationRequest$a.e(n);
        }
        this.a = locationRequest$a.a();
    }
    
    public static i0 a(final String s, final LocationRequest locationRequest) {
        return new i0(locationRequest, null, false, false, false, false, null, Long.MAX_VALUE);
    }
    
    public final boolean equals(final Object o) {
        return o instanceof i0 && n.a((Object)this.a, (Object)((i0)o).a);
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final String toString() {
        return this.a.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.p(parcel, 1, (Parcelable)this.a, n, false);
        c.b(parcel, a);
    }
}
