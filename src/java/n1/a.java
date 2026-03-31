package n1;

import android.os.Parcelable;
import r1.c;
import android.os.Parcel;
import q1.n$a;
import q1.n;
import android.app.PendingIntent;
import android.os.Parcelable$Creator;

public final class a extends r1.a
{
    public static final Parcelable$Creator<a> CREATOR;
    public static final a e;
    final int a;
    private final int b;
    private final PendingIntent c;
    private final String d;
    
    static {
        e = new a(0);
        CREATOR = (Parcelable$Creator)new p();
    }
    
    public a(final int n) {
        this(n, null, null);
    }
    
    a(final int a, final int b, final PendingIntent c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public a(final int n, final PendingIntent pendingIntent) {
        this(n, pendingIntent, null);
    }
    
    public a(final int n, final PendingIntent pendingIntent, final String s) {
        this(1, n, pendingIntent, s);
    }
    
    static String f(final int n) {
        if (n == 99) {
            return "UNFINISHED";
        }
        if (n == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(n);
                        sb.append(")");
                        return sb.toString();
                    }
                    case 24: {
                        return "API_DISABLED_FOR_CONNECTION";
                    }
                    case 23: {
                        return "API_DISABLED";
                    }
                    case 22: {
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    }
                    case 21: {
                        return "API_VERSION_UPDATE_REQUIRED";
                    }
                    case 20: {
                        return "RESTRICTED_PROFILE";
                    }
                    case 19: {
                        return "SERVICE_MISSING_PERMISSION";
                    }
                    case 18: {
                        return "SERVICE_UPDATING";
                    }
                    case 17: {
                        return "SIGN_IN_FAILED";
                    }
                    case 16: {
                        return "API_UNAVAILABLE";
                    }
                    case 15: {
                        return "INTERRUPTED";
                    }
                    case 14: {
                        return "TIMEOUT";
                    }
                    case 13: {
                        return "CANCELED";
                    }
                }
                break;
            }
            case 11: {
                return "LICENSE_CHECK_FAILED";
            }
            case 10: {
                return "DEVELOPER_ERROR";
            }
            case 9: {
                return "SERVICE_INVALID";
            }
            case 8: {
                return "INTERNAL_ERROR";
            }
            case 7: {
                return "NETWORK_ERROR";
            }
            case 6: {
                return "RESOLUTION_REQUIRED";
            }
            case 5: {
                return "INVALID_ACCOUNT";
            }
            case 4: {
                return "SIGN_IN_REQUIRED";
            }
            case 3: {
                return "SERVICE_DISABLED";
            }
            case 2: {
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            }
            case 1: {
                return "SERVICE_MISSING";
            }
            case 0: {
                return "SUCCESS";
            }
            case -1: {
                return "UNKNOWN";
            }
        }
    }
    
    public int a() {
        return this.b;
    }
    
    public String b() {
        return this.d;
    }
    
    public PendingIntent c() {
        return this.c;
    }
    
    public boolean d() {
        return this.b != 0 && this.c != null;
    }
    
    public boolean e() {
        return this.b == 0;
    }
    
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return this.b == a.b && n.a((Object)this.c, (Object)a.c) && n.a((Object)this.d, (Object)a.d);
    }
    
    public int hashCode() {
        return n.b(new Object[] { this.b, this.c, this.d });
    }
    
    public String toString() {
        final n$a c = n.c((Object)this);
        c.a("statusCode", (Object)f(this.b));
        c.a("resolution", (Object)this.c);
        c.a("message", (Object)this.d);
        return c.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final int a = this.a;
        final int a2 = r1.c.a(parcel);
        r1.c.k(parcel, 1, a);
        r1.c.k(parcel, 2, this.a());
        r1.c.p(parcel, 3, (Parcelable)this.c(), n, false);
        r1.c.q(parcel, 4, this.b(), false);
        r1.c.b(parcel, a2);
    }
}
