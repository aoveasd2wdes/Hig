package c2;

import android.os.IInterface;
import android.os.IBinder;

public abstract class w extends q implements x
{
    public static x J(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        if (queryLocalInterface instanceof x) {
            return (x)queryLocalInterface;
        }
        return (x)new v(binder);
    }
}
