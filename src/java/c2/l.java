package c2;

import android.os.IInterface;
import android.os.IBinder;

public abstract class l extends q implements m
{
    public static m J(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
        if (queryLocalInterface instanceof m) {
            return (m)queryLocalInterface;
        }
        return (m)new k(binder);
    }
}
