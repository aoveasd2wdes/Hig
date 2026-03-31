package i1;

import android.app.NotificationChannel;
import android.app.Notification;
import androidx.core.app.i;
import android.content.Intent;
import android.os.Build$VERSION;
import android.app.PendingIntent;
import androidx.core.app.f$d;
import android.content.Context;

public class e
{
    private final Context a;
    private final Integer b;
    private final String c;
    private f$d d;
    
    public e(final Context a, final String c, final Integer b, final g g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new f$d(a, c).o(1);
        this.e(g, false);
    }
    
    private PendingIntent b() {
        final Intent launchIntentForPackage = this.a.getPackageManager().getLaunchIntentForPackage(this.a.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setPackage((String)null);
            launchIntentForPackage.setFlags(270532608);
            int n;
            if (Build$VERSION.SDK_INT > 23) {
                n = 201326592;
            }
            else {
                n = 134217728;
            }
            return PendingIntent.getActivity(this.a, 0, launchIntentForPackage, n);
        }
        return null;
    }
    
    private int c(final String s, final String s2) {
        return this.a.getResources().getIdentifier(s, s2, this.a.getPackageName());
    }
    
    private void e(final g g, final boolean b) {
        final int c = this.c(g.c().b(), g.c().a());
        if (c == 0) {
            this.c("ic_launcher.png", "mipmap");
        }
        this.d = this.d.k((CharSequence)g.e()).p(c).j((CharSequence)g.d()).i(this.b()).n(g.h());
        final Integer a = g.a();
        if (a != null) {
            this.d = this.d.g((int)a);
        }
        if (b) {
            i.c(this.a).e((int)this.b, this.d.b());
        }
    }
    
    public Notification a() {
        return this.d.b();
    }
    
    public void d(final String s) {
        if (Build$VERSION.SDK_INT >= 26) {
            final i c = i.c(this.a);
            i1.d.a();
            final NotificationChannel a = i1.c.a(this.c, (CharSequence)s, 0);
            i1.b.a(a, 0);
            c.b(a);
        }
    }
    
    public void f(final g g, final boolean b) {
        this.e(g, b);
    }
}
