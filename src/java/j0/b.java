package j0;

import java.util.List;
import androidx.lifecycle.h$b;
import android.util.Log;
import android.text.TextUtils;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class b implements Parcelable
{
    public static final Parcelable$Creator<b> CREATOR;
    final int[] a;
    final ArrayList b;
    final int[] c;
    final int[] d;
    final int e;
    final String f;
    final int g;
    final int h;
    final CharSequence i;
    final int j;
    final CharSequence k;
    final ArrayList l;
    final ArrayList m;
    final boolean n;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public b a(final Parcel parcel) {
                return new b(parcel);
            }
            
            public b[] b(final int n) {
                return new b[n];
            }
        };
    }
    
    b(final Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = (parcel.readInt() != 0);
    }
    
    b(final a a) {
        final int size = ((j0)a).c.size();
        this.a = new int[size * 6];
        if (((j0)a).i) {
            this.b = new ArrayList(size);
            this.c = new int[size];
            this.d = new int[size];
            int i = 0;
            int n = 0;
            while (i < size) {
                final j0.a a2 = (j0.a)((j0)a).c.get(i);
                final int[] a3 = this.a;
                final int n2 = n + 1;
                a3[n] = a2.a;
                final ArrayList b = this.b;
                final o b2 = a2.b;
                String g;
                if (b2 != null) {
                    g = b2.g;
                }
                else {
                    g = null;
                }
                b.add((Object)g);
                final int[] a4 = this.a;
                final int n3 = n2 + 1;
                a4[n2] = (a2.c ? 1 : 0);
                final int n4 = n3 + 1;
                a4[n3] = a2.d;
                final int n5 = n4 + 1;
                a4[n4] = a2.e;
                final int n6 = n5 + 1;
                a4[n5] = a2.f;
                a4[n6] = a2.g;
                this.c[i] = ((Enum)a2.h).ordinal();
                this.d[i] = ((Enum)a2.i).ordinal();
                ++i;
                n = n6 + 1;
            }
            this.e = ((j0)a).h;
            this.f = ((j0)a).k;
            this.g = a.v;
            this.h = ((j0)a).l;
            this.i = ((j0)a).m;
            this.j = ((j0)a).n;
            this.k = ((j0)a).o;
            this.l = ((j0)a).p;
            this.m = ((j0)a).q;
            this.n = ((j0)a).r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }
    
    private void a(final a a) {
        int n = 0;
        int n2 = 0;
        while (true) {
            final int length = this.a.length;
            boolean c = true;
            if (n >= length) {
                break;
            }
            final j0.a a2 = new j0.a();
            final int[] a3 = this.a;
            final int n3 = n + 1;
            a2.a = a3[n];
            if (b0.l0(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Instantiate ");
                sb.append((Object)a);
                sb.append(" op #");
                sb.append(n2);
                sb.append(" base fragment #");
                sb.append(this.a[n3]);
                Log.v("FragmentManager", sb.toString());
            }
            a2.h = h$b.values()[this.c[n2]];
            a2.i = h$b.values()[this.d[n2]];
            final int[] a4 = this.a;
            final int n4 = n3 + 1;
            if (a4[n3] == 0) {
                c = false;
            }
            a2.c = c;
            final int n5 = n4 + 1;
            final int n6 = a4[n4];
            a2.d = n6;
            final int n7 = n5 + 1;
            final int n8 = a4[n5];
            a2.e = n8;
            n = n7 + 1;
            final int n9 = a4[n7];
            a2.f = n9;
            final int n10 = a4[n];
            a2.g = n10;
            ((j0)a).d = n6;
            ((j0)a).e = n8;
            ((j0)a).f = n9;
            ((j0)a).g = n10;
            ((j0)a).d(a2);
            ++n2;
            ++n;
        }
        ((j0)a).h = this.e;
        ((j0)a).k = this.f;
        ((j0)a).i = true;
        ((j0)a).l = this.h;
        ((j0)a).m = this.i;
        ((j0)a).n = this.j;
        ((j0)a).o = this.k;
        ((j0)a).p = this.l;
        ((j0)a).q = this.m;
        ((j0)a).r = this.n;
    }
    
    public a b(final b0 b0) {
        final a a = new a(b0);
        this.a(a);
        a.v = this.g;
        for (int i = 0; i < this.b.size(); ++i) {
            final String s = (String)this.b.get(i);
            if (s != null) {
                ((j0.a)((j0)a).c.get(i)).b = b0.N(s);
            }
        }
        a.i(1);
        return a;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList((List)this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList((List)this.l);
        parcel.writeStringList((List)this.m);
        parcel.writeInt((int)(this.n ? 1 : 0));
    }
}
