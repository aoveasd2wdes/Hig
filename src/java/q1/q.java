package q1;

import r1.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import r1.a;

public class q extends a
{
    public static final Parcelable$Creator<q> CREATOR;
    private final int a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final int e;
    
    static {
        CREATOR = (Parcelable$Creator)new r0();
    }
    
    public q(final int a, final boolean b, final boolean c, final int d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public int a() {
        return this.d;
    }
    
    public int b() {
        return this.e;
    }
    
    public boolean c() {
        return this.b;
    }
    
    public boolean d() {
        return this.c;
    }
    
    public int e() {
        return this.a;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = r1.c.a(parcel);
        r1.c.k(parcel, 1, this.e());
        r1.c.c(parcel, 2, this.c());
        r1.c.c(parcel, 3, this.d());
        r1.c.k(parcel, 4, this.a());
        r1.c.k(parcel, 5, this.b());
        r1.c.b(parcel, a);
    }
}
