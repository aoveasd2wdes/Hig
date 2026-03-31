package e2;

import android.os.Parcelable;
import r1.c;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import android.os.Parcelable$Creator;
import r1.a;

public final class i extends a implements o1.i
{
    public static final Parcelable$Creator<i> CREATOR;
    private final Status a;
    private final j b;
    
    static {
        CREATOR = (Parcelable$Creator)new o();
    }
    
    public i(final Status a, final j b) {
        this.a = a;
        this.b = b;
    }
    
    public j a() {
        return this.b;
    }
    
    public Status b() {
        return this.a;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.p(parcel, 1, (Parcelable)this.b(), n, false);
        c.p(parcel, 2, (Parcelable)this.a(), n, false);
        c.b(parcel, a);
    }
}
