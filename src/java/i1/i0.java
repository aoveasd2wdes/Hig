package i1;

import android.location.LocationManager;
import android.content.Intent;
import android.content.Context;
import k3.d$b;
import android.content.BroadcastReceiver;

public class i0 extends BroadcastReceiver
{
    private final d$b a;
    private s0 b;
    
    public i0(final d$b a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        if ("android.location.PROVIDERS_CHANGED".equals((Object)intent.getAction())) {
            final LocationManager locationManager = (LocationManager)context.getSystemService("location");
            final boolean providerEnabled = locationManager.isProviderEnabled("gps");
            final boolean providerEnabled2 = locationManager.isProviderEnabled("network");
            s0 b2;
            if (!providerEnabled && !providerEnabled2) {
                final s0 b = this.b;
                if (b != null && b != s0.f) {
                    return;
                }
                b2 = s0.e;
            }
            else {
                final s0 b3 = this.b;
                if (b3 != null && b3 != s0.e) {
                    return;
                }
                b2 = s0.f;
            }
            this.b = b2;
            this.a.a((Object)b2.ordinal());
        }
    }
}
