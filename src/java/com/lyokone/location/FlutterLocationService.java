package com.lyokone.location;

import android.os.IBinder;
import android.content.Intent;
import u3.q;
import k3.m;
import v2.h;
import android.util.Log;
import android.content.Context;
import v3.c0;
import u3.j;
import i4.l;
import java.util.Map;
import v2.i;
import android.content.ActivityNotFoundException;
import android.os.Build$VERSION;
import i4.g;
import k3.k$d;
import v2.a;
import android.app.Activity;
import k3.n;
import android.app.Service;

public final class FlutterLocationService extends Service implements n
{
    public static final FlutterLocationService.FlutterLocationService$a i;
    private final FlutterLocationService.FlutterLocationService$b c;
    private boolean d;
    private Activity e;
    private a f;
    private com.lyokone.location.a g;
    private k$d h;
    
    static {
        i = new FlutterLocationService.FlutterLocationService$a((g)null);
    }
    
    public FlutterLocationService() {
        this.c = new FlutterLocationService.FlutterLocationService$b(this);
    }
    
    private final boolean n() {
        boolean k;
        if (Build$VERSION.SDK_INT >= 29) {
            final Activity e = this.e;
            if (e == null) {
                throw new ActivityNotFoundException();
            }
            k = androidx.core.app.a.k(e, "android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        else {
            k = false;
        }
        return k;
    }
    
    public final Map a(final i i) {
        l.e((Object)i, "options");
        final a f = this.f;
        if (f != null) {
            f.f(i, this.d);
        }
        Map e;
        if (this.d) {
            e = c0.e(new j[] { u3.n.a((Object)"channelId", (Object)"flutter_location_channel_01"), u3.n.a((Object)"notificationId", (Object)75418) });
        }
        else {
            e = null;
        }
        return e;
    }
    
    public final boolean b() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean j = false;
        if (sdk_INT >= 29) {
            final Activity e = this.e;
            if (e == null) {
                throw new ActivityNotFoundException();
            }
            if (androidx.core.content.a.a((Context)e, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                j = true;
            }
        }
        else {
            final com.lyokone.location.a g = this.g;
            if (g != null) {
                j = g.j();
            }
        }
        return j;
    }
    
    public final void c() {
        Log.d("FlutterLocationService", "Stop service in foreground.");
        if (Build$VERSION.SDK_INT >= 24) {
            v2.h.a(this, 1);
        }
        else {
            this.stopForeground(true);
        }
        this.d = false;
    }
    
    public boolean d(final int n, final String[] array, final int[] array2) {
        l.e((Object)array, "permissions");
        l.e((Object)array2, "grantResults");
        if (Build$VERSION.SDK_INT >= 29 && n == 641 && array.length == 2 && l.a((Object)array[0], (Object)"android.permission.ACCESS_FINE_LOCATION") && l.a((Object)array[1], (Object)"android.permission.ACCESS_BACKGROUND_LOCATION")) {
            Label_0145: {
                if (array2[0] == 0 && array2[1] == 0) {
                    this.e();
                    final k$d h = this.h;
                    if (h != null) {
                        h.a((Object)1);
                    }
                }
                else {
                    k$d k$d;
                    String s;
                    String s2;
                    if (!this.n()) {
                        k$d = this.h;
                        if (k$d == null) {
                            break Label_0145;
                        }
                        s = "PERMISSION_DENIED_NEVER_ASK";
                        s2 = "Background location permission denied forever - please open app settings";
                    }
                    else {
                        k$d = this.h;
                        if (k$d == null) {
                            break Label_0145;
                        }
                        s = "PERMISSION_DENIED";
                        s2 = "Background location permission denied";
                    }
                    k$d.b(s, s2, (Object)null);
                }
            }
            this.h = null;
        }
        return false;
    }
    
    public final void e() {
        if (this.d) {
            Log.d("FlutterLocationService", "Service already in foreground mode.");
        }
        else {
            Log.d("FlutterLocationService", "Start service in foreground mode.");
            final a f = this.f;
            l.b((Object)f);
            this.startForeground(75418, f.a());
            this.d = true;
        }
    }
    
    public final com.lyokone.location.a f() {
        return this.g;
    }
    
    public final m g() {
        return (m)this.g;
    }
    
    public final n h() {
        return (n)this.g;
    }
    
    public final n i() {
        return (n)this;
    }
    
    public final boolean j() {
        return this.d;
    }
    
    public final void k() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        q a = null;
        if (sdk_INT >= 29) {
            final Activity e = this.e;
            if (e != null) {
                androidx.core.app.a.j(e, new String[] { "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION" }, 641);
                a = q.a;
            }
            if (a == null) {
                throw new ActivityNotFoundException();
            }
        }
        else {
            final com.lyokone.location.a g = this.g;
            if (g != null) {
                g.p = this.h;
            }
            if (g != null) {
                g.s();
            }
            this.h = null;
        }
    }
    
    public final void l(final Activity e) {
        this.e = e;
        final com.lyokone.location.a g = this.g;
        if (g != null) {
            g.v(e);
        }
    }
    
    public final void m(final k$d h) {
        this.h = h;
    }
    
    public IBinder onBind(final Intent intent) {
        Log.d("FlutterLocationService", "Binding to location service.");
        return (IBinder)this.c;
    }
    
    public void onCreate() {
        super.onCreate();
        Log.d("FlutterLocationService", "Creating service.");
        this.g = new com.lyokone.location.a(((Context)this).getApplicationContext(), null);
        final Context applicationContext = ((Context)this).getApplicationContext();
        l.d((Object)applicationContext, "applicationContext");
        this.f = new a(applicationContext, "flutter_location_channel_01", 75418);
    }
    
    public void onDestroy() {
        Log.d("FlutterLocationService", "Destroying service.");
        this.g = null;
        this.f = null;
        super.onDestroy();
    }
    
    public boolean onUnbind(final Intent intent) {
        Log.d("FlutterLocationService", "Unbinding from location service.");
        return super.onUnbind(intent);
    }
}
