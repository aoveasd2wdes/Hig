package q1;

import android.content.ServiceConnection;
import android.os.Handler$Callback;
import a2.e;
import android.os.Looper;
import java.util.concurrent.Executor;
import t1.b;
import android.os.Handler;
import android.content.Context;
import java.util.HashMap;

final class h1 extends i
{
    private final HashMap f;
    private final Context g;
    private volatile Handler h;
    private final g1 i;
    private final b j;
    private final long k;
    private final long l;
    private volatile Executor m;
    
    h1(final Context context, final Looper looper, final Executor m) {
        this.f = new HashMap();
        final g1 i = new g1(this, (f1)null);
        this.i = i;
        this.g = context.getApplicationContext();
        this.h = (Handler)new e(looper, (Handler$Callback)i);
        this.j = b.a();
        this.k = 5000L;
        this.l = 300000L;
        this.m = m;
    }
    
    protected final void c(final c1 c1, final ServiceConnection serviceConnection, final String s) {
        o.i((Object)serviceConnection, (Object)"ServiceConnection must not be null");
        final HashMap f = this.f;
        synchronized (f) {
            final e1 e1 = (e1)this.f.get((Object)c1);
            if (e1 == null) {
                final String string = c1.toString();
                final StringBuilder sb = new StringBuilder();
                sb.append("Nonexistent connection status for service config: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            if (e1.h(serviceConnection)) {
                e1.f(serviceConnection, s);
                if (e1.i()) {
                    this.h.sendMessageDelayed(this.h.obtainMessage(0, (Object)c1), this.k);
                }
                return;
            }
            final String string2 = c1.toString();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
            sb2.append(string2);
            throw new IllegalStateException(sb2.toString());
        }
    }
    
    protected final boolean e(final c1 c1, final ServiceConnection serviceConnection, String string, final Executor executor) {
        o.i((Object)serviceConnection, (Object)"ServiceConnection must not be null");
        final HashMap f = this.f;
        synchronized (f) {
            final e1 e1 = (e1)this.f.get((Object)c1);
            Executor m = executor;
            if (executor == null) {
                m = this.m;
            }
            e1 e3;
            if (e1 == null) {
                final e1 e2 = new e1(this, c1);
                e2.d(serviceConnection, serviceConnection, string);
                e2.e(string, m);
                this.f.put((Object)c1, (Object)e2);
                e3 = e2;
            }
            else {
                this.h.removeMessages(0, (Object)c1);
                if (e1.h(serviceConnection)) {
                    string = c1.toString();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                e1.d(serviceConnection, serviceConnection, string);
                final int a = e1.a();
                if (a != 1) {
                    if (a != 2) {
                        e3 = e1;
                    }
                    else {
                        e1.e(string, m);
                        e3 = e1;
                    }
                }
                else {
                    serviceConnection.onServiceConnected(e1.b(), e1.c());
                    e3 = e1;
                }
            }
            return e3.j();
        }
    }
}
