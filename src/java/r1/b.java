package r1;

import java.util.List;
import android.os.IBinder;
import java.util.ArrayList;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import android.os.Bundle;
import android.os.Parcel;

public abstract class b
{
    public static Bundle a(final Parcel parcel, int dataPosition) {
        final int v = v(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        final Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + v);
        return bundle;
    }
    
    public static byte[] b(final Parcel parcel, int dataPosition) {
        final int v = v(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        final byte[] byteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + v);
        return byteArray;
    }
    
    public static int[] c(final Parcel parcel, int dataPosition) {
        final int v = v(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        final int[] intArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + v);
        return intArray;
    }
    
    public static Parcelable d(final Parcel parcel, int v, final Parcelable$Creator parcelable$Creator) {
        v = v(parcel, v);
        final int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        final Parcelable parcelable = (Parcelable)parcelable$Creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + v);
        return parcelable;
    }
    
    public static String e(final Parcel parcel, int dataPosition) {
        final int v = v(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        final String string = parcel.readString();
        parcel.setDataPosition(dataPosition + v);
        return string;
    }
    
    public static ArrayList f(final Parcel parcel, int dataPosition) {
        final int v = v(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        final ArrayList stringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + v);
        return stringArrayList;
    }
    
    public static Object[] g(final Parcel parcel, int v, final Parcelable$Creator parcelable$Creator) {
        v = v(parcel, v);
        final int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        final Object[] typedArray = parcel.createTypedArray(parcelable$Creator);
        parcel.setDataPosition(dataPosition + v);
        return typedArray;
    }
    
    public static ArrayList h(final Parcel parcel, int v, final Parcelable$Creator parcelable$Creator) {
        v = v(parcel, v);
        final int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        final ArrayList typedArrayList = parcel.createTypedArrayList(parcelable$Creator);
        parcel.setDataPosition(dataPosition + v);
        return typedArrayList;
    }
    
    public static void i(final Parcel parcel, final int n) {
        if (parcel.dataPosition() == n) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Overread allowed size end=");
        sb.append(n);
        throw new a(sb.toString(), parcel);
    }
    
    public static int j(final int n) {
        return (char)n;
    }
    
    public static boolean k(final Parcel parcel, final int n) {
        z(parcel, n, 4);
        return parcel.readInt() != 0;
    }
    
    public static byte l(final Parcel parcel, final int n) {
        z(parcel, n, 4);
        return (byte)parcel.readInt();
    }
    
    public static double m(final Parcel parcel, final int n) {
        z(parcel, n, 8);
        return parcel.readDouble();
    }
    
    public static float n(final Parcel parcel, final int n) {
        z(parcel, n, 4);
        return parcel.readFloat();
    }
    
    public static Float o(final Parcel parcel, final int n) {
        final int v = v(parcel, n);
        if (v == 0) {
            return null;
        }
        y(parcel, n, v, 4);
        return parcel.readFloat();
    }
    
    public static int p(final Parcel parcel) {
        return parcel.readInt();
    }
    
    public static IBinder q(final Parcel parcel, int v) {
        v = v(parcel, v);
        final int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        final IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + v);
        return strongBinder;
    }
    
    public static int r(final Parcel parcel, final int n) {
        z(parcel, n, 4);
        return parcel.readInt();
    }
    
    public static Integer s(final Parcel parcel, final int n) {
        final int v = v(parcel, n);
        if (v == 0) {
            return null;
        }
        y(parcel, n, v, 4);
        return parcel.readInt();
    }
    
    public static void t(final Parcel parcel, int dataPosition, final List list, final ClassLoader classLoader) {
        final int v = v(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (v == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(dataPosition + v);
    }
    
    public static long u(final Parcel parcel, final int n) {
        z(parcel, n, 8);
        return parcel.readLong();
    }
    
    public static int v(final Parcel parcel, final int n) {
        if ((n & 0xFFFF0000) != 0xFFFF0000) {
            return (char)(n >> 16);
        }
        return parcel.readInt();
    }
    
    public static void w(final Parcel parcel, int v) {
        v = v(parcel, v);
        parcel.setDataPosition(parcel.dataPosition() + v);
    }
    
    public static int x(final Parcel parcel) {
        final int p = p(parcel);
        final int v = v(parcel, p);
        final int j = j(p);
        final int dataPosition = parcel.dataPosition();
        if (j != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf((Object)Integer.toHexString(p))), parcel);
        }
        final int n = v + dataPosition;
        if (n >= dataPosition && n <= parcel.dataSize()) {
            return n;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(n);
        throw new a(sb.toString(), parcel);
    }
    
    private static void y(final Parcel parcel, final int n, final int n2, final int n3) {
        if (n2 == n3) {
            return;
        }
        final String hexString = Integer.toHexString(n2);
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected size ");
        sb.append(n3);
        sb.append(" got ");
        sb.append(n2);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }
    
    private static void z(final Parcel parcel, int v, final int n) {
        v = v(parcel, v);
        if (v == n) {
            return;
        }
        final String hexString = Integer.toHexString(v);
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected size ");
        sb.append(n);
        sb.append(" got ");
        sb.append(v);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }
    
    public static class a extends RuntimeException
    {
        public a(final String s, final Parcel parcel) {
            final int dataPosition = parcel.dataPosition();
            final int dataSize = parcel.dataSize();
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append(" Parcel: pos=");
            sb.append(dataPosition);
            sb.append(" size=");
            sb.append(dataSize);
            super(sb.toString());
        }
    }
}
