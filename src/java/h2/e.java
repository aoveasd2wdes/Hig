package h2;

import android.os.IInterface;
import r1.c;
import android.os.Parcel;
import q1.n;
import android.util.Log;
import q1.o;
import x1.b$a;
import android.os.IBinder;
import android.os.Parcelable$Creator;
import r1.a;

public class e extends a
{
    public static final Parcelable$Creator<e> CREATOR;
    private static final String d = "e";
    private final int a;
    private final b b;
    private final Float c;
    
    static {
        CREATOR = (Parcelable$Creator)new m0();
    }
    
    protected e(final int n) {
        this(n, (b)null, null);
    }
    
    e(final int n, final IBinder binder, final Float n2) {
        b b;
        if (binder == null) {
            b = null;
        }
        else {
            b = new b(b$a.J(binder));
        }
        this(n, b, n2);
    }
    
    private e(final int n, final b b, final Float c) {
        final boolean b2 = c != null && c > 0.0f;
        int a = n;
        boolean b3 = false;
        Label_0061: {
            if (n == 3) {
                if (b == null || !b2) {
                    a = 3;
                    b3 = false;
                    break Label_0061;
                }
                a = 3;
            }
            b3 = true;
        }
        o.b(b3, (Object)String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", new Object[] { a, b, c }));
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    protected e(final b b, final float n) {
        this(3, b, n);
    }
    
    final e a() {
        final int a = this.a;
        if (a == 0) {
            return (e)new d();
        }
        final boolean b = true;
        if (a == 1) {
            return (e)new v();
        }
        if (a == 2) {
            return (e)new t();
        }
        if (a != 3) {
            final String d = e.d;
            final StringBuilder sb = new StringBuilder();
            sb.append("Unknown Cap type: ");
            sb.append(a);
            Log.w(d, sb.toString());
            return this;
        }
        o.k(this.b != null, (Object)"bitmapDescriptor must not be null");
        o.k(this.c != null && b, (Object)"bitmapRefWidth must not be null");
        return (e)new h(this.b, (float)this.c);
    }
    
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        return this.a == e.a && n.a((Object)this.b, (Object)e.b) && n.a((Object)this.c, (Object)e.c);
    }
    
    public int hashCode() {
        return n.b(new Object[] { this.a, this.b, this.c });
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[Cap: type=");
        sb.append(this.a);
        sb.append("]");
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, int a) {
        a = this.a;
        final int a2 = r1.c.a(parcel);
        r1.c.k(parcel, 2, a);
        final b b = this.b;
        IBinder binder;
        if (b == null) {
            binder = null;
        }
        else {
            binder = ((IInterface)b.a()).asBinder();
        }
        r1.c.j(parcel, 3, binder, false);
        r1.c.i(parcel, 4, this.c, false);
        r1.c.b(parcel, a2);
    }
}
