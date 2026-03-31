package z1;

import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

public abstract class a implements IInterface
{
    private final IBinder b;
    private final String c;
    
    protected a(final IBinder b, final String c) {
        this.b = b;
        this.c = c;
    }
    
    protected final Parcel G() {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }
    
    protected final void J(final int n, final Parcel parcel) {
        final Parcel obtain = Parcel.obtain();
        try {
            this.b.transact(n, parcel, obtain, 0);
            obtain.readException();
        }
        finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
    
    protected final void W(final int n, final Parcel parcel) {
        try {
            this.b.transact(1, parcel, (Parcel)null, 1);
        }
        finally {
            parcel.recycle();
        }
    }
    
    public final IBinder asBinder() {
        return this.b;
    }
}
