package q1;

import android.util.Log;
import android.os.Bundle;
import android.os.IBinder;

public final class u0 extends n0
{
    private c b;
    private final int c;
    
    public u0(final c b, final int c) {
        this.b = b;
        this.c = c;
    }
    
    public final void k1(final int n, final IBinder binder, final y0 y0) {
        final c b = this.b;
        o.i((Object)b, (Object)"onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        o.h((Object)y0);
        q1.c.a0(b, y0);
        this.r2(n, binder, y0.a);
    }
    
    public final void r2(final int n, final IBinder binder, final Bundle bundle) {
        o.i((Object)this.b, (Object)"onPostInitComplete can be called only once per call to getRemoteService");
        this.b.M(n, binder, bundle, this.c);
        this.b = null;
    }
    
    public final void u0(final int n, final Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", (Throwable)new Exception());
    }
}
