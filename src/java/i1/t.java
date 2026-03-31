package i1;

import android.os.Bundle;
import androidx.core.location.f;
import androidx.core.location.d;
import android.os.Looper;
import androidx.core.location.f$c;
import h1.b;
import android.app.Activity;
import android.location.LocationListener;
import java.util.Iterator;
import java.util.List;
import android.os.Build$VERSION;
import h1.a;
import android.location.Location;
import android.content.Context;
import android.location.LocationManager;
import androidx.core.location.c;

class t implements s, c
{
    private final LocationManager a;
    private final q0 b;
    private final g0 c;
    public Context d;
    private boolean e;
    private Location f;
    private String g;
    private r0 h;
    private a i;
    
    public t(final Context d, final g0 c) {
        this.e = false;
        this.a = (LocationManager)d.getSystemService("location");
        this.c = c;
        this.d = d;
        this.b = new q0(d, c);
    }
    
    private static int f(final o o) {
        final int n = t$a.a[((Enum)o).ordinal()];
        if (n == 1 || n == 2) {
            return 104;
        }
        if (n != 3 && n != 4 && n != 5) {
            return 102;
        }
        return 100;
    }
    
    private static String h(final LocationManager locationManager, final o o) {
        final List providers = locationManager.getProviders(true);
        if (o == o.e) {
            return "passive";
        }
        if (providers.contains((Object)"fused") && Build$VERSION.SDK_INT >= 31) {
            return "fused";
        }
        if (providers.contains((Object)"gps")) {
            return "gps";
        }
        if (providers.contains((Object)"network")) {
            return "network";
        }
        if (!providers.isEmpty()) {
            return (String)providers.get(0);
        }
        return null;
    }
    
    static boolean i(final Location location, final Location location2) {
        if (location2 == null) {
            return true;
        }
        final long n = location.getTime() - location2.getTime();
        final boolean b = n > 120000L;
        final boolean b2 = n < -120000L;
        final boolean b3 = n > 0L;
        if (b) {
            return true;
        }
        if (b2) {
            return false;
        }
        final float n2 = (float)(int)(location.getAccuracy() - location2.getAccuracy());
        final boolean b4 = n2 > 0.0f;
        final boolean b5 = n2 < 0.0f;
        final boolean b6 = n2 > 200.0f;
        final boolean b7 = location.getProvider() != null && location.getProvider().equals((Object)location2.getProvider());
        return b5 || (b3 && !b4) || (b3 && !b6 && b7);
    }
    
    public void a(final r0 r0, final a a) {
        final Iterator iterator = this.a.getProviders(true).iterator();
        Location location = null;
        while (iterator.hasNext()) {
            final Location lastKnownLocation = this.a.getLastKnownLocation((String)iterator.next());
            if (lastKnownLocation != null && i(lastKnownLocation, location)) {
                location = lastKnownLocation;
            }
        }
        r0.a(location);
    }
    
    public boolean b(final int n, final int n2) {
        return false;
    }
    
    public void c() {
        this.e = false;
        this.b.i();
        this.a.removeUpdates((LocationListener)this);
    }
    
    public void d(final h0 h0) {
        h0.b(this.a != null && this.g(this.d));
    }
    
    public void e(final Activity activity, final r0 h, final a i) {
        if (!this.g(this.d)) {
            i.a(h1.b.g);
            return;
        }
        this.h = h;
        this.i = i;
        o o = i1.o.i;
        final g0 c = this.c;
        float n;
        long c2;
        int f;
        if (c != null) {
            n = (float)c.b();
            o = this.c.a();
            if (o == i1.o.e) {
                c2 = Long.MAX_VALUE;
            }
            else {
                c2 = this.c.c();
            }
            f = f(o);
        }
        else {
            c2 = 0L;
            n = 0.0f;
            f = 102;
        }
        final String h2 = h(this.a, o);
        this.g = h2;
        if (h2 == null) {
            i.a(h1.b.g);
            return;
        }
        final f a = new f$c(c2).c(n).d(c2).e(f).a();
        this.e = true;
        this.b.h();
        androidx.core.location.d.b(this.a, this.g, a, (c)this, Looper.getMainLooper());
    }
    
    public /* synthetic */ boolean g(final Context context) {
        return r.a((s)this, context);
    }
    
    public void onLocationChanged(final Location f) {
        synchronized (this) {
            if (i(f, this.f)) {
                this.f = f;
                if (this.h != null) {
                    this.b.f(f);
                    this.h.a(this.f);
                }
            }
        }
    }
    
    public void onProviderDisabled(final String s) {
        if (s.equals((Object)this.g)) {
            if (this.e) {
                this.a.removeUpdates((LocationListener)this);
            }
            final a i = this.i;
            if (i != null) {
                i.a(h1.b.g);
            }
            this.g = null;
        }
    }
    
    public void onProviderEnabled(final String s) {
    }
    
    public void onStatusChanged(final String s, final int n, final Bundle bundle) {
        if (n == 2) {
            this.onProviderEnabled(s);
        }
        else if (n == 0) {
            this.onProviderDisabled(s);
        }
    }
}
