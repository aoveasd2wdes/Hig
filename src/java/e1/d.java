package e1;

import java.io.IOException;
import android.os.Build$VERSION;
import android.location.Geocoder$GeocodeListener;
import java.util.List;
import android.location.Geocoder;
import java.util.Locale;
import android.content.Context;

class d
{
    private final Context a;
    private Locale b;
    
    d(final Context a) {
        this.a = a;
    }
    
    private static Geocoder a(final Context context, final Locale locale) {
        Geocoder geocoder;
        if (locale != null) {
            geocoder = new Geocoder(context, locale);
        }
        else {
            geocoder = new Geocoder(context);
        }
        return geocoder;
    }
    
    private List b(final Geocoder geocoder, final double n, final double n2) {
        return geocoder.getFromLocation(n, n2, 5);
    }
    
    private List c(final Geocoder geocoder, final String s) {
        return geocoder.getFromLocationName(s, 5);
    }
    
    private void d(final Geocoder geocoder, final String s, final int n, final a a) {
        e1.b.a(geocoder, s, n, (Geocoder$GeocodeListener)new Geocoder$GeocodeListener(this, a) {
            final a a;
            final d b;
            
            public void onError(final String s) {
                this.a.onError(s);
            }
            
            public void onGeocode(final List list) {
                this.a.onGeocode(list);
            }
        });
    }
    
    private void e(final Geocoder geocoder, final double n, final double n2, final int n3, final a a) {
        c.a(geocoder, n, n2, n3, (Geocoder$GeocodeListener)new Geocoder$GeocodeListener(this, a) {
            final a a;
            final d b;
            
            public void onError(final String s) {
                this.a.onError(s);
            }
            
            public void onGeocode(final List list) {
                this.a.onGeocode(list);
            }
        });
    }
    
    boolean f() {
        return Geocoder.isPresent();
    }
    
    void g(final String s, final a a) {
        final Geocoder a2 = a(this.a, this.b);
        if (Build$VERSION.SDK_INT >= 33) {
            this.d(a2, s, 5, a);
        }
        else {
            try {
                a.onGeocode(this.c(a2, s));
            }
            catch (final IOException ex) {
                a.onError(((Throwable)ex).getMessage());
            }
        }
    }
    
    void h(final double n, final double n2, final a a) {
        final Geocoder a2 = a(this.a, this.b);
        if (Build$VERSION.SDK_INT >= 33) {
            this.e(a2, n, n2, 5, a);
        }
        else {
            try {
                a.onGeocode(this.b(a2, n, n2));
            }
            catch (final IOException ex) {
                a.onError(((Throwable)ex).getMessage());
            }
        }
    }
    
    void i(final Locale b) {
        this.b = b;
    }
}
