package c2;

import android.os.Parcelable;
import h2.z;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

public abstract class o extends q implements p
{
    public o() {
        super("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }
    
    public static p J(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        if (queryLocalInterface instanceof p) {
            return (p)queryLocalInterface;
        }
        return (p)new n(binder);
    }
    
    protected final boolean G(int int1, final Parcel parcel, final Parcel parcel2, int int2) {
        if (int1 == 1) {
            int1 = parcel.readInt();
            int2 = parcel.readInt();
            final int int3 = parcel.readInt();
            r.b(parcel);
            final z u1 = ((p)this).u1(int1, int2, int3);
            parcel2.writeNoException();
            if (u1 == null) {
                parcel2.writeInt(0);
            }
            else {
                parcel2.writeInt(1);
                ((Parcelable)u1).writeToParcel(parcel2, 1);
            }
            return true;
        }
        return false;
    }
}
