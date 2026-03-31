package j0;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class g0 implements Parcelable
{
    public static final Parcelable$Creator<g0> CREATOR;
    final String a;
    final String b;
    final boolean c;
    final int d;
    final int e;
    final String f;
    final boolean g;
    final boolean h;
    final boolean i;
    final boolean j;
    final int k;
    final String l;
    final int m;
    final boolean n;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public g0 a(final Parcel parcel) {
                return new g0(parcel);
            }
            
            public g0[] b(final int n) {
                return new g0[n];
            }
        };
    }
    
    g0(final Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        final int int1 = parcel.readInt();
        final boolean b = true;
        this.c = (int1 != 0);
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = (parcel.readInt() != 0);
        this.h = (parcel.readInt() != 0);
        this.i = (parcel.readInt() != 0);
        this.j = (parcel.readInt() != 0);
        this.k = parcel.readInt();
        this.l = parcel.readString();
        this.m = parcel.readInt();
        this.n = (parcel.readInt() != 0 && b);
    }
    
    g0(final o o) {
        this.a = o.getClass().getName();
        this.b = o.g;
        this.c = o.q;
        this.d = o.y;
        this.e = o.z;
        this.f = o.A;
        this.g = o.D;
        this.h = o.n;
        this.i = o.C;
        this.j = o.B;
        this.k = ((Enum)o.S).ordinal();
        this.l = o.j;
        this.m = o.k;
        this.n = o.L;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.b);
        sb.append(")}:");
        if (this.c) {
            sb.append(" fromLayout");
        }
        if (this.e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.e));
        }
        final String f = this.f;
        if (f != null && !f.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f);
        }
        if (this.g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.j) {
            sb.append(" hidden");
        }
        if (this.l != null) {
            sb.append(" targetWho=");
            sb.append(this.l);
            sb.append(" targetRequestCode=");
            sb.append(this.m);
        }
        if (this.n) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt((int)(this.c ? 1 : 0));
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt((int)(this.g ? 1 : 0));
        parcel.writeInt((int)(this.h ? 1 : 0));
        parcel.writeInt((int)(this.i ? 1 : 0));
        parcel.writeInt((int)(this.j ? 1 : 0));
        parcel.writeInt(this.k);
        parcel.writeString(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt((int)(this.n ? 1 : 0));
    }
}
