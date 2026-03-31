package h2;

import android.os.RemoteException;

public final class u extends RuntimeException
{
    public u(final RemoteException ex) {
        super((Throwable)ex);
    }
}
