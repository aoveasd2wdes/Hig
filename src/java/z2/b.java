package z2;

import android.net.NetworkCapabilities;
import android.os.Build$VERSION;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;

public class b
{
    private final ConnectivityManager a;
    
    public b(final ConnectivityManager a) {
        this.a = a;
    }
    
    private String c() {
        final NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            final int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type != 1) {
                    if (type == 4 || type == 5) {
                        return "mobile";
                    }
                    if (type != 6) {
                        if (type == 7) {
                            return "bluetooth";
                        }
                        if (type == 9) {
                            return "ethernet";
                        }
                        if (type != 17) {
                            return "none";
                        }
                        return "vpn";
                    }
                }
                return "wifi";
            }
            return "mobile";
        }
        return "none";
    }
    
    public ConnectivityManager a() {
        return this.a;
    }
    
    String b() {
        if (Build$VERSION.SDK_INT >= 23) {
            final NetworkCapabilities networkCapabilities = this.a.getNetworkCapabilities(z2.a.a(this.a));
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1)) {
                return "wifi";
            }
            if (networkCapabilities.hasTransport(3)) {
                return "ethernet";
            }
            if (networkCapabilities.hasTransport(4)) {
                return "vpn";
            }
            if (networkCapabilities.hasTransport(0)) {
                return "mobile";
            }
            if (networkCapabilities.hasTransport(2)) {
                return "bluetooth";
            }
        }
        return this.c();
    }
}
