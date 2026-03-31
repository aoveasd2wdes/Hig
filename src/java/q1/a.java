package q1;

import android.os.RemoteException;
import android.util.Log;
import android.os.Binder;
import android.accounts.Account;

public abstract class a extends j$a
{
    public static Account W(final j j) {
        Account account = null;
        final Account account2 = null;
        if (j != null) {
            final long clearCallingIdentity = Binder.clearCallingIdentity();
            while (true) {
                try {
                    try {
                        final Account g = j.g();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        account = g;
                    }
                    finally {}
                }
                catch (final RemoteException ex) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                    final Account g = account2;
                    continue;
                }
                break;
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return account;
    }
}
