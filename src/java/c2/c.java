package c2;

import android.os.IInterface;
import android.os.IBinder;

public abstract class c extends q implements d
{
    public static d J(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (queryLocalInterface instanceof d) {
            return (d)queryLocalInterface;
        }
        return (d)new b(binder);
    }
}
