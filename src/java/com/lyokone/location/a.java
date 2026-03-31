package com.lyokone.location;

import android.os.BaseBundle;
import v2.c;
import i1.j0;
import k2.d;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.util.Log;
import android.os.Looper;
import android.os.Handler;
import i1.l0;
import android.content.IntentSender$SendIntentException;
import v2.f;
import android.location.Location;
import i1.a0;
import i1.y;
import i1.w;
import android.os.Build$VERSION;
import java.util.HashMap;
import com.google.android.gms.location.LocationResult;
import e2.g$a;
import e2.h;
import android.content.Context;
import android.util.SparseArray;
import android.location.LocationManager;
import k3.k$d;
import k3.d$b;
import android.location.OnNmeaMessageListener;
import e2.e;
import e2.g;
import com.google.android.gms.location.LocationRequest;
import e2.l;
import e2.b;
import android.app.Activity;
import k3.m;
import k3.n;

public class a implements n, m
{
    public Activity c;
    public b d;
    private l e;
    private LocationRequest f;
    private g g;
    public e h;
    private OnNmeaMessageListener i;
    private Double j;
    private long k;
    private long l;
    private Integer m;
    private float n;
    public d$b o;
    public k$d p;
    private k$d q;
    public k$d r;
    private final LocationManager s;
    public SparseArray t;
    
    a(final Context context, final Activity c) {
        this.k = 5000L;
        this.l = 5000L / 2L;
        this.m = 100;
        this.n = 0.0f;
        this.t = (SparseArray)new a$a(this);
        this.c = c;
        this.s = (LocationManager)context.getSystemService("location");
    }
    
    private void h() {
        final g$a g$a = new g$a();
        g$a.a(this.f);
        this.g = g$a.b();
    }
    
    private void l() {
        final e h = this.h;
        if (h != null) {
            this.d.e(h);
            this.h = null;
        }
        this.h = new e(this) {
            final a a;
            
            public void b(final LocationResult locationResult) {
                super.b(locationResult);
                final Location a = locationResult.a();
                final HashMap hashMap = new HashMap();
                hashMap.put((Object)"latitude", (Object)a.getLatitude());
                hashMap.put((Object)"longitude", (Object)a.getLongitude());
                hashMap.put((Object)"accuracy", (Object)(double)a.getAccuracy());
                final int sdk_INT = Build$VERSION.SDK_INT;
                if (sdk_INT >= 26) {
                    hashMap.put((Object)"verticalAccuracy", (Object)(double)w.a(a));
                    hashMap.put((Object)"headingAccuracy", (Object)(double)y.a(a));
                }
                if (sdk_INT >= 29) {
                    hashMap.put((Object)"elapsedRealtimeUncertaintyNanos", (Object)v2.g.a(a));
                }
                hashMap.put((Object)"provider", (Object)a.getProvider());
                if (a.getExtras() != null) {
                    hashMap.put((Object)"satelliteNumber", (Object)((BaseBundle)a.getExtras()).getInt("satellites"));
                }
                hashMap.put((Object)"elapsedRealtimeNanos", (Object)a.getElapsedRealtimeNanos());
                if (a.isFromMockProvider()) {
                    hashMap.put((Object)"isMock", (Object)1.0);
                }
                Double n;
                if (this.a.j != null && sdk_INT >= 24) {
                    n = this.a.j;
                }
                else {
                    n = a.getAltitude();
                }
                hashMap.put((Object)"altitude", (Object)n);
                hashMap.put((Object)"speed", (Object)(double)a.getSpeed());
                if (sdk_INT >= 26) {
                    hashMap.put((Object)"speed_accuracy", (Object)(double)a0.a(a));
                }
                hashMap.put((Object)"heading", (Object)(double)a.getBearing());
                hashMap.put((Object)"time", (Object)a.getTime());
                final k$d r = this.a.r;
                if (r != null) {
                    r.a((Object)hashMap);
                    this.a.r = null;
                }
                final a a2 = this.a;
                final d$b o = a2.o;
                if (o != null) {
                    o.a((Object)hashMap);
                }
                else {
                    final b d = a2.d;
                    if (d != null) {
                        d.e(a2.h);
                    }
                }
            }
        };
        if (Build$VERSION.SDK_INT >= 24) {
            this.i = (OnNmeaMessageListener)new f(this);
        }
    }
    
    private void m() {
        (this.f = LocationRequest.a()).o(this.k);
        this.f.n(this.l);
        this.f.p((int)this.m);
        this.f.q(this.n);
    }
    
    private void u(final String s, final String s2, final Object o) {
        final k$d r = this.r;
        if (r != null) {
            r.b(s, s2, o);
            this.r = null;
        }
        final d$b o2 = this.o;
        if (o2 != null) {
            o2.b(s, s2, o);
            this.o = null;
        }
    }
    
