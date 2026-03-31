package h2;

import android.os.Parcelable;
import r1.c;
import android.os.Parcel;
import android.util.Pair;
import android.os.Parcelable$Creator;
import r1.a;

public final class x extends a
{
    public static final Parcelable$Creator<x> CREATOR;
    private final float a;
    private final int b;
    private final int c;
    private final boolean d;
    private final w e;
    
    static {
        CREATOR = (Parcelable$Creator)new f0();
    }
    
    x(final float a, final int b, final int c, final boolean d, final w e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public w a() {
        return this.e;
    }
    
    public boolean b() {
        return this.d;
    }
    
    public final float c() {
        return this.a;
    }
    
    public final Pair d() {
        return new Pair((Object)this.b, (Object)this.c);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = r1.c.a(parcel);
        r1.c.h(parcel, 2, this.a);
        r1.c.k(parcel, 3, this.b);
        r1.c.k(parcel, 4, this.c);
        r1.c.c(parcel, 5, this.b());
        r1.c.p(parcel, 6, (Parcelable)this.a(), n, false);
        r1.c.b(parcel, a);
    }
}
