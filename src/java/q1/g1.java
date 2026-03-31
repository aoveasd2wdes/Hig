package q1;

import java.util.HashMap;
import android.content.ComponentName;
import android.util.Log;
import android.os.Message;
import android.os.Handler$Callback;

final class g1 implements Handler$Callback
{
    final h1 a;
    
    public final boolean handleMessage(final Message message) {
        final int what = message.what;
        if (what != 0) {
            if (what != 1) {
                return false;
            }
            final HashMap j = h1.j(this.a);
            synchronized (j) {
                final c1 c1 = (c1)message.obj;
                final e1 e1 = (e1)h1.j(this.a).get((Object)c1);
                if (e1 != null && e1.a() == 3) {
                    final String value = String.valueOf((Object)c1);
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(value);
                    Log.e("GmsClientSupervisor", sb.toString(), (Throwable)new Exception());
                    ComponentName componentName;
                    if ((componentName = e1.b()) == null) {
                        componentName = c1.a();
                    }
                    ComponentName componentName2;
                    if ((componentName2 = componentName) == null) {
                        componentName2 = new(android.content.ComponentName.class)();
                        final String c2 = c1.c();
                        o.h(c2);
                        new ComponentName(c2, "unknown");
                    }
                    e1.onServiceDisconnected(componentName2);
                }
                return true;
            }
        }
        final HashMap i = h1.j(this.a);
        synchronized (i) {
            final c1 c3 = (c1)message.obj;
            final e1 e2 = (e1)h1.j(this.a).get((Object)c3);
            if (e2 != null && e2.i()) {
                if (e2.j()) {
                    e2.g("GmsClientSupervisor");
                }
                h1.j(this.a).remove((Object)c3);
            }
            return true;
        }
    }
}
