package q1;

import android.os.Parcelable;
import r1.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import r1.a;

public class f extends a
{
    public static final Parcelable$Creator<f> CREATOR;
    private final q a;
    private final boolean b;
    private final boolean c;
    private final int[] d;
    private final int e;
    private final int[] f;
    
    static {
        CREATOR = (Parcelable$Creator)new a1();
    }
    
    public f(final q a, final boolean b, final boolean c, final int[] d, final int e, final int[] f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public int a() {
        return this.e;
    }
    
    public int[] b() {
        return this.d;
    }
    
    public int[] c() {
        return this.f;
    }
    
    public boolean d() {
        return this.b;
    }
    
    public boolean e() {
        return this.c;
    }
    
    public final q f() {
        return this.a;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = r1.c.a(parcel);
        r1.c.p(parcel, 1, (Parcelable)this.a, n, false);
        r1.c.c(parcel, 2, this.d());
        r1.c.c(parcel, 3, this.e());
        r1.c.l(parcel, 4, this.b(), false);
        r1.c.k(parcel, 5, this.a());
        r1.c.l(parcel, 6, this.c(), false);
        r1.c.b(parcel, a);
    }
}
