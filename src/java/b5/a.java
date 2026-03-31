package b5;

import i4.l;

public abstract class a
{
    private static final b.a a;
    private static final int b;
    
    static {
        a = new b.a();
        b = -1234567890;
    }
    
    public static final boolean a(final byte[] array, final int n, final byte[] array2, final int n2, final int n3) {
        l.e(array, "a");
        l.e(array2, "b");
        for (int i = 0; i < n3; ++i) {
            if (array[i + n] != array2[i + n2]) {
                return false;
            }
        }
        return true;
    }
    
    public static final void b(final long n, final long n2, final long n3) {
        if ((n2 | n3) >= 0L && n2 <= n && n - n2 >= n3) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("size=");
        sb.append(n);
        sb.append(" offset=");
        sb.append(n2);
        sb.append(" byteCount=");
        sb.append(n3);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }
    
    public static final int c() {
        return b5.a.b;
    }
    
    public static final int d(final e e, final int n) {
        l.e(e, "<this>");
        if (n == b5.a.b) {
            return e.y();
        }
        return n;
    }
    
    public static final int e(final int n) {
        return (n & 0xFF) << 24 | ((0xFF000000 & n) >>> 24 | (0xFF0000 & n) >>> 8 | (0xFF00 & n) << 8);
    }
    
    public static final long f(final long n) {
        return (n & 0xFFL) << 56 | ((0xFF00000000000000L & n) >>> 56 | (0xFF000000000000L & n) >>> 40 | (0xFF0000000000L & n) >>> 24 | (0xFF00000000L & n) >>> 8 | (0xFF000000L & n) << 8 | (0xFF0000L & n) << 24 | (0xFF00L & n) << 40);
    }
    
    public static final short g(final short n) {
        final int n2 = n & 0xFFFF;
        return (short)((n2 & 0xFF) << 8 | (0xFF00 & n2) >>> 8);
    }
}
