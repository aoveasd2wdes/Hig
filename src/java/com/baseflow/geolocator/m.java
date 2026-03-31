package com.baseflow.geolocator;

import h1.c;
import h1.a;
import i1.r0;
import i1.g;
import i1.g0;
import java.util.Map;
import i1.f0;
import android.util.Log;
import android.location.Location;
import k3.d$b;
import i1.s;
import i1.n;
import android.app.Activity;
import android.content.Context;
import k3.d;
import j1.b;
import k3.d$d;

class m implements d$d
{
    private final b a;
    private d b;
    private Context c;
    private Activity d;
    private GeolocatorLocationService e;
    private n f;
    private s g;
    
    public m(final b a, final n f) {
        this.a = a;
        this.f = f;
    }
    
    private void e(final boolean b) {
        Log.e("FlutterGeolocator", "Geolocator position updates stopped");
        final GeolocatorLocationService e = this.e;
        if (e != null && e.c(b)) {
            this.e.q();
            this.e.e();
        }
        else {
            Log.e("FlutterGeolocator", "There is still another flutter engine connected, not stopping location service");
        }
        final s g = this.g;
        if (g != null) {
            final n f = this.f;
            if (f != null) {
                f.h(g);
                this.g = null;
            }
        }
    }
    
    public void a(final Object o) {
        this.e(true);
    }
    
    public void b(final Object o, final d$b d$b) {
        final g g = null;
        try {
            if (!this.a.f(this.c)) {
                final h1.b i = h1.b.i;
                d$b.b(i.toString(), i.b(), (Object)null);
                return;
            }
            if (this.e == null) {
                Log.e("FlutterGeolocator", "Location background service has not started correctly");
                return;
            }
            final Map map = (Map)o;
            final boolean b = map != null && map.get((Object)"forceLocationManager") != null && (boolean)map.get((Object)"forceLocationManager");
            final g0 e = g0.e(map);
            g j = g;
            if (map != null) {
                j = i1.g.i((Map)map.get((Object)"foregroundNotificationConfig"));
            }
            if (j != null) {
                Log.e("FlutterGeolocator", "Geolocator position updates started using Android foreground service");
                this.e.p(b, e, d$b);
                this.e.f(j);
            }
            else {
                Log.e("FlutterGeolocator", "Geolocator position updates started");
                final s b2 = this.f.b(this.c, Boolean.TRUE.equals((Object)b), e);
                this.g = b2;
                this.f.g(b2, this.d, (r0)new k(d$b), (a)new l(d$b));
            }
        }
        catch (final c c) {
            final h1.b h = h1.b.h;
            d$b.b(h.toString(), h.b(), (Object)null);
        }
    }
    
    public void h(final Activity d) {
        if (d == null && this.g != null && this.b != null) {
            this.k();
        }
        this.d = d;
    }
    
    public void i(final GeolocatorLocationService e) {
        this.e = e;
    }
    
    void j(final Context c, final k3.c c2) {
        if (this.b != null) {
            Log.w("FlutterGeolocator", "Setting a event call handler before the last was disposed.");
            this.k();
        }
        (this.b = new d(c2, "flutter.baseflow.com/geolocator_updates_android")).d((d$d)this);
        this.c = c;
    }
    
    void k() {
        if (this.b == null) {
            Log.d("FlutterGeolocator", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        this.e(false);
        this.b.d((d$d)null);
        this.b = null;
    }
}
