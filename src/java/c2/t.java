package c2;

import android.os.IInterface;
import android.os.IBinder;

public abstract class t extends q implements u
{
    public static u J(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        if (queryLocalInterface instanceof u) {
            return (u)queryLocalInterface;
        }
        return (u)new s(binder);
    }
}
