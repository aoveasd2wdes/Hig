package q1;

import r1.c;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable$Creator;
import r1.a;

public class r extends a
{
    public static final Parcelable$Creator<r> CREATOR;
    private final int a;
    private List b;
    
    static {
        CREATOR = (Parcelable$Creator)new w();
    }
    
    public r(final int a, final List b) {
        this.a = a;
        this.b = b;
    }
    
    public final int a() {
        return this.a;
    }
    
    public final List b() {
        return this.b;
    }
    
    public final void c(final m m) {
        if (this.b == null) {
            this.b = (List)new ArrayList();
        }
        this.b.add((Object)m);
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = c.a(parcel);
        c.k(parcel, 1, this.a);
        c.t(parcel, 2, this.b, false);
        c.b(parcel, a);
    }
}
