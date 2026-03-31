package h2;

import android.os.IInterface;
import r1.c;
import android.os.Parcel;
import x1.b$a;
import android.os.IBinder;
import android.os.Parcelable$Creator;
import r1.a;

public class w extends a
{
    public static final Parcelable$Creator<w> CREATOR;
    protected final b a;
    
    static {
        CREATOR = (Parcelable$Creator)new v0();
    }
    
    w(final IBinder binder) {
        this.a = new b(b$a.J(binder));
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        final b a2 = this.a;
        a = c.a(parcel);
        c.j(parcel, 2, ((IInterface)a2.a()).asBinder(), false);
        c.b(parcel, a);
    }
}
