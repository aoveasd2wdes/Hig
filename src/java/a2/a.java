package a2;

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
    
    protected final Parcel G(final int n, final Parcel parcel) {
        final Parcel obtain = Parcel.obtain();
        try {
            try {
                this.b.transact(n, parcel, obtain, 0);
                obtain.readException();
                parcel.recycle();
                return obtain;
            }
            finally {}
        }
        catch (final RuntimeException ex) {
            final Parcel parcel2;
            parcel2.recycle();
            throw ex;
        }
        parcel.recycle();
    }
    
    protected final Parcel J() {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }
    
    public final IBinder asBinder() {
        return this.b;
    }
}
