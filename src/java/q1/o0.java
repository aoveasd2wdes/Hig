package q1;

import android.os.IInterface;
import android.os.Parcel;
import android.os.IBinder;

final class o0 implements l
{
    private final IBinder b;
    
    o0(final IBinder b) {
        this.b = b;
    }
    
    public final void Y0(final k k, final g g) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            IBinder binder;
            if (k != null) {
                binder = ((IInterface)k).asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            if (g != null) {
                obtain.writeInt(1);
                b1.a(g, obtain, 0);
            }
            else {
                obtain.writeInt(0);
            }
            this.b.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    public final IBinder asBinder() {
        return this.b;
    }
}
