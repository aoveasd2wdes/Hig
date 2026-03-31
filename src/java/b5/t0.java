package b5;

import java.util.concurrent.locks.ReentrantLock;
import p4.d;
import i4.l;

public abstract class t0
{
    public static final byte[] a(final String s) {
        l.e(s, "<this>");
        final byte[] bytes = s.getBytes(d.b);
        l.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }
    
    public static final ReentrantLock b() {
        return new ReentrantLock();
    }
    
    public static final String c(final byte[] array) {
        l.e(array, "<this>");
        return new String(array, d.b);
    }
}