    public boolean a(final int n, final int n2, final Intent intent) {
        if (n != 1) {
            if (n != 4097) {
                return false;
            }
            final k$d q = this.q;
            if (q == null) {
                return false;
            }
            Integer n3;
            if (n2 == -1) {
                n3 = 1;
            }
            else {
                n3 = 0;
            }
            q.a((Object)n3);
            this.q = null;
            return true;
        }
        else {
            final k$d p3 = this.p;
            if (p3 == null) {
                return false;
            }
            if (n2 == -1) {
                this.x();
                return true;
            }
            p3.b("SERVICE_STATUS_DISABLED", "Failed to get location. Location services disabled", (Object)null);
            this.p = null;
            return true;
        }
    }
    
    public boolean d(final int n, final String[] array, final int[] array2) {
        return this.r(n, array, array2);
    }
    
    public void i(final Integer m, final Long n, final Long n2, final Float n3) {
        this.m = m;
        this.k = n;
        this.l = n2;
        this.n = n3;
        this.l();
        this.m();
        this.h();
        this.x();
    }
    
    public boolean j() {
        final Activity c = this.c;
        if (c != null) {
            return androidx.core.content.a.a((Context)c, "android.permission.ACCESS_FINE_LOCATION") == 0;
        }
        this.p.b("MISSING_ACTIVITY", "You should not checkPermissions activation outside of an activity.", (Object)null);
        throw new ActivityNotFoundException();
    }
    
    public boolean k() {
        if (Build$VERSION.SDK_INT >= 28) {
            return v2.b.a(this.s);
        }
        final boolean providerEnabled = this.s.isProviderEnabled("gps");
        final boolean providerEnabled2 = this.s.isProviderEnabled("network");
        return providerEnabled || providerEnabled2;
    }
    
    public boolean r(final int n, final String[] array, final int[] array2) {
        if (n == 34 && array.length == 1 && array[0].equals((Object)"android.permission.ACCESS_FINE_LOCATION")) {
            k$d k$d;
            Integer n2;
            if (array2[0] == 0) {
                if (this.r != null || this.o != null) {
                    this.x();
                }
                k$d = this.p;
                if (k$d == null) {
                    return true;
                }
                n2 = 1;
            }
            else if (!this.w()) {
                this.u("PERMISSION_DENIED_NEVER_ASK", "Location permission denied forever - please open app settings", null);
                k$d = this.p;
                if (k$d == null) {
                    return true;
                }
                n2 = 2;
            }
            else {
                this.u("PERMISSION_DENIED", "Location permission denied", null);
                k$d = this.p;
                if (k$d == null) {
                    return true;
                }
                n2 = 0;
            }
            k$d.a((Object)n2);
            this.p = null;
            return true;
        }
        return false;
    }
    
    public void s() {
        if (this.c == null) {
            this.p.b("MISSING_ACTIVITY", "You should not requestPermissions activation outside of an activity.", (Object)null);
            throw new ActivityNotFoundException();
        }
        if (this.j()) {
            this.p.a((Object)1);
            return;
        }
        androidx.core.app.a.j(this.c, new String[] { "android.permission.ACCESS_FINE_LOCATION" }, 34);
    }
    
    public void t(final k$d q) {
        if (this.c != null) {
            try {
                if (this.k()) {
                    q.a((Object)1);
                    return;
                }
                this.q = q;
                this.e.c(this.g).c(this.c, (d)new v2.e(this, q));
                return;
            }
            catch (final Exception ex) {
                q.b("SERVICE_STATUS_ERROR", "Location service status couldn't be determined", (Object)null);
                return;
            }
        }
        q.b("MISSING_ACTIVITY", "You should not requestService activation outside of an activity.", (Object)null);
        throw new ActivityNotFoundException();
    }
    
    void v(final Activity c) {
        this.c = c;
        if (c != null) {
            this.d = e2.f.a(c);
            this.e = e2.f.c(c);
            this.l();
            this.m();
            this.h();
        }
        else {
            final b d = this.d;
            if (d != null) {
                d.e(this.h);
            }
            this.d = null;
            this.e = null;
            if (Build$VERSION.SDK_INT >= 24) {
                final LocationManager s = this.s;
                if (s != null) {
                    j0.a(s, this.i);
                    this.i = null;
                }
            }
        }
    }
    
    public boolean w() {
        final Activity c = this.c;
        return c != null && androidx.core.app.a.k(c, "android.permission.ACCESS_FINE_LOCATION");
    }
    
    public void x() {
        if (this.c != null) {
            this.e.c(this.g).e(this.c, (k2.e)new c(this)).c(this.c, (d)new v2.d(this));
            return;
        }
        this.p.b("MISSING_ACTIVITY", "You should not requestLocation activation outside of an activity.", (Object)null);
        throw new ActivityNotFoundException();
    }
}
