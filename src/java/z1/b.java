package z1;

import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

public abstract class b extends Binder implements IInterface
{
    protected b(final String s) {
        this.attachInterface((IInterface)this, s);
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
        return this.u2(n, parcel, parcel2, n2);
    }
    
    protected abstract boolean u2(final int p0, final Parcel p1, final Parcel p2, final int p3);
}
