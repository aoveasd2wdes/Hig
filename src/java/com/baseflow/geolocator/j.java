package com.baseflow.geolocator;

import android.util.Log;
import i1.h0;
import i1.f;
import i1.r0;
import i1.g0;
import h1.c;
import i1.f0;
import i1.q;
import j1.a;
import android.location.Location;
import k3.k$d;
import i1.s;
import java.util.HashMap;
import k3.k;
import android.app.Activity;
import android.content.Context;
import java.util.Map;
import i1.p;
import i1.n;
import j1.b;
import k3.k$c;

class j implements k$c
{
    private final b c;
    private final n d;
    private final p e;
    final Map f;
    private Context g;
    private Activity h;
    private k i;
    
    j(final b c, final n d, final p e) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = (Map)new HashMap();
    }
    
    private void i(final k$d k$d, final Context context) {
        final q b = this.e.b(context, (h1.a)new e(k$d));
        if (b != null) {
            k$d.a((Object)((Enum)b).ordinal());
        }
    }
    
    private void q(final k3.j j, final k$d k$d) {
        final String s = (String)((Map)j.b).get((Object)"requestId");
        final s s2 = (s)this.f.get((Object)s);
        if (s2 != null) {
            s2.c();
        }
        this.f.remove((Object)s);
        k$d.a((Object)null);
    }
    
    private void r(final k$d k$d) {
        try {
            k$d.a((Object)this.c.a(this.g).b());
        }
        catch (final c c) {
            final h1.b h = h1.b.h;
            k$d.b(h.toString(), h.b(), (Object)null);
        }
    }
    
    private void s(final k3.j j, final k$d k$d) {
        try {
            if (!this.c.f(this.g)) {
                final h1.b i = h1.b.i;
                k$d.b(i.toString(), i.b(), (Object)null);
                return;
            }
            final Map map = (Map)j.b;
            final boolean b = map.get((Object)"forceLocationManager") != null && (boolean)map.get((Object)"forceLocationManager");
            final g0 e = g0.e(map);
            final String s = (String)map.get((Object)"requestId");
            final boolean[] array = { false };
            final s b2 = this.d.b(this.g, b, e);
            this.f.put((Object)s, (Object)b2);
            this.d.g(b2, this.h, (r0)new h(this, array, b2, s, k$d), (h1.a)new i(this, array, b2, s, k$d));
        }
        catch (final c c) {
            final h1.b h = h1.b.h;
            k$d.b(h.toString(), h.b(), (Object)null);
        }
    }
    
    private void t(final k3.j j, final k$d k$d) {
        try {
            if (!this.c.f(this.g)) {
                final h1.b i = h1.b.i;
                k$d.b(i.toString(), i.b(), (Object)null);
                return;
            }
            final Boolean b = (Boolean)j.a("forceLocationManager");
            this.d.d(this.g, b != null && b, (r0)new com.baseflow.geolocator.c(k$d), (h1.a)new d(k$d));
        }
        catch (final c c) {
            final h1.b h = h1.b.h;
            k$d.b(h.toString(), h.b(), (Object)null);
        }
    }
    
    private void u(final k$d k$d) {
        this.d.f(this.g, (h0)new f(k$d));
    }
    
    private void v(final k$d k$d) {
        try {
            this.c.h(this.h, (j1.c)new com.baseflow.geolocator.f(k$d), (h1.a)new g(k$d));
        }
        catch (final c c) {
            final h1.b h = h1.b.h;
            k$d.b(h.toString(), h.b(), (Object)null);
        }
    }
    
    public void a(final k3.j j, final k$d k$d) {
        final String a = j.a;
        a.hashCode();
        final int hashCode = a.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1774650278: {
                if (!a.equals((Object)"cancelGetCurrentPosition")) {
                    break;
                }
                n = 8;
                break;
            }
            case 877043524: {
                if (!a.equals((Object)"getLocationAccuracy")) {
                    break;
                }
                n = 7;
                break;
            }
            case 746581438: {
                if (!a.equals((Object)"requestPermission")) {
                    break;
                }
                n = 6;
                break;
            }
            case 686218487: {
                if (!a.equals((Object)"checkPermission")) {
                    break;
                }
                n = 5;
                break;
            }
            case 356040619: {
                if (!a.equals((Object)"isLocationServiceEnabled")) {
                    break;
                }
                n = 4;
                break;
            }
            case 347240634: {
                if (!a.equals((Object)"openAppSettings")) {
                    break;
                }
                n = 3;
                break;
            }
            case -821636766: {
                if (!a.equals((Object)"openLocationSettings")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1156770336: {
                if (!a.equals((Object)"getLastKnownPosition")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1757019252: {
                if (!a.equals((Object)"getCurrentPosition")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        boolean b = false;
        switch (n) {
            default: {
                k$d.c();
                return;
            }
            case 8: {
                this.q(j, k$d);
                return;
            }
            case 7: {
                this.i(k$d, this.g);
                return;
            }
            case 6: {
                this.v(k$d);
                return;
            }
            case 5: {
                this.r(k$d);
                return;
            }
            case 4: {
                this.u(k$d);
                return;
            }
            case 3: {
                b = k1.a.a(this.g);
                break;
            }
            case 2: {
                b = k1.a.b(this.g);
                break;
            }
            case 1: {
                this.t(j, k$d);
                return;
            }
            case 0: {
                this.s(j, k$d);
                return;
            }
        }
        k$d.a((Object)b);
    }
    
    void w(final Activity h) {
        this.h = h;
    }
    
    void x(final Context g, final k3.c c) {
        if (this.i != null) {
            Log.w("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            this.y();
        }
        (this.i = new k(c, "flutter.baseflow.com/geolocator_android")).e((k$c)this);
        this.g = g;
    }
    
    void y() {
        final k i = this.i;
        if (i == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        i.e((k$c)null);
        this.i = null;
    }
}
