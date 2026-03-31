package z2;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build$VERSION;
import android.os.Looper;
import android.net.ConnectivityManager$NetworkCallback;
import android.os.Handler;
import k3.d$b;
import android.content.Context;
import k3.d$d;
import android.content.BroadcastReceiver;

public class f extends BroadcastReceiver implements d$d
{
    private final Context a;
    private final b b;
    private d$b c;
    private final Handler d;
    private ConnectivityManager$NetworkCallback e;
    
    public f(final Context a, final b b) {
        this.d = new Handler(Looper.getMainLooper());
        this.a = a;
        this.b = b;
    }
    
    private void i() {
        this.d.post((Runnable)new d(this));
    }
    
    private void j(final String s) {
        this.d.post((Runnable)new e(this, s));
    }
    
    public void a(final Object o) {
        if (Build$VERSION.SDK_INT >= 24) {
            if (this.e != null) {
                this.b.a().unregisterNetworkCallback(this.e);
                this.e = null;
            }
            return;
        }
        try {
            this.a.unregisterReceiver((BroadcastReceiver)this);
        }
        catch (final Exception ex) {}
    }
    
    public void b(final Object o, final d$b c) {
        this.c = c;
        if (Build$VERSION.SDK_INT >= 24) {
            this.e = (ConnectivityManager$NetworkCallback)new f$a(this);
            c.a(this.b.a(), this.e);
        }
        else {
            this.a.registerReceiver((BroadcastReceiver)this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }
    
    public void onReceive(final Context context, final Intent intent) {
        final d$b c = this.c;
        if (c != null) {
            c.a((Object)this.b.b());
        }
    }
}
