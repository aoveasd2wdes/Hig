package q1;

import android.os.Parcelable;
import r1.c;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.accounts.Account;
import android.os.Parcelable$Creator;
import r1.a;

public final class h0 extends a
{
    public static final Parcelable$Creator<h0> CREATOR;
    final int a;
    private final Account b;
    private final int c;
    private final GoogleSignInAccount d;
    
    static {
        CREATOR = (Parcelable$Creator)new i0();
    }
    
    h0(final int a, final Account b, final int c, final GoogleSignInAccount d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public h0(final Account account, final int n, final GoogleSignInAccount googleSignInAccount) {
        this(2, account, n, googleSignInAccount);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = this.a;
        final int a2 = r1.c.a(parcel);
        r1.c.k(parcel, 1, a);
        r1.c.p(parcel, 2, (Parcelable)this.b, n, false);
        r1.c.k(parcel, 3, this.c);
        r1.c.p(parcel, 4, (Parcelable)this.d, n, false);
        r1.c.b(parcel, a2);
    }
}
