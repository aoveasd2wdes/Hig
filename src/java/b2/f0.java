package b2;

import android.os.Parcelable;
import r1.c;
import android.os.Parcel;
import p4.f;
import java.util.Arrays;
import java.util.Collection;
import i4.l;
import android.os.Process;
import i4.g;
import java.util.List;
import android.os.Parcelable$Creator;
import r1.a;

public final class f0 extends a
{
    public static final Parcelable$Creator<f0> CREATOR;
    public static final r g;
    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final List e;
    private final f0 f;
    
    static {
        g = new r((g)null);
        CREATOR = (Parcelable$Creator)new z0();
        Process.myUid();
        Process.myPid();
    }
    
    public f0(final int a, String d, final String c, final String s, final List list, final f0 f) {
        l.e((Object)d, "packageName");
        if (f != null && f.a()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.a = a;
        this.b = d;
        this.c = c;
        final Collection collection = null;
        if ((d = s) == null) {
            if (f != null) {
                d = f.d;
            }
            else {
                d = null;
            }
        }
        this.d = d;
        Object o;
        if ((o = list) == null) {
            Object e = collection;
            if (f != null) {
                e = f.e;
            }
            if ((o = e) == null) {
                o = w0.o();
                l.d(o, "of(...)");
            }
        }
        l.e(o, "<this>");
        final w0 p6 = w0.p((Collection)o);
        l.d((Object)p6, "copyOf(...)");
        this.e = (List)p6;
        this.f = f;
    }
    
    public final boolean a() {
        return this.f != null;
    }
    
    public final boolean equals(final Object o) {
        if (o instanceof f0) {
            final int a = this.a;
            final f0 f0 = (f0)o;
            if (a == f0.a && l.a((Object)this.b, (Object)f0.b) && l.a((Object)this.c, (Object)f0.c) && l.a((Object)this.d, (Object)f0.d) && l.a((Object)this.f, (Object)f0.f) && l.a((Object)this.e, (Object)f0.e)) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d, this.f });
    }
    
    public final String toString() {
        final int length = this.b.length();
        final String c = this.c;
        final int n = 0;
        int length2;
        if (c != null) {
            length2 = c.length();
        }
        else {
            length2 = 0;
        }
        final StringBuilder sb = new StringBuilder(length + 18 + length2);
        sb.append(this.a);
        sb.append("/");
        sb.append(this.b);
        final String c2 = this.c;
        if (c2 != null) {
            sb.append("[");
            if (p4.f.p(c2, this.b, false, 2, (Object)null)) {
                sb.append((CharSequence)c2, this.b.length(), c2.length());
            }
            else {
                sb.append(c2);
            }
            sb.append("]");
        }
        if (this.d != null) {
            sb.append("/");
            final String d = this.d;
            int hashCode = n;
            if (d != null) {
                hashCode = d.hashCode();
            }
            sb.append(Integer.toHexString(hashCode));
        }
        final String string = sb.toString();
        l.d((Object)string, "toString(...)");
        return string;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        l.e((Object)parcel, "dest");
        final int a = this.a;
        final int a2 = r1.c.a(parcel);
        r1.c.k(parcel, 1, a);
        r1.c.q(parcel, 3, this.b, false);
        r1.c.q(parcel, 4, this.c, false);
        r1.c.q(parcel, 6, this.d, false);
        r1.c.p(parcel, 7, (Parcelable)this.f, n, false);
        r1.c.t(parcel, 8, this.e, false);
        r1.c.b(parcel, a2);
    }
}
