package v2;

import android.app.Notification;
import android.app.NotificationChannel;
import i1.b;
import i1.c;
import i1.d;
import android.os.Build$VERSION;
import android.content.Intent;
import android.app.PendingIntent;
import i4.g;
import i4.l;
import androidx.core.app.f$d;
import android.content.Context;

public final class a
{
    private final Context a;
    private final String b;
    private final int c;
    private i d;
    private f$d e;
    
    public a(final Context a, final String b, final int c) {
        l.e((Object)a, "context");
        l.e((Object)b, "channelId");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new i(null, null, null, null, null, null, false, 127, null);
        final f$d o = new f$d(a, b).o(1);
        l.d((Object)o, "Builder(context, channel\u2026tionCompat.PRIORITY_HIGH)");
        this.e = o;
        this.e(this.d, false);
    }
    
    private final PendingIntent b() {
        final Intent launchIntentForPackage = this.a.getPackageManager().getLaunchIntentForPackage(this.a.getPackageName());
        PendingIntent activity = null;
        Intent setFlags = null;
        Label_0046: {
            if (launchIntentForPackage != null) {
                final Intent setPackage = launchIntentForPackage.setPackage((String)null);
                if (setPackage != null) {
                    setFlags = setPackage.setFlags(270532608);
                    break Label_0046;
                }
            }
            setFlags = null;
        }
        if (setFlags != null) {
            activity = PendingIntent.getActivity(this.a, 0, setFlags, 67108864);
        }
        return activity;
    }
    
    private final int c(final String s) {
        return this.a.getResources().getIdentifier(s, "drawable", this.a.getPackageName());
    }
    
    private final void d(final String s) {
        if (Build$VERSION.SDK_INT >= 26) {
            final androidx.core.app.i c = androidx.core.app.i.c(this.a);
            l.d((Object)c, "from(context)");
            i1.d.a();
            final NotificationChannel a = i1.c.a(this.b, (CharSequence)s, 0);
            i1.b.a(a, 0);
            c.b(a);
        }
    }
    
    private final void e(final i i, final boolean b) {
        int n = this.c(i.d());
        if (n == 0) {
            n = this.c("navigation_empty_icon");
        }
        final f$d r = this.e.k((CharSequence)i.g()).p(n).j((CharSequence)i.f()).r((CharSequence)i.c());
        l.d((Object)r, "builder\n            .set\u2026Text(options.description)");
        this.e = r;
        f$d e;
        String s;
        if (i.b() != null) {
            e = this.e.g((int)i.b()).h(true);
            s = "{\n            builder.se\u2026Colorized(true)\n        }";
        }
        else {
            e = this.e.g(0).h(false);
            s = "{\n            builder.se\u2026olorized(false)\n        }";
        }
        l.d((Object)e, s);
        this.e = e;
        f$d e2;
        String s2;
        if (i.e()) {
            e2 = this.e.i(this.b());
            s2 = "{\n            builder.se\u2026oFrontIntent())\n        }";
        }
        else {
            e2 = this.e.i((PendingIntent)null);
            s2 = "{\n            builder.se\u2026entIntent(null)\n        }";
        }
        l.d((Object)e2, s2);
        this.e = e2;
        if (b) {
            final androidx.core.app.i c = androidx.core.app.i.c(this.a);
            l.d((Object)c, "from(context)");
            c.e(this.c, this.e.b());
        }
    }
    
    public final Notification a() {
        this.d(this.d.a());
        final Notification b = this.e.b();
        l.d((Object)b, "builder.build()");
        return b;
    }
    
    public final void f(final i d, final boolean b) {
        l.e((Object)d, "options");
        if (!l.a((Object)d.a(), (Object)this.d.a())) {
            this.d(d.a());
        }
        this.e(d, b);
        this.d = d;
    }
}
