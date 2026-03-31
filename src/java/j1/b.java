package j1;

import android.util.Log;
import java.util.Iterator;
import android.os.Build$VERSION;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import h1.a;
import android.app.Activity;
import k3.n;

public class b implements n
{
    private static b f;
    private Activity c;
    private a d;
    private c e;
    
    private b() {
    }
    
    public static b b() {
        synchronized (b.class) {
            if (b.f == null) {
                b.f = new b();
            }
            return b.f;
        }
    }
    
    private static List c(final Context context) {
        final boolean b = j1.f.b(context, "android.permission.ACCESS_FINE_LOCATION");
        final boolean b2 = j1.f.b(context, "android.permission.ACCESS_COARSE_LOCATION");
        if (!b && !b2) {
            throw new h1.c();
        }
        final ArrayList list = new ArrayList();
        if (b) {
            ((List)list).add((Object)"android.permission.ACCESS_FINE_LOCATION");
        }
        if (b2) {
            ((List)list).add((Object)"android.permission.ACCESS_COARSE_LOCATION");
        }
        return (List)list;
    }
    
    private boolean e(final String[] array, final int[] array2) {
        final int g = g(array, "android.permission.ACCESS_BACKGROUND_LOCATION");
        return g >= 0 && array2[g] == 0;
    }
    
    private static int g(final Object[] array, final Object o) {
        return Arrays.asList(array).indexOf(o);
    }
    
    public j1.a a(final Context context) {
        final List c = c(context);
        if (Build$VERSION.SDK_INT < 23) {
            return j1.a.h;
        }
        final Iterator iterator = c.iterator();
        while (true) {
            while (iterator.hasNext()) {
                if (androidx.core.content.a.a(context, (String)iterator.next()) == 0) {
                    final int n = 0;
                    if (n == -1) {
                        return j1.a.e;
                    }
                    if (Build$VERSION.SDK_INT < 29) {
                        return j1.a.h;
                    }
                    if (!j1.f.b(context, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                        return j1.a.g;
                    }
                    if (androidx.core.content.a.a(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                        return j1.a.h;
                    }
                    return j1.a.g;
                }
            }
            final int n = -1;
            continue;
        }
    }
    
    public boolean d(int n, final String[] array, final int[] array2) {
        if (n != 109) {
            return false;
        }
        final Activity c = this.c;
        if (c == null) {
            Log.e("Geolocator", "Trying to process permission result without an valid Activity instance");
            final a d = this.d;
            if (d != null) {
                d.a(h1.b.e);
            }
            return false;
        }
        try {
            final List c2 = c((Context)c);
            if (array2.length == 0) {
                Log.i("Geolocator", "The grantResults array is empty. This can happen when the user cancels the permission request");
                return false;
            }
            final j1.a e = j1.a.e;
            final Iterator iterator = c2.iterator();
            int n2 = -1;
            int n3 = 0;
            n = 0;
            while (iterator.hasNext()) {
                final String s = (String)iterator.next();
                final int g = g(array, s);
                int n4 = n3;
                if (g >= 0) {
                    n4 = 1;
                }
                int n5 = n2;
                if (array2[g] == 0) {
                    n5 = 0;
                }
                n2 = n5;
                n3 = n4;
                if (androidx.core.app.a.k(this.c, s)) {
                    n = 1;
                    n2 = n5;
                    n3 = n4;
                }
            }
            if (n3 == 0) {
                Log.w("Geolocator", "Location permissions not part of permissions send to onRequestPermissionsResult method.");
                return false;
            }
            j1.a a;
            if (n2 == 0) {
                if (Build$VERSION.SDK_INT >= 29 && !this.e(array, array2)) {
                    a = j1.a.g;
                }
                else {
                    a = j1.a.h;
                }
            }
            else {
                a = e;
                if (n == 0) {
                    a = j1.a.f;
                }
            }
            final c e2 = this.e;
            if (e2 != null) {
                e2.a(a);
            }
            return true;
        }
        catch (final h1.c c3) {
            final a d2 = this.d;
            if (d2 != null) {
                d2.a(h1.b.h);
            }
            return false;
        }
    }
    
    public boolean f(final Context context) {
        final j1.a a = this.a(context);
        return a == j1.a.g || a == j1.a.h;
    }
    
    public void h(final Activity c, final c e, final a d) {
        if (c == null) {
            d.a(h1.b.e);
            return;
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 23) {
            e.a(j1.a.h);
            return;
        }
        final List c2 = c((Context)c);
        if (sdk_INT >= 29 && j1.f.b((Context)c, "android.permission.ACCESS_BACKGROUND_LOCATION") && this.a((Context)c) == j1.a.g) {
            c2.add((Object)"android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        this.d = d;
        this.e = e;
        androidx.core.app.a.j(this.c = c, (String[])c2.toArray((Object[])new String[0]), 109);
    }
}
