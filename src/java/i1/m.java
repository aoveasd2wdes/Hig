package i1;

import java.util.Random;
import k2.c;
import k2.d;
import java.util.Objects;
import android.os.Looper;
import android.content.IntentSender$SendIntentException;
import e2.j;
import java.security.SecureRandom;
import e2.g$a;
import com.google.android.gms.location.LocationRequest$a;
import android.os.Build$VERSION;
import com.google.android.gms.location.LocationRequest;
import k2.g;
import android.app.Activity;
import e2.h;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationAvailability;
import e2.f;
import h1.a;
import e2.b;
import e2.e;
import android.content.Context;

class m implements s
{
    private final Context a;
    private final e b;
    private final b c;
    private final q0 d;
    private final int e;
    private final g0 f;
    private a g;
    private r0 h;
    
    public m(final Context a, final g0 f) {
        this.a = a;
        this.c = e2.f.b(a);
        this.f = f;
        this.d = new q0(a, f);
        this.e = this.s();
        this.b = new e(this, f, a) {
            final g0 a;
            final Context b;
            final m c;
            
            public void a(final LocationAvailability locationAvailability) {
                synchronized (this) {
                    if (!locationAvailability.a() && !this.c.r(this.b) && this.c.g != null) {
                        this.c.g.a(h1.b.g);
                    }
                }
            }
            
            public void b(final LocationResult locationResult) {
                synchronized (this) {
                    if (this.c.h == null) {
                        Log.e("FlutterGeolocator", "LocationCallback was called with empty locationResult or no positionChangedCallback was registered.");
                        this.c.c.e(this.c.b);
                        if (this.c.g != null) {
                            this.c.g.a(h1.b.f);
                        }
                        return;
                    }
                    final Location a = locationResult.a();
                    if (a == null) {
                        return;
                    }
                    if (a.getExtras() == null) {
                        a.setExtras(Bundle.EMPTY);
                    }
                    if (this.a != null) {
                        a.getExtras().putBoolean("geolocator_use_mslAltitude", this.a.d());
                    }
                    this.c.d.f(a);
                    this.c.h.a(a);
                }
            }
        };
    }
    
    private static LocationRequest o(final g0 g0) {
        if (Build$VERSION.SDK_INT < 33) {
            return p(g0);
        }
        final LocationRequest$a locationRequest$a = new LocationRequest$a(0L);
        if (g0 != null) {
            locationRequest$a.j(y(g0.a()));
            locationRequest$a.d(g0.c());
            locationRequest$a.i(g0.c());
            locationRequest$a.h((float)g0.b());
        }
        return locationRequest$a.a();
    }
    
    private static LocationRequest p(final g0 g0) {
        final LocationRequest a = LocationRequest.a();
        if (g0 != null) {
            a.p(y(g0.a()));
            a.o(g0.c());
            a.n(g0.c() / 2L);
            a.q((float)g0.b());
        }
        return a;
    }
    
    private static e2.g q(final LocationRequest locationRequest) {
        final g$a g$a = new g$a();
        g$a.a(locationRequest);
        return g$a.b();
    }
    
    private int s() {
        synchronized (this) {
            return ((Random)new SecureRandom()).nextInt(65536);
        }
    }
    
    private void x(final g0 g0) {
        final LocationRequest o = o(g0);
        this.d.h();
        this.c.a(o, this.b, Looper.getMainLooper());
    }
    
    private static int y(final o o) {
        final int n = m$b.a[((Enum)o).ordinal()];
        if (n == 1) {
            return 105;
        }
        if (n == 2) {
            return 104;
        }
        if (n != 3) {
            return 100;
        }
        return 102;
    }
    
    public void a(final r0 r0, final a a) {
        final g b = this.c.b();
        Objects.requireNonNull((Object)r0);
        b.f((k2.e)new i(r0)).d((d)new i1.j(a));
    }
    
    public boolean b(final int n, final int n2) {
        if (n == this.e) {
            if (n2 == -1) {
                final g0 f = this.f;
                if (f != null && this.h != null && this.g != null) {
                    this.x(f);
                    return true;
                }
                return false;
            }
            else {
                final a g = this.g;
                if (g != null) {
                    g.a(h1.b.g);
                }
            }
        }
        return false;
    }
    
    public void c() {
        this.d.i();
        this.c.e(this.b);
    }
    
    public void d(final h0 h0) {
        e2.f.d(this.a).c(new g$a().b()).b((c)new i1.h(h0));
    }
    
    public void e(final Activity activity, final r0 h, final a g) {
        this.h = h;
        this.g = g;
        e2.f.d(this.a).c(q(o(this.f))).f((k2.e)new k(this)).d((d)new l(this, activity, g));
    }
    
    public /* synthetic */ boolean r(final Context context) {
        return r.a((s)this, context);
    }
}
