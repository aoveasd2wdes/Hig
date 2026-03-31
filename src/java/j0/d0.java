package j0;

import java.util.List;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class d0 implements Parcelable
{
    public static final Parcelable$Creator<d0> CREATOR;
    ArrayList a;
    ArrayList b;
    b[] c;
    int d;
    String e;
    ArrayList f;
    ArrayList g;
    ArrayList h;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public d0 a(final Parcel parcel) {
                return new d0(parcel);
            }
            
            public d0[] b(final int n) {
                return new d0[n];
            }
        };
    }
    
    public d0() {
        this.e = null;
        this.f = new ArrayList();
        this.g = new ArrayList();
    }
    
    public d0(final Parcel parcel) {
        this.e = null;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.a = parcel.createStringArrayList();
        this.b = parcel.createStringArrayList();
        this.c = (b[])parcel.createTypedArray((Parcelable$Creator)j0.b.CREATOR);
        this.d = parcel.readInt();
        this.e = parcel.readString();
        this.f = parcel.createStringArrayList();
        this.g = parcel.createTypedArrayList((Parcelable$Creator)j0.c.CREATOR);
        this.h = parcel.createTypedArrayList((Parcelable$Creator)b0.g.CREATOR);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeStringList((List)this.a);
        parcel.writeStringList((List)this.b);
        parcel.writeTypedArray((Parcelable[])this.c, n);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeStringList((List)this.f);
        parcel.writeTypedList((List)this.g);
        parcel.writeTypedList((List)this.h);
    }
}
