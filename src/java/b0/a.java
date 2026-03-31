package b0;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class a implements Parcelable
{
    public static final Parcelable$Creator<a> CREATOR;
    public static final a b;
    private final Parcelable a;
    
    static {
        b = (a)new a$a();
        CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator() {
            public a a(final Parcel parcel) {
                return this.b(parcel, null);
            }
            
            public a b(final Parcel parcel, final ClassLoader classLoader) {
                if (parcel.readParcelable(classLoader) == null) {
                    return b0.a.b;
                }
                throw new IllegalStateException("superState must be null");
            }
            
            public a[] c(final int n) {
                return new a[n];
            }
        };
    }
    
    private a() {
        this.a = null;
    }
    
    protected a(final Parcel parcel, final ClassLoader classLoader) {
        Object a = parcel.readParcelable(classLoader);
        if (a == null) {
            a = b0.a.b;
        }
        this.a = (Parcelable)a;
    }
    
    protected a(Parcelable a) {
        if (a != null) {
            if (a == b0.a.b) {
                a = null;
            }
            this.a = a;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }
    
    public final Parcelable a() {
        return this.a;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable(this.a, n);
    }
}
