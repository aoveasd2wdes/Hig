package r1;

import android.os.Parcelable;
import java.util.List;
import android.os.IBinder;
import android.os.Bundle;
import android.os.Parcel;

public abstract class c
{
    public static int a(final Parcel parcel) {
        return u(parcel, 20293);
    }
    
    public static void b(final Parcel parcel, final int n) {
        v(parcel, n);
    }
    
    public static void c(final Parcel parcel, final int n, final boolean b) {
        w(parcel, n, 4);
        parcel.writeInt((int)(b ? 1 : 0));
    }
    
    public static void d(final Parcel parcel, int u, final Bundle bundle, final boolean b) {
        if (bundle == null) {
            if (b) {
                w(parcel, u, 0);
            }
            return;
        }
        u = u(parcel, u);
        parcel.writeBundle(bundle);
        v(parcel, u);
    }
    
    public static void e(final Parcel parcel, final int n, final byte b) {
        w(parcel, n, 4);
        parcel.writeInt((int)b);
    }
    
    public static void f(final Parcel parcel, int u, final byte[] array, final boolean b) {
        if (array == null) {
            if (b) {
                w(parcel, u, 0);
            }
            return;
        }
        u = u(parcel, u);
        parcel.writeByteArray(array);
        v(parcel, u);
    }
    
    public static void g(final Parcel parcel, final int n, final double n2) {
        w(parcel, n, 8);
        parcel.writeDouble(n2);
    }
    
    public static void h(final Parcel parcel, final int n, final float n2) {
        w(parcel, n, 4);
        parcel.writeFloat(n2);
    }
    
    public static void i(final Parcel parcel, final int n, final Float n2, final boolean b) {
        if (n2 == null) {
            if (b) {
                w(parcel, n, 0);
            }
            return;
        }
        w(parcel, n, 4);
        parcel.writeFloat((float)n2);
    }
    
    public static void j(final Parcel parcel, int u, final IBinder binder, final boolean b) {
        if (binder == null) {
            if (b) {
                w(parcel, u, 0);
            }
            return;
        }
        u = u(parcel, u);
        parcel.writeStrongBinder(binder);
        v(parcel, u);
    }
    
    public static void k(final Parcel parcel, final int n, final int n2) {
        w(parcel, n, 4);
        parcel.writeInt(n2);
    }
    
    public static void l(final Parcel parcel, int u, final int[] array, final boolean b) {
        if (array == null) {
            if (b) {
                w(parcel, u, 0);
            }
            return;
        }
        u = u(parcel, u);
        parcel.writeIntArray(array);
        v(parcel, u);
    }
    
    public static void m(final Parcel parcel, final int n, final Integer n2, final boolean b) {
        if (n2 == null) {
            if (b) {
                w(parcel, n, 0);
            }
            return;
        }
        w(parcel, n, 4);
        parcel.writeInt((int)n2);
    }
    
    public static void n(final Parcel parcel, int u, final List list, final boolean b) {
        if (list == null) {
            if (b) {
                w(parcel, u, 0);
            }
            return;
        }
        u = u(parcel, u);
        parcel.writeList(list);
        v(parcel, u);
    }
    
    public static void o(final Parcel parcel, final int n, final long n2) {
        w(parcel, n, 8);
        parcel.writeLong(n2);
    }
    
    public static void p(final Parcel parcel, int u, final Parcelable parcelable, final int n, final boolean b) {
        if (parcelable == null) {
            if (b) {
                w(parcel, u, 0);
            }
            return;
        }
        u = u(parcel, u);
        parcelable.writeToParcel(parcel, n);
        v(parcel, u);
    }
    
    public static void q(final Parcel parcel, int u, final String s, final boolean b) {
        if (s == null) {
            if (b) {
                w(parcel, u, 0);
            }
            return;
        }
        u = u(parcel, u);
        parcel.writeString(s);
        v(parcel, u);
    }
    
    public static void r(final Parcel parcel, int u, final List list, final boolean b) {
        if (list == null) {
            if (b) {
                w(parcel, u, 0);
            }
            return;
        }
        u = u(parcel, u);
        parcel.writeStringList(list);
        v(parcel, u);
    }
    
    public static void s(final Parcel parcel, int i, final Parcelable[] array, final int n, final boolean b) {
        if (array == null) {
            if (b) {
                w(parcel, i, 0);
            }
            return;
        }
        final int u = u(parcel, i);
        final int length = array.length;
        parcel.writeInt(length);
        Parcelable parcelable;
        for (i = 0; i < length; ++i) {
            parcelable = array[i];
            if (parcelable == null) {
                parcel.writeInt(0);
            }
            else {
                x(parcel, parcelable, n);
            }
        }
        v(parcel, u);
    }
    
    public static void t(final Parcel parcel, int i, final List list, final boolean b) {
        if (list == null) {
            if (b) {
                w(parcel, i, 0);
            }
            return;
        }
        final int u = u(parcel, i);
        final int size = list.size();
        parcel.writeInt(size);
        Parcelable parcelable;
        for (i = 0; i < size; ++i) {
            parcelable = (Parcelable)list.get(i);
            if (parcelable == null) {
                parcel.writeInt(0);
            }
            else {
                x(parcel, parcelable, 0);
            }
        }
        v(parcel, u);
    }
    
    private static int u(final Parcel parcel, final int n) {
        parcel.writeInt(n | 0xFFFF0000);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }
    
    private static void v(final Parcel parcel, final int n) {
        final int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(n - 4);
        parcel.writeInt(dataPosition - n);
        parcel.setDataPosition(dataPosition);
    }
    
    private static void w(final Parcel parcel, final int n, final int n2) {
        parcel.writeInt(n | n2 << 16);
    }
    
    private static void x(final Parcel parcel, final Parcelable parcelable, int dataPosition) {
        final int dataPosition2 = parcel.dataPosition();
        parcel.writeInt(1);
        final int dataPosition3 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        parcel.setDataPosition(dataPosition2);
        parcel.writeInt(dataPosition - dataPosition3);
        parcel.setDataPosition(dataPosition);
    }
}
