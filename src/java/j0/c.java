package j0;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

class c implements Parcelable
{
    public static final Parcelable$Creator<c> CREATOR;
    final List a;
    final List b;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public c a(final Parcel parcel) {
                return new c(parcel);
            }
            
            public c[] b(final int n) {
                return new c[n];
            }
        };
    }
    
    c(final Parcel parcel) {
        this.a = (List)parcel.createStringArrayList();
        this.b = (List)parcel.createTypedArrayList((Parcelable$Creator)j0.b.CREATOR);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeStringList(this.a);
        parcel.writeTypedList(this.b);
    }
}
