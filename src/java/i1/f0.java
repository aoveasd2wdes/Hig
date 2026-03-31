package i1;

import android.os.BaseBundle;
import java.util.HashMap;
import java.util.Map;
import android.os.Build$VERSION;
import android.location.Location;

public abstract class f0
{
    private static boolean a(final Location location) {
        if (Build$VERSION.SDK_INT >= 31) {
            return v.a(location);
        }
        return location.isFromMockProvider();
    }
    
    public static Map b(final Location location) {
        if (location == null) {
            return null;
        }
        final HashMap hashMap = new HashMap();
        ((Map)hashMap).put((Object)"latitude", (Object)location.getLatitude());
        ((Map)hashMap).put((Object)"longitude", (Object)location.getLongitude());
        ((Map)hashMap).put((Object)"timestamp", (Object)location.getTime());
        ((Map)hashMap).put((Object)"is_mocked", (Object)a(location));
        if (location.hasAltitude()) {
            ((Map)hashMap).put((Object)"altitude", (Object)location.getAltitude());
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 26 && u.a(location)) {
            ((Map)hashMap).put((Object)"altitude_accuracy", (Object)w.a(location));
        }
        if (location.hasAccuracy()) {
            ((Map)hashMap).put((Object)"accuracy", (Object)(double)location.getAccuracy());
        }
        if (location.hasBearing()) {
            ((Map)hashMap).put((Object)"heading", (Object)(double)location.getBearing());
        }
        if (sdk_INT >= 26 && x.a(location)) {
            ((Map)hashMap).put((Object)"heading_accuracy", (Object)y.a(location));
        }
        if (location.hasSpeed()) {
            ((Map)hashMap).put((Object)"speed", (Object)(double)location.getSpeed());
        }
        if (sdk_INT >= 26 && z.a(location)) {
            ((Map)hashMap).put((Object)"speed_accuracy", (Object)(double)a0.a(location));
        }
        if (location.getExtras() != null) {
            if (((BaseBundle)location.getExtras()).containsKey("geolocator_mslAltitude")) {
                ((Map)hashMap).put((Object)"altitude", (Object)((BaseBundle)location.getExtras()).getDouble("geolocator_mslAltitude"));
            }
            if (((BaseBundle)location.getExtras()).containsKey("geolocator_mslSatelliteCount")) {
                ((Map)hashMap).put((Object)"gnss_satellite_count", (Object)((BaseBundle)location.getExtras()).getDouble("geolocator_mslSatelliteCount"));
            }
            if (((BaseBundle)location.getExtras()).containsKey("geolocator_mslSatellitesUsedInFix")) {
                ((Map)hashMap).put((Object)"gnss_satellites_used_in_fix", (Object)((BaseBundle)location.getExtras()).getDouble("geolocator_mslSatellitesUsedInFix"));
            }
            if (sdk_INT >= 34 && b0.a(location)) {
                ((Map)hashMap).put((Object)"altitude", (Object)c0.a(location));
                if (d0.a(location)) {
                    ((Map)hashMap).put((Object)"altitude_accuracy", (Object)e0.a(location));
                }
            }
        }
        return (Map)hashMap;
    }
}
