package q1;

import android.os.Handler;
import android.os.IInterface;
import android.os.Bundle;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

public final class v0 implements ServiceConnection
{
    private final int a;
    final c b;
    
    public v0(final c b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        final c b = this.b;
        if (binder == null) {
            c.b0(b, 16);
            return;
        }
        final Object u = c.U(b);
        synchronized (u) {
            final c b2 = this.b;
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            Object o;
            if (queryLocalInterface != null && queryLocalInterface instanceof l) {
                o = queryLocalInterface;
            }
            else {
                o = new o0(binder);
            }
            c.Y(b2, (l)o);
            monitorexit(u);
            this.b.c0(0, null, this.a);
        }
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        final Object u = c.U(this.b);
        synchronized (u) {
            c.Y(this.b, (l)null);
            monitorexit(u);
            final c b = this.b;
            final int a = this.a;
            final Handler l = b.l;
            l.sendMessage(l.obtainMessage(6, a, 1));
        }
    }
}
