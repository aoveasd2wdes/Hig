package c2;

import android.os.IInterface;
import android.os.IBinder;

public abstract class f extends q implements g
{
    public static g J(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        if (queryLocalInterface instanceof g) {
            return (g)queryLocalInterface;
        }
        return (g)new e(binder);
    }
}
