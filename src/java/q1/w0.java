package q1;

import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import n1.a;
import android.os.Bundle;
import android.os.IBinder;

public final class w0 extends l0
{
    public final IBinder g;
    final c h;
    
    public w0(final c h, final int n, final IBinder g, final Bundle bundle) {
        super(this.h = h, n, bundle);
        this.g = g;
    }
    
    protected final void f(final a a) {
        if (c.T(this.h) != null) {
            c.T(this.h).J(a);
        }
        this.h.K(a);
    }
    
    protected final boolean g() {
        while (true) {
            try {
                final IBinder g = this.g;
                o.h((Object)g);
                final String interfaceDescriptor = g.getInterfaceDescriptor();
                if (!this.h.D().equals((Object)interfaceDescriptor)) {
                    final String d = this.h.D();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("service descriptor mismatch: ");
                    sb.append(d);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    final String string = sb.toString();
                    Log.w("GmsClient", string);
                    return false;
                }
                final IInterface r = this.h.r(this.g);
                if (r != null && (c.e0(this.h, 2, 4, r) || c.e0(this.h, 3, 4, r))) {
                    c.X(this.h, (a)null);
                    final c h = this.h;
                    final Bundle w = h.w();
                    if (c.S(h) != null) {
                        c.S(this.h).W(w);
                    }
                    return true;
                }
                return false;
            }
            catch (final RemoteException ex) {
                final String string = "service probably died";
                continue;
            }
            break;
        }
    }
}
