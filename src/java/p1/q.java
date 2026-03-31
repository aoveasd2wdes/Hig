package p1;

import android.net.Uri;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public final class q extends BroadcastReceiver
{
    Context a;
    private final p b;
    
    public q(final p b) {
        this.b = b;
    }
    
    public final void a(final Context a) {
        this.a = a;
    }
    
    public final void b() {
        synchronized (this) {
            final Context a = this.a;
            if (a != null) {
                a.unregisterReceiver((BroadcastReceiver)this);
            }
            this.a = null;
        }
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final Uri data = intent.getData();
        String schemeSpecificPart;
        if (data != null) {
            schemeSpecificPart = data.getSchemeSpecificPart();
        }
        else {
            schemeSpecificPart = null;
        }
        if ("com.google.android.gms".equals((Object)schemeSpecificPart)) {
            this.b.a();
            this.b();
        }
    }
}
