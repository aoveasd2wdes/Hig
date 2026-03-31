package e2;

import android.os.IInterface;
import android.os.IBinder;
import b2.d;

public abstract class b0 extends d implements c0
{
    public static c0 J(final IBinder binder) {
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        if (queryLocalInterface instanceof c0) {
            return (c0)queryLocalInterface;
        }
        return (c0)new a0(binder);
    }
}
