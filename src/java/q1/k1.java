package q1;

import android.os.Parcel;
import a2.c;
import android.accounts.Account;
import android.os.IBinder;
import a2.a;

public final class k1 extends a implements j
{
    k1(final IBinder binder) {
        super(binder, "com.google.android.gms.common.internal.IAccountAccessor");
    }
    
    public final Account g() {
        final Parcel g = this.G(2, this.J());
        final Account account = (Account)c.a(g, Account.CREATOR);
        g.recycle();
        return account;
    }
}
