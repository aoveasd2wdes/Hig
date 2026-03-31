package n1;

import android.os.RemoteException;
import android.util.Log;
import q1.m0;
import x1.d;
import x1.b;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import q1.o;
import q1.l1;

abstract class v extends l1
{
    private final int b;
    
    protected v(final byte[] array) {
        o.a(array.length == 25);
        this.b = Arrays.hashCode(array);
    }
    
    protected static byte[] J(final String s) {
        try {
            return s.getBytes("ISO-8859-1");
        }
        catch (final UnsupportedEncodingException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    abstract byte[] W();
    
    public final b b() {
        return d.u2((Object)this.W());
    }
    
    public final boolean equals(final Object o) {
        if (o != null) {
            if (o instanceof m0) {
                try {
                    final m0 m0 = (m0)o;
                    if (m0.k() != this.b) {
                        return false;
                    }
                    final b b = m0.b();
                    return b != null && Arrays.equals(this.W(), (byte[])d.W(b));
                }
                catch (final RemoteException ex) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)ex);
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return this.b;
    }
    
    public final int k() {
        return this.b;
    }
}
