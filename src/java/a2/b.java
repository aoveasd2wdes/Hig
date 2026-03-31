package a2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.IInterface;
import android.os.Binder;

public abstract class b extends Binder implements IInterface
{
    protected b(final String s) {
        this.attachInterface((IInterface)this, s);
    }
    
    protected boolean G(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        return false;
    }
    
    public final IBinder asBinder() {
        return (IBinder)this;
    }
    
    public final boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n > 16777215) {
            if (super.onTransact(n, parcel, parcel2, n2)) {
                return true;
            }
        }
        else {
            parcel.enforceInterface(this.getInterfaceDescriptor());
        }
        return this.G(n, parcel, parcel2, n2);
    }
}
