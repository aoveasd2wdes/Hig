package g2;

import android.os.BaseBundle;
import q1.o;
import android.os.Parcelable;
import android.os.Bundle;

public abstract class d0
{
    public static Parcelable a(Bundle bundle, final String s) {
        final ClassLoader d = d();
        bundle.setClassLoader(d);
        bundle = bundle.getBundle("map_state");
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(d);
        return bundle.getParcelable(s);
    }
    
    public static void b(final Bundle bundle, final Bundle bundle2) {
        if (bundle != null) {
            if (bundle2 != null) {
                final Parcelable a = a(bundle, "MapOptions");
                if (a != null) {
                    c(bundle2, "MapOptions", a);
                }
                final Parcelable a2 = a(bundle, "StreetViewPanoramaOptions");
                if (a2 != null) {
                    c(bundle2, "StreetViewPanoramaOptions", a2);
                }
                final Parcelable a3 = a(bundle, "camera");
                if (a3 != null) {
                    c(bundle2, "camera", a3);
                }
                if (((BaseBundle)bundle).containsKey("position")) {
                    ((BaseBundle)bundle2).putString("position", ((BaseBundle)bundle).getString("position"));
                }
                if (((BaseBundle)bundle).containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                    bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
                }
            }
        }
    }
    
    public static void c(final Bundle bundle, final String s, final Parcelable parcelable) {
        final ClassLoader d = d();
        bundle.setClassLoader(d);
        Bundle bundle2;
        if ((bundle2 = bundle.getBundle("map_state")) == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(d);
        bundle2.putParcelable(s, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
    
    private static ClassLoader d() {
        return (ClassLoader)o.h((Object)d0.class.getClassLoader());
    }
}
