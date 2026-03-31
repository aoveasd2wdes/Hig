package e2;

import r1.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import r1.a;

public final class j extends a
{
    public static final Parcelable$Creator<j> CREATOR;
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    
    static {
        CREATOR = (Parcelable$Creator)new p();
    }
    
    public j(final boolean a, final boolean b, final boolean c, final boolean d, final boolean e, final boolean f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public boolean a() {
        return this.f;
    }
    
    public boolean b() {
        return this.c;
    }
    
    public boolean c() {
        return this.d;
    }
    
    public boolean d() {
        return this.a;
    }
    
    public boolean e() {
        return this.e;
    }
    
    public boolean f() {
        return this.b;
    }
    
    public void writeToParcel(final Parcel parcel, int a) {
        a = r1.c.a(parcel);
        r1.c.c(parcel, 1, this.d());
        r1.c.c(parcel, 2, this.f());
        r1.c.c(parcel, 3, this.b());
        r1.c.c(parcel, 4, this.c());
        r1.c.c(parcel, 5, this.e());
        r1.c.c(parcel, 6, this.a());
        r1.c.b(parcel, a);
    }
}
