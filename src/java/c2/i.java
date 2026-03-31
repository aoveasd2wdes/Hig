package c2;

import android.os.IInterface;
import android.os.IBinder;

public abstract class i extends q implements j
{
    public static j J(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        if (queryLocalInterface instanceof j) {
            return (j)queryLocalInterface;
        }
        return (j)new h(binder);
    }
}
