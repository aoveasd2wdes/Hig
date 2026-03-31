package com.baseflow.geolocator;

import android.content.Context;
import android.os.Binder;
import i1.r0;
import g1.c;
import i1.g0;
import android.os.IBinder;
import android.content.Intent;
import g1.a;
import android.util.Log;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import i1.g;
import i1.f0;
import android.os.Build$VERSION;
import h1.b;
import android.location.Location;
import k3.d$b;
import i1.e;
import android.net.wifi.WifiManager$WifiLock;
import android.os.PowerManager$WakeLock;
import i1.s;
import i1.n;
import android.app.Activity;
import android.app.Service;

public class GeolocatorLocationService extends Service
{
    private final String c;
    private final String d;
    private final a e;
    private boolean f;
    private int g;
    private int h;
    private Activity i;
    private n j;
    private s k;
    private PowerManager$WakeLock l;
    private WifiManager$WifiLock m;
    private e n;
    
    public GeolocatorLocationService() {
        this.c = "GeolocatorLocationService:Wakelock";
        this.d = "GeolocatorLocationService:WifiLock";
        this.e = new a(this);
        this.f = false;
        this.g = 0;
        this.h = 0;
        this.i = null;
        this.j = null;
        this.l = null;
        this.m = null;
        this.n = null;
    }
    
    private int i() {
        if (Build$VERSION.SDK_INT < 29) {
            return 3;
        }
        return 4;
    }
    
    private void l(final g g) {
        this.m();
        if (g.f()) {
            final PowerManager powerManager = (PowerManager)((Context)this).getApplicationContext().getSystemService("power");
            if (powerManager != null) {
                (this.l = powerManager.newWakeLock(1, "GeolocatorLocationService:Wakelock")).setReferenceCounted(false);
                this.l.acquire();
            }
        }
        if (g.g()) {
            final WifiManager wifiManager = (WifiManager)((Context)this).getApplicationContext().getSystemService("wifi");
            if (wifiManager != null) {
                (this.m = wifiManager.createWifiLock(this.i(), "GeolocatorLocationService:WifiLock")).setReferenceCounted(false);
                this.m.acquire();
            }
        }
    }
    
    private void m() {
        final PowerManager$WakeLock l = this.l;
        if (l != null && l.isHeld()) {
            this.l.release();
            this.l = null;
        }
        final WifiManager$WifiLock m = this.m;
        if (m != null && m.isHeld()) {
            this.m.release();
            this.m = null;
        }
    }
    
    public boolean c(final boolean b) {
        final boolean b2 = false;
        final boolean b3 = false;
        if (b) {
            boolean b4 = b3;
            if (this.h == 1) {
                b4 = true;
            }
            return b4;
        }
        boolean b5 = b2;
        if (this.g == 0) {
            b5 = true;
        }
        return b5;
    }
    
    public void d(final g g) {
        final e n = this.n;
        if (n != null) {
            n.f(g, this.f);
            this.l(g);
        }
    }
    
    public void e() {
        if (this.f) {
            Log.d("FlutterGeolocator", "Stop service in foreground.");
            if (Build$VERSION.SDK_INT >= 24) {
                g1.a.a(this, 1);
            }
            else {
                this.stopForeground(true);
            }
            this.m();
            this.f = false;
            this.n = null;
        }
    }
    
    public void f(final g g) {
        if (this.n != null) {
            Log.d("FlutterGeolocator", "Service already in foreground mode.");
            this.d(g);
        }
        else {
            Log.d("FlutterGeolocator", "Start service in foreground mode.");
            (this.n = new e(((Context)this).getApplicationContext(), "geolocator_channel_01", 75415, g)).d(g.b());
            this.startForeground(75415, this.n.a());
            this.f = true;
        }
        this.l(g);
    }
    
    public void g() {
        ++this.g;
        final StringBuilder sb = new StringBuilder();
        sb.append("Flutter engine connected. Connected engine count ");
        sb.append(this.g);
        Log.d("FlutterGeolocator", sb.toString());
    }
    
    public void h() {
        --this.g;
        final StringBuilder sb = new StringBuilder();
        sb.append("Flutter engine disconnected. Connected engine count ");
        sb.append(this.g);
        Log.d("FlutterGeolocator", sb.toString());
    }
    
    public void n(final Activity i) {
        this.i = i;
    }
    
    public void o(final n j) {
        this.j = j;
    }
    
    public IBinder onBind(final Intent intent) {
        Log.d("FlutterGeolocator", "Binding to location service.");
        return (IBinder)this.e;
    }
    
    public void onCreate() {
        super.onCreate();
        Log.d("FlutterGeolocator", "Creating service.");
    }
    
    public void onDestroy() {
        Log.d("FlutterGeolocator", "Destroying location service.");
        this.q();
        this.e();
        this.j = null;
        this.n = null;
        Log.d("FlutterGeolocator", "Destroyed location service.");
        super.onDestroy();
    }
    
    public int onStartCommand(final Intent intent, final int n, final int n2) {
        return 1;
    }
    
    public boolean onUnbind(final Intent intent) {
        Log.d("FlutterGeolocator", "Unbinding from location service.");
        return super.onUnbind(intent);
    }
    
    public void p(final boolean b, final g0 g0, final d$b d$b) {
        ++this.h;
        final n j = this.j;
        if (j != null) {
            final s b2 = j.b(((Context)this).getApplicationContext(), Boolean.TRUE.equals((Object)b), g0);
            this.k = b2;
            this.j.g(b2, this.i, (r0)new g1.b(d$b), (h1.a)new c(d$b));
        }
    }
    
    public void q() {
        --this.h;
        Log.d("FlutterGeolocator", "Stopping location service.");
        final s k = this.k;
        if (k != null) {
            final n j = this.j;
            if (j != null) {
                j.h(k);
            }
        }
    }
    
    class a extends Binder
    {
        private final GeolocatorLocationService b;
        final GeolocatorLocationService c;
        
        a(final GeolocatorLocationService c, final GeolocatorLocationService b) {
            this.c = c;
            this.b = b;
        }
        
        public GeolocatorLocationService a() {
            return this.b;
        }
    }
}
