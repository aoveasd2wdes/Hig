package e2;

import java.util.Collections;
import r1.c;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;
import r1.a;

public final class g extends a
{
    public static final Parcelable$Creator<g> CREATOR;
    private final List a;
    private final boolean b;
    private final boolean c;
    
    static {
        CREATOR = (Parcelable$Creator)new n();
    }
    
    g(final List a, final boolean b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void writeToParcel(final Parcel parcel, int a) {
        final List a2 = this.a;
        a = r1.c.a(parcel);
        r1.c.t(parcel, 1, Collections.unmodifiableList(a2), false);
        r1.c.c(parcel, 2, this.b);
        r1.c.c(parcel, 3, this.c);
        r1.c.b(parcel, a);
    }
}
