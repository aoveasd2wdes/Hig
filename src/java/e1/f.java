package e1;

import k3.l;
import k3.p;
import android.util.Log;
import f1.c;
import java.util.Locale;
import f1.b;
import java.util.List;
import k3.k$d;
import k3.j;
import k3.k;
import k3.k$c;

final class f implements k$c
{
    private final d c;
    private k d;
    
    f(final d c) {
        this.c = c;
    }
    
    private void b(final j j, final k$d k$d) {
        k$d.a((Object)this.c.f());
    }
    
    private void c(final j j, final k$d k$d) {
        final String s = (String)j.a("address");
        if (s == null || s.isEmpty()) {
            k$d.b("ARGUMENT_ERROR", "Supply a valid value for the 'address' parameter.", (Object)null);
        }
        this.c.g(s, (a)new a(this, k$d, s) {
            final k$d a;
            final String b;
            final f c;
            
            public void onError(final String s) {
                this.a.b("IO_ERROR", String.format(s, new Object[0]), (Object)null);
            }
            
            public void onGeocode(final List list) {
                if (list != null && list.size() > 0) {
                    this.a.a((Object)f1.b.c(list));
                }
                else {
                    this.a.b("NOT_FOUND", String.format("No coordinates found for '%s'", new Object[] { this.b }), (Object)null);
                }
            }
        });
    }
    
    private void d(final j j, final k$d k$d) {
        final String s = (String)j.a("address");
        if (s == null || s.isEmpty()) {
            k$d.b("ARGUMENT_ERROR", "Supply a valid value for the 'address' parameter.", (Object)null);
        }
        this.c.g(s, (a)new a(this, k$d, s) {
            final k$d a;
            final String b;
            final f c;
            
            public void onError(final String s) {
                this.a.b("IO_ERROR", String.format(s, new Object[0]), (Object)null);
            }
            
            public void onGeocode(final List list) {
                if (list != null && list.size() > 0) {
                    this.a.a((Object)f1.b.b(list));
                }
                else {
                    this.a.b("NOT_FOUND", String.format("No coordinates found for '%s'", new Object[] { this.b }), (Object)null);
                }
            }
        });
    }
    
    private void e(final j j, final k$d k$d) {
        final double doubleValue = (double)j.a("latitude");
        final double doubleValue2 = (double)j.a("longitude");
        this.c.h(doubleValue, doubleValue2, (a)new a(this, k$d, doubleValue, doubleValue2) {
            final k$d a;
            final double b;
            final double c;
            final f d;
            
            public void onError(final String s) {
                this.a.b("IO_ERROR", String.format(s, new Object[0]), (Object)null);
            }
            
            public void onGeocode(final List list) {
                if (list != null && list.size() > 0) {
                    this.a.a((Object)f1.b.b(list));
                }
                else {
                    this.a.b("NOT_FOUND", String.format(Locale.ENGLISH, "No address information found for supplied coordinates (latitude: %f, longitude: %f).", new Object[] { this.b, this.c }), (Object)null);
                }
            }
        });
    }
    
    private void f(final j j, final k$d k$d) {
        this.c.i(f1.c.a((String)j.a("localeIdentifier")));
        k$d.a((Object)Boolean.TRUE);
    }
    
    public void a(final j j, final k$d k$d) {
        final String a = j.a;
        a.hashCode();
        final int hashCode = a.hashCode();
        int n = -1;
        switch (hashCode) {
            case 930278181: {
                if (!a.equals((Object)"setLocaleIdentifier")) {
                    break;
                }
                n = 4;
                break;
            }
            case 769355766: {
                if (!a.equals((Object)"placemarkFromAddress")) {
                    break;
                }
                n = 3;
                break;
            }
            case -533029387: {
                if (!a.equals((Object)"locationFromAddress")) {
                    break;
                }
                n = 2;
                break;
            }
            case -898056143: {
                if (!a.equals((Object)"isPresent")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1276560131: {
                if (!a.equals((Object)"placemarkFromCoordinates")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                k$d.c();
                break;
            }
            case 4: {
                this.f(j, k$d);
                break;
            }
            case 3: {
                this.d(j, k$d);
                break;
            }
            case 2: {
                this.c(j, k$d);
                break;
            }
            case 1: {
                this.b(j, k$d);
                break;
            }
            case 0: {
                this.e(j, k$d);
                break;
            }
        }
    }
    
    void g(final k3.c c) {
        if (this.d != null) {
            Log.wtf("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            this.h();
        }
        (this.d = new k(c, "flutter.baseflow.com/geocoding", (l)p.b, c.f())).e((k$c)this);
    }
    
    void h() {
        final k d = this.d;
        if (d == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        d.e((k$c)null);
        this.d = null;
    }
}
