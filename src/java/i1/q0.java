package i1;

import android.os.BaseBundle;
import android.os.Handler;
import androidx.core.widget.h;
import android.os.Bundle;
import android.location.Location;
import android.location.GnssStatus;
import android.os.Build$VERSION;
import java.util.Calendar;
import android.location.GnssStatus$Callback;
import android.location.OnNmeaMessageListener;
import android.location.LocationManager;
import android.content.Context;

public class q0
{
    private final Context a;
    private final LocationManager b;
    private final g0 c;
    private OnNmeaMessageListener d;
    private GnssStatus$Callback e;
    private String f;
    private double g;
    private double h;
    private Calendar i;
    private boolean j;
    
    public q0(final Context a, final g0 c) {
        this.j = false;
        this.a = a;
        this.c = c;
        this.b = (LocationManager)a.getSystemService("location");
        if (Build$VERSION.SDK_INT >= 24) {
            this.d = (OnNmeaMessageListener)new n0(this);
            this.e = new GnssStatus$Callback(this) {
                final q0 a;
                
                public void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
                    this.a.g = o0.a(gnssStatus);
                    this.a.h = 0.0;
                    for (int n = 0; n < this.a.g; ++n) {
                        if (p0.a(gnssStatus, n)) {
                            ++this.a.h;
                        }
                    }
                }
            };
        }
    }
    
    public void f(final Location location) {
        if (location == null) {
            return;
        }
        if (location.getExtras() == null) {
            location.setExtras(Bundle.EMPTY);
        }
        ((BaseBundle)location.getExtras()).putDouble("geolocator_mslSatelliteCount", this.g);
        ((BaseBundle)location.getExtras()).putDouble("geolocator_mslSatellitesUsedInFix", this.h);
        if (this.f != null && this.c != null && this.j) {
            final Calendar instance = Calendar.getInstance();
            instance.add(13, -5);
            final Calendar i = this.i;
            if (i != null && i.before((Object)instance)) {
                return;
            }
            if (this.c.d()) {
                final String[] split = this.f.split(",");
                final String s = split[0];
                if (this.f.trim().matches("^\\$..GGA.*$") && split.length > 9 && !split[9].isEmpty()) {
                    final double double1 = Double.parseDouble(split[9]);
                    if (location.getExtras() == null) {
                        location.setExtras(Bundle.EMPTY);
                    }
                    ((BaseBundle)location.getExtras()).putDouble("geolocator_mslAltitude", double1);
                }
            }
        }
    }
    
    public void h() {
        if (this.j) {
            return;
        }
        if (this.c != null && Build$VERSION.SDK_INT >= 24 && this.b != null && androidx.core.widget.h.a(this.a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            l0.a(this.b, this.d, (Handler)null);
            m0.a(this.b, this.e, (Handler)null);
            this.j = true;
        }
    }
    
    public void i() {
        if (this.c != null && Build$VERSION.SDK_INT >= 24) {
            final LocationManager b = this.b;
            if (b != null) {
                j0.a(b, this.d);
                k0.a(this.b, this.e);
                this.j = false;
            }
        }
    }
}
