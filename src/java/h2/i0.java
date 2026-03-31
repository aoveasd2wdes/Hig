package h2;

import android.os.RemoteException;
import c2.p;

final class i0 implements c0
{
    private final p b;
    final b0 c;
    
    i0(final b0 c) {
        this.c = c;
        this.b = b0.j(c);
    }
    
    public final z a(final int n, final int n2, final int n3) {
        try {
            return this.b.u1(n, n2, n3);
        }
        catch (final RemoteException ex) {
            return null;
        }
    }
}
